package brs;

import brs.peer.Peer;
import brs.util.JSON;
import brs.util.Observable;
import com.google.gson.JsonObject;

import java.util.List;

public interface BlockchainProcessor extends Observable<Block, BlockchainProcessor.Event> {

  enum Event {
    BLOCK_PUSHED, BLOCK_POPPED, BLOCK_GENERATED, BLOCK_SCANNED,
    RESCAN_BEGIN, RESCAN_END,
    BEFORE_BLOCK_ACCEPT,
    BEFORE_BLOCK_APPLY, AFTER_BLOCK_APPLY
  }

  Peer getLastBlockchainFeeder();

  int getLastBlockchainFeederHeight();

  boolean isScanning();

  int getMinRollbackHeight();

  void processPeerBlock(JsonObject request, Peer peer) throws BurstException;

  void fullReset();

  void generateBlock(String secretPhrase, byte[] publicKey, Long nonce)
      throws BlockNotAcceptedException;

  void scan(int height);

  void forceScanAtStart();

  void validateAtNextScan();

  List<? extends Block> popOffTo(int height);

  class BlockNotAcceptedException extends BurstException {

    BlockNotAcceptedException(String message) {
      super(message);
    }

  }

  class TransactionNotAcceptedException extends BlockNotAcceptedException {

    private final Transaction transaction;

    public TransactionNotAcceptedException(String message, Transaction transaction) {
      super(message  + " transaction: " + JSON.toJsonString(transaction.getJsonObject()));
      this.transaction = transaction;
    }

    Transaction getTransaction() {
      return transaction;
    }

  }

  class BlockOutOfOrderException extends BlockNotAcceptedException {

    public BlockOutOfOrderException(String message) {
      super(message);
    }

  }

}

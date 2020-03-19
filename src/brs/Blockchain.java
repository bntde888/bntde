package brs;

import java.util.Collection;
import java.util.List;

public interface Blockchain {

  Block getLastBlock();
    
  Block getLastBlock(int timestamp);

  void setLastBlock(Block blockImpl);

  int getHeight();

  Block getBlock(long blockImplId);

  Block getBlockAtHeight(int height);

  boolean hasBlock(long blockImplId);

  Collection<Block> getBlocks(int from, int to);

  Collection<Block> getBlocks(Account account, int timestamp);

  Collection<Block> getBlocks(Account account, int timestamp, int from, int to);

  List<Long> getBlockIdsAfter(long blockImplId, int limit);

  List<? extends Block> getBlocksAfter(long blockImplId, int limit);

  long getBlockIdAtHeight(int height);

  Transaction getTransaction(long transactionId);

  Transaction getTransactionByFullHash(String fullHash); // TODO add byte[] method

  boolean hasTransaction(long transactionId);

  boolean hasTransactionByFullHash(String fullHash); // TODO add byte[] method

  int getTransactionCount();

  Collection<Transaction> getAllTransactions();

  Collection<Transaction> getTransactions(Account account, byte type, byte subtype, int blockImplTimestamp, boolean includeIndirectIncoming);

  Collection<Transaction> getTransactions(Account account, int numberOfConfirmations, byte type, byte subtype, int blockImplTimestamp, int from, int to, boolean includeIndirectIncoming);

  Collection<Transaction> getTransactionsFromHeight(int height, byte type, byte subtype);

  Collection<Transaction> getTransactionsForAccount(Account account, byte type, byte subtype, int fromHeight, int toHeight);
}

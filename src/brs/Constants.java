package brs;

import brs.props.Props;
import brs.util.Convert;

import java.util.Calendar;
import java.util.TimeZone;

public final class Constants {

  public static final int BURST_DIFF_ADJUST_CHANGE_BLOCK = 2700;

  public static final long BURST_REWARD_RECIPIENT_ASSIGNMENT_WAIT_TIME = 4;

  // not sure when these were enabled, but they each do an alias lookup every block if greater than the current height
  public static final long BURST_ESCROW_START_BLOCK = 0;
  public static final long BURST_SUBSCRIPTION_START_BLOCK = 0;
  public static final int BURST_SUBSCRIPTION_MIN_FREQ = 3600;
  public static final int BURST_SUBSCRIPTION_MAX_FREQ = 31536000;

  public static final int BLOCK_HEADER_LENGTH = 232;

  public static final long MAX_BALANCE_BURST = 500000000L;
  
  public static final long FEE_QUANT =    735000;
  public static final long ONE_BURST = 100000000;

  public static final long MAX_BALANCE_NQT = MAX_BALANCE_BURST * ONE_BURST;
  public static final long INITIAL_BASE_TARGET = 18325193796L;
  public static final long MAX_BASE_TARGET = 18325193796L;
  public static final int MAX_ROLLBACK = Burst.getPropertyService().getInt(Props.DB_MAX_ROLLBACK);

  public static final int MAX_ALIAS_URI_LENGTH = 1000;
  public static final int MAX_ALIAS_LENGTH = 100;

  public static final int MAX_ARBITRARY_MESSAGE_LENGTH = 1000;
  public static final int MAX_ENCRYPTED_MESSAGE_LENGTH = 1000;

  public static final int MAX_MULTI_OUT_RECIPIENTS = 64;
  public static final int MAX_MULTI_SAME_OUT_RECIPIENTS = 128;

  public static final int MAX_ACCOUNT_NAME_LENGTH = 100;
  public static final int MAX_ACCOUNT_DESCRIPTION_LENGTH = 1000;

  public static final long MAX_ASSET_QUANTITY_QNT = 1000000000L * 100000000L;
  public static final long ASSET_ISSUANCE_FEE_NQT = 1000 * ONE_BURST;
  public static final int MIN_ASSET_NAME_LENGTH = 3;
  public static final int MAX_ASSET_NAME_LENGTH = 10;
  public static final int MAX_ASSET_DESCRIPTION_LENGTH = 1000;
  public static final int MAX_ASSET_TRANSFER_COMMENT_LENGTH = 1000;

  public static final int MAX_POLL_NAME_LENGTH = 100;
  public static final int MAX_POLL_DESCRIPTION_LENGTH = 1000;
  public static final int MAX_POLL_OPTION_LENGTH = 100;
  public static final int MAX_POLL_OPTION_COUNT = 100;

  public static final int MAX_DGS_LISTING_QUANTITY = 1000000000;
  public static final int MAX_DGS_LISTING_NAME_LENGTH = 100;
  public static final int MAX_DGS_LISTING_DESCRIPTION_LENGTH = 1000;
  public static final int MAX_DGS_LISTING_TAGS_LENGTH = 100;
  public static final int MAX_DGS_GOODS_LENGTH = 10240;

  public static final int NQT_BLOCK = 0;
  public static final int REFERENCED_TRANSACTION_FULL_HASH_BLOCK = 0;
  public static final int REFERENCED_TRANSACTION_FULL_HASH_BLOCK_TIMESTAMP = 0;

  public static final int MAX_AUTOMATED_TRANSACTION_NAME_LENGTH = 30;
  public static final int MAX_AUTOMATED_TRANSACTION_DESCRIPTION_LENGTH = 1000;

  public static final String HTTP = "http://";

  public static final Version MIN_VERSION = Version.parse("v2.3.0");



  static final long UNCONFIRMED_POOL_DEPOSIT_NQT = (Burst.getPropertyService().getBoolean(Props.DEV_TESTNET) ? 50 : 100) * ONE_BURST;

  // TODO burstkit4j integration
  public static final long EPOCH_BEGINNING;

  public static final int PREMINE_HEIGHT = 1;
  public static final int SKIP_MORTGAGE_POOL_CHECK_HEIGHT = 100;
  public static final long PREMINE_ID = Long.parseUnsignedLong("12509357112034180029");
  public static final long PREMINE_AMOUNT = 292620000 * ONE_BURST;
  public static final long[] STAKING_IDS = {
          Long.parseUnsignedLong("7358512608409874225"),//staking1
          Long.parseUnsignedLong("14995275632074903707"),//staking2
          Long.parseUnsignedLong("2774882677540801629"),//3
          Long.parseUnsignedLong("14033975931155167123"),//4
          Long.parseUnsignedLong("11775530793619959633"),//5
          Long.parseUnsignedLong("16952416984149542298"),//6
          Long.parseUnsignedLong("9963327695438949630"),//7
          Long.parseUnsignedLong("5293461769518076975"),//8
          Long.parseUnsignedLong("10313345753234817146"),//9
          Long.parseUnsignedLong("18359638716101004076"),//10
          Long.parseUnsignedLong("17281756849206331427"),//11
          Long.parseUnsignedLong("8067853692572585010"),//12
          Long.parseUnsignedLong("2502157479182474125"),//13
          Long.parseUnsignedLong("721349214401603469"),//14
          Long.parseUnsignedLong("622673537767015939"),//15
          Long.parseUnsignedLong("10992104799434473695"),//16
          Long.parseUnsignedLong("13037153644320239612"),//17
          Long.parseUnsignedLong("12371695859369518315"),//18
          Long.parseUnsignedLong("1407751061541891832"),//19
          Long.parseUnsignedLong("439912504359407565"),//20
          Long.parseUnsignedLong("7483164054028971409"),//21
          Long.parseUnsignedLong("4189304022601593503"),//22
          Long.parseUnsignedLong("6956367874848565658"),//23
          Long.parseUnsignedLong("11716241698811788150"),//24
          Long.parseUnsignedLong("4765687071104058548"),//25
          Long.parseUnsignedLong("7608716179309564516"),//26
          Long.parseUnsignedLong("17313036209227153040"),//27
          Long.parseUnsignedLong("10520662632769854961"),//28
          Long.parseUnsignedLong("8813777027885744880"),//29
          Long.parseUnsignedLong("14754955042456122269"),//30
          Long.parseUnsignedLong("1873900276549588744"),//31
          Long.parseUnsignedLong("8464565148991044840"),//32
          Long.parseUnsignedLong("9445342936864502015"),//33
          Long.parseUnsignedLong("540525306832652164"),//34
          Long.parseUnsignedLong("9468822209787466480")//35
  };
  public static final int STAKING_PERCENTAGE = 30;
  public static final int AVG_CAPACITY_BLOCK_COUNT = 1000;
  public static final long POOL_MORTGAGE_AMOUNT = 500000 * ONE_BURST;
  public static final long UNIT_MORTGAGE_AMOUNT = 500 * ONE_BURST;

  public static final long[] POOL_IDS = {
          Long.parseUnsignedLong("8297987649134348731"),//1
          Long.parseUnsignedLong("11613457366847202426"),//2
          Long.parseUnsignedLong("18337995512692526917"),//3
          Long.parseUnsignedLong("7130251833096747092"),//4
          Long.parseUnsignedLong("9245262305802459368"),//5
          Long.parseUnsignedLong("8524879085519183874"),//6
          Long.parseUnsignedLong("12264689937133027744"),//7
          Long.parseUnsignedLong("15660242653645687017"),//8
          Long.parseUnsignedLong("1137795852083791137"),//9
          Long.parseUnsignedLong("794142679832940081"),//10
          Long.parseUnsignedLong("1157185379816003938"),//11
          Long.parseUnsignedLong("4374660774801773444"),//12
          Long.parseUnsignedLong("16477470428011068368"),//13
          Long.parseUnsignedLong("9031685606892484091"),//14
          Long.parseUnsignedLong("7989144713554390579"),//15
          Long.parseUnsignedLong("11817744958654335825"),//16
          Long.parseUnsignedLong("5194040972658191160"),//17
          Long.parseUnsignedLong("7860869484753016045"),//18
          Long.parseUnsignedLong("7182566816633958671"),//19
          Long.parseUnsignedLong("17923787550812243165"),//20
          Long.parseUnsignedLong("2222404342631568049"),//21
          Long.parseUnsignedLong("1346799512168973584"),//22
          Long.parseUnsignedLong("5386114355366042092"),//23
          Long.parseUnsignedLong("5464037515025881097"),//24
          Long.parseUnsignedLong("15582106402394540790"),//25
          Long.parseUnsignedLong("10388307487248332996"),//26
          Long.parseUnsignedLong("13573653546796749031"),//27
          Long.parseUnsignedLong("1318934288655743142"),//28
          Long.parseUnsignedLong("13013241870043089773"),//29
          Long.parseUnsignedLong("9435662706419802642"),//30
          Long.parseUnsignedLong("5024192267140338190"),//31
          Long.parseUnsignedLong("9959696812870152511"),//32
          Long.parseUnsignedLong("11281428947983036673"),//33
          Long.parseUnsignedLong("5280164457011058880"),//34
          Long.parseUnsignedLong("1675709297942367128")//35

  };

  public static final String ADDRESS_PREFIX = "BNTDE-";

  public static final int STAKING_BLOCK_COUNT = 64800;

  public static final int INITIAL_REWARD_AMOUNT = 65;
  public static final int ZERO_REWARD_HEIGHT = 13413600;
  public static final int REWARD_DEC_DURATION = 64800;
  public static final int REWARD_DEC_PERCENTAGE = 98;







  static {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.set(Calendar.YEAR, 2014);
    calendar.set(Calendar.MONTH, Calendar.AUGUST);
    calendar.set(Calendar.DAY_OF_MONTH, 11);
    calendar.set(Calendar.HOUR_OF_DAY, 2);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    EPOCH_BEGINNING = calendar.getTimeInMillis();

    if (MAX_ROLLBACK < 1440) {
      throw new RuntimeException("brs.maxRollback must be at least 1440");
    }
  }

  public static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyz";

  public static final int EC_RULE_TERMINATOR = 2400; /* cfb: This constant defines a straight edge when "longest chain"
                                                        rule is outweighed by "economic majority" rule; the terminator
                                                        is set as number of seconds before the current time. */

  public static final int EC_BLOCK_DISTANCE_LIMIT = 60;
  public static final int EC_CHANGE_BLOCK_1 = 67000;

  public static final String RESPONSE = "response";
  public static final String TOKEN = "token";
  public static final String WEBSITE = "website";
  public static final String PROTOCOL = "protocol";

  public static final int BLOCK_PROCESS_THREAD_DELAY = 500; // Milliseconds

  private Constants() {
  } // never

}


package stream.interfaces;

/**
 *
 * @author yuzo
 */
public interface KafkaConstantsInterface {
    
    public static String KAFKA_BROKERS = "localhost:9092";
    public static Integer MESSAGE_COUNT = 1000;
    public static String CLIENT_ID = "ClientID_10";
    public static String TOPIC_NAME = "Blue_Sea";
    public static String GROUP_ID_CONFIG = "ConsumerGroup";
    public static Integer MAX_NO_MESSAGE_FOUND_COUNT = 100;
    public static String OFFSET_RESET_LATEST = "latest";
    public static String OFFSET_RESET_EARLIER = "earliest";
    public static Integer MAX_POLL_RECORDS = 1;
    
}

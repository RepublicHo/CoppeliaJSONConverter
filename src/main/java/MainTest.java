import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 9/7/2022
 * @Description: Map a complex JSON value to an array of simple objects
 */
public class MainTest {
    static class Output {
        @JsonProperty("value")
        String value;

        @Override
        public String toString() {
            return "Output [value=" + value + "]";
        }

    }


    /**
     * Get the content of the file in String.
     * @param file as path relative
     * @return the String of the content in the file
     * @throws IOException
     */
    public static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) throws JsonMappingException, JsonProcessingException, IOException {
        String file = "src/main/resources/test.json";
        String jsonString = readFileAsString(file);
//        String json = "{\"data\":{\"account_summary\":[{\"aggregation\":{\"activeAccounts\":{\"value\":\"0\"},\"deletedAccounts\":{\"value\":\"1\"},\"holdAccounts\":{\"value\":\"3\"}},\"accountHolder\":\"John\"}]}}";

        ObjectMapper m;
        m = new ObjectMapper();
        AccountInfo a = m.readValue(jsonString, AccountInfo.class);
        System.out.println(a);
    }

    static class AccountInfo {

        @JsonProperty("data")
        Data data;

        @Override
        public String toString() {
            return "AccountInfo [data=" + data + "]";
        }
    }

    static class Data {
        @JsonProperty("account_summary")
        List<AccountSumamry> accountSummary;

        @Override
        public String toString() {
            return "Data [accountSummary=" + accountSummary + "]";
        }

    }

    static class AccountSumamry {
        @JsonProperty("aggregation")
        Aggregation aggregation;
        @JsonProperty("accountHolder")
        String accountHolder;

        @Override
        public String toString() {
            return "AccountSumamry [aggregation=" + aggregation + ", accountHolder=" + accountHolder + "]";
        }

    }

    static class Aggregation {
        @JsonProperty("FeatureSatisfaction")
        Output featureSatisfaction;
        @JsonProperty("deletedAccounts")
        Output action;
        @JsonProperty("holdAccounts")
        Output relevanceTotal;
        Output similarity;
        Output similarityTotal;


//        @Override
//        public String toString() {
//            return "Aggregation [activeAccounts=" + activeAccounts + ", deletedAccounts=" + deletedAccounts
//                    + ", holdAccounts=" + holdAccounts + "]";
//        }

    }


}

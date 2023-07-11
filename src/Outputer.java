import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Outputer {
    public static String formData(String head, HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        System.out.println(head);
        for (Map.Entry<String, String> m : map.entrySet()) {
            count++;
            sb.append(count).append(") ").append(m.getKey()).append(",").append(m.getValue()).append("\n");
        }
        return sb.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}

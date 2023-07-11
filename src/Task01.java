import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {

        String title = " Initial data: ";
        HashMap<String, String> map = getInitData();
        Outputer.getOutput(Outputer.formData(title, map));
        title = " Update data: ";
        map.replace("banana", "25 kg", "14 kg");
        Outputer.getOutput(Outputer.formData(title, map));
    }

    private static HashMap<String, String> getInitData() {
        HashMap<String, String> map;
        map = new HashMap<>();
        map.put("orange", "12 kg");
        map.put("banana", "25 kg");
        map.put("lemon", "8 kg");
        map.put("pineapple", "13 kg");
        map.put("grape", "9 kg");
        return map;
    }
}

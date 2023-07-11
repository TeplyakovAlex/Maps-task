import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {

        String title = " Initial data: ";
        HashMap<String, String> map = getInitData();
        Outputer.getOutput(Outputer.formData(title, map));

        System.out.print("Enter search product name: ");
        title = " Result: ";
        HashMap<String, String> mapSearch = getResult(Inputer.inputText(), map);
        Outputer.getOutput(Outputer.formData(title, mapSearch));

    }

    private static HashMap<String, String> getResult(String code, Map<String, String> map) {
        boolean hasContain = map.containsKey(code);
        if (hasContain) {
            String name = map.get(code);
            map.clear();
            map.put(code, name);
            return (HashMap<String, String>) map;
        } else {
            map.clear();
            map.put(code, " not found!");
            return (HashMap<String, String>) map;
        }
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

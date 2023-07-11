import java.util.HashMap;
import java.util.LinkedHashMap;

public class Tast03 {
    public static void main(String[] args) {

        String title = " Initial data: ";
        HashMap<String, String> map = getInitData();
        Outputer.getOutput(Outputer.formData(title, map));
        title = " Update data: ";
        map.replace("Tom", "tom@mail.com", "tomasdev@glob.net");
        Outputer.getOutput(Outputer.formData(title, map));
    }

    private static LinkedHashMap<String, String> getInitData() {
        LinkedHashMap<String, String> map;
        map = new LinkedHashMap<>();
        map.put("Tom", "tom@mail.com");
        map.put("Lisa", "lisa@mail.com");
        map.put("Alice", "alisa@mail.com");
        map.put("Denis", "den@mail.com");
        return map;
    }
}

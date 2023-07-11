import java.util.Scanner;

public class Inputer {
    public static String inputText() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().trim();
    }
}

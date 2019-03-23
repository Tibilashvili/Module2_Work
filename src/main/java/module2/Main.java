package module2;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("src/MyOwnFile"));
        String str = "";

        while (scanner.hasNext()){
            str+=scanner.nextLine() + "\n";
            new TreeBuilder().buildRepitionsMap(str);
            System.out.println(str);

        }

        scanner.close();

    }
}

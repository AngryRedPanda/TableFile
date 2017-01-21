import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Formatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner fin = new Scanner(new File ("in.text"));
             PrintStream fout = new PrintStream(new File("out.txt"));) {
            while (fin.hasNext()) {
                int al = fin.nextInt();
                System.out.println(al);
                String table = "";
                for (int j = 1; j < 3; j++) {
                    for (int i = 0; i < 1000; i++) {
                        table += Math.pow((double) i, (double) j) + "\t";
                    }
                    table += "\n";
                }
                fout.print(table);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Не найдено");
        }


        /*String table = "";
        for (int j = 1; j < 4; j++) {
            for (int i = 1; i < 1001; i++) {
                table += (int) Math.pow((double) i, (double) j) + "\t";
            }
            table += "\n";
        }

        try {
            Formatter f = new Formatter("test.txt");
            f.format("%s", table);
            f.close();
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println(table);
*/
}
}

/*


        */

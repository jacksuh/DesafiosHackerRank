package javabasico;
import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(in.nextInt());
        }

        int queries = in.nextInt();
        for (int l = 0; l < queries; l++) {
            String query = in.next();

            switch (query) {
                case "Insert":
                    int index = in.nextInt();
                    int value = in.nextInt();
                    source.add(index, value);
                    break;
                case "Delete":
                    source.remove(in.nextInt());
                    break;
            }
        }

        for (Integer i : source) {
            System.out.print(i + " ");
        }

        in.close();
    }
}

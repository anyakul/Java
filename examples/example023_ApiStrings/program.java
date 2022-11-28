package examples.example023_ApiStrings;

public class program {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("+");
        }

        System.out.println(sb);

        // 9ms
    }
}

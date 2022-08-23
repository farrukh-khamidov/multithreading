public class Main2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.print(i);
        }

        for (int i = 0; i < 100000; i++) {
            System.out.print('a');
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - startTime);

    }
}
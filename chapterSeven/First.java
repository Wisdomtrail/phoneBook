package chapterSeven;

public class First {
    public static void main(String[] args) {
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

             for (int counter = 0; counter < array.length; counter++) {
                 System.out.printf("%3d%8d%n", counter, array[counter]);

             }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("HW8 - array chapter 1");

        /* task1 */
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float [] floatNumbers = {1.57f, 7.654f, 9.986f};
        String [] text = {"one", "two", "three"};

        /* task2 */
        for (int i = 0; i < numbers.length - 1; i++){
            System.out.print(numbers[i] + ",");
        }
        System.out.print(numbers[2]);
        System.out.println();
        for (int i = 0; i < floatNumbers.length - 1; i++){
            System.out.print(floatNumbers[i] + ",");
        }
        System.out.print(floatNumbers[2]);
        System.out.println();
        for (int i = 0; i < text.length - 1; i++){
            System.out.print(text[i] + ",");
        }
        System.out.print(text[2]);
        System.out.println();
        /* task3 */
        for (int i = 2; i > 0; i--){
            System.out.print(numbers[i] + ",");
        }
        System.out.print(numbers[0]);
        System.out.println();
        for (int i = 2; i > 0; i--){
            System.out.print(floatNumbers[i] + ",");
        }
        System.out.print(floatNumbers[0]);
        System.out.println();
        for (int i = 2; i > 0; i--){
            System.out.print(text[i] + ",");
        }
        System.out.print(text[0]);

    }
}
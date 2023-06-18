public class Task2 {
    public static void main(String[] args) {

        int[] Array = { 1, 7, 8, 2, 3, 4, 5, 6, 7, 8, 11 };
        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
/**
 * 1. Добавил массив Array.
 * 2. Привел числитель выражения double catchedRes1 = (double) intArray[8] / d
 * к double, чтобы получилось double без потери дробной части.
 * 3. Добавил исключение ArrayIndexOutOfBoundsException, если массив задан меньше 8.
 */
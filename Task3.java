public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}

/**
 * 1. Переместил исключение Throwable в самый конец исключений, чтобы оно не
 * мешало вызову исключений, которые являются наследниками этого класса.
 * 2. В методе printSum заданное исключение FileNotFoundException не
 * подходит под содержание метода, т.к. метод не работает с файлами.
 * 3. NullPointerException - исключение, которое ни к чему неприменимо
 * в приведенном коде.
 */
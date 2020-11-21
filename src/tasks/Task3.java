package tasks;

public class Task3 {

    public static int incrementIfPositive(int a) {
        return a > 0 ? a + 1 : a;
    }

    public static boolean determineAdult(int age) {
        if (age >= 18) {
            return true;
        } else if (age < 0) {
            System.out.println("Ошибка! Введите правильный возраст.");
        }
        return false;
    }

    public static long determineRainfall(double area, double rainfallAmount) {
        return (long) (2 * area * 1000000 * rainfallAmount);
    }

    public static int getMinFromTwo(int x, int y) {
        return x < y ? x : y;
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
        return getMinFromTwo(getMinFromTwo(x, y), getMinFromTwo(m, n));
    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    static int[] fillArray(int x) {
        int[] result = new int[x];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

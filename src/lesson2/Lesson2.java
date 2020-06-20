package lesson2;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * <p>
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * <p>
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
 * и вывести результат расчета.
 */

public class Lesson2 {

    public static void main(String[] args) {
        String[][] array =
                {{"1", "2", "3", "4"}, // 1x4
                        {"4", "4", "2", "1"}, // 2x4
                        {"3", "2", "1", "4"}, // 3x4
                        {"2", "1", "a", "3"}}; // 4x4
        System.out.println("Получен массив. . . ");
        System.out.println("Начинаю суммировать. . .");
        try {
            System.out.println(arraySum(array, 4, 4));
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение . . .");

    }


    private static int arraySum(String[][] in, int rowsSize, int columnsSize) {
        int sum = 0;
        // проверяем на размер
        if ((in.length != rowsSize) & (in.length != columnsSize)) {
            throw new MyArraySizeException(rowsSize, columnsSize);
        }

        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                try {
                    sum += Integer.parseInt(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }


        return sum;
    }

    public static class MyArraySizeException extends ArrayIndexOutOfBoundsException {
        MyArraySizeException(int arraySizeFirst, int arraySizeSecond) {
            System.err.printf("Размер массива дожен быть %sх%s! \n", arraySizeFirst, arraySizeSecond);
        }
    }

    public static class MyArrayDataException extends NumberFormatException {
        MyArrayDataException(int row, int column) {
            System.err.printf("Невозможно преобразовать в число. Ошибка в %s строке, %s столбце массива. \n", row + 1, column + 1);
        }
    }

}

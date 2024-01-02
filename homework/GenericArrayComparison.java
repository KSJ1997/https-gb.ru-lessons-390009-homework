public class GenericArrayComparison {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверка на null и равную длину массивов
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        // Сравнение элементов массивов
        for (int i = 0; i < array1.length; i++) {
            // Проверка на null элементов
            if (array1[i] == null || array2[i] == null) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            } else if (!array1[i].getClass().equals(array2[i].getClass()) || !array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Пример использования метода compareArrays() для массивов разных типов
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {1, 2, 3};
        System.out.println("Integer Arrays are equal: " + compareArrays(intArray1, intArray2));

        String[] strArray1 = {"a", "b", "c"};
        String[] strArray2 = {"a", "b", "c"};
        System.out.println("String Arrays are equal: " + compareArrays(strArray1, strArray2));

        // Пример с массивами разной длины
        Double[] doubleArray1 = {1.1, 2.2, 3.3};
        Double[] doubleArray2 = {1.1, 2.2};
        System.out.println("Double Arrays are equal: " + compareArrays(doubleArray1, doubleArray2));

        // Пример с массивами разных типов данных
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"1", "2", "3"};
        System.out.println("Different Type Arrays are equal: " + compareArrays(intArray, strArray));
    }
}

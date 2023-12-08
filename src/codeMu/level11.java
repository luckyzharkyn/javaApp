package codeMu;

public class level11 {
    public static void main(String[] args) {
        // №1 Дан массив с целыми числами:
//         int[] arr = {1, 2, 3, 4, 5};
//        // Выведите в консоль элементы этого массива.
//        for(int i = 0; i < arr.length; i++) {
//            Helper.show(arr[i]);
//        }

        // №2 Дан массив со строками:
//         String[] arr = {"ab", "cd", "ef"};
        // Выведите в консоль первые символы элементов этого массива.
//            for(int i = 0; i < arr.length; i++) {
//                Helper.show(arr[i].charAt(0));
//            }

        //  №3 Дано некоторое целое число:
//        int num = 12345;
//        String o = Integer.toString(num);
//        // Найдите сумму всех его четных цифр.
//        int sum = 0;
//        for(int i = 0; i < o.length(); i++) {
//            int digit = Character.getNumericValue(o.charAt(i));
//            if(digit % 2 == 0) {
//                sum += digit;
//            }
//        }
//        Helper.show(sum);

        //  №4 Дано некоторое целое число:
//         byte num = 5;
//        // Найдите факториал этого числа.
//        int result = level11.factorial(1, num);
//        Helper.show(result);
    }

    static int factorial(int product, int value) {
        if (value <= 1) {
            return product;
        } else {
            product *= value;
            return factorial(product, value - 1);
        }
    }


}

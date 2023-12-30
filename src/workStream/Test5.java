package workStream;

import codeMu.Helper;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12,4,21,81,7,19};
//        array = Arrays.stream(array).sorted().toArray();
//        Helper.show(Arrays.toString(array));

        int result = Arrays.stream(array)
                .filter(x->x%2 == 1)
                .map(x->{
                    if(x % 3 == 0) {
                        x /= 3;
                    }
                    return x;
                }).reduce((acc, elem) -> acc+elem)
                .getAsInt();
        Helper.show(result);
    }
}

package workStream;

import codeMu.Helper;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream1.filter(x->{
//            Helper.show("!!!");
//            return x%2==0;
//        }).collect(Collectors.toList());

//        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//        stream4.forEach(Helper::show);

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream5.distinct().forEach(Helper::show);
//        long result = stream5.distinct().count();
//        Helper.show(result);

        Helper.show(stream5.distinct().peek(Helper::show).count());
    }
}

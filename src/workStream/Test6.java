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
    }
}

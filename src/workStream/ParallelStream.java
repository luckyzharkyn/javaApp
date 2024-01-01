package workStream;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.parallelStream()
//                .reduce((acc, elem) -> acc + elem).get();
//        Helper.show(sumResult);

//        double divisionResult = list.parallelStream()
//                .reduce((acc, elem) -> acc / elem).get();
//        Helper.show(divisionResult);
    }
}

package org.kovan.intern.advanced_data_and_exceptions.streams_and_lambdas;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class StreamStatisticsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new Random().ints(100,0,1000).boxed().sorted().toList();
        System.out.println("The Numbers are "+numbers);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Count: "+intSummaryStatistics.getCount());
        System.out.println("Sum: "+intSummaryStatistics.getSum());
        System.out.println("Min: "+intSummaryStatistics.getMin());
        System.out.println("Max: "+intSummaryStatistics.getMax());
        System.out.println("Average: "+intSummaryStatistics.getAverage());
    }
}

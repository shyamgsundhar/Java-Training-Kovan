package org.kovan.intern.advanced_data_and_exceptions.streams_and_lambdas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExercisesDemo {
    static List<Integer> numbers = Arrays.asList(10, 55, 23, 78, 90, 12, 45, 67, 78, 90, 5, 100, 3, 55);
    static List<String> names = Arrays.asList( "Arun", "Bala", "Anita", "Kumar", "Ajay", "Ravi", "Anita", "Deepa", "Aakash", "Bala");

    public static void main(String[] args) {
        List<Integer> evenIntegers = numbers.stream().filter(n->n%2==0).toList();
        System.out.println("The Even Numbers are "+evenIntegers);
        List<String> upperCaseStrings= names.stream().map(String::toUpperCase).toList();
        System.out.println("The Uppercase Strings Converted are "+upperCaseStrings);
        long greaterThan50 = numbers.stream().filter(n->n>50).count();
        System.out.println("The count of Number Greater than 50 are "+greaterThan50);
        List<String> startsWithA = names.stream().filter(n->n.startsWith("A")).toList();
        System.out.println("The Strings starts with A "+startsWithA);
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        System.out.println("The Distinct Elements are "+distinctNumbers);
        List<Integer> ascendingOrder = numbers.stream().sorted().toList();
        System.out.println("The Ascending Order is "+ascendingOrder);
        List<Integer> descendingOrder = numbers.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println("The Descending Order is "+descendingOrder);
        Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);
        System.out.println("Max is "+maxNum);
        Optional<Integer> minNum = numbers.stream().min(Integer::compareTo);
        System.out.println("Min is "+minNum);
        String commas=numbers.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println("The Comma Separated "+commas);
        long sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The Sum is "+sum);
        OptionalDouble avg = numbers.stream().mapToDouble(Number::doubleValue).average();
        System.out.println("The avg is "+avg);
        List<String> stringsWithLengthGreater5=names.stream().filter(len->len.length()>5).toList();
        System.out.println("The String with Length of Greater 5 "+stringsWithLengthGreater5);
        long vowelCount = names.stream().filter(w -> w.matches("(?i)^[aeiou].*")).count();
        System.out.println("Starts with vowel "+vowelCount);
        List<Integer> sqrEachNum=numbers.stream().map(n->n*n).toList();
        System.out.println("The Square List "+sqrEachNum);
        Optional<Integer> secondLargest = numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();
        System.out.println("The Second Largest "+secondLargest);
        List<?> merged= Stream.concat(names.stream(),numbers.stream()).distinct().toList();
        System.out.println("The Merged List is "+merged);
        Map<Boolean,List<Integer>> booleanListMap=numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even "+booleanListMap.get(true));
        System.out.println("Odd "+booleanListMap.get(false));
        Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
        List<Integer> divisible = numbers.stream().filter(n -> n % 3 == 0 && n % 5 == 0).distinct().toList();
        System.out.println("Divisible by 3 and 5: " + divisible);
    }
}

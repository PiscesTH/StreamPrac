package org.test;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("jane", 27));
        customers.add(new Customer("jane", 26));
        customers.add(new Customer("james", 25));
        customers.add(new Customer("luke", 33));
        customers.add(new Customer("tomas", 38));
        customers.add(new Customer("tomas", 38));
        customers.add(new Customer("mike", 30));
        System.out.println(customers.getClass());
        System.out.println(customers.get(0).getClass());
/*
        customers.stream().filter(customer -> customer.getAge() <= 30)
                .distinct()
                .sorted(Comparator.comparing(Customer::getName))
                .forEach(System.out::println);
        System.out.println("--------------------------------------");
        customers.stream().filter(customer -> customer.getAge() >= 30)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        */
        /*
        List<String> names = customers.stream().map(Customer::getName).collect(Collectors.toList());
        //위 아래 코드는 같은 결과를 가진다.
        //List<String> names = customers.stream().map(Customer::getName).toList();
        names.forEach(System.out::println);
        long nameCnt = names.stream().count();
        System.out.println("--------------------------------------");
        List<Integer> ages = customers.stream().map(Customer::getAge).toList();
        Set<String> setNames = customers.stream().map(Customer::getName).collect(Collectors.toSet());
        setNames.forEach(System.out::println);
        Map<String, Integer> mapCustomer = customers.stream().distinct().collect(Collectors.toMap(Customer::getName, Customer::getAge));
        System.out.println(ages.size());
        System.out.println("--------------------------------------");
        System.out.println(mapCustomer.getClass());
        mapCustomer.forEach((key, value) -> System.out.printf("%s : %d\n",key, value));
        System.out.println("--------------------------------------");
        int[] arr = customers.stream().mapToInt(Customer::getAge).toArray();
        IntStream intStream = customers.stream().mapToInt(Customer::getAge);
        int ageCnt = ages.size();
        */
        List<Customer> janes = customers.stream().filter(customer -> "jane".equals(customer.getName())).distinct().sorted().toList();
        System.out.println(janes.getClass());
        janes.forEach(System.out::println);
    }
}

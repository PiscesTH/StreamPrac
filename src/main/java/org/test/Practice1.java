package org.test;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("C++");
        list.add("React");

        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("--------------------------------");
        //아래 코드는 모두 동일한 결과
        list.stream().forEach((String str) -> {System.out.println(str);});
        //람다식
        list.stream().forEach((String str) -> System.out.println(str) );
        //구현부 코드가 한줄이면 ;, {} 생략 가능
        list.stream().forEach((str) -> System.out.println(str) );
        //파라미터 타입 유추 가능할 때 타입 생략 가능
        list.stream().forEach(str -> System.out.println(str) );
        //파라미터가 하나이면 () 생략 가능 (많이 쓰는 방식). 두개 이상일 땐 생략 불가능
        list.stream().forEach( System.out::println );
        //함수 레퍼런스 방식

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);    //스트림 사용
        //stream.forEach(System.out::println);    //예외 발생

        Stream.Builder<String> sb = Stream.builder();
        sb.accept("Spring");
        sb.accept("Summer");
        sb.accept("Fall");
        sb.accept("Fall");
        sb.add("Winter").add("Seasons");

        Stream<String> sbStream = sb.build();
        sbStream.distinct().forEach(System.out::println);

    }
}

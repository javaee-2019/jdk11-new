package com.shanmu2020.jdk11.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionTest {
    @Test
    public void test5() {
        List<String> list = List.of("Java", "Python", "C"); //不可变集合
        List<String> copy = List.copyOf(list); //copyOf判断是否是不可变集合类型，如果是直接返回
        System.out.println(list == copy); // true
        List<String> list1 = new ArrayList<String>(); // 这里返回正常的集合
        List<String> copy1 = List.copyOf(list1); // 这里返回一个不可变集合
        System.out.println(list1 == copy1); // false
    }

    @Test
    public void test20() {
        Stream.of(6, 10, 11, 15, 20)
                .takeWhile(model-> model%2==0)
                .forEach(System.out::println);//6 10
    }
}

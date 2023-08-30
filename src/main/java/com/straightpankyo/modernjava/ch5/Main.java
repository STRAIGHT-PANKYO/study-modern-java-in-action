/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.straightpankyo.modernjava.ch5;

import com.straightpankyo.modernjava.ch2.Unit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>자세한 기능을 적어주세요
 *
 * <p><b>Example:</b> 사용법을 간단히 적어주세요</p>
 *
 * <pre class="code">
 *  Demo demo = new Demo();
 *  demo.print("Hello Nhn");
 * </pre>
 *
 * @author hyunjin-jo
 * @see com.example.demo.DemoApplication
 * @since 1.0
 */
public class Main {

    public void test() {
        List<Unit> units = new ArrayList<>();

        List<Unit> smallUnits = units.stream()
                                     .filter(Unit::isSmall)
                                     .collect(Collectors.toList());

        units.stream()
             .filter(Unit::isSmall)
             .distinct()
             .forEach(System.out::println);

        List<String> words = Arrays.asList("Hello", "World");

        words.stream()
             .map(word -> word.split(""))
             .distinct()
             .collect(Collectors.toList());

        words.stream()
             .map(word -> word.split(""))
             .flatMap(Arrays::stream)
             .distinct()
             .collect(Collectors.toList());

        List<Integer> integers = List.of(4, 5, 3, 9);

        int sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }

        Integer sum = integers.stream().reduce(0, Integer::sum);

        List<String> numbers = List.of("1, 2,3");
        numbers.stream();

        Stream.of("1, 2, 3");
    }
}

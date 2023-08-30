/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.straightpankyo.modernjava.ch3;

import static java.util.Comparator.comparing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class Main {

    public String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("hello.txt"))) {

            return p.process(br);
        }
    }

    public void test() throws IOException {
        processFile((BufferedReader br) -> br.readLine() + br.readLine());

        Integer::parseInt;

        Comparator
        comparing()

    }

}

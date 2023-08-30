/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.straightpankyo.modernjava.ch3;

import java.io.BufferedReader;
import java.util.function.Function;

public  interface BufferedReaderProcessor<T extends BufferedReader> extends Function<T, String> {
    <V> void a(V x);
}

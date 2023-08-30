/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.straightpankyo.modernjava.ch3;

import java.io.BufferedReader;
import java.io.Reader;

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
public class MyBufferdReader extends BufferedReader {

    public MyBufferdReader(Reader in, int sz) {
        super(in, sz);
    }

    public MyBufferdReader(Reader in) {
        super(in);
    }
}

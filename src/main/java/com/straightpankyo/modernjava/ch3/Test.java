/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.straightpankyo.modernjava.ch3;


public abstract class Test {
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Test() {
        super();
    }
}


abstract class B {
    abstract void a();
}
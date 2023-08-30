package com.straightpankyo.modernjava.ch2;

import lombok.Getter;

@Getter
public class Unit {

    private String name;
    private Integer weight;
    private Integer mineral;
    private Integer gas;
    private Size size;
    private final boolean isSmall;

    public Unit(String name, Integer weight, boolean isSmall) {
        this.weight = weight;
        this.name = name;
        this.isSmall = isSmall;
    }


    public boolean isSmall() {
        return isSmall;
    }


}

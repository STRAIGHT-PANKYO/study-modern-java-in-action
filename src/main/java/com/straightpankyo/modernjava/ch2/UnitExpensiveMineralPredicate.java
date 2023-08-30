package com.straightpankyo.modernjava.ch2;

public class UnitExpensiveMineralPredicate implements UnitPredicate{

    @Override
    public boolean test(Unit unit) {
        return unit.getMineral() > 250;
    }
}
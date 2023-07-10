package com.straightpankyo.modernjava;

public class UnitCheapGasPredicate implements UnitPredicate{

    @Override
    public boolean test(Unit unit) {
        return unit.getGas() < 100;
    }
}

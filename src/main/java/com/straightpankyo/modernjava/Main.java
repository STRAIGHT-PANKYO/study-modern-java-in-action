package com.straightpankyo.modernjava;

import static com.straightpankyo.modernjava.Size.SMALL;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    private List<Unit> filterSmallUnits(List<Unit> unitList) {
        List<Unit> result = new ArrayList<>();
        for (Unit unit : unitList) {
            if (SMALL.equals(unit.getSize())) {
                result.add(unit);
            }
        }

        return result;
    }

    private List<Unit> filterUnitsBySize(List<Unit> units, Size size) {
        ...
    }

    private List<Unit> filterUnits(List<Unit> unitList, UnitPredicate p) {
        ArrayList<Unit> result = new ArrayList<>();
        for (Unit unit : unitList) {
            if (p.test(unit)) {
                result.add(unit);
            }
        }

        return result;
    }


    private List<Unit> filterUnits2() {
        ArrayList<Unit> unitList = new ArrayList<>();
        List<Unit> units = filterUnits(unitList, unit -> SMALL.equals(unit.getSize()));


        filter(unitList, (Unit unit) -> SMALL.equals(unit.getSize()));
    }

    private <T> List<T> filter(List<T> list, Predicate<T> p) {
        ArrayList<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }

        return result;
    }


}

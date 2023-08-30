package com.straightpankyo.modernjava.ch2;

import static com.straightpankyo.modernjava.ch2.Size.SMALL;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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


    private List<Unit> filterUnits(List<Unit> unitList, UnitPredicate p) {
        ArrayList<Unit> result = new ArrayList<>();
        for (Unit unit : unitList) {
            if (p.test(unit)) {
                result.add(unit);
            }
        }

        return result;
    }


    private <T> List<T> filter(List<T> list, Predicate<T> p) {
        ArrayList<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }

        Supplier<Unit> marine = Unit::new;
        BiFunction<String, Integer, Unit> strangeMarine = Unit::new;

        return result;
    }


}

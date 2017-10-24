package fr.utt.if26.mouloud_kevin_corentin.entities;


import java.util.Comparator;

public class ModuleTriCredit implements Comparator<Module> {

    public int compare(Module m1, Module m2) {
        if (m1.getCredit() > m2.getCredit()) {
            return 1;
        } else if (m1.getCredit() < m2.getCredit()) {
            return -1;
        } else {
            return 0;
        }

    }
}

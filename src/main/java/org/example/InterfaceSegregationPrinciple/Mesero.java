package org.example.InterfaceSegregationPrinciple;

public class Mesero implements Cleaner {
    @Override
    public void cleanTable() {
        System.out.println("Conserje limpiando la mesa.");
    }
}

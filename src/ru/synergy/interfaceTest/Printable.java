package ru.synergy.interfaceTest;

public abstract class Printable {
    abstract void print();

    void read(String appendString){
        System.out.println("Read printable" + "//// Appended string//// -> + appendedString ");
    }


}

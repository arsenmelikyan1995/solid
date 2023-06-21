package org.example.SingleOpenLiskov;

public class Computer {
    String name;
    int memorySize;


    public Computer(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }

    public void setDate(String name){
        this.name = name;
    }

//    public void save(){
//        System.out.println("Saved object class in file");
//    }
//
//    public void load(){
//        System.out.println("Loading object class from file");
//    }

}

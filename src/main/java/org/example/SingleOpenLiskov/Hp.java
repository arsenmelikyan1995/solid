package org.example.SingleOpenLiskov;

public class Hp extends Computer{
    public Hp(String name, int memorySize) {
        super(name, memorySize);
    }

    public void setDate(String name){
        this.name = name;
        this.memorySize = 8000;
    }

}

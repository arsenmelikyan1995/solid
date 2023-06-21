package org.example.SingleOpenLiskov;

public class SaveComputerToFile implements SaveComputer{

    @Override
    public void save(String path,Computer computer){

        System.out.println("Saving in file " + path + ", " + computer);
    }

}

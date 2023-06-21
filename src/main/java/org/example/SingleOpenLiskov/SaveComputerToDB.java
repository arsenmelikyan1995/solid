package org.example.SingleOpenLiskov;

public class SaveComputerToDB implements SaveComputer {
    @Override
    public void save(String path, Computer computer) {
        System.out.println("Saving in DB " + path + ", " + computer);

    }
}

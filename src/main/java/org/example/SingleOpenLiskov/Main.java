package org.example.SingleOpenLiskov;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("IBM XT", 5000);
//        computer.save();
        SaveComputer saveComputer = new SaveComputerToFile();
        saveComputer.save("out.dat", computer);
        saveComputer = new SaveComputerToDB();
        saveComputer.save("out.dat", computer);
        test();
    }

    public static void test() {
        Computer computer = new Computer("IBM XT", 5000);
        Computer computer2 = new Hp("HP", 5000);

        computer2.setDate("IBM XT");
        if (computer.name.compareTo(computer2.name) == 0 && computer.memorySize == computer2.memorySize) {
            System.out.println("test OK");
        } else {
            System.out.println("test fail");

        }
    }
}
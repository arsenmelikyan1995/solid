package org.example.interfaceSegregationPrinciple;

public class Line implements ILine{
    @Override
    public void drawLint() {
        System.out.println("Painting Line");
    }

}

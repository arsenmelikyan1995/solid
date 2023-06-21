package org.example.interfaceSegregationPrinciple;

//public class Circle implements Shape{
public class Circle implements ICircle{
//    @Override
//    public void drawLint() {
//
//    }

    @Override
    public void drawCircle() {
        System.out.println("Painting Circle");
    }
//
//    @Override
//    public void drawRect() {
//
//    }
}

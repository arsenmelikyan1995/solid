package org.example.interfaceSegregationPrinciple;

//public class Rectangle implements Shape{
public class Rectangle implements IRectangle{

    @Override
    public void drawRect() {
        System.out.println("Painting Rectangle");
    }
}
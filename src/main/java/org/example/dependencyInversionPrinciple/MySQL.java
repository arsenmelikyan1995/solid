package org.example.dependencyInversionPrinciple;

public class MySQL implements ISQL{

    @Override
    public void save(IForm frm){
        System.out.println("Save form in DB");
    }
}

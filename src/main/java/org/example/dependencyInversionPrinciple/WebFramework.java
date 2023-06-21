package org.example.dependencyInversionPrinciple;

public class WebFramework {

    public void save(IForm frm){
       ISQL db = new MySQL();
        db.save(frm);
    }

}

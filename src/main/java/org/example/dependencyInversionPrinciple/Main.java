package org.example.dependencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {
        ModelForm form = new ModelForm(1, 30, "Qwerty");
        WebFramework w = new WebFramework();
        w.save(form);
    }
}

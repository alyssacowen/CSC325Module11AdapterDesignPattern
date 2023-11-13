package org.example;


public class Insert_USA_Plug implements USA_Plug {
    // Overrides method from USA_Plug interface
    // This function sets the behavior when inserting this USA plug
    @Override
    public void insertPlug()
    {
        System.out.println("Inserting the USA Plug");
    }

}


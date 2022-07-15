package com.company.Structural.Decorator;

public class StormtrooperMedic extends PersonajDecorator
{

    public StormtrooperMedic(Personaj personaj)
    {
        super(personaj);
    }

    public String Heal(){return "Ліквати!!!";}

    @Override
    public String UseSkills() {
        return super.UseSkills()+Heal();
    }
}

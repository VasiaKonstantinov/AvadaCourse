package com.company.Structural.Decorator;

public class Game
{
    public static void main(String[] args)
    {
        Personaj personaj = new Sniper(new StormtrooperMedic(new Stormtrooper()));

        System.out.println(personaj.UseSkills());
    }

}

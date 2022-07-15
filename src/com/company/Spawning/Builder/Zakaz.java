package com.company.Spawning.Builder;

public class Zakaz
{
    public static void main(String[] args)
    {
        Director director = new Director();

        director.setBuilder(new CommonPc());

        PC pc = director.BuildPC();

        System.out.println(pc);
    }
}

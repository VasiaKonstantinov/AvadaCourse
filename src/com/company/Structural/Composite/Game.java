package com.company.Structural.Composite;

public class Game {
    public static void main(String[] args) {


    Team team = new Team();

    Personaj sniper = new Sniper();
    Personaj second_sniper = new Sniper();
    Personaj medic = new Medic();

    team.addPersonaj(sniper);
    team.addPersonaj(second_sniper);
    team.addPersonaj(medic);


    team.createTeam();
    }
}
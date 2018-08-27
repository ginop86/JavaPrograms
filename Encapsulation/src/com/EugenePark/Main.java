package com.EugenePark;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "Eugene";
	    player.health = 20;
	    player.weapon = "Sword";

//	    int damage = 10;
	    player.loseHealth(1);
        System.out.println("Remaining health: " + player.healthRemaining());
    }
}

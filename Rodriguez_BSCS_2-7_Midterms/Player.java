/*
   David Axle Rodriguez
   251017667
   BSCS 2-7
   10-16-26
 */
import java.util.ArrayList;
import java.util.Scanner;

class Player{
  String name;
	int hp;
	ArrayList<Enemy> visibleEnemies;
  ArrayList<Weapons> weapons;
  
  
	Player() {
	  this.name = name;
    this.hp = 3;
	}
	

  void showWeapons(){
    if (Weapons weapons : weapon){
      System.out.println(weapon);
    }
	}
	
	void weapons(){
    weapons.add(sword);
    weapons.add(staff);
  }
	
	void seeEnemy(Enemy enemy){
	  System.out.println(name + " sees the " + enemy);
	  System.out.println(enemy + ": " + enemy.hp  + " HP, " + enemy.atk + " Damage ");
	}
	void playerTurn(Scanner sc){
	System.out.println("What do you want");}
}

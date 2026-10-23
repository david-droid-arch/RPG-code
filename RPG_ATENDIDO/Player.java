import java.util.ArrayList;

class Player{
  String name;
  int hp;
  ArrayList<Weapon> weapons;
  ArrayList<Enemy> visibleEnemies;
  
  Player(String name){
    this.name = name;
    this.hp = 3;
    this.weapons = new ArrayList<>();
    this.visibleEnemies = new ArrayList<>();
    weapons.add(new Sword());
    weapons.add(new Staff());
    //weapons.add(new Spear());
  }
  
  void showWeapons(boolean bol){
  
    if (bol){
      System.out.println(name + "'s Weapons:");
      for (Weapon weapon : weapons){
        System.out.println("\t" + weapon);
      }
    }
    else{
      System.out.println(name + "'s Weapons:");
      for (int q = 0; q < weapons.size(); q++){
        System.out.printf("\t[%d] %s: %d Damage\n",q ,weapons.get(q).name, weapons.get(q).damage);
      }
    }
    System.out.println();
  }
  
  void seeEnemy(Enemy enemy){
    System.out.printf("\n%s sees the %s\n", name, enemy.name);
    System.out.println(enemy);
    visibleEnemies.add(enemy);
  }
  
  void playerTurn(){
    System.out.printf("--- %s's Turn(%d HP) ---\n", name, hp);
    for (int q = 0; q < visibleEnemies.size(); q++){
      System.out.println("What do you do?");
      System.out.printf("\t[%d] Attack %s: %d HP, %d Damage\n", q, visibleEnemies.get(q).name, visibleEnemies.get(q).hp, visibleEnemies.get(q).damage);
      
      System.out.print(": ");
      int enemyIndex = Main.sml.nextInt();
    
      if (enemyIndex == q){
        System.out.println("With which weapon?");
        showWeapons(false);
        
        System.out.print(": ");
        int weaponIndex = Main.sml.nextInt();
        
        System.out.printf("\n%s Attacks the %s with the %s\n", name, visibleEnemies.get(enemyIndex).name, weapons.get(weaponIndex).name);
        weapons.get(weaponIndex).hurtEnemy(visibleEnemies.get(enemyIndex));
        //visibleEnemies.get(enemyIndex).hp -= weapons.get(weaponIndex).damage;
      }
      
    }
  }
  
  /*
  void whichWeapon(){
    System.out.println("With which weapon?");
    showWeapons();
    
  }
  */
}

import java.util.Scanner;

class Main{
  static Scanner sml = new Scanner(System.in);
  public static void main(String[] args){
    
    
    
    System.out.println("Turn Based RPG");
    System.out.println("--------------");
    System.out.println("""
                      [1] Play
                      [2] Quit""");
    System.out.print(": ");
    String input = sml.nextLine();
    
    switch(input){
      case "1": playGame(); break;
      case "2": System.out.println("boom"); return;
    }
    
  }
  
  static void playGame(){
    Player player = new Player("Steve");
    player.showWeapons(true);
    
    player.seeEnemy(new Knight());
    battle(player);
  }
  
  static void battle(Player player){
    while(!player.visibleEnemies.isEmpty() && player.hp > 0){
      player.playerTurn();
    }
  }
  
}

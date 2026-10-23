class Sword extends Weapon{
  
  Sword(){
    super("Sword", 1, "Wizard");
  }
  
  @Override
  void hurtEnemy(Enemy enemy){
    if (this.target.equals(enemy.name)){
      enemy.hp -= damage;
    }
  }
  
}

class Staff extends Weapon{
  
  Staff(){
    super("Staff", 1, "Knight");
  }
  
  @Override
  void hurtEnemy(Enemy enemy){
    if (this.target.equals(enemy.name)){
      enemy.hp -= damage;
    }
  }
  
}

class Weapon{
  String name;
  int damage;
  String target;
  
  Weapon(String name, int damage, String target){
    this.name = name;
    this.damage = damage;
    this.target = target;
  }
  
  void hurtEnemy(Enemy enemy){}
  
  public String toString(){
    return name + ": " + damage + " Damage";
  }
}

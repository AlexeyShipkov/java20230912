package java20230912; 

// import java20230912.Armed; 

public class Hero {
    String name; //имя
    int health; //зоровье
    int safe; //защита

    public Hero (String name, int health, int safe){

        this.name = name;
        this.health = health;
        this.safe = safe;
    }
    




// int myWeapon;
// int myMedicine;

    public void infoHero () {
    Hero myHero = new Hero(name, health, safe);
    System.out.println(myHero.name);
    System.out.println(myHero.health);
    System.out.println(myHero.safe);
    /*if (Armed = true) {
    System.out.println(getWeapon(myWeapon));}
    else 
    System.out.println(getMedicine(myMedicine));
 */   
}


}
  

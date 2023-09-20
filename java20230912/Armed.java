package java20230912; 

public class Armed extends Hero{

    public Armed(String name, int health, int safe) {
        super(name, health, safe);

    }
      
    
    String [] WeaponsHero = {"Rogue", "Spearman", "Sniper", "Crossbowman"}; //вооруженные персонажи
public String getWeaponHero(int wh) {
        return WeaponsHero[wh];
}
    
    String [] Weapons = {"Knife", "Spear", "Rifle", "Crossbow"}; //оружие: «Нож», «Копье», винтовка, «Арбалет».

    public String getWeapon(int arm) {
        return Weapons[arm];
}
    

}

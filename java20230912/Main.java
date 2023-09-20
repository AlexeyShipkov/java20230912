/*Проанализировать и описать персонажей: 
Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
peaceful
armed 
Mage, Monk, Rogue, Spearman, Sniper, Crossbowman, Peasant.
На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса. 
Mage Tablet 
Monk Ointment
Rogue Knife 
Spearman Spear 
Sniper Rifle
Crossbowman Crossbow
Peasant Bandage

*/

package java20230912;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
System.out.print("\033[H\033[J"); //отчистка экрана
Scanner myHeroType = new Scanner(System.in);
    System.out.println("Введите тип персонажа. 0 военный, 1 мирный");
    int typeHero = myHeroType.nextInt();

    Scanner myHeroNum = new Scanner(System.in);
    System.out.println("Введите номер перосонажа (0-3 для военных, 0-2 для мирных)");
    int numberHero = myHeroNum.nextInt();

if (typeHero == 0) {

Armed myHero = new Armed("", 100, 50);
myHero.name = myHero.getWeaponHero(numberHero);
myHero.infoHero();
System.out.println(myHero.getWeapon(numberHero));
}
else {
if(typeHero == 1){
Peaceful myHero = new Peaceful("", 100, 50);
myHero.name = myHero.getMedHero(numberHero);
myHero.infoHero();
System.out.println(myHero.getMedicine(numberHero));

}
else {System.out.println("Тип персонажа введен некорректно");}
}
    } 

    

}
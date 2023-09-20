package java20230912;
public class Peaceful extends Hero {
    
    public Peaceful(String name, int health, int safe) {
        super(name, health, safe);}


        String [] MedHero = {"Mage", "Monk", "Peasant"}; //лечащие персонажи
        public String getMedHero(int mh) {
                return MedHero[mh];
        }
        
               
        String [] Medicine = {"Tablet", "Ointment", "Bandage"}; //лекарства: таблетка, мазь, повязка
        
        public String getMedicine(int medic) {
            return Medicine[medic];
        }


    }

public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyname();
        knight.sayMyagility();
        knight.sayMystrength();
        knight.sayMyintelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyname();
        mage.sayMyagility();
        mage.sayMystrength();
        mage.sayMyintelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyname();
        thief.sayMyagility();
        thief.sayMystrength();
        thief.sayMyintelligence();

        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 5;
        archer.intelligence = 5;
        archer.name = "Sheeeshh";
        archer.sayMyname();
        archer.sayMyagility();
        archer.sayMystrength();
        archer.sayMyintelligence();

        Character sparta = new Character();
        sparta.strength = 10;
        sparta.agility = 9;
        sparta.intelligence = 5;
        sparta.name = "SPAAAARTAAAAAA";
        sparta.sayMyname();
        sparta.sayMyagility();
        sparta.sayMystrength();
        sparta.sayMyintelligence();
        
        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        //gear

        Gear boots = new Gear();

        boots.name = "Sinaunang sapatos";
        boots.defense = 999;
        boots.weight = 55.5f;
        boots.rarity = "legendary super duper epic,";
        boots.hasElementalResistance = true;
        boots.description();
    }
}

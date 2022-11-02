package Pertemuan6;

import java.util.HashMap;
import java.util.Map;

class Monster
{
    String name;
    int healthPoint;
    int defense;

    Monster(String name, int healthPoint, int defense){
        this.name = name;
        this.healthPoint = healthPoint;
        this.defense = defense;
    }
}

public class ArrayHashMap {
    public static void main(String[] args) {
        // inisialisasi objek
        Monster goblin = new Monster("goblin", 80, 2);
        Monster orc = new Monster("orc",100, 3);
        Monster ogre = new Monster("ogre",150, 5);
    
        // deklarasi hashmap
        HashMap<String, Monster> labeledMonsters = new HashMap<String, Monster>();
    
        // penambahan pair pada hashmap
        labeledMonsters.put("strongest", ogre);
        labeledMonsters.put("weakest", goblin);
        labeledMonsters.put("balanced", orc);
        System.out.println(labeledMonsters.toString());
        
        // penambahan pair dengan key dan value duplikat pada hashmap
        labeledMonsters.put("balanced", goblin);
        System.out.println("=============");
        for(Map.Entry<String, Monster> item : labeledMonsters.entrySet()){
            System.out.println("The " + item.getKey() + " monster is " + item.getValue().name);
        }
        
        // penghapusan pair pada hashmap
        labeledMonsters.remove("balanced");
        System.out.println("=============");
        for(Map.Entry<String, Monster> item : labeledMonsters.entrySet()){
            System.out.println("The " + item.getKey() + " monster is " + item.getValue().name);
        }

        
    }
}


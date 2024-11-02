package LinkedList_Desafio6;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjaList = new LinkedList<>();

        Ninja naruto = new Ninja("Naruto Uzumaki", 18, "Konoha");
        Ninja sasuke = new Ninja("Sasuke Uchiha", 18, "Konoha");
        Ninja sakura = new Ninja("Sakura Haruno", 17, "Konoha");
        Ninja kakashi = new Ninja("Kakashi Hatake", 32, "Konoha");

        ninjaList.add(naruto);
        ninjaList.add(sasuke);
        ninjaList.add(sakura);

        System.out.println(ninjaList);

        ninjaList.add(1,kakashi);

        for(Ninja n : ninjaList) {
            System.out.println(n);
        }

        System.out.println(ninjaList);
    }
}

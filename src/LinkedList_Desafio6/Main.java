package LinkedList_Desafio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ninja> ninjaList = new LinkedList<>();

        Ninja naruto = new Ninja("Naruto Uzumaki", 18, "Konoha");
        Ninja sasuke = new Ninja("Sasuke Uchiha", 18, "Konoha");
        Ninja sakura = new Ninja("Sakura Haruno", 17, "Konoha");
        Ninja kakashi = new Ninja("Kakashi Hatake", 32, "Konoha");
        Ninja gaara = new Ninja("Gaara Sabaku", 19, "Sunagakure");

        ninjaList.add(naruto);
        ninjaList.add(sasuke);
        ninjaList.add(sakura);
        ninjaList.add(kakashi);
        ninjaList.add(gaara);

        System.out.println("Escolha uma opção");
        System.out.println("1- Ordenar por um critério");
        System.out.println("2- Buscar por nome");

        int escolha = scanner.nextInt();
        switch(escolha) {
            case 1:
                System.out.println("1- Ordenar por nome");
                System.out.println("2- Ordenar por idade");
                System.out.println("3- Ordenar por vila");

                scanner.nextLine();
                int escolhaOrdenar = scanner.nextInt();


                switch (escolhaOrdenar) {
                    case 1:
                        ninjaList.sort(Comparator.comparing(n -> n.getNome()));
                        System.out.println(ninjaList);
                        break;
                    case 2:
                        ninjaList.sort(Comparator.comparing(n -> n.getIdade()));
                        System.out.println(ninjaList);
                        break;
                    case 3:
                        ninjaList.sort(Comparator.comparing(n -> n.getVila()));
                        System.out.println(ninjaList);
                        break;
                }
                break;

            case 2:
                System.out.println("Digite o nome do Ninja que deseja buscar");
                scanner.nextLine();
                String nomeNinjaBusca = scanner.nextLine();

                Optional<Ninja> ninjaEncontrado = ninjaList.stream().filter(ninja -> ninja.getNome().toLowerCase().contains(nomeNinjaBusca.toLowerCase())).findAny();

                if(ninjaEncontrado.isPresent()) {
                    System.out.println(ninjaEncontrado.toString());
                } else {
                    System.out.println("Ninja não encontrado");

                }
        }

    }
}

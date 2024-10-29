package Intermediario;

public class Uzumaki extends Ninja {
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoes, RankNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
    }

    @Override
    public void ataqueEspecial() {
        if(chakra >= 3) {
            System.out.println(nome + " usou seu ataque especial!");
            chakra -= 3;
        }else {
            System.out.println("Junte mais chakra");
        }
    }
}

package Intermediario;

public class Jinchuuriki extends Ninja{
    int furiaJinchuuriki;
    String bijuu;
    public Jinchuuriki(String nome, int idade, String aldeia, String bijuu) {
        super(nome, idade, aldeia);
        this.bijuu = bijuu;
    }

    public Jinchuuriki(String nome, int idade, String aldeia, int numeroDeMissoes, RankNinja rank, String bijuu) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
        this.bijuu = bijuu;
    }

    @Override
    public void ataqueEspecial() {
        if(chakra >= 3) {

            System.out.println(nome + " usou seu ataque especial!");
            furiaJinchuuriki++;
            chakra--;
        }else {
            System.out.println("Junte mais chakra");
        }
    }

    public void invocarBijuu() {
        if(furiaJinchuuriki >= 3) {
            System.out.println(nome + " invocou sua bijuu " + bijuu);
            furiaJinchuuriki = 0;
        }
        else {
            System.out.println("Junte mais furia");
        }
    }
}

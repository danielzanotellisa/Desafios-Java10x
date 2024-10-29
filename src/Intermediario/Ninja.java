package Intermediario;

public abstract class Ninja {

    String nome;
    int idade;
    String aldeia;
    int chakra;
    int numeroDeMissoes;
    RankNinja rank;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //TODO: sobrecarga de construtor com todos os elementos novos

    //Para fazermos uma sobrecarga de construtor, nós fazemos a referencia do construtor que ja criamos
    //para não repetirmos muito código.

    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoes, RankNinja rank){
        this(nome, idade, aldeia);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }


    public void ataqueBasico () {
        System.out.println(nome + " usou o ataque básico");
    }
    public void juntarChakra() {
        chakra++;
        System.out.println(nome + " tem " + chakra + " pontos de chakra!");
    }

    public abstract void ataqueEspecial();

    public void mostrarRank() {
        System.out.println(nome + ": Ja completou " + numeroDeMissoes + " missões e é um " + rank);
    }

}

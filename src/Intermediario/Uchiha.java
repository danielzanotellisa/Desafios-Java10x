package Intermediario;

public class Uchiha extends Ninja implements SharinganInterface {
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoes, RankNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Katon, jutso bola de fogo!");
    }

    @Override
    public void ativarShraingan() {
        System.out.println("Sharingan Ativado");
    }
}

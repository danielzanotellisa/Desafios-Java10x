package Intermediario;

public class Main {
    public static void main(String[] args) {
        //TODO: criar um ENUM para poder separar os ranks
        //TODO: usar sobrecarga de construtores para poder flexibilizar a criação de objetos

        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Konoha", 35, RankNinja.JOUNIN);
        itachi.ataqueEspecial();
        itachi.ativarShraingan();
        itachi.mostrarRank();
    }
}

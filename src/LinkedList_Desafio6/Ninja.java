package LinkedList_Desafio6;

public class Ninja {
    private String nome;
    private Integer idade;
    private String vila;

    public Ninja() {
    }

    public Ninja(String nome, Integer idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + ", vila: " + vila;
    }
}

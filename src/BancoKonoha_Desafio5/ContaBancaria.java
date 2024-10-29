package BancoKonoha_Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    String titular;
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public ContaBancaria(double saldo, String titular) {
        this(saldo);
        this.titular = titular;
    }

}

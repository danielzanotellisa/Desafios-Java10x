package BancoKonoha_Desafio5;

public class BancoKonoha {
    public void transferenciaEntreContas(ContaCorrente CCenvia, ContaCorrente CCrecebe,double valor) {
        if(CCenvia.saldo >= 0 && CCenvia.saldo >= valor) {
            CCenvia.saldo -= valor;
            CCrecebe.saldo += valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferenciaEntreContas(ContaCorrente CCenvia, ContaPoupanca CPrecebe, double valor) {
        if(CCenvia.saldo >= 0 && CCenvia.saldo >= valor) {
            CCenvia.saldo -= valor;
            CPrecebe.saldo += valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferenciaEntreContas(ContaPoupanca CPenvia, ContaCorrente CCrecebe, double valor) {
        if(CPenvia.saldo >= 0 && CPenvia.saldo >= valor) {
            CPenvia.saldo -= valor;
            CCrecebe.saldo += valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}

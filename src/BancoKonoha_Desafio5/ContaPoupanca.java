package BancoKonoha_Desafio5;

public class ContaPoupanca extends ContaBancaria{
    final TipoConta tipoConta = TipoConta.POUPANCA;
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é de: " + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo = (valor - (valor * 1.5) / 100);
        System.out.println("O valor de " + valor + " foi adicionado a sua conta do tipo " + tipoConta +", seu saldo atual é de " + saldo);
    }
}

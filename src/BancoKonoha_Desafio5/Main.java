package BancoKonoha_Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente Naruto = new ContaCorrente(0);
        Naruto.depositar(100);
        Naruto.consultarSaldo();
        ContaPoupanca narutoPoupanca = new ContaPoupanca(100);
        narutoPoupanca.depositar(200);
        narutoPoupanca.consultarSaldo();
        ContaCorrente Sasuke = new ContaCorrente(300);

        BancoKonoha banco = new BancoKonoha();
        banco.transferenciaEntreContas(Naruto,Sasuke,50);
        Naruto.consultarSaldo();
        Sasuke.consultarSaldo();
        banco.transferenciaEntreContas(narutoPoupanca,Naruto,50);
        narutoPoupanca.consultarSaldo();
        Naruto.consultarSaldo();    
    }
}

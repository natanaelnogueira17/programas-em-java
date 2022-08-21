package Contas;

public class PessoaFisica {
    public static void main(String[] args){
        Conta cc1 = new  Conta();
        cc1.cliente = "cliente final";
        cc1.saldo = 10000;
        System.out.println("cliente: " +cc1.cliente);
        cc1.exibirSaldo();
        System.out.println("-------------------------- " );
        Conta cc2 = new  Conta();
        cc2.cliente = "cliente final 2";
        cc2.saldo = 8500;
        System.out.println("cliente: " +cc2.cliente);
        cc2.exibirSaldo();

    }
}

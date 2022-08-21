package Seguros;

import Contas.Conta;

public class SeguroPessoaFisica {
    public static void main(String[] args){
        Conta cc3 = new  Conta();
        cc3.cliente = "cliente final 2";
        cc3.saldo = 8500;
        System.out.println("cliente: " +cc3.cliente);
        cc3.exibirSaldo();
    }
}

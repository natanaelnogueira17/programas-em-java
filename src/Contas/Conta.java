package Contas;

public class Conta {
    //Atributos
    public String cliente;
    public double saldo;
    //construtor
    public Conta(){
        System.out.println("Agencia 0261");
    }
    //metodos
    public void exibirSaldo(){
        System.out.println("Saldo: R$ " +  saldo);
    }

}

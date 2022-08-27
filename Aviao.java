package poo;

public class Aviao extends /* essa palavra e usada para heranca*/ Carro{
	double envergadura;
	void aterrizar() {
		System.out.println("->---------- _________");
	} // novo metodo para aviao
	
	void acelerar() {
		System.out.println("acelerar__________ e decolar  ------------>");
	} // polimorfismo -> usou o metodo do carro e alterou seu comportamento

}

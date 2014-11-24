package miCalculadora;

public class Principal {
	
	public static void main(String[] args){
		Calculadora c=new Calculadora();
		
		System.out.println("Programa de Calculadora");
		System.out.println("=======================");
		
		System.out.println("La suma de 2+3="+c.suma(2,3));
	}

}

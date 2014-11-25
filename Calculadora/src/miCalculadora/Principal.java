package miCalculadora;

public class Principal {
	
	public static void main(String[] args){
		Calculadora c=new Calculadora();
		
		System.out.println("Programa de Calculadora");
		System.out.println("=======================");
		
		System.out.println("La suma de 2+3="+c.suma(2,3));
		System.out.println("La resta de 2-3="+c.resta(2,3));
		System.out.println("La multiplicacion de 2*3="+c.mul(2,3));
		System.out.println("La division de 2/3="+c.div(2,3));
	}

}

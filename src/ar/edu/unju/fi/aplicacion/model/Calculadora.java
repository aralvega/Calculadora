package ar.edu.unju.fi.aplicacion.model;

public class Calculadora {
	
	public int sumar(int numA, int numB) {
		return numA+numB;
	}
	
	public String mostrarResultadoSuma(int numA, int numB) {
		String resultado="";
		if(numA== 0 && numB==0) {
			resultado = "Los ceros no son numeros naturales";
		}else {
			resultado = String.valueOf(sumar(numA,numB));
		}
		
		return resultado;
	}
	
	public int restar(int numA, int numB) {
		return numA-numB;
	}
	
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
	public int dividir(int a, int b) {
		int res =0;
		if (b != 0) {
			res = a/b;
		}
		return res;
	}

}

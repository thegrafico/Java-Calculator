package methosCalculadora;

import java.util.*;

public class CalculatorMethos{
	private double suma, resta, mult, div, elevar, porciento;

	public CalculatorMethos() {
	}

	// metodo de sumar
	public double getsuma(double num1, double num2) {
		return suma = num1 + num2;
	}

	// OVERLOADING
	public double getsuma(double num1, double num2, double num3) {
		return suma = num1 + num2 + num3;
	}

	// metodo de restar
	public double getresta(double num1, double num2) {
		return resta = num1 - num2;
	}

	// metodo de multiplicar
	public double getmult(double num1, double num2) {
		return mult = num1 * num2;
	}

	// metodo de dividir
	public double getdiv(double num1, double num2) {
		return div = num1 / num2;
	}

	// metodo de elevar
	public double getelevar(double num1, double num2) {
		return elevar = Math.pow(num1, num2);
	}
	// metodo del porciento

	// sobreCarga y sobreEscritua del metodo porciento
	public double getporciento(double num1, double num2) {
		return porciento = (num1 / 100) * num2;
	}
	// creamos el método Existe Punto de carácter público fuera del botón
	// punto

	public static boolean existepunto(String punto) {
		boolean resultado = false;
		// voy a declarar un bucle para que me recorra todo la cadena de
		// caracteres y si encuentra no lo ponga
		for (int i = 0; i < punto.length(); i++) {
			if (punto.substring(i, i + 1).equals(".")) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

}

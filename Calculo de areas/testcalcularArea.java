
public class testcalcularArea{

	public static void main(String [] args){
		int lado = 10;
		int altura = 7;
		int ladoCorto = 8;
		int ladoLargo = 12;
		int radio = 5;
		

		int resultadoCuadrado = calcularArea.areaCuadrado(lado);
		int resultadoTriangulo = calcularArea.areaTriangulo(altura, lado);
		int resultadoRectangulo = calcularArea.areaRectangulo(ladoCorto, ladoLargo);
		double resultadoCirculo = calcularArea.areaCirculo(radio);
		
		
		System.out.println("Para lado igual a " + lado + " el area de un cuadrado sería " + resultadoCuadrado);
		System.out.println("Para lado igual a " + lado + " y altura igual a " + altura +" el area de un triangulo sería " + resultadoTriangulo);
		System.out.println("Para lado corto igual a " + ladoCorto + " y lado largo igual a " + ladoLargo +" el area de un rectangulo sería " + resultadoRectangulo);
		System.out.println("Para un radio igual a " + radio + "el area de un circulo sería " + resultadoCirculo);
		
	}


}

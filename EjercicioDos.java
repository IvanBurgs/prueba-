package ejercicios1.com;

import java.lang.Character;

public class EjercicioDos {
	
	public void mostrarPrimeraPalabra(String frase){
		String primeraPalabra = frase.substring(0,frase.indexOf(" "));
		System.out.println(primeraPalabra);
	}
	
	public void contarNumeroPalabras(String frase){
		int contador = 1;
		int ultimoespacio = frase.lastIndexOf(" ");
		int espacioactual = 0;
		while(espacioactual!=ultimoespacio){
			espacioactual=frase.indexOf(" ",espacioactual+1);
			contador++;
		}
		System.out.println("Tiene " + contador + " palabras");
	}
	
	public void contarLetras(String frase){
		int contador = 0;
		for(int i = 0;i<frase.length();i++){
			char letra = frase.charAt(i);
			if(Character.isLetter(letra)){
				contador++;
			}
		}
		System.out.println("Tiene " + contador + " letras");
	}
	
	public void contarAes(String frase){
		int contadora = 0;	
		int contadorA = 0;
		for(int i = 0;i<frase.length();i++){
			char letra = frase.charAt(i);
			if(letra=='a'){
				contadora++;
			}else if(letra=='A'){
				contadorA++;
			}
		}
		System.out.println("Tiene " + contadora + " a's");
		System.out.println("Tiene " + contadorA + " A's");
	}
}

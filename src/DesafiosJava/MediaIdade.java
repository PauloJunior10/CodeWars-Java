package DesafiosJava;

public class MediaIdade {

	  public static void main(String[] args) {
	    int[] idades = {18, 19, 19, 19, 19, 19, 19};
	    int idadeAntiga = calcularMedia(idades);
	    
	    // Troca a idade do candidato de 25 anos com o de 18 anos
	    idades[0] = 18;
	    idades[6] = 25;
	    
	    int idadeNova = calcularMedia(idades);
	    
	    System.out.println("Média de idade antiga: " + idadeAntiga);
	    System.out.println("Média de idade nova: " + idadeNova);
	  }
	  
	  public static int calcularMedia(int[] idades) {
	    int soma = 0;
	    for (int i = 0; i < idades.length; i++) {
	      soma += idades[i];
	    }
	    return soma / idades.length;
	  }

	}
package exercicioArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
	public static void main(String[] args) {
		System.out.println("EXERCICIO 1:\n");
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(125);
		lista1.add(23);
		lista1.add(7);
		lista1.add(41);
		System.out.println("tamanho da lista: " + lista1.size());
		System.out.println("Verificando se 7 esta na lista:" + lista1.contains(7));
		
		System.out.println("\nEXERCICIO 2:\n");
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(5);
		lista2.add(5);
		lista2.add(5);
		lista2.add(7);
		System.out.println("Contagem de elementos unicos na lista" + lista2.toString() + ": " + contagemElementosUnicos(lista2));
		
		System.out.println("\nEXERCICIO 3:\n");
		System.out.println("Juntando lista 1 e 2: " + juntarListas(lista1,lista2));
		
		System.out.println("\nEXERCICIO 4:\n");
		int index = buscarMenorNumero(lista1);
		System.out.println("Buscando índice do menor numero da lista " + lista1 + ": " + index);
		System.out.println("lista1[" + index + "] = " + lista1.get(index));
		
		System.out.println("\nEXERCICIO 5:\n");

		ArrayList<String> lista3 = new ArrayList<String>();
		lista3.add("girafa");
		lista3.add("cobra");
		lista3.add("elefante");
		lista3.add("cachorro");
		lista3.add("cachorro");
		lista3.add("cachorro");
		System.out.println("Numero de ocorrencias de cachorro na lista " + lista3 + ": " + ocorrencias(lista3, "cachorro"));

		System.out.println("\nEXERCICIO 6:\n");
		ArrayList<Integer> lista4 = new ArrayList<Integer>();
		lista4.add(1);
		lista4.add(2);
		lista4.add(3);
		lista4.add(4);
		System.out.println("Lista " + lista4 + " sem numeros pares: " + limparListas(lista4));

		System.out.println("\nEXERCICIO 7:\n");
		ArrayList<ContaCorrente> lista5 = new ArrayList<ContaCorrente>();
		lista5.add(new ContaCorrente(10000));
		lista5.add(new ContaCorrente(15000));
		lista5.add(new ContaCorrente(2000));
		lista5.add(new ContaCorrente(2500));
		System.out.println("Original: " + lista5);
		System.out.println("Ordenada pelo saldo: " + ordenarPorAtributo(lista5, "saldo"));
		
		System.out.println("\nEXERCICIO 8:\n");
		System.out.println("Lista " + lista3 + " com apenas palavras que comecam com C: " + filtrarPorLetra(lista3, "c"));
		
		System.out.println("\nEXERCICIO 9:\n");
		System.out.println("Media da lista " + lista1 + ": " + media(lista1));
		
		System.out.println("\nEXERCICIO 10:\n");
		ArrayList<String> lista6 = new ArrayList<String>();
		lista6.add("a");
		lista6.add("b");
		lista6.add("c");
		lista6.add("d");
		lista6.add("e");
		System.out.println("Lista original: " + lista6);
		System.out.println("Invertida: " + reverter(lista6));
	}

	public static int contagemElementosUnicos(ArrayList<Integer> lista) {
		return (int) lista.stream().distinct().count();
	}
	public static ArrayList<Integer> juntarListas(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		resultado.addAll(lista1);
		resultado.addAll(lista2);

		return resultado;
	}
	public static int buscarMenorNumero(ArrayList<Integer> lista) {
		ArrayList<Integer> clone = new ArrayList<>(lista);
		clone.sort(null);
		return lista.indexOf(clone.get(0));
	}
	public static int ocorrencias (ArrayList<String> lista, String busca) {
		ArrayList<String> clone = new ArrayList<String>(lista);
		clone.sort(null);
		return clone.lastIndexOf(busca) - clone.indexOf(busca) + 1;
	}
	public static ArrayList<Integer> limparListas(ArrayList<Integer> lista1) {	
		ArrayList<Integer> resultado = new ArrayList<Integer>();

		for (Integer numero : lista1) {
			if(numero % 2 != 0) {
				resultado.add(numero);
			}
		}
		return resultado;
	}
	public static ArrayList<ContaCorrente> ordenarPorAtributo(ArrayList<ContaCorrente> lista, String atributo) {
		ArrayList<ContaCorrente> clone = new ArrayList<ContaCorrente>(lista);
		clone.sort(new Comparator<ContaCorrente>(){
		     public int compare(ContaCorrente o1, ContaCorrente o2){
		         if(o1.saldo == o2.saldo)
		             return 0;
		         return o1.saldo < o2.saldo ? -1 : 1;
		     }
		});
		return clone;
	}
	public static ArrayList<String> filtrarPorLetra(ArrayList<String> lista, String letra) {
		ArrayList<String> clone = new ArrayList<String>();
		for (String string : lista) {
			if (string.startsWith(letra)) {
				clone.add(string);
			}
		}
		return clone;
	}
	public static double media(ArrayList<Integer> lista) {
		int soma = 0;
		for (int i : lista) {
			soma += i;
		}
		return soma/lista.size();
	}
	public static ArrayList<String> reverter(ArrayList<String> lista) {
		ArrayList<String> clone = new ArrayList<String>(lista);
		Collections.reverse(clone);
		return clone;
	}
}



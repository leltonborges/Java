package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Ana");
		list.add("Claudio");
		list.add("Baby");
		list.add("Bob");
		list.add("Tadeu");
		list.add("Luiz");
		list.add(0, "Lelton");
		list.add(2, "Bruno");
		list.add("Alex");
	
		//tamanho
		System.out.println(list.size());
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-----------------------------");
		//remove
		list.remove("Lelton");
		list.remove(3);
				
		//removedo por predidado
		list.removeIf(x -> x.charAt(0)=='B');
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-----------------------------");
		//encontra uma posição de um elemento
		System.out.println("Index of "+ list.indexOf("Ana"));
		
		System.out.println("-----------------------------");
		//Busca todos que comece com tal letra
		//stream aceita com funçoes lambda
		List<String> result = list.stream().filter(a -> a.charAt(0)=='A').collect(Collectors.toList());
		for(String name : result) {
			;System.out.println(name);
		}
		
		System.out.println("-----------------------------");
		//Encontra o primeiro elemento que comece com tal letra
		String primyElement = list.stream().filter(b ->b.charAt(0)=='A').findFirst().orElse("Elemento não encontrado");
		System.out.println(primyElement);
	}

}

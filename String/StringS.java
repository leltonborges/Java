package String;

public class StringS {
	public static void main(String[] args) {
		String frase = "LELTON pREIRA BORGES ";
		
		//toLowerCase converte toda o texto em minusculas
		String minusculas = frase.toLowerCase();
		
		//toUpperCase converte o texto todo em maiusculas
		String maiusculas = frase.toUpperCase();
		
		//trim remove os espacos nas extremidades do texto
		String espaco = frase.trim();
		
		//substring pegar o conteudo do texto da posição define ate o final 
		//ou ate a posiçao definada, lembrado que a contagem começa do 0 (zero)
		String pegarDeTalLugar = frase.substring(2);
		//aqui pegará depois do 3 até antes da posição 6
		String pegarAte = frase.substring(3, 6);
		
		//replace, troca o conteudo por outro conteudo, neste caso 
		//trocara a letra 'E' por '3'
		String trocar = frase.replace('E', '3');
		
		//indexOf, informa a primeira posicao do conteudo buscado
		int posicaoI = frase.indexOf('R');		
		
		//lastIndexOf, informa a ultima posicao do conteudo buscado
		int posicaoF = frase.lastIndexOf('R');
		
		//split, recorta palavras conforme o separado informado.
		//aqui foi informado o separado " " (um espaco em branco), pois as palavras são
		//separadas por espaço em branco
		String recordaPalavra[] = frase.split(" ");
	}
}

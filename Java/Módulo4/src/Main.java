
public class Main {
	
	public static void main(String[] args) {
		/*
		int idade = 11;
		System.out.println("minha idade � " + idade);
		idade = 12;
		System.out.println("minha idade � " + idade);
		idade = 13;
		System.out.println("minha idade � " + idade);
		 */
		//Tipos de vari�veis
		/*
		int numero = 24000000;
		String frase = "Ol� mundo!";
		boolean var = true;
		char var2 = 'a';
		double var3 = 24.9;
		
		System.out.println(numero);
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		*/
		//Constante
		/*
		final int vida_maxima = 10;
		System.out.println(vida_maxima);
		*/
		//Array normal
		/*
		String[] nome = new String[5];
		nome[0] = "Guilherme";
		nome[1] = "jo�o";
		
		String[][] var2 = new String  [5][5];
		var2[0][0] = "Felipe";
		System.out.println(var2[0][0]);
		*/
		
		
		
		
			/*
			 >
			 <
			 >=
			 <=
			 ==
			 !=
			 */
			/*
			if(vida < 100) {
				vida+=100;
				System.out.println("Minha vida � igual a 100!");
			}else {
				System.out.println("Minha vida n�o � igual a 100!");
			}
			
			String nome = "Guilherme";
			if (nome == "Guilherme") {
				System.out.println("Nome igual a " + nome);
			}else if(nome == "Jo�o") {
			
			}else if (nome == "Felipe"){
				
			}else {
				
			}
			
			if (nome != "jo�o") {
				System.out.println("O nome � diferente de Jo�o");
			}
			
			boolean var = true;
			if (var)
				System.out.println("Verdade");
			System.out.print("");
			*/
			
		
			/*
			int vida = 90;
	
			switch(vida)
			{
			case 90:
			//Execute alguma a��o aqui!
			System.out.println("Quero que o meu personagem corra mais r�pido!");
			break;
			case 30:
			System.out.println("Minha vida � igual a 30!");
			break;
			default:
			System.out.println("Nenhuma condi��o bateu! eu tenho 100 de vida!");
			break;
			}
			*/
			/*
			int vida_1 = 100;
			int vida_2 = 100;
			int vida_3 = 200;
			int vida_final = vida_1 * vida_2 + vida_3;
		
			int vida_final2 = ((vida_1 + vida_2) / 2) * 2;
			System.out.println(vida_final2);
			*/
			String nome_jogador = "Guilherme";
			int skill = 100;
			/*
			if ((nome_jogador == "Guilherme" && skill == 100) && skill <= 90) {
				//podemos executar esse c�digo
				System.out.println("Verdade");
			}else {
				System.out.println("Entramos no else");
			}
			*/
			/*
			if ((nome_jogador == "Guilherme" || nome_jogador == "Jo�o") && skill >= 100) {
				System.out.println("Come�e o jogo");
			}
			*/
			
			
			
			int contador = 0;
			/*
			while(contador <= 10) {
				System.out.println("Ol�, agora o contador est� em: " + contador);
				contador++;
			}
			*/
			
			/*
			for (int i = 0; i <= 10; i ++) {
				System.out.println("Ol�, agora o contador est� em: " + i);
			}
			*/
			contador = 0;
			do {
				//
				System.out.println(contador);
				contador++;
			}while(contador < 3);
	}
}

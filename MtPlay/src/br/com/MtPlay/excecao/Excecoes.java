package br.com.MtPlay.excecao;

/**
 * Classe que lida com as exceções recebidas, retornando-as com mensagens que possam ser compreendidas.
 * @author Brunno Martyres Obristo
 * @see br.com.MtPlay.implementacao.
 * @see br.com.MtPlay.implementacao.
 * @since 1.0.0
 * @version 1.0.0
 */
public class Excecoes {
	//Checked: Antes de compilar
	//Unchecked: Depois de compilar
	public static String tratarExcecao(Exception e) {
		if(e instanceof NullPointerException) {
			return "Objeto nulo.";
		}else if(e instanceof NumberFormatException){
			return "Formato inválido";
		}else if(e instanceof ArrayIndexOutOfBoundsException){
			return "Vetor estourou";
		}else{	
			e.printStackTrace();
			return "Exceção não tratada";
		}
		
	}
}

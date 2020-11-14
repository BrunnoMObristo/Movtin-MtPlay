package br.com.MtPlay.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe utilizada para fazer estabelecer uma conexão com banco, deixando a responsabilidade de
 * abrí-la e fechá-la, para os DAO.
 * @see br.com.MtPlay.dao.
 * @author Brunno Martyres Obristo
 * @since 1.0.0
 * @version 1.0.0
 */
public class Conexao {

	public static Connection conectar() throws Exception{
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm86365", "020501");
	}
}


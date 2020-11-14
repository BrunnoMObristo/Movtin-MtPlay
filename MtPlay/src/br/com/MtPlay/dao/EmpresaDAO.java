package br.com.MtPlay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.MtPlay.beans.Empresa;
import br.com.MtPlay.conexao.Conexao;

/**
 * Classe que cont�m os m�todos da classe Empresa. Realiza algumas opera��es de CRUD.
 * Faz refer�ncia � classe Empresa.
 * Faz refer�ncia � tabela "TB_MTPLAY_EMPRESA".
 * @author Brunno Martyres Obristo
 * @see br.com.MtPlay.beans.Empresa
 * @see br.com.MtPlay.bo.EmpresaBO
 * @since 1.0.0
 * @version 1.0.0
 */
public class EmpresaDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	/**
	 * M�todo utilizado para abrir a conex�o.
	 * @author Brunno Martyres Obristo 
	 * @throws Exception lan�a uma exce��o para o m�todo que a invocou.
	 * @since 1.0.0
	 * @version 1.0.0
	 * @see br.com.MtPlay.conexao.Conexao
	 */
	public EmpresaDAO() throws Exception {
		con = Conexao.conectar();			
	}

	/**
	 * M�todo utilizado para fechar a conex�o.
	 * @author Brunno Martyres Obristo
	 * @throws Exception lan�a uma exce��o para o m�todo que a invocou.
	 * @since 1.0.0
	 * @version 1.0.0
	 * @see br.com.MtPlay.conexao.Conexao
	 */
	public void close() throws Exception {
		con.close();
	}
	
	/**
	 * M�todo utilizado para fazer uma inser��o na tabela de Empresa.
	 * @return que executa o statement descrito.
	 * @author Brunno Martyres Obristo 
	 * @param objeto (objeto da classe Empresa).
	 * @throws Exception lan�a uma exce��o para o m�todo que a invocou.
	 * @since 1.0.0
	 * @version 1.0.0
	 */
	public boolean add(Empresa objeto) throws Exception{			
		stmt = con.prepareStatement("INSERT INTO TB_MTPLAY_EMPRESA (ID_EMPRESA, NOME, TEL_FIXO, TEL_CEL, CNPJ, TIPO, SEGMENTO, "
				+ "SITE, EMAIL, LOGRADOURO, NR_RESIDENCIAL, BAIRRO, COMPLEMENTO, "
				+ "CEP, OUTROS, ID_CIDADE, ID_ESTADO, STATUS) VALUES ('', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'A')");		
		stmt.setString(1, objeto.getNome());
		stmt.setInt(2,  objeto.getTelFixo());
		stmt.setString(3, objeto.getTelCel());		
		stmt.setString(4, objeto.getCnpj());	
		stmt.setString(5, objeto.getTipo());
		stmt.setString(6, objeto.getSegmento());
		stmt.setString(7, objeto.getSite());
		stmt.setString(8, objeto.getEmail());
		stmt.setString(9, objeto.getLogradouro());
		stmt.setInt(10, objeto.getNumero());
		stmt.setString(11,  objeto.getBairro());
		stmt.setString(12, objeto.getComplemento());
		stmt.setInt(13, objeto.getCep());
		stmt.setString(14, objeto.getOutros());
		stmt.setInt(15, objeto.getIdCidade());
		stmt.setInt(16, objeto.getIdEstado());
		
		// stmt.execute => S� retorna True ou False
		// stmt.executeUpdate => Retorna quantas linhas foram afetadas
		// stmt.executeQuery() => S� quando for Select, quando o banco trazer algum dado		
		return stmt.execute();
	}
	
}

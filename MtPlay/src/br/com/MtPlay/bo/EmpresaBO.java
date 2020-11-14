package br.com.MtPlay.bo;

import br.com.MtPlay.beans.Empresa;
import br.com.MtPlay.dao.EmpresaDAO;

public class EmpresaBO {
	
	public static String novo(Empresa objeto) throws Exception{
		
		EmpresaDAO dao = new EmpresaDAO();
		
		if (objeto.getNome() == null) {
			return "Preencha o nome";
		}
		if (objeto.getTelFixo() == 0) {
			return "Preencha o Telefone Fixo";
		}
		if (objeto.getTelCel() == null) {
			return "Preencha o Telefone Celular";
		}
		if (objeto.getCnpj() == null) {
			return "Preencha o CNPJ";
		}
		if (objeto.getTipo() == null) {
			return "Preencha o Tipo";
		}
		if (objeto.getSegmento() == null) {
			return "Preencha o Segmento";
		}
		if (objeto.getEmail() == null) {
			return "Preencha o Email";
		}
		if (objeto.getLogradouro() == null) {
			return "Preencha o Logradouro";
		}
		if (objeto.getNumero() == 0) {
			return "Preencha o Número";
		}
		if (objeto.getBairro() == null) {
			return "Preencha o Bairro";
		}
		if (objeto.getCep() == 0) {
			return "Preencha o Cep";
		}
	}
	
}

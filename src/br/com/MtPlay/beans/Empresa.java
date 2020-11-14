package br.com.MtPlay.beans;

public class Empresa {

	private int idEmpresa;
	private String nome = new String();
	private int telFixo;
	private String telCel = new String();
	private String cnpj = new String();
	private String tipo = new String();
	private String segmento = new String();
	private String site = new String();
	private String email = new String();
	private String logradouro = new String();
	private int numero;
	private String bairro = new String();
	private String complemento = new String();
	private int cep;
	private String outros = new String();
	private int idCidade;
	private int idEstado;
	private String status = new String();
	
	public Empresa() {
		super();
	}
	
	public Empresa(int idEmpresa, String nome, int telFixo, String telCel, String cnpj, String tipo, String segmento,
			String site, String email, String logradouro, int numero, String bairro, String complemento, int cep,
			String outros, int idCidade, int idEstado, String status) {
		super();
		this.idEmpresa = idEmpresa;
		this.nome = nome;
		this.telFixo = telFixo;
		this.telCel = telCel;
		this.cnpj = cnpj;
		this.tipo = tipo;
		this.segmento = segmento;
		this.site = site;
		this.email = email;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.outros = outros;
		this.idCidade = idCidade;
		this.idEstado = idEstado;
		this.status = status;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public int getTelFixo() {
		return telFixo;
	}

	public void setTelFixo(int telFixo) {
		this.telFixo = telFixo;
	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipo() {
		return tipo.toUpperCase();
	}

	public void setTipo(String tipo) {
		this.tipo = tipo.toUpperCase();
	}

	public String getSegmento() {
		return segmento.toUpperCase();
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento.toUpperCase();
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro.toUpperCase();
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro.toUpperCase();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro.toUpperCase();
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}

	public String getComplemento() {
		return complemento.toUpperCase();
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento.toUpperCase();
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getOutros() {
		return outros.toUpperCase();
	}

	public void setOutros(String outros) {
		this.outros = outros.toUpperCase();
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

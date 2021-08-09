package devolucao;

public class Devolucao {
	
	private int idDevolucao;
	private int idCliente;
	private int idProduto;
	private int quantidade;
	private String data;
	private String causa;
	
	public Devolucao(int idDevolucao, int idCliente, int idProduto, int quantidade, String data, String causa) {
		this.idDevolucao = idDevolucao;
		this.idCliente = idCliente;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.causa = causa;
	}

	public int getIdDevolucao() {
		return idDevolucao;
	}

	public void setIdDevolucao(int idDevolucao) {
		this.idDevolucao = idDevolucao;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}
	
	public String dadosDevolucao() {
		String aux = "";
		
		aux += "ID da Reserva -->"+idDevolucao+"\n";
		aux += "ID do Cliente --->  " +idCliente+ "\n";
		aux += "ID do Produto --->  " +idProduto+ "\n";
		aux += "Quantidade ---> "+quantidade+"\n";
		aux += "Data da reserva ---> " +data+"\n";
		aux += "Causa da devolução ---> " +causa+"\n";

		return aux;
	}
	
	

}

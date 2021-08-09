package fornecedor;

public class Fornecedor {
	
	private int idFornecedor;
	private int idProduto;
	private int quantidade;
	private String tipo;
	private String nome;
	
	public Fornecedor(int idFornecedor, int idProduto, int quantidade, String tipo, String nome) {
		this.idFornecedor = idFornecedor;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.nome = nome;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String dadosFornecedor() {
		String aux = "";
		
		aux += "ID do fornecedor -->"+idFornecedor+"\n";
		aux += "Nome do fornecedor ---> " +nome+"\n";
		aux += "ID do Produto --->  " +idProduto+ "\n";
		aux += "Quantidade ---> "+quantidade+"\n";
		aux += "Tipo do produto ---> " +tipo+"\n";
	
		
		return aux;
	}
	
	

}

package produto;

public class Produto {
	
	private int idProduto;
	private String nome;
	private String tipo;
	private String tamanho;
	private String cor;
	private String genero;
	private String marca;
	private double valor;
	
	public Produto(int idProduto, String nome, String tipo, String tamanho, String cor, String genero, String marca,double valor) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.genero = genero;
		this.marca = marca;
		this.valor = valor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String dadosProduto() {
		String aux = "";
			
		aux += "ID do produto -->"+idProduto+"\n";
		aux += "Nome --->  " +nome+ "\n";
		aux += "Tipo --->  " +tipo+ "\n";
		aux += "Marca ---> "+marca+"\n";
		aux += "Tamanho ---> " +tamanho+"\n";
		aux += "Genero ---> " +genero+"\n";
		aux += "Cor ---> " +cor+"\n";
		aux += "Preço do produto ---> "+valor+"\n";
		
		return aux;
	}
	
	

}

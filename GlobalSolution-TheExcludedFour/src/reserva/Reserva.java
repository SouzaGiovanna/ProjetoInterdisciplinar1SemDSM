package reserva;

public class Reserva {
	
	private int idReserva;
	private int idCliente;
	private int idProduto;
	private int quantidade;
	private String data;
	
	public Reserva(int idReserva, int idCliente, int idProduto, int quantidade, String data) {
		this.idReserva = idReserva;
		this.idCliente = idCliente;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.data = data;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
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
	
	public String dadosReserva() {
		String aux = "";
		
		aux += "ID da Reserva -->"+idReserva+"\n";
		aux += "ID do Cliente --->  " +idCliente+ "\n";
		aux += "ID do Produto --->  " +idProduto+ "\n";
		aux += "Quantidade ---> "+quantidade+"\n";
		aux += "Data da reserva ---> " +data+"\n";

		return aux;
	}
	
	

}

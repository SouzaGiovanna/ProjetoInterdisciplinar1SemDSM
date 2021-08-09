package funcionario;

public class Funcionario {
	
	private int idFuncionario;
	private String nome;
	private String cpf;
	private String cargo;
	private String telefone;
	private String sexo;
	private String dataNasc;
	private String endereco;
	
	public Funcionario(int idFuncionario, String nome, String cpf, String cargo, String telefone, String sexo,String dataNasc, String endereco) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String dadosFuncionario() {
		String aux = "";
			
		aux += "ID do funcionário -->"+idFuncionario+"\n";
		aux += "Nome --->  " +nome+ "\n";
		aux += "CPF --->  " +cpf+ "\n";
		aux += "Cargo ---> "+cargo+"\n";
		aux += "Endereço ---> " +endereco+"\n";
		aux += "Telefone ---> " +telefone+"\n";
		aux += "Sexo ---> " +sexo+"\n";
		aux += "Data de nascimento ---> "+dataNasc+"\n";
		
		return aux;
	}
	
	
	

}

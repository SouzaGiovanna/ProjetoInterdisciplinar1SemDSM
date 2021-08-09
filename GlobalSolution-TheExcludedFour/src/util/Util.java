package util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import devolucao.Devolucao;
import fornecedor.Fornecedor;
import funcionario.Funcionario;
import produto.Produto;
import rendimento.Rendimento;
import reserva.Reserva;

public class Util {
	
	static Funcionario[] funcionario = new Funcionario[20];
	static Produto[] produto = new Produto[50];
	static Reserva[] reserva = new Reserva[20];
	static Devolucao[] devolucao = new Devolucao[20];
	static Fornecedor[] fornecedor= new Fornecedor[10];
	static Rendimento[] rendimento = new Rendimento[10];
	static int posicaoFuncionario = 0,posicaoProduto=0,posicaoReserva = 0,posicaoDevolucao=0,posicaoFornecedor=0,posicaoRendimento=0;

	// -------------------------------------------INICIO FUNCIONÁRIO ----------------------------------------------------------
	
	public static void cadastrarFuncionario() {
		int idFuncionario;
		String nome,cpf,cargo,telefone,sexo,dataNasc,endereco;
		
		if(posicaoFuncionario < funcionario.length) {
			idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do funcionário: "));
			nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
			cpf = JOptionPane.showInputDialog("Informe o CPF do funcionário: ");
			endereco = JOptionPane.showInputDialog("Informe o endereço do funcionário: ");
			cargo = JOptionPane.showInputDialog("Informe o cargo do funcionário: ");
			telefone = JOptionPane.showInputDialog("Informe o telefone do funcionário: ");
			sexo = JOptionPane.showInputDialog("Informe o sexo do funcionário: ");
			dataNasc= JOptionPane.showInputDialog("Informe a data de nascimento do funcionário: ");
			
			funcionario[posicaoFuncionario] = new Funcionario(idFuncionario,nome,cpf,cargo,telefone,sexo,dataNasc,endereco);
			posicaoFuncionario++;
		}else {
			JOptionPane.showMessageDialog(null, "Número máximo de funcionários cadastrados,mande um email para o Service Desk");
		}
	}
	
	public static void listarFuncionario() {
		
		int cpfFuncionario = pesquisarCpfFuncionario();
		
		if(cpfFuncionario == -1) {
			JOptionPane.showMessageDialog(null, "CPF não foi encontrado");
		}else {
			JOptionPane.showMessageDialog(null,funcionario[cpfFuncionario].dadosFuncionario());
		}
	}
	
	
	private static int pesquisarCpfFuncionario() {

		int cpfFuncionario = -1;
		String cpf = JOptionPane.showInputDialog("Informe o CPF do funcionário a ser encontrado: ");

		for (int i = 0; i < posicaoFuncionario; i++) {
			if (funcionario[i].getCpf().equals(cpf)) {
				cpfFuncionario = i;
			}
		}

		return cpfFuncionario;
	}
	
	// -------------------------------------------FIM FUNCIONÁRIO ----------------------------------------------------------
	
	
	// -------------------------------------------INICIO PRODUTO ----------------------------------------------------------
	public static void cadastrarProduto() {
		int idProduto;
		String nome,tipo,tamanho,cor,genero,marca;
		double valor;
		
		if(posicaoProduto < produto.length) {
			idProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto: "));
			nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
			tipo = JOptionPane.showInputDialog("Informe o tipo do produto: ");
			tamanho = JOptionPane.showInputDialog("Informe o tamanho do produto: ");
			cor = JOptionPane.showInputDialog("Informe a cor do produto: ");
			genero = JOptionPane.showInputDialog("Informe o gênero do produto: ");
			marca = JOptionPane.showInputDialog("Informe a marca do produto: ");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de venda do produto: "));
			
			produto[posicaoProduto] = new Produto(idProduto,nome,tipo,tamanho,cor,genero,marca,valor);
			posicaoProduto++;
		}else {
			JOptionPane.showMessageDialog(null, "Número máximo de produtos cadastrados,mande um email para o Service Desk");
		}
	}
	
	public static void listarProduto() {
		
		int idProduto = pesquisarIdProduto();
		
		if(idProduto == -1) {
			JOptionPane.showMessageDialog(null, "ID do produto não foi encontrado");
		}else {
			JOptionPane.showMessageDialog(null,produto[idProduto].dadosProduto());
		}
	}
	
	
	private static int pesquisarIdProduto() {

		int idProduto = -1;
		int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto a ser encontrado: "));

		for (int i = 0; i < posicaoProduto; i++) {
			if (produto[i].getIdProduto() == id) {
				idProduto = i;
			}
		}

		return idProduto;
	}
	
	// -------------------------------------------FIM PRODUTO ----------------------------------------------------------
	
	// -------------------------------------------INICIO RESERVA ----------------------------------------------------------
	
	public static void cadastrarReserva() {
		int idReserva,idCliente,idProduto,quantidade;
		String data;
		
		if(posicaoReserva < reserva.length) {
			idReserva = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da reserva: "));
			idCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente: "));
			idProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto: "));
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos: "));
			data = JOptionPane.showInputDialog("Informe a data da reserva: ");
			
			
			reserva[posicaoReserva] = new Reserva(idReserva,idCliente,idProduto,quantidade,data);
			posicaoReserva++;
		}else {
			JOptionPane.showMessageDialog(null, "Número máximo de reservas cadastradas,mande um email para o Service Desk");
		}
	}
	
	public static void listarReserva() {
		
		int idReserva = pesquisarIdReserva();
		
		if(idReserva == -1) {
			JOptionPane.showMessageDialog(null, "ID da reserva não foi encontrada");
		}else {
			JOptionPane.showMessageDialog(null,reserva[idReserva].dadosReserva());
		}
	}
	
	
	private static int pesquisarIdReserva() {

		int idReserva = -1;
		int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da reserva a ser encontrada: "));

		for (int i = 0; i < posicaoReserva; i++) {
			if (reserva[i].getIdReserva() == id) {
				idReserva = i;
			}
		}

		return idReserva;
	}
	
	// -------------------------------------------FINAL RESERVA ----------------------------------------------------------
	
	// -------------------------------------------INICIO DEVOLUÇÃO ----------------------------------------------------------
	
	public static void cadastrarDevolucao() {
		int idDevolucao,idCliente,idProduto,quantidade;
		String data,causa;
		
		if(posicaoDevolucao < devolucao.length) {
			idDevolucao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da devolução: "));
			idCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente: "));
			idProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto: "));
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos: "));
			data = JOptionPane.showInputDialog("Informe a data da devolução: ");
			causa = JOptionPane.showInputDialog("Informe a causa da devolução: ");
			
			devolucao[posicaoDevolucao] = new Devolucao(idDevolucao,idCliente,idProduto,quantidade,data,causa);
			posicaoDevolucao++;
		}else {
			JOptionPane.showMessageDialog(null, "Número máximo de devoluções cadastradas,mande um email para o Service Desk");
		}
	}
	
	public static void listarDevolucao() {
		
		int idDevolucao = pesquisarIdDevolucao();
		
		if(idDevolucao == -1) {
			JOptionPane.showMessageDialog(null, "ID da devolução não foi encontrada");
		}else {
			JOptionPane.showMessageDialog(null,devolucao[idDevolucao].dadosDevolucao());
		}
	}
	
	
	private static int pesquisarIdDevolucao() {

		int idDevolucao = -1;
		int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da devolução a ser encontrada: "));

		for (int i = 0; i < posicaoDevolucao; i++) {
			if (devolucao[i].getIdDevolucao() == id) {
				idDevolucao = i;
			}
		}

		return idDevolucao;
	}
	
	// -------------------------------------------FINAL DEVOLUÇÃO ----------------------------------------------------------
	
	// -------------------------------------------INICIO FORNECEDOR ----------------------------------------------------------
	public static void cadastrarFornecedor() {

		int idFornecedor,idProduto,quantidade;
		String tipo,nome;
		
		if(posicaoFornecedor < fornecedor.length) {
			idFornecedor = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do fornecedor: "));
			nome = JOptionPane.showInputDialog("Informe o nome do fornecedor: ");
			idProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto: "));
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos: "));
			tipo = JOptionPane.showInputDialog("Informe o tipo de produto fornecido: ");
			
			fornecedor[posicaoFornecedor] = new Fornecedor(idFornecedor,idProduto,quantidade,tipo,nome);
			posicaoFornecedor++;
		}else {
			JOptionPane.showMessageDialog(null, "Número máximo de fornecedores cadastrados,mande um email para o Service Desk");
		}
	}
	
	public static void listarFornecedor() {
		
		int idFornecedor = pesquisarIdFornecedor();
		
		if(idFornecedor == -1) {
			JOptionPane.showMessageDialog(null, "ID do fornecedor não foi encontrado");
		}else {
			JOptionPane.showMessageDialog(null,fornecedor[idFornecedor].dadosFornecedor());
		}
	}
	
	
	private static int pesquisarIdFornecedor() {

		int idFornecedor = -1;
		int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o CPF do fornecedor a ser encontrado: "));

		for (int i = 0; i < posicaoFornecedor; i++) {
			if (fornecedor[i].getIdFornecedor() == id) {
				idFornecedor = i;
			}
		}

		return idFornecedor;
	}
	
	// -------------------------------------------FINAL FORNECEDOR ----------------------------------------------------------
	
	public static void listaEstoque() {
		String aux = "";
		for(int i=0;i<posicaoProduto;i++) {
			aux += produto[i].dadosProduto() + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null,aux);
	}
	
	public static void listaRendimento(){
		
		 int diaAntes,mesAntes,diaDepois,mesDepois,resultadoAntes,resultadoDepois,resultadoFinal,valor = 0 ; 
		 
		 do {
		 diaAntes = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia inicial da pesquisa: "));
		 mesAntes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês inicial da pesquisa: "));
		 diaDepois = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia final da pesquisa: "));
		 mesDepois = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês final da pesquisa: "));
		 
		 if(mesAntes>mesDepois) {
			 JOptionPane.showMessageDialog(null, "Por favor coloque um período aceitável para a pesquisa!");
		 }else {
			 valor = 1;
		 }}while(valor!= 1);
		 
		 
		 resultadoAntes = diaAntes + (mesAntes * 30);
		 resultadoDepois = diaDepois + (mesDepois * 30);
		 
		resultadoFinal = resultadoDepois - resultadoAntes;
		
		if(resultadoFinal>0 && resultadoFinal<=60) {
			
			ImageIcon image01 = new ImageIcon("src/grafico01.png");
			JOptionPane.showMessageDialog(null,"","Gráfico de rendimento",JOptionPane.INFORMATION_MESSAGE,image01);

		}else if(resultadoFinal>60 && resultadoFinal<=120) {
			
			ImageIcon image02 = new ImageIcon("src/grafico02.png");
			JOptionPane.showMessageDialog(null,"","Gráfico de rendimento",JOptionPane.INFORMATION_MESSAGE,image02);
			
		}else if(resultadoFinal>120 && resultadoFinal<=180) {
			
			ImageIcon image03 = new ImageIcon("src/grafico03.png");
			JOptionPane.showMessageDialog(null,"","Gráfico de rendimento",JOptionPane.INFORMATION_MESSAGE,image03);
			
		}else if(resultadoFinal>180 && resultadoFinal<=240) {
			
			ImageIcon image04 = new ImageIcon("src/grafico04.png");
			JOptionPane.showMessageDialog(null,"","Gráfico de rendimento",JOptionPane.INFORMATION_MESSAGE,image04);
			
		}else {
			
			ImageIcon image05 = new ImageIcon("src/grafico05.png");
			JOptionPane.showMessageDialog(null,"","Gráfico de rendimento",JOptionPane.INFORMATION_MESSAGE,image05);
			
		}
	}
	
	public static void listaPedido() {
		int idPedido,resposta,opcao;
		String dataAdiamento;
		
		idPedido = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do pedido(1-3):"));
		
		if(idPedido<1 || idPedido>6) {
			
		}else {
			switch(idPedido) {
			
			case 1:
				ImageIcon image01 = new ImageIcon("src/rota01.png");
				resposta = Integer.parseInt((JOptionPane.showInputDialog(null,menuPedido(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				if(resposta<1||resposta>4) {
					JOptionPane.showMessageDialog(null, "Por favor escolha a opção corretamente!");
				}else {
					if(resposta ==1) {
						opcao = Integer.parseInt((JOptionPane.showInputDialog(null,menuAlteraPedido(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
						if(opcao<1||opcao>4) {
							JOptionPane.showMessageDialog(null, "Por favor escolha a opção corretamente!");
						}else {
							if(opcao == 1) {
								JOptionPane.showMessageDialog(null, "Pedido finalizado com sucesso!");
							}else if(opcao == 2) {
								JOptionPane.showMessageDialog(null, "Pedido cancelado com sucesso!");
							}else if(opcao == 3) {
								dataAdiamento = (JOptionPane.showInputDialog(null,"Digita a data para qual o pedido foi adiado: "));
								JOptionPane.showMessageDialog(null, "Data do adiamento: "+dataAdiamento+"\nPedido adiado com sucesso!");
							}
							
						}
					}else if(resposta == 2) {
						JOptionPane.showMessageDialog(null,"","Rota de entrega",JOptionPane.INFORMATION_MESSAGE,image01);
					}else if(resposta == 3) {
						JOptionPane.showMessageDialog(null, dadosPedido01());
					}
				}
				break;
			case 2:
				ImageIcon image02 = new ImageIcon("src/rota02.png");
				resposta = Integer.parseInt((JOptionPane.showInputDialog(null,menuPedido(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				if(resposta<1||resposta>4) {
					JOptionPane.showMessageDialog(null, "Por favor escolha a opção corretamente!");
				}else {
					if(resposta ==1) {
						opcao = Integer.parseInt((JOptionPane.showInputDialog(null,menuAlteraPedido(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
						if(opcao<1||opcao>4) {
							JOptionPane.showMessageDialog(null, "Por favor escolha a opção corretamente!");
						}else {
							if(opcao == 1) {
								JOptionPane.showMessageDialog(null, "Pedido finalizado com sucesso!");
							}else if(opcao == 2) {
								JOptionPane.showMessageDialog(null, "Pedido cancelado com sucesso!");
							}else if(opcao == 3) {
								dataAdiamento = (JOptionPane.showInputDialog(null,"Digita a data para qual o pedido foi adiado: "));
								JOptionPane.showMessageDialog(null, "Data do adiamento: "+dataAdiamento+"\nPedido adiado com sucesso!");
							}
							
						}
					}else if(resposta == 2) {
						JOptionPane.showMessageDialog(null,"","Rota de entrega",JOptionPane.INFORMATION_MESSAGE,image02);
					}else if(resposta == 3) {
						JOptionPane.showMessageDialog(null, dadosPedido02());
					}
				}
				break;
			case 3:
				ImageIcon image03 = new ImageIcon("src/rota03.png");
				resposta = Integer.parseInt((JOptionPane.showInputDialog(null,menuPedido(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				if(resposta<1||resposta>4) {
					JOptionPane.showMessageDialog(null, "Por favor escolha a opção corretamente!");
				}else {
					if(resposta ==1) {
						opcao = Integer.parseInt((JOptionPane.showInputDialog(null,menuAlteraPedido(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
						if(opcao<1||opcao>4) {
							JOptionPane.showMessageDialog(null, "Por favor escolha a opção corretamente!");
						}else {
							if(opcao == 1) {
								JOptionPane.showMessageDialog(null, "Pedido finalizado com sucesso!");
							}else if(opcao == 2) {
								JOptionPane.showMessageDialog(null, "Pedido cancelado com sucesso!");
							}else if(opcao == 3) {
								dataAdiamento = (JOptionPane.showInputDialog(null,"Digita a data para qual o pedido foi adiado: "));
								JOptionPane.showMessageDialog(null, "Data do adiamento: "+dataAdiamento+"\nPedido adiado com sucesso!");
							}
							
						}
					}else if(resposta == 2) {
						JOptionPane.showMessageDialog(null,"","Rota de entrega",JOptionPane.INFORMATION_MESSAGE,image03);
					}else if(resposta == 3) {
						JOptionPane.showMessageDialog(null, dadosPedido03());
					}
				}
				break;
			
		}
		
		
		}
	}
	
	public static String dadosPedido01() {
		String aux = "";
		
		aux += "Pedido nº1  \n";
		aux += "Produtos: \n";
		aux += "Blusa XYZ M branca \n";
		aux += "Shorts XYZ M preto \n";
		aux += "Camisa XYZ M preto \n";
		aux += "";
		aux += "Valor Total: R$ 340,00 \n";
		aux += "";
		
		return aux;
	}
	
	public static String dadosPedido02() {
		String aux = "";
		
		aux += "Pedido nº2  \n";
		aux += "Produtos: \n";
		aux += "Tênis XYZ nº42 branco \n";
		aux += "Camisa XYZ G branca \n";
		aux += "Shorts XYZ G preto \n";
		aux += "";
		aux += "Valor Total: R$ 420,00 \n";
		aux += "";
		
		return aux;
	}
	
	public static String dadosPedido03() {
		String aux = "";
		
		aux += "Pedido nº3  \n";
		aux += "Produtos: \n";
		aux += "Camisa XYZ M branca \n";
		aux += "Camisa XYZ M azul \n";
		aux += "Camisa XYZ M preto \n";
		aux += "";
		aux += "Valor Total: R$ 210,00 \n";
		aux += "";
		
		return aux;
	}
	
	public static String menuAlteraPedido() {
		String aux = "";
		
		aux += "1-Pedido Concluido  \n";
		aux += "2-Pedido Cancelado \n";
		aux += "3-Pedido Adiado \n";
		aux += "4-Voltar";
		aux += "";
		
		return aux;
	}
	
	public static String menuPedido() {
		String aux = "";
		
		aux += "1-Alterar status do pedido  \n";
		aux += "2-Visualizar rota do pedido \n";
		aux += "3-Visualizar dados do pedido \n";
		aux += "4-Voltar";
		aux += "";
		
		return aux;
	}
	
	public static String menuPrincipal() {
		String aux = "";
		
		aux += "1-Funcionário  \n";
		aux += "2-Produto \n";
		aux += "3-Estoque \n";
		aux += "4-Reserva  \n";
		aux += "5-Devolução  \n";
		aux += "6-Rendimento \n";
		aux += "7-Forncedor  \n";
		aux += "8-Pedido  \n";
		aux += "9-Finalizar aplicação";
		aux += "";
		
		return aux;
	}
	
	public static String menuFuncionario() {
		String aux = "";
		
		aux += "1-Cadastrar funcionário  \n";
		aux += "2-Listar funcionário \n";
		aux += "3-Voltar";
		
		return aux;
	}
	
	public static String menuProduto() {
		String aux = "";
		
		aux += "1-Cadastrar produto  \n";
		aux += "2-Listar produto \n";
		aux += "3-Voltar";
		
		return aux;
	}
	
	public static String menuReserva() {
		String aux = "";
		
		aux += "1-Cadastrar reserva  \n";
		aux += "2-Listar reserva \n";
		aux += "3-Voltar";
		
		return aux;
	}
	
	public static String menuDevolucao() {
		String aux = "";
		
		aux += "1-Cadastrar devolução  \n";
		aux += "2-Listar devolução \n";
		aux += "3-Voltar";
		
		return aux;
	}
	
	public static String menuFornecedor() {
		String aux = "";
		
		aux += "1-Cadastrar fornecedores  \n";
		aux += "2-Listar fornecedores \n";
		aux += "3-Voltar";
		
		return aux;
	}

}

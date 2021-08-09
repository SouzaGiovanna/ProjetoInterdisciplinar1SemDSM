package main;

import javax.swing.JOptionPane;

import util.Util;

public class Main {
	
	public static void main(String[] args) {
	
	int opcao,opcaoFuncionario,opcaoProduto,opcaoReserva,opcaoDevolucao,opcaoFornecedor;	
	int resposta;

	do {
		opcao = Integer.parseInt((JOptionPane.showInputDialog(null, Util.menuPrincipal(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
		
		if(opcao <1 || opcao > 9) {
			JOptionPane.showMessageDialog(null,"Insira uma opção válida por favor. ");
		}else {
			
			switch (opcao) {
			case 1:
				do {
				opcaoFuncionario = Integer.parseInt((JOptionPane.showInputDialog(null, Util.menuFuncionario(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				
				if(opcaoFuncionario<1 || opcaoFuncionario>3) {
					JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
				}else {
					if(opcaoFuncionario == 1) {
					Util.cadastrarFuncionario();
					}else if(opcaoFuncionario == 2) {
					Util.listarFuncionario();
					}
				}
				}while(opcaoFuncionario != 3);
				
				break;
				
			case 2:
				do {
				opcaoProduto = Integer.parseInt((JOptionPane.showInputDialog(null, Util.menuProduto(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				
				if(opcaoProduto<1 || opcaoProduto>3) {
					JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
				}else {
					if(opcaoProduto == 1) {
					Util.cadastrarProduto();
					}else if(opcaoProduto == 2) {
					Util.listarProduto();
					}
				}
				}while(opcaoProduto != 3);
				break;
				
			case 3:
				Util.listaEstoque();
				break;
				
			case 4:
				do {
				opcaoReserva = Integer.parseInt((JOptionPane.showInputDialog(null, Util.menuReserva(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				
				if(opcaoReserva<1 || opcaoReserva>3) {
					JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
				}else {
					if(opcaoReserva == 1) {
					Util.cadastrarReserva();
					}else if(opcaoReserva == 2) {
					Util.listarReserva();
					}
				}
				}while(opcaoReserva != 3);
				break;
			
			case 5:
				do {
				opcaoDevolucao = Integer.parseInt((JOptionPane.showInputDialog(null, Util.menuDevolucao(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				
				if(opcaoDevolucao<1 || opcaoDevolucao>3) {
					JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
				}else {
					if(opcaoDevolucao == 1) {
					Util.cadastrarDevolucao();
					}else if(opcaoDevolucao == 2) {
						Util.listarDevolucao();
					}
				}
				}while(opcaoDevolucao != 3);
				break;
				
			case 6:
				Util.listaRendimento();
				break;
				
			case 7:
				do{
				opcaoFornecedor = Integer.parseInt((JOptionPane.showInputDialog(null, Util.menuFornecedor(), "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE)));
				
				if(opcaoFornecedor<1 || opcaoFornecedor>3) {
					JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
				}else {
					if(opcaoFornecedor == 1) {
					Util.cadastrarFornecedor();
					}else if(opcaoFornecedor == 2) {
						Util.listarFornecedor();
					}
				}
				}while(opcaoFornecedor != 3);
				break;
				
			case 8:
				Util.listaPedido();
				break;
				
			case 9:
				resposta = JOptionPane.showConfirmDialog(null,"Deseja finalizar a aplicação?");
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null,"Até breve!");
				}else {
					opcao = resposta;
				}
				break;

			}
			
		}

	} while (opcao != 9);
	
}

}



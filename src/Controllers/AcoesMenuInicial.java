package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.JanelaDistorcaoHarmonica;
import view.JanelaFluxoPotenciaFundamental;

public class AcoesMenuInicial implements ActionListener{
	
	private JPanel painelInicial;
	private JFrame telaInicial;

	public AcoesMenuInicial(JPanel painelInicial,JFrame telaInicial) {
		this.painelInicial=painelInicial;
		this.telaInicial=telaInicial;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equals("Fluxo de Potencia Fundamental")) {
			try {
				new JanelaFluxoPotenciaFundamental(telaInicial);
			} catch (IOException e1) {
				System.out.println("ERRO!");
				e1.printStackTrace();
			}
			painelInicial.setVisible(false);
			}
		else if(comando.equals("Distorção Harmônica")) {
			try {
				new JanelaDistorcaoHarmonica(telaInicial);
				JOptionPane.showMessageDialog(null,"POR FAVOR, DIGITE: Amplitudes ≤ 220, \n -180 ≤ Ângulo de Fase ≥ 180 \n NÃO DEIXE NENHUM CAMPO EM BRANCO");
			} catch (IOException e1) {
				System.out.println("ERRO!");
			}
			painelInicial.setVisible(false);

		}
		else if(comando.equals("Fluxo de Potência Harmônico")) {
			JOptionPane.showMessageDialog(null,"Não implementado. Peço perdão pelo vacilo");
		}
	}
}
	



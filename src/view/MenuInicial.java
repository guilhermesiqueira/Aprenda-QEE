package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AcoesMenuInicial;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.IOException;

@SuppressWarnings("serial")
public class MenuInicial extends JFrame {
	
	private JPanel painelInicial;
	
	public MenuInicial(JFrame telaInicial) throws IOException{
		
		criaPainelInicial(telaInicial);		
	}
	
	public void criaPainelInicial(JFrame telaInicial) throws IOException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(000, 000, 2000, 3000);
		painelInicial = new JPanel();
		painelInicial.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelInicial);
		painelInicial.setLayout(null);
		
		JLabel lblAprendaQee = new JLabel("Aprenda QEE");
		lblAprendaQee.setBounds(638, 12, 90, 15);
		painelInicial.add(lblAprendaQee);
		
		JButton btnFluxodePotenciaFundamental = new JButton("Fluxo de Potência Fundamental");
		btnFluxodePotenciaFundamental.setBounds(553, 154, 259, 25);
		btnFluxodePotenciaFundamental.addActionListener(new AcoesMenuInicial(painelInicial,telaInicial));
		painelInicial.add(btnFluxodePotenciaFundamental);
		
		JButton btnDistorcaoHarmonica = new JButton("Distorção Harmônica");
		btnDistorcaoHarmonica.setBounds(553, 333, 259, 25);
		btnDistorcaoHarmonica.addActionListener(new AcoesMenuInicial(painelInicial, telaInicial));
		painelInicial.add(btnDistorcaoHarmonica);
		
		JButton btnFluxodePotenciaHarmonico = new JButton("Fluxo de Potência Harmônico");
		btnFluxodePotenciaHarmonico.setBounds(553, 512, 259, 25);
		btnFluxodePotenciaHarmonico.addActionListener(new AcoesMenuInicial(painelInicial, telaInicial));

		painelInicial.add(btnFluxodePotenciaHarmonico);
	
		telaInicial.getContentPane().add(painelInicial);
		telaInicial.setVisible(true);

	}
	
}

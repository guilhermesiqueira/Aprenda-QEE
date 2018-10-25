package view;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.CalculosPotenciasdoFluxoPotenciaFundamental;
import controllers.AcoesFPF;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class JanelaFluxoPotenciaFundamental extends JFrame {

	private JPanel painelJFPF;
	private JLabel lblnguloDeFases;
	private JLabel lblIt;
	private JLabel lblPt;
	private JLabel lblPativa;
	private JTextField pAtivaTxt;
	private JLabel lblPreativa;
	private JTextField pReativaTxt;
	private JLabel lblFp;
	private JTextField FatorPotenciaTxt;
	private JTextField pAparenteTxt;
	private JTextField AmplitudeVrmsTxt;
	private JTextField AmplitudeIrmsTxt;
	private JTextField AnguloCorrenteTxt;
	private JTextField AnguloTensaoTxt;


	public JanelaFluxoPotenciaFundamental(JFrame telaInicial) throws IOException{

		criaPainelFPF(telaInicial);
	}


	private void criaPainelFPF(JFrame telaInicial) throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(000, 000, 1000, 1000);
		painelJFPF = new JPanel();
		painelJFPF.setBorder(new EmptyBorder(5, 5, 5, 5));
		painelJFPF.setLayout(null);

		JLabel lblForneaOsSeguintes = new JLabel("Forneça os seguintes dados:");
		lblForneaOsSeguintes.setForeground(Color.RED);
		lblForneaOsSeguintes.setBounds(360, 12, 215, 15);
		painelJFPF.add(lblForneaOsSeguintes);

		JLabel lblAmplitudevrms = new JLabel("Amplitude (Vrms):");
		lblAmplitudevrms.setForeground(SystemColor.desktop);
		lblAmplitudevrms.setBounds(516, 59, 134, 15);
		painelJFPF.add(lblAmplitudevrms);

		AmplitudeVrmsTxt = new JTextField();
		AmplitudeVrmsTxt.setBounds(786, 55, 62, 19);
		AmplitudeVrmsTxt.setHorizontalAlignment(JTextField.CENTER);
		painelJFPF.add(AmplitudeVrmsTxt);
		AmplitudeVrmsTxt.setColumns(3);

		JLabel lblAmplitudeirms = new JLabel("Amplitude (Irms):");
		lblAmplitudeirms.setForeground(SystemColor.desktop);
		lblAmplitudeirms.setBounds(516, 113, 134, 15);
		painelJFPF.add(lblAmplitudeirms);

		AmplitudeIrmsTxt = new JTextField();
		AmplitudeIrmsTxt.setColumns(3);
		AmplitudeIrmsTxt.setBounds(786, 109, 62, 19);
		AmplitudeIrmsTxt.setHorizontalAlignment(JTextField.CENTER);
		painelJFPF.add(AmplitudeIrmsTxt);

		lblnguloDeFases = new JLabel("Ângulo de Fases da Tensão (θº): ");
		lblnguloDeFases.setForeground(SystemColor.desktop);
		lblnguloDeFases.setBounds(516, 86, 242, 15);
		painelJFPF.add(lblnguloDeFases);

		AnguloTensaoTxt = new JTextField();
		AnguloTensaoTxt.setColumns(3);
		AnguloTensaoTxt.setBounds(786, 82, 62, 19);
		AnguloTensaoTxt.setHorizontalAlignment(JTextField.CENTER);
		painelJFPF.add(AnguloTensaoTxt);

		JLabel lblnguloDeFases_1 = new JLabel("Ângulo de Fases da Corrente (θº): ");
		lblnguloDeFases_1.setForeground(SystemColor.desktop);
		lblnguloDeFases_1.setBounds(516, 140, 262, 15);
		painelJFPF.add(lblnguloDeFases_1);

		AnguloCorrenteTxt = new JTextField();
		AnguloCorrenteTxt.setColumns(3);
		AnguloCorrenteTxt.setBounds(786, 136, 62, 19);
		AnguloCorrenteTxt.setHorizontalAlignment(JTextField.CENTER);
		painelJFPF.add(AnguloCorrenteTxt);

		//Gráfico da Tensão
		JLabel lblVt = new JLabel("Onda de Tensão");
		lblVt.setBounds(30, 33, 134, 15);
		painelJFPF.add(lblVt);

		CalculosPotenciasdoFluxoPotenciaFundamental graficoTensao = new CalculosPotenciasdoFluxoPotenciaFundamental();
		ArrayList<Double> pontosgraficoTensao = graficoTensao.ondaTensao();
        GraphPanel graphTensao = new GraphPanel(pontosgraficoTensao);
        graphTensao.setBounds(25,55,473,141);



		//Gráfico da Corrente
		lblIt = new JLabel("Onda da Corrente");
		lblIt.setBounds(35, 202, 159, 15);
		painelJFPF.add(lblIt);

		JLabel lblResultadosObtidos = new JLabel("Resultados Obtidos:");
		lblResultadosObtidos.setForeground(Color.BLUE);
		lblResultadosObtidos.setBounds(681, 204, 145, 15);
		painelJFPF.add(lblResultadosObtidos);

		CalculosPotenciasdoFluxoPotenciaFundamental graficoCorrente = new CalculosPotenciasdoFluxoPotenciaFundamental();
		ArrayList<Double> pontosgraficoCorrente = graficoCorrente.ondas();
        GraphPanel graphCorrente = new GraphPanel(pontosgraficoCorrente);
        graphCorrente.setBounds(25,225,473,141);

		//Gráfico Potência Instântanea
		lblPt = new JLabel("Onda da Potência Instântanea");
		lblPt.setBounds(25, 383, 241, 15);
		painelJFPF.add(lblPt);
		CalculosPotenciasdoFluxoPotenciaFundamental graficoPotenciaInstantanea = new CalculosPotenciasdoFluxoPotenciaFundamental();
        ArrayList<Double> pontosPotenciaInstantanea = graficoPotenciaInstantanea.ondaPotenciaInstantanea();
        GraphPanel graphPotenciaInstantanea = new GraphPanel(pontosPotenciaInstantanea);
        JLabel labelondaPotInst = new JLabel("Forma de onda da Potência Instantânea:");
        graphPotenciaInstantanea.setBounds(25,399,473,141);

        painelJFPF.add(graphTensao);
        painelJFPF.add(graphCorrente);
        painelJFPF.add(graphPotenciaInstantanea);



		lblPativa = new JLabel("P(ativa) = ");
		lblPativa.setForeground(SystemColor.desktop);
		lblPativa.setBounds(658, 225, 88, 15);
		painelJFPF.add(lblPativa);

		pAtivaTxt = new JTextField();
		pAtivaTxt.setEditable(false);
		pAtivaTxt.setColumns(3);
		pAtivaTxt.setBounds(784, 221, 78, 19);
		painelJFPF.add(pAtivaTxt);

		lblPreativa = new JLabel("P(reativa) =");
		lblPreativa.setForeground(SystemColor.desktop);
		lblPreativa.setBounds(656, 252, 93, 15);
		painelJFPF.add(lblPreativa);

		pReativaTxt = new JTextField();
		pReativaTxt.setEditable(false);
		pReativaTxt.setColumns(3);
		pReativaTxt.setBounds(784, 248, 78, 19);
		painelJFPF.add(pReativaTxt);

		lblFp = new JLabel("Fator de Potência =");
		lblFp.setForeground(SystemColor.desktop);
		lblFp.setBounds(628, 300, 149, 15);
		painelJFPF.add(lblFp);

		FatorPotenciaTxt = new JTextField();
		FatorPotenciaTxt.setEditable(false);
		FatorPotenciaTxt.setColumns(3);
		FatorPotenciaTxt.setBounds(784, 296, 78, 19);
		painelJFPF.add(FatorPotenciaTxt);

		JLabel lblTringPot = new JLabel("Triângulo de Potência");
		lblTringPot.setBounds(30, 464, 164, 15);
		painelJFPF.add(lblTringPot);

		telaInicial.getContentPane().add(painelJFPF);

		JLabel lblPaparente = new JLabel("P(aparente) = ");
		lblPaparente.setForeground(SystemColor.desktop);
		lblPaparente.setBounds(649, 275, 106, 15);
		painelJFPF.add(lblPaparente);

		pAparenteTxt = new JTextField();
		pAparenteTxt.setEditable(false);
		pAparenteTxt.setColumns(3);
		pAparenteTxt.setBounds(784, 271, 78, 19);
		painelJFPF.add(pAparenteTxt);

		//Botões
		JButton btnSimular = new JButton("Simular");
		btnSimular.setBounds(628, 167, 117, 25);
		painelJFPF.add(btnSimular);
		btnSimular.setActionCommand("Simular");
		btnSimular.addActionListener(new AcoesFPF(painelJFPF,telaInicial, AmplitudeVrmsTxt, AmplitudeIrmsTxt,AnguloTensaoTxt,AnguloCorrenteTxt,pAtivaTxt,pReativaTxt,pAparenteTxt,FatorPotenciaTxt));

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(769, 167, 117, 25);
		btnVoltar.setActionCommand("Voltar");
		painelJFPF.add(btnVoltar);
		btnVoltar.addActionListener(new AcoesFPF(painelJFPF,telaInicial, AmplitudeVrmsTxt, AmplitudeIrmsTxt,AnguloTensaoTxt,AnguloCorrenteTxt,pAtivaTxt,pReativaTxt,pAparenteTxt,FatorPotenciaTxt));

		//Triangulo de Potências
	    JLabel lblTringuloDePotncias = new JLabel("Triângulo de Potências");
		lblTringuloDePotncias.setForeground(Color.GREEN);
		lblTringuloDePotncias.setBounds(658, 355, 169, 15);
		painelJFPF.add(lblTringuloDePotncias);

		telaInicial.setVisible(true);
		painelJFPF.setVisible(true);

	}

public JTextField getpAtivaTxt() {
		return pAtivaTxt;
	}


	public String getAmplitudeVrmsTxt() {
		return AmplitudeVrmsTxt.getText();
	}

	public String getAmplitudeIrmsTxt() {
		return AmplitudeIrmsTxt.getText();
	}
	public String getAnguloTensaoTxt() {
		return AnguloTensaoTxt.getText();
	}
	public String getAnguloCorrenteTxt() {
		return AnguloCorrenteTxt.getText();
	}
}

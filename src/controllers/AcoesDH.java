package controllers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Model.CalculosDistorcaoHarmonica;
import view.GraphPanel;
import view.MenuInicial;

public class AcoesDH implements ActionListener{

		private JPanel painelPrincipal;
		private JFrame telaPrincipal;
		private double amplitudeComponenteFundamental,anguloComponenteFundamental, amplitudeHarmonico1, anguloHarmonico1, ordemHarmonico1,
        amplitudeHarmonico2, anguloHarmonico2, ordemHarmonico2, amplitudeHarmonico3, anguloHarmonico3, ordemHarmonico3,
        amplitudeHarmonico4, anguloHarmonico4, ordemHarmonico4, amplitudeHarmonico5, anguloHarmonico5, ordemHarmonico5,amplitudeHarmonico6, anguloHarmonico6, ordemHarmonico6;
		private String Resultante;
		CalculosDistorcaoHarmonica calculo = new CalculosDistorcaoHarmonica();
		private JTextField AmplitudeComponenteFundamentaltxt, AnguloComponenteFundamentaltxt, AmplitudeHarmonicatxt6, AnguloHarmonicatxt6,AmplitudeHarmonicatxt,
        AnguloHarmonicatxt, AmplitudeHarmonicatxt2, AnguloHarmonicatxt2, AmplitudeHarmonicatxt3, AnguloHarmonicatxt3,AmplitudeHarmonicatxt4, AnguloHarmonicatxt4,AmplitudeHarmonicatxt5,AnguloHarmonicatxt5;
		private JSpinner OrdensHarmonicasSpinner6, OrdensHarmonicasSpinner1, OrdensHarmonicasSpinner2, OrdensHarmonicasSpinner3, OrdensHarmonicasSpinner4, OrdensHarmonicasSpinner5;
		private GraphPanel graficoCompFund, graficoResultante, graficoHarmonico1, graficoHarmonico2, graficoHarmonico3, graficoHarmonico4, graficoHarmonico5, graficoHarmonico6;
    private JTextArea ResultanteFourrier;


		public AcoesDH(JPanel painelPrincipal,JFrame telaPrincipal) {
			this.painelPrincipal=painelPrincipal;
			this.telaPrincipal=telaPrincipal;
			//Composição (os calculos só são instanciados quando a controller de Ações da DH existe)
			calculo = new CalculosDistorcaoHarmonica();
		}

		public AcoesDH(JFrame telaPrincipal, JPanel painelPrincipal, GraphPanel graficoCompFund, GraphPanel graficoResultante, GraphPanel graficoHarmonico1, GraphPanel graficoHarmonico2, GraphPanel graficoHarmonico3, GraphPanel graficoHarmonico4, GraphPanel graficoHarmonico5, GraphPanel graficoHarmonico6,
						JTextField AmplitudeComponenteFundamentaltxt, JTextField AnguloComponenteFundamentaltxt, JSpinner OrdensHarmonicasSpinner6, JTextField AmplitudeHarmonicatxt6,JTextField AnguloHarmonicatxt6,
						JSpinner OrdensHarmonicasSpinner1,JTextField AmplitudeHarmonicatxt, JTextField AnguloHarmonicatxt, JSpinner OrdensHarmonicasSpinner2, JTextField AmplitudeHarmonicatxt2, JTextField AnguloHarmonicatxt2,JSpinner OrdensHarmonicasSpinner3, JTextField AmplitudeHarmonicatxt3, JTextField AnguloHarmonicatxt3,
						JSpinner OrdensHarmonicasSpinner4, JTextField AmplitudeHarmonicatxt4, JTextField AnguloHarmonicatxt4, JSpinner OrdensHarmonicasSpinner5, JTextField AmplitudeHarmonicatxt5, JTextField AnguloHarmonicatxt5) {
			this.telaPrincipal = telaPrincipal;
			this.painelPrincipal = painelPrincipal;
			this.graficoCompFund = graficoCompFund;
			this.graficoResultante = graficoResultante;
			this.graficoHarmonico1 = graficoHarmonico1;
			this.graficoHarmonico2 = graficoHarmonico2;
			this.graficoHarmonico3 = graficoHarmonico3;
			this.graficoHarmonico4 = graficoHarmonico4;
			this.graficoHarmonico5 = graficoHarmonico5;
			this.graficoHarmonico6 = graficoHarmonico6;
			this.AmplitudeComponenteFundamentaltxt = AmplitudeComponenteFundamentaltxt;
			this.AnguloComponenteFundamentaltxt = AnguloComponenteFundamentaltxt;
			this.OrdensHarmonicasSpinner6 = OrdensHarmonicasSpinner6;
			this.AmplitudeHarmonicatxt6 = AmplitudeHarmonicatxt6;
			this.AnguloHarmonicatxt6 = AnguloHarmonicatxt6;
			this.OrdensHarmonicasSpinner1 = OrdensHarmonicasSpinner1;
			this.AmplitudeHarmonicatxt = AmplitudeHarmonicatxt;
			this.AnguloHarmonicatxt = AnguloHarmonicatxt;
			this.OrdensHarmonicasSpinner2 = OrdensHarmonicasSpinner2;
			this.AmplitudeHarmonicatxt2 = AmplitudeHarmonicatxt2;
			this.AnguloHarmonicatxt2 = AnguloHarmonicatxt2;
			this.OrdensHarmonicasSpinner3 = OrdensHarmonicasSpinner3;
			this.AmplitudeHarmonicatxt3 = AmplitudeHarmonicatxt3;
			this.AnguloHarmonicatxt3 = AnguloHarmonicatxt3;
			this.OrdensHarmonicasSpinner4 = OrdensHarmonicasSpinner4;
			this.AmplitudeHarmonicatxt4 = AmplitudeHarmonicatxt4;
			this.AnguloHarmonicatxt4 = AnguloHarmonicatxt4;
			this.OrdensHarmonicasSpinner5 = OrdensHarmonicasSpinner5;
			this.AmplitudeHarmonicatxt5 = AmplitudeHarmonicatxt5;
			this.AnguloHarmonicatxt5 = AnguloHarmonicatxt5;


		}


		@Override
		public void actionPerformed(ActionEvent e) {
			String comando = e.getActionCommand();

				amplitudeComponenteFundamental = Double.parseDouble(AmplitudeComponenteFundamentaltxt.getText());
		    anguloComponenteFundamental = Double.parseDouble(AnguloComponenteFundamentaltxt.getText());

		    amplitudeHarmonico1 = Double.parseDouble(AmplitudeHarmonicatxt6.getText());
		    anguloHarmonico1 = Double.parseDouble(AnguloHarmonicatxt6.getText());
		    ordemHarmonico1 = (Integer)OrdensHarmonicasSpinner6.getValue();

		    amplitudeHarmonico2 = Double.parseDouble(AmplitudeHarmonicatxt2.getText());
		    anguloHarmonico2 = Double.parseDouble(AnguloHarmonicatxt2.getText());
		    ordemHarmonico2 = (Integer)OrdensHarmonicasSpinner2.getValue();

		    amplitudeHarmonico3 = Double.parseDouble(AmplitudeHarmonicatxt3.getText());
		    anguloHarmonico3 = Double.parseDouble(AnguloHarmonicatxt3.getText());
		    ordemHarmonico3 = (Integer)OrdensHarmonicasSpinner3.getValue();

		    amplitudeHarmonico4 = Double.parseDouble(AmplitudeHarmonicatxt4.getText());
		    anguloHarmonico4 = Double.parseDouble(AnguloHarmonicatxt4.getText());
		    ordemHarmonico4 = (Integer)OrdensHarmonicasSpinner4.getValue();

		    amplitudeHarmonico5 = Double.parseDouble(AmplitudeHarmonicatxt5.getText());
		    anguloHarmonico5 = Double.parseDouble(AnguloHarmonicatxt5.getText());
		    ordemHarmonico5 = (Integer)OrdensHarmonicasSpinner5.getValue();

		    amplitudeHarmonico6 = Double.parseDouble(AmplitudeHarmonicatxt.getText());
		    anguloHarmonico6 = Double.parseDouble(AnguloHarmonicatxt.getText());
		    ordemHarmonico6 = (Integer)OrdensHarmonicasSpinner1.getValue();

		    calculo.setAmplitudeComponenteFundamental(amplitudeComponenteFundamental);
		    calculo.setAnguloComponenteFundamental(anguloComponenteFundamental);

		    calculo.setAmplitudeHarmonica1(amplitudeHarmonico1);
		    calculo.setAnguloHarmonica1(anguloHarmonico1);
		    calculo.setOrdemHarmonica1(ordemHarmonico1);

		    calculo.setAmplitudeHarmonica2(amplitudeHarmonico2);
		    calculo.setAnguloHarmonica2(anguloHarmonico2);
		    calculo.setOrdemHarmonica2(ordemHarmonico2);

		    calculo.setAmplitudeHarmonica3(amplitudeHarmonico3);
		    calculo.setAnguloHarmonica3(anguloHarmonico3);
		    calculo.setOrdemHarmonica3(ordemHarmonico3);

		    calculo.setAmplitudeHarmonica4(amplitudeHarmonico4);
		    calculo.setAnguloHarmonica4(anguloHarmonico4);
		    calculo.setOrdemHarmonica4(ordemHarmonico4);

		    calculo.setAmplitudeHarmonica5(amplitudeHarmonico5);
		    calculo.setAnguloHarmonica5(anguloHarmonico5);
		    calculo.setOrdemHarmonica5(ordemHarmonico5);

		    calculo.setAmplitudeHarmonica6(amplitudeHarmonico6);
		    calculo.setAnguloHarmonica6(anguloHarmonico6);
		    calculo.setOrdemHarmonica6(ordemHarmonico6);

		    Resultante = calculo.Fourrier();

		    ArrayList<Double> pontosComponenteFundamental = calculo.pontosComponenteFundamental();
		    ArrayList<Double> pontosHarmonica1 = calculo.pontosGrafHarmonico1();
		    ArrayList<Double> pontosHarmonica2 = calculo.pontosGrafHarmonico2();
		    ArrayList<Double> pontosHarmonica3 = calculo.pontosGrafHarmonico3();
		    ArrayList<Double> pontosHarmonica4 = calculo.pontosGrafHarmonico4();
		    ArrayList<Double> pontosHarmonica5 = calculo.pontosGrafHarmonico5();
		    ArrayList<Double> pontosHarmonica6 = calculo.pontosGrafHarmonico6();
		    ArrayList<Double> pontosResultante = calculo.ondas();

		    graficoCompFund = new GraphPanel(pontosComponenteFundamental);
		    graficoHarmonico1 = new GraphPanel(pontosHarmonica1);
		    graficoHarmonico2 = new GraphPanel(pontosHarmonica2);
		    graficoHarmonico3 = new GraphPanel(pontosHarmonica3);
		    graficoHarmonico4 = new GraphPanel(pontosHarmonica4);
		    graficoHarmonico5 = new GraphPanel(pontosHarmonica5);
		    graficoHarmonico6 = new GraphPanel(pontosHarmonica6);
		    graficoResultante = new GraphPanel(pontosResultante);

		    graficoCompFund.setBounds(29,44,434,154);
		    graficoHarmonico1.setBounds(29,405,434,121);
		    graficoHarmonico2.setBounds(29,551,434,111);
		    graficoHarmonico3.setBounds(475,254,434,121);
		    graficoHarmonico4.setBounds(475,405,434,121);
		    graficoHarmonico5.setBounds(475,551,434,111);
		    graficoHarmonico6.setBounds(29,254,434,121);
		    graficoResultante.setBounds(943,51,413,147);

        ResultanteFourrier = new JTextArea();
        ResultanteFourrier.setText(Resultante);
        ResultanteFourrier.setBounds(930, 240,430,75);
        ResultanteFourrier.setEditable(false);
        ResultanteFourrier.setLineWrap(true);
        ResultanteFourrier.setBorder(BorderFactory.createEmptyBorder());

        painelPrincipal.add(graficoCompFund);
        painelPrincipal.add(graficoHarmonico1);
        painelPrincipal.add(graficoHarmonico2);
        painelPrincipal.add(graficoHarmonico3);
        painelPrincipal.add(graficoHarmonico4);
        painelPrincipal.add(graficoHarmonico5);
        painelPrincipal.add(graficoHarmonico6);
        painelPrincipal.add(graficoResultante);
        painelPrincipal.add(ResultanteFourrier, BorderLayout.SOUTH);




			if(comando.equals("Simular Comp. Fundamental")) {
				if(amplitudeComponenteFundamental<=0 || amplitudeComponenteFundamental >=220 || anguloComponenteFundamental > 180 || anguloComponenteFundamental < -180) {
					JOptionPane.showMessageDialog(null,"0 ≤ amplitude ≥ 220");
					NumberFormatException e1 = new NumberFormatException();
					throw e1;
				} else {
				ResultanteFourrier.revalidate();
				ResultanteFourrier.repaint();
        graficoCompFund.revalidate();
        graficoCompFund.repaint();
        graficoResultante.revalidate();
        graficoResultante.repaint();
			}
		}

				if( comando.equals("Simular Harmonicas"))  {
					if(amplitudeHarmonico1<0 ||amplitudeHarmonico1>221 || amplitudeHarmonico2<0 ||amplitudeHarmonico2>221 || amplitudeHarmonico3<0 || amplitudeHarmonico3>221 || amplitudeHarmonico4<0 || amplitudeHarmonico4>221 || amplitudeHarmonico5<0 || amplitudeHarmonico5>221 || amplitudeHarmonico1<0 || amplitudeHarmonico6>221 || anguloHarmonico1 > 180 || anguloHarmonico1 < -180
							|| anguloHarmonico2 > 180 || anguloHarmonico2 < -180 || anguloHarmonico3 > 180 || anguloHarmonico3 < -180 || anguloHarmonico3 > 180 || anguloHarmonico3 < -180 || anguloHarmonico4 > 180 || anguloHarmonico4 < -180
							|| anguloHarmonico5 > 180 || anguloHarmonico5 < -180 || anguloHarmonico6 > 180 || anguloHarmonico6 < -180) {
						JOptionPane.showMessageDialog(null,"ERRO: 0 ≤ amplitude ≥ 220 \n -180 ≤ Ângulo de Fase ≥ 180 ");
						NumberFormatException e1 = new NumberFormatException();
						throw e1;

				} else {

					ResultanteFourrier.revalidate();
					ResultanteFourrier.repaint();
          graficoCompFund.revalidate();
          graficoCompFund.repaint();
          graficoResultante.revalidate();
          graficoResultante.repaint();
          graficoHarmonico1.revalidate();
          graficoHarmonico1.repaint();
          graficoHarmonico2.revalidate();
          graficoHarmonico2.repaint();
          graficoHarmonico3.revalidate();
          graficoHarmonico3.repaint();
          graficoHarmonico4.revalidate();
          graficoHarmonico4.repaint();
          graficoHarmonico5.revalidate();
          graficoHarmonico5.repaint();
          graficoHarmonico6.revalidate();
          graficoHarmonico6.repaint();
				}
			}

	else if(comando.equals("Voltar")) {
  	  try {
			new MenuInicial(telaPrincipal);
  	  }catch (IOException e1) {
			System.out.println("ERRO!");
			}
  	  telaPrincipal.setVisible(true);
		}

	}
}

package view;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

import Model.CalculosDistorcaoHarmonica;
import controllers.AcoesDH;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;

public class JanelaDistorcaoHarmonica extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel painelDH;
	private JTextField AmplitudeCompFundamentaltxt;
	private JTextField AnguloCompFundamentaltxt;
	private JTextField AmplitudeHarmonicastxt;
	private JTextField AmplitudeHarmonicastxt2;
	private JTextField AmplitudeHarmonicastxt3;
	private JTextField AmplitudeHarmonicastxt4;
	private JTextField AmplitudeHarmonicastxt5;
	private JTextField AmplitudeHarmonicastxt6;

	private JTextField AnguloHarmonicastxt;
	private JTextField AnguloHarmonicastxt2;
	private JTextField AnguloHarmonicastxt3;
	private JTextField AnguloHarmonicastxt4;
	private JTextField AnguloHarmonicastxt5;
	private JTextField AnguloHarmonicastxt6;

	public JanelaDistorcaoHarmonica(JFrame telaInicial2) throws IOException {
		criaPainelDH(telaInicial2);
	}

	private void criaPainelDH(JFrame telaInicial2) throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painelDH = new JPanel();
		painelDH.setBounds(000, 000, 2000, 3000);
		painelDH.setLayout(null);

		JLabel label = new JLabel("Forneça os seguintes dados:");
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		label.setForeground(Color.RED);
		label.setBounds(535, 12, 295, 25);
		painelDH.add(label);





		telaInicial2.getContentPane().add(painelDH);

		JLabel lblComponenteFundamental = new JLabel("Componente Fundamental");
		lblComponenteFundamental.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblComponenteFundamental.setForeground(SystemColor.desktop);
		lblComponenteFundamental.setBounds(116, 18, 232, 15);
		painelDH.add(lblComponenteFundamental);


		CalculosDistorcaoHarmonica graficoOndaComportamentoFundamental = new CalculosDistorcaoHarmonica();
        ArrayList<Double> pontosComponenteFundamental = graficoOndaComportamentoFundamental.pontosComponenteFundamental();
        GraphPanel graficoCompFund = new GraphPanel(pontosComponenteFundamental);
        graficoCompFund.setBounds(29,44,434,154);
		painelDH.add(graficoCompFund);



		JLabel lblResultante = new JLabel("Resultante");
		lblResultante.setForeground(Color.RED);
		lblResultante.setBounds(1102, 40, 95, 15);
		painelDH.add(lblResultante);

		ArrayList<Double> pontosResultante = graficoOndaComportamentoFundamental.pontosComponenteFundamental();
        GraphPanel graficoResultante = new GraphPanel(pontosResultante);
        graficoResultante.setBounds(943,51,413,147);

        painelDH.add(graficoResultante);




		JButton btnSimular = new JButton("Simular Comp. Fundamental");
		btnSimular.setBounds(567, 154, 232, 25);


		JLabel lblHarmonicas = new JLabel("Harmonicas:");
		lblHarmonicas.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblHarmonicas.setForeground(SystemColor.activeCaption);
		lblHarmonicas.setBounds(175, 227, 117, 15);
		painelDH.add(lblHarmonicas);


		CalculosDistorcaoHarmonica graficoOndaHarmonica1 = new CalculosDistorcaoHarmonica();
		CalculosDistorcaoHarmonica graficoOndaHarmonica2 = new CalculosDistorcaoHarmonica();
		CalculosDistorcaoHarmonica graficoOndaHarmonica3 = new CalculosDistorcaoHarmonica();
		CalculosDistorcaoHarmonica graficoOndaHarmonica4 = new CalculosDistorcaoHarmonica();
		CalculosDistorcaoHarmonica graficoOndaHarmonica5 = new CalculosDistorcaoHarmonica();
		CalculosDistorcaoHarmonica graficoOndaHarmonica6 = new CalculosDistorcaoHarmonica();

		ArrayList<Double> harmonica1 = graficoOndaHarmonica1.pontosGrafHarmonico1();
        ArrayList<Double> harmonica2 = graficoOndaHarmonica2.pontosGrafHarmonico2();
        ArrayList<Double> harmonica3 = graficoOndaHarmonica3.pontosGrafHarmonico3();
        ArrayList<Double> harmonica4 = graficoOndaHarmonica4.pontosGrafHarmonico4();
        ArrayList<Double> harmonica5 = graficoOndaHarmonica5.pontosGrafHarmonico5();
        ArrayList<Double> harmonica6 = graficoOndaHarmonica6.pontosGrafHarmonico6();

        GraphPanel graficoHarmonico1 = new GraphPanel(harmonica1);
        GraphPanel graficoHarmonico2 = new GraphPanel(harmonica2);
        GraphPanel graficoHarmonico3 = new GraphPanel(harmonica3);
        GraphPanel graficoHarmonico4 = new GraphPanel(harmonica4);
        GraphPanel graficoHarmonico5 = new GraphPanel(harmonica5);
        GraphPanel graficoHarmonico6 = new GraphPanel(harmonica6);

        //Gráfico da primeira Harmonica
        graficoHarmonico1.setBounds(29,405,434,121);

        painelDH.add(graficoHarmonico1);

        //Gráfico da segunda Harmonica
        graficoHarmonico2.setBounds(29,551,434,111);

      //Gráfico da terceira Harmonica
        graficoHarmonico3.setBounds(475,254,434,121);

      //Gráfico da quarta Harmonica
        graficoHarmonico4.setBounds(475,405,434,121);

        //Gráfico da quinta Harmonica
        graficoHarmonico5.setBounds(475,551,434,111);

      //Gráfico da sexta Harmonica
        graficoHarmonico6.setBounds(29,254,434,121);


        painelDH.add(graficoHarmonico1);
        painelDH.add(graficoHarmonico2);
        painelDH.add(graficoHarmonico3);
        painelDH.add(graficoHarmonico4);
        painelDH.add(graficoHarmonico5);
        painelDH.add(graficoHarmonico6);

		JButton btnSimularHarmonicas = new JButton("Simular Harmonicas");
		btnSimularHarmonicas.setBounds(944, 558, 192, 25);
		painelDH.add(btnSimularHarmonicas);


		JLabel lblFourrier = new JLabel("Fourrier");
		lblFourrier.setBounds(1114, 210, 70, 15);
		painelDH.add(lblFourrier);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(944, 613, 193, 25);
		btnVoltar.setActionCommand("Voltar");
		painelDH.add(btnVoltar);
		telaInicial2.setVisible(true);
		painelDH.setVisible(true);

		painelDH.add(btnSimular);

		JLabel lblAmplitude = new JLabel("Amplitude:");
		painelDH.add(lblAmplitude);
		lblAmplitude.setBounds(474, 53, 76, 15);

		AmplitudeCompFundamentaltxt = new JTextField();
		AmplitudeCompFundamentaltxt.setText("0");
		painelDH.add(AmplitudeCompFundamentaltxt);
		AmplitudeCompFundamentaltxt.setBounds(729, 51, 37, 19);
		AmplitudeCompFundamentaltxt.setColumns(3);

		JLabel lblnguloDeFases = new JLabel("Ângulo de Fases da Harmônica (θº): ");
		painelDH.add(lblnguloDeFases);
		lblnguloDeFases.setBounds(467, 82, 257, 15);

		AnguloCompFundamentaltxt = new JTextField();
		AnguloCompFundamentaltxt.setText("0");
		painelDH.add(AnguloCompFundamentaltxt);
		AnguloCompFundamentaltxt.setBounds(729, 80, 37, 19);
		AnguloCompFundamentaltxt.setColumns(3);

		JLabel lblOrdemHarmonica6 = new JLabel("Ordem Harmônica:");
		painelDH.add(lblOrdemHarmonica6);
		lblOrdemHarmonica6.setBounds(39,375,131,15);
		JSpinner OrdensHarmonicasSpinner6 = new JSpinner();
		painelDH.add(OrdensHarmonicasSpinner6);
		OrdensHarmonicasSpinner6.setEnabled(true);
		OrdensHarmonicasSpinner6.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		OrdensHarmonicasSpinner6.setBounds(175, 373, 44, 20);

        JLabel lblAmplitudeHarmonica6 = new JLabel("Amplitude:");
        painelDH.add(lblAmplitudeHarmonica6);
        lblAmplitudeHarmonica6.setBounds(224,375,76,15);
        AmplitudeHarmonicastxt6 = new JTextField();
        AmplitudeHarmonicastxt6.setText("0");
        painelDH.add(AmplitudeHarmonicastxt6);
        AmplitudeHarmonicastxt6.setEnabled(true);
        AmplitudeHarmonicastxt6.setBounds(305,373,37,19);
        AmplitudeHarmonicastxt6.setColumns(3);
        AnguloHarmonicastxt6 = new JTextField();
        AnguloHarmonicastxt6.setText("0");
        painelDH.add(AnguloHarmonicastxt6);
        AnguloHarmonicastxt6.setEnabled(true);
        AnguloHarmonicastxt6.setBounds(406, 373, 37, 19);
        AnguloHarmonicastxt6.setColumns(3);



        JLabel lblnguloDeFases_6 = new JLabel("Ângulo:");
        painelDH.add(lblnguloDeFases_6);
        lblnguloDeFases_6.setBounds(347,375,54,15);

        JLabel lblOrdemHarmonica1 = new JLabel("Ordem Harmônica:");
        painelDH.add(lblOrdemHarmonica1);
        lblOrdemHarmonica1.setBounds(39,529,131,15);
        JSpinner OrdensHarmonicasSpinner1 = new JSpinner();
        painelDH.add(OrdensHarmonicasSpinner1);
        OrdensHarmonicasSpinner1.setModel(new SpinnerNumberModel(0, 0, 16, 1));
        OrdensHarmonicasSpinner1.setBounds(175, 527, 44, 20);
        OrdensHarmonicasSpinner1.setEnabled(true);
        JLabel lblAmplitudeHarmonica1 = new JLabel("Amplitude:");
        painelDH.add(lblAmplitudeHarmonica1);
        lblAmplitudeHarmonica1.setBounds(224,529,76,15);
        AmplitudeHarmonicastxt = new JTextField();
        AmplitudeHarmonicastxt.setText("0");
        painelDH.add(AmplitudeHarmonicastxt);
        AmplitudeHarmonicastxt.setBounds(305,527,37,19);
        AmplitudeHarmonicastxt.setEnabled(true);
        AmplitudeHarmonicastxt.setColumns(3);



        JLabel lblnguloDeFases_1 = new JLabel("Ângulo:");
        painelDH.add(lblnguloDeFases_1);
        lblnguloDeFases_1.setBounds(347,529,54,15);
        AnguloHarmonicastxt = new JTextField();
        AnguloHarmonicastxt.setText("0");
        painelDH.add(AnguloHarmonicastxt);
        AnguloHarmonicastxt.setBounds(406, 527, 37, 19);
        AnguloHarmonicastxt.setEnabled(true);
        AnguloHarmonicastxt.setColumns(3);

        JLabel lblOrdemHarmonica2 = new JLabel("Ordem Harmônica:");
        painelDH.add(lblOrdemHarmonica2);
        lblOrdemHarmonica2.setBounds(39,663,131,15);
        JSpinner OrdensHarmonicasSpinner2 = new JSpinner();
        painelDH.add(OrdensHarmonicasSpinner2);
        OrdensHarmonicasSpinner2.setModel(new SpinnerNumberModel(0, 0, 16, 1));
        OrdensHarmonicasSpinner2.setBounds(175, 661, 44, 20);
        OrdensHarmonicasSpinner2.setEnabled(true);

        JLabel lblAmplitudeHarmonica2 = new JLabel("Amplitude:");
        painelDH.add(lblAmplitudeHarmonica2);
        lblAmplitudeHarmonica2.setBounds(224,663,76,15);
        AmplitudeHarmonicastxt2 = new JTextField();
        AmplitudeHarmonicastxt2.setText("0");
        painelDH.add(AmplitudeHarmonicastxt2);
        AmplitudeHarmonicastxt2.setBounds(305,661,37,19);
        AmplitudeHarmonicastxt2.setEnabled(true);
        AmplitudeHarmonicastxt2.setColumns(3);



        JLabel lblnguloDeFases_2 = new JLabel("Ângulo:");
        painelDH.add(lblnguloDeFases_2);
        lblnguloDeFases_2.setBounds(347,663,54,15);
        AnguloHarmonicastxt2 = new JTextField();
        AnguloHarmonicastxt2.setText("0");
        painelDH.add(AnguloHarmonicastxt2);
        AnguloHarmonicastxt2.setBounds(406, 661, 37, 19);
        AnguloHarmonicastxt2.setEnabled(true);
        AnguloHarmonicastxt2.setColumns(3);

        JLabel lblOrdemHarmonica3 = new JLabel("Ordem Harmônica:");
        painelDH.add(lblOrdemHarmonica3);
        lblOrdemHarmonica3.setBounds(485,375,131,15);
        JSpinner OrdensHarmonicasSpinner3 = new JSpinner();
        painelDH.add(OrdensHarmonicasSpinner3);
        OrdensHarmonicasSpinner3.setEnabled(true);
        OrdensHarmonicasSpinner3.setModel(new SpinnerNumberModel(0, 0, 16, 1));
        OrdensHarmonicasSpinner3.setBounds(621, 373, 44, 20);

        JLabel lblAmplitudeHarmonica3 = new JLabel("Amplitude:");
        painelDH.add(lblAmplitudeHarmonica3);
        lblAmplitudeHarmonica3.setBounds(670,375,76,15);
        AmplitudeHarmonicastxt3 = new JTextField();
        AmplitudeHarmonicastxt3.setText("0");
        painelDH.add(AmplitudeHarmonicastxt3);
        AmplitudeHarmonicastxt3.setEnabled(true);
        AmplitudeHarmonicastxt3.setBounds(751,373,37,19);
        AmplitudeHarmonicastxt3.setColumns(3);



        JLabel lblnguloDeFases_3 = new JLabel("Ângulo:");
        painelDH.add(lblnguloDeFases_3);
        lblnguloDeFases_3.setBounds(793,375,54,15);
        AnguloHarmonicastxt3 = new JTextField();
        AnguloHarmonicastxt3.setText("0");
        painelDH.add(AnguloHarmonicastxt3);
        AnguloHarmonicastxt3.setEnabled(true);
        AnguloHarmonicastxt3.setBounds(852, 373, 37, 19);
        AnguloHarmonicastxt3.setColumns(3);

        JLabel lblOrdemHarmonica5 = new JLabel("Ordem Harmônica:");
        painelDH.add(lblOrdemHarmonica5);
        lblOrdemHarmonica5.setBounds(485,665,131,15);
        JSpinner OrdensHarmonicasSpinner5 = new JSpinner();
        painelDH.add(OrdensHarmonicasSpinner5);
        OrdensHarmonicasSpinner5.setEnabled(true);
        OrdensHarmonicasSpinner5.setModel(new SpinnerNumberModel(0, 0, 16, 1));
        OrdensHarmonicasSpinner5.setBounds(621, 663, 44, 20);

        JLabel lblAmplitudeHarmonica5 = new JLabel("Amplitude:");
        painelDH.add(lblAmplitudeHarmonica5);
        lblAmplitudeHarmonica5.setBounds(670,665,76,15);
        AmplitudeHarmonicastxt5 = new JTextField();
        AmplitudeHarmonicastxt5.setText("0");
        painelDH.add(AmplitudeHarmonicastxt5);
        AmplitudeHarmonicastxt5.setEnabled(true);
        AmplitudeHarmonicastxt5.setBounds(751,663,37,19);
        AmplitudeHarmonicastxt5.setColumns(3);



        JLabel lblnguloDeFases_5 = new JLabel("Ângulo:");
        painelDH.add(lblnguloDeFases_5);
        lblnguloDeFases_5.setBounds(793,665,54,15);
        AnguloHarmonicastxt5 = new JTextField();
        AnguloHarmonicastxt5.setText("0");
        painelDH.add(AnguloHarmonicastxt5);
        AnguloHarmonicastxt5.setEnabled(true);
        AnguloHarmonicastxt5.setBounds(852, 663, 37, 19);
        AnguloHarmonicastxt5.setColumns(3);

        JLabel lblOrdemHarmonica4 = new JLabel("Ordem Harmônica:");
        painelDH.add(lblOrdemHarmonica4);
        lblOrdemHarmonica4.setBounds(475,529,131,15);
        JSpinner OrdensHarmonicasSpinner4 = new JSpinner();
        painelDH.add(OrdensHarmonicasSpinner4);
        OrdensHarmonicasSpinner4.setEnabled(true);
        OrdensHarmonicasSpinner4.setModel(new SpinnerNumberModel(0, 0, 16, 1));
        OrdensHarmonicasSpinner4.setBounds(611, 527, 44, 20);

        JLabel lblAmplitudeHarmonica4 = new JLabel("Amplitude:");
        painelDH.add(lblAmplitudeHarmonica4);
        lblAmplitudeHarmonica4.setBounds(660,529,76,15);
        AmplitudeHarmonicastxt4 = new JTextField();
        AmplitudeHarmonicastxt4.setText("0");
        painelDH.add(AmplitudeHarmonicastxt4);
        AmplitudeHarmonicastxt4.setEnabled(true);
        AmplitudeHarmonicastxt4.setBounds(741,527,37,19);
        AmplitudeHarmonicastxt4.setColumns(3);



        JLabel lblnguloDeFases_4 = new JLabel("Ângulo:");
        painelDH.add(lblnguloDeFases_4);
        lblnguloDeFases_4.setBounds(783,529,54,15);
        AnguloHarmonicastxt4 = new JTextField();
        AnguloHarmonicastxt4.setText("0");
        painelDH.add(AnguloHarmonicastxt4);
        AnguloHarmonicastxt4.setEnabled(true);
        AnguloHarmonicastxt4.setBounds(842, 527, 37, 19);
        AnguloHarmonicastxt4.setColumns(3);
        btnSimularHarmonicas.addActionListener(new AcoesDH(telaInicial2, painelDH, graficoCompFund, graficoResultante, graficoHarmonico1, graficoHarmonico2, graficoHarmonico3, graficoHarmonico4, graficoHarmonico5, graficoHarmonico6,
        		AmplitudeCompFundamentaltxt, AnguloCompFundamentaltxt, OrdensHarmonicasSpinner6, AmplitudeHarmonicastxt6, AnguloHarmonicastxt6, OrdensHarmonicasSpinner1, AmplitudeHarmonicastxt, AnguloHarmonicastxt, OrdensHarmonicasSpinner2,
        		AmplitudeHarmonicastxt2, AnguloHarmonicastxt2, OrdensHarmonicasSpinner3, AmplitudeHarmonicastxt3, AnguloHarmonicastxt3, OrdensHarmonicasSpinner4, AmplitudeHarmonicastxt4, AnguloHarmonicastxt4, OrdensHarmonicasSpinner5,
        		AmplitudeHarmonicastxt5,AnguloHarmonicastxt5));

        btnVoltar.addActionListener(new AcoesDH(telaInicial2,painelDH, graficoCompFund, graficoResultante, graficoHarmonico1, graficoHarmonico2, graficoHarmonico3, graficoHarmonico4, graficoHarmonico5, graficoHarmonico6,
        		AmplitudeCompFundamentaltxt, AnguloCompFundamentaltxt, OrdensHarmonicasSpinner6, AmplitudeHarmonicastxt6, AnguloHarmonicastxt6, OrdensHarmonicasSpinner1, AmplitudeHarmonicastxt, AnguloHarmonicastxt,
                OrdensHarmonicasSpinner2, AmplitudeHarmonicastxt2, AnguloHarmonicastxt2,OrdensHarmonicasSpinner3, AmplitudeHarmonicastxt3, AnguloHarmonicastxt3, OrdensHarmonicasSpinner4, AmplitudeHarmonicastxt4,
                AnguloHarmonicastxt4, OrdensHarmonicasSpinner5, AmplitudeHarmonicastxt5, AnguloHarmonicastxt5));

        btnSimular.addActionListener(new AcoesDH(telaInicial2, painelDH,graficoCompFund,graficoResultante,graficoHarmonico1, graficoHarmonico2, graficoHarmonico3, graficoHarmonico4, graficoHarmonico5, graficoHarmonico6,
                AmplitudeCompFundamentaltxt,AnguloCompFundamentaltxt,OrdensHarmonicasSpinner6,AmplitudeHarmonicastxt6,AnguloHarmonicastxt6,OrdensHarmonicasSpinner1,AmplitudeHarmonicastxt,AnguloHarmonicastxt,
                OrdensHarmonicasSpinner2,AmplitudeHarmonicastxt2,AnguloHarmonicastxt2,OrdensHarmonicasSpinner3,AmplitudeHarmonicastxt3,AnguloHarmonicastxt3,OrdensHarmonicasSpinner4,AmplitudeHarmonicastxt4,AnguloHarmonicastxt4,
                OrdensHarmonicasSpinner5,AmplitudeHarmonicastxt5,AnguloHarmonicastxt5));

	}
}

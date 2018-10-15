package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.CalculosPotenciasdoFluxoPotenciaFundamental;
import view.GraphPanel;
import view.JanelaFluxoPotenciaFundamental;
import view.MenuInicial;

public class AcoesFPF implements ActionListener{

	private JPanel painelInicial;
	private JFrame telaInicial;
	private double  amplitudeVRMS, amplitudeIRMS, anguloTensao, anguloCorrente;
	CalculosPotenciasdoFluxoPotenciaFundamental calculo = new CalculosPotenciasdoFluxoPotenciaFundamental();	
	private JTextField amplitudeIRMStxt, amplitudeVRMStxt, anguloTensaotxt, anguloCorrentetxt;
	private JTextField pAtivatxt, pReativatxt, pAparentetxt, fatorPotenciatxt;
	private GraphPanel grafTensao;
	private GraphPanel grafCorrente;
	private GraphPanel grafPotenciaInstantanea;


	public AcoesFPF(JPanel painelInicial,JFrame telaInicial) {
		this.painelInicial=painelInicial;
		this.telaInicial=telaInicial;
		//Composição (os calculos só são instanciados quando a controller de Ações da FPF existe)
		calculo = new CalculosPotenciasdoFluxoPotenciaFundamental();
	}
	
	public AcoesFPF(JPanel painelInicial, JFrame telaInicial,JTextField amplitudeVRMStxt, JTextField amplitudeIRMStxt, JTextField anguloTensaotxt, JTextField anguloCorrentetxt,
					JTextField pAtivatxt, JTextField pReativatxt, JTextField pAparentetxt, JTextField fatorPotenciatxt) {
		this.painelInicial = painelInicial;
		this.telaInicial = telaInicial;
		this.amplitudeVRMStxt = amplitudeVRMStxt;
		this.amplitudeIRMStxt = amplitudeIRMStxt;
		this.anguloTensaotxt = anguloTensaotxt;
		this.anguloCorrentetxt = anguloCorrentetxt;
		this.pAtivatxt = pAtivatxt;
		this.pReativatxt = pReativatxt;
		this.pAparentetxt = pAparentetxt;
		this.fatorPotenciatxt = fatorPotenciatxt;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if(comando.equals("Simular")) {
		try {
			amplitudeVRMS = Double.parseDouble(amplitudeVRMStxt.getText());
			amplitudeIRMS = Double.parseDouble(amplitudeIRMStxt.getText());
			anguloTensao = Double.parseDouble(anguloTensaotxt.getText());
			anguloCorrente = Double.parseDouble(anguloCorrentetxt.getText());
			
			if(amplitudeIRMS < 0 || amplitudeIRMS > 100 || amplitudeVRMS < 0 || amplitudeVRMS > 220 || anguloTensao > 180 || anguloTensao < -180|| anguloCorrente > 180 || anguloCorrente < -180) {
				NumberFormatException e1 = new NumberFormatException();
				throw e1;
			} else {

			calculo.setAmplitudeVRMS(amplitudeVRMS);
			calculo.setAmplitudeIRMS(amplitudeIRMS);
			calculo.setAnguloTensao(anguloTensao);
			calculo.setAnguloCorrente(anguloCorrente);
			
			ArrayList<Double> graficoTensao = calculo.ondaTensao();
            ArrayList<Double> graficoCorrente = calculo.ondas();
            ArrayList<Double> graficoPotInst = calculo.ondaPotenciaInstantanea();
            
            grafTensao = new GraphPanel(graficoTensao);
            grafCorrente = new GraphPanel(graficoCorrente);
            grafPotenciaInstantanea = new GraphPanel(graficoPotInst);
            
            grafTensao.setBounds(25,55,473,141);
            grafCorrente.setBounds(25,225,473,141);
            grafPotenciaInstantanea.setBounds(25,399,473,141);
            
            painelInicial.add(grafTensao);
            painelInicial.add(grafCorrente);
            painelInicial.add(grafPotenciaInstantanea);
            new JanelaFluxoPotenciaFundamental(telaInicial);
            
            grafTensao.revalidate();
            grafTensao.repaint();
            grafCorrente.revalidate();
            grafCorrente.repaint();
            grafPotenciaInstantanea.revalidate();
            grafPotenciaInstantanea.repaint();

			pAtivatxt.setText(String.valueOf(calculo.CalculapAtiva()) +"Watt");
			pReativatxt.setText(String.valueOf(calculo.CalculapReativa()) +"Var");
			pAparentetxt.setText(String.valueOf(calculo.CalculapAparente())+ "VA");
			fatorPotenciatxt.setText(String.valueOf(calculo.calculaFatorPotencia()+" "+calculo.TxtFatPotencia()));
			}
		}catch(NumberFormatException e1) {
			JOptionPane.showMessageDialog(null,"ERRO: Tensão: 0 ≤ VRMS ≤ 220\nCorrente: 0 ≤ IRMS ≤ 100\n-180 ≤ Ângulo ≥ 180");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(comando.equals("Voltar")) {
		try {
			new MenuInicial(telaInicial);
		} catch (IOException e1) {
			System.out.println("ERRO!");
			}
		painelInicial.setVisible(false);
		}
	}
}

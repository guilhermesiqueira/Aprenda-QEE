package Model;

import java.util.ArrayList;

public class CalculosPotenciasdoFluxoPotenciaFundamental implements ContratoCalculos {
	private double amplitudeVRMS;
	private double amplitudeIRMS;
	private double anguloTensao;
	private double anguloCorrente;


	public double getAmplitudeVRMS() {
		return amplitudeVRMS;
	}

	public void setAmplitudeVRMS(double amplitudeVRMS) {
		this.amplitudeVRMS = amplitudeVRMS;
	}

	public double getAmplitudeIRMS() {
		return amplitudeIRMS;
	}
	public void setAmplitudeIRMS(double amplitudeIRMS) {
		this.amplitudeIRMS = amplitudeIRMS;
	}


	public double getAnguloTensao() {
		return anguloTensao;
	}

	public void setAnguloTensao(double anguloTensao) {
		this.anguloTensao = anguloTensao;
	}


	public double getAnguloCorrente() {
		return anguloCorrente;
	}
	public void setAnguloCorrente(double anguloCorrente) {
		this.anguloCorrente = anguloCorrente;
	}



	//calculos
	public double CalculapAtiva() {
		double pAtiva;

		pAtiva = getAmplitudeVRMS() * getAmplitudeIRMS() * Math.cos(Math.toRadians(getAnguloTensao() - getAnguloCorrente()));
		pAtiva = Math.round(pAtiva*100.0)/100.0;
		return pAtiva;
	}

	public double CalculapReativa() {
		double pReativa;

		pReativa = getAmplitudeVRMS() * getAmplitudeIRMS() * Math.sin(Math.toRadians(getAnguloTensao() - getAnguloCorrente()));
		pReativa = Math.round(pReativa*100.0)/100.0;

		return pReativa;
	}

	public double CalculapAparente() {
		double pAparente;

		pAparente = getAmplitudeVRMS() * getAmplitudeIRMS();
		pAparente = Math.round(pAparente*100.0)/100.0;

		return pAparente;
	}

	public double calculaFatorPotencia() {
		double fatorPotencia;

		fatorPotencia = Math.cos(Math.toRadians(getAnguloTensao() - getAnguloCorrente()));
		return fatorPotencia;
	}
	public String TxtFatPotencia(){
    String fatorPotencia = null;
    if (getAnguloTensao()-getAnguloCorrente() < 0){
        fatorPotencia = "Adiantado";
    }
    else if (getAnguloTensao()-getAnguloCorrente()>0){
        fatorPotencia = "Atrasado";
    }
    else if (getAnguloTensao()-getAnguloCorrente() == 0){
        fatorPotencia = "1";
    }
    return (fatorPotencia);
  }

	public ArrayList<Double> ondaTensao(){

		ArrayList<Double> pontosTensao = new ArrayList<>();

    for (double i = 0; i <= 220; i = (float) (i + 0.1)) {
        pontosTensao.add(getAmplitudeVRMS()*(Math.cos((2*3.14*60*i)) + getAnguloTensao()));
    }
    return (pontosTensao);
	}

	public ArrayList<Double> ondas(){

		ArrayList<Double> pontosCorrente = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
    	pontosCorrente.add(getAmplitudeIRMS()*(Math.cos((2*3.14*60*i)) + getAnguloCorrente()));
    }
    return (pontosCorrente);
	}

	public ArrayList<Double> ondaPotenciaInstantanea(){

		ArrayList<Double> pontosPotInstantanea = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
    	pontosPotInstantanea.add((getAmplitudeVRMS()*(Math.cos((2*3.14*60*i)) + getAnguloTensao()))*(getAmplitudeIRMS()*(Math.cos((2*3.14*60*i)) + getAnguloCorrente())));
    }
    return (pontosPotInstantanea);
	}

}

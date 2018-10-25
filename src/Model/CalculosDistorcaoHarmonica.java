package Model;

import static java.lang.Math.cos;

import java.util.ArrayList;

public class CalculosDistorcaoHarmonica implements ContratoCalculos{
	private double amplitudeComponenteFundamental;
	private double anguloComponenteFundamental;
	private double amplitudeHarmonica1;
	private double anguloHarmonica1;
	private double amplitudeHarmonica2;
	private double anguloHarmonica2;
	private double amplitudeHarmonica3;
	private double anguloHarmonica3;
	private double amplitudeHarmonica4;
	private double anguloHarmonica4;
	private double amplitudeHarmonica5;
	private double anguloHarmonica5;
	private double amplitudeHarmonica6;
	private double anguloHarmonica6;
	private double ordemHarmonica1;
	private double ordemHarmonica2;
	private double ordemHarmonica3;
	private double ordemHarmonica4;
	private double ordemHarmonica5;
	private double ordemHarmonica6;

	public double getAmplitudeComponenteFundamental() {
		return amplitudeComponenteFundamental;
	}
	public void setAmplitudeComponenteFundamental(double amplitudeComponenteFundamental) {
		this.amplitudeComponenteFundamental = amplitudeComponenteFundamental;
	}
	public double getAnguloComponenteFundamental() {
		return anguloComponenteFundamental;
	}
	public void setAnguloComponenteFundamental(double anguloComponenteFundamental) {
		this.anguloComponenteFundamental = anguloComponenteFundamental;
	}
	public double getAmplitudeHarmonica1() {
		return amplitudeHarmonica1;
	}
	public void setAmplitudeHarmonica1(double amplitudeHarmonica1) {
		this.amplitudeHarmonica1 = amplitudeHarmonica1;
	}
	public double getAnguloHarmonica1() {
		return anguloHarmonica1;
	}
	public void setAnguloHarmonica1(double anguloHarmonica1) {
		this.anguloHarmonica1 = anguloHarmonica1;
	}
	public double getAmplitudeHarmonica2() {
		return amplitudeHarmonica2;
	}
	public void setAmplitudeHarmonica2(double amplitudeHarmonica2) {
		this.amplitudeHarmonica2 = amplitudeHarmonica2;
	}
	public double getAnguloHarmonica2() {
		return anguloHarmonica2;
	}
	public void setAnguloHarmonica2(double anguloHarmonica2) {
		this.anguloHarmonica2 = anguloHarmonica2;
	}
	public double getAmplitudeHarmonica3() {
		return amplitudeHarmonica3;
	}
	public void setAmplitudeHarmonica3(double amplitudeHarmonica3) {
		this.amplitudeHarmonica3 = amplitudeHarmonica3;
	}
	public double getAnguloHarmonica3() {
		return anguloHarmonica3;
	}
	public void setAnguloHarmonica3(double anguloHarmonica3) {
		this.anguloHarmonica3 = anguloHarmonica3;
	}
	public double getAmplitudeHarmonica4() {
		return amplitudeHarmonica4;
	}
	public void setAmplitudeHarmonica4(double amplitudeHarmonica4) {
		this.amplitudeHarmonica4 = amplitudeHarmonica4;
	}
	public double getAnguloHarmonica4() {
		return anguloHarmonica4;
	}
	public void setAnguloHarmonica4(double anguloHarmonica4) {
		this.anguloHarmonica4 = anguloHarmonica4;
	}
	public double getAmplitudeHarmonica5() {
		return amplitudeHarmonica5;
	}
	public void setAmplitudeHarmonica5(double amplitudeHarmonica5) {
		this.amplitudeHarmonica5 = amplitudeHarmonica5;
	}
	public double getAnguloHarmonica5() {
		return anguloHarmonica5;
	}
	public void setAnguloHarmonica5(double anguloHarmonica5) {
		this.anguloHarmonica5 = anguloHarmonica5;
	}
	public double getAmplitudeHarmonica6() {
		return amplitudeHarmonica6;
	}
	public void setAmplitudeHarmonica6(double amplitudeHarmonica6) {
		this.amplitudeHarmonica6 = amplitudeHarmonica6;
	}
	public double getAnguloHarmonica6() {
		return anguloHarmonica6;
	}
	public void setAnguloHarmonica6(double anguloHarmonica6) {
		this.anguloHarmonica6 = anguloHarmonica6;
	}
	public double getOrdemHarmonica1() {
		return ordemHarmonica1;
	}
	public void setOrdemHarmonica1(double ordemHarmonica1) {
		this.ordemHarmonica1 = ordemHarmonica1;
	}
	public double getOrdemHarmonica2() {
		return ordemHarmonica2;
	}
	public void setOrdemHarmonica2(double ordemHarmonica2) {
		this.ordemHarmonica2 = ordemHarmonica2;
	}
	public double getOrdemHarmonica3() {
		return ordemHarmonica3;
	}
	public void setOrdemHarmonica3(double ordemHarmonica3) {
		this.ordemHarmonica3 = ordemHarmonica3;
	}
	public double getOrdemHarmonica4() {
		return ordemHarmonica4;
	}
	public void setOrdemHarmonica4(double ordemHarmonica4) {
		this.ordemHarmonica4 = ordemHarmonica4;
	}
	public double getOrdemHarmonica5() {
		return ordemHarmonica5;
	}
	public void setOrdemHarmonica5(double ordemHarmonica5) {
		this.ordemHarmonica5 = ordemHarmonica5;
	}
	public double getOrdemHarmonica6() {
		return ordemHarmonica6;
	}
	public void setOrdemHarmonica6(double ordemHarmonica6) {
		this.ordemHarmonica6 = ordemHarmonica6;
	}
	public ArrayList<Double> pontosGrafHarmonico1(){
		ArrayList<Double> grafHarmonico1 = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafHarmonico1.add(getAmplitudeHarmonica1()*cos((getOrdemHarmonica1()*2*3.14*60*i) + getAnguloHarmonica1()));
    }
    return (grafHarmonico1);
  }
	public ArrayList<Double> pontosGrafHarmonico2(){
		ArrayList<Double> grafHarmonico2 = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafHarmonico2.add(getAmplitudeHarmonica2()*cos((getOrdemHarmonica2()*2*3.14*60*i) + getAnguloHarmonica2()));
    }
    return (grafHarmonico2);
  }

	public ArrayList<Double> pontosGrafHarmonico3(){
		ArrayList<Double> grafHarmonico3 = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafHarmonico3.add(getAmplitudeHarmonica1()*cos((getOrdemHarmonica3()*2*3.14*60*i) + getAnguloHarmonica3()));
    }
    return (grafHarmonico3);
  }

	public ArrayList<Double> pontosGrafHarmonico4(){
		ArrayList<Double> grafHarmonico4 = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafHarmonico4.add(getAmplitudeHarmonica4()*cos((getOrdemHarmonica4()*2*3.14*60*i) + getAnguloHarmonica4()));
    }
    return (grafHarmonico4);
  }
	public ArrayList<Double> pontosGrafHarmonico5(){
		ArrayList<Double> grafHarmonico5 = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafHarmonico5.add(getAmplitudeHarmonica5()*cos((getOrdemHarmonica5()*2*3.14*60*i) + getAnguloHarmonica5()));
    }
    return (grafHarmonico5);
  }
	public ArrayList<Double> pontosGrafHarmonico6(){
		ArrayList<Double> grafHarmonico6 = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafHarmonico6.add(getAmplitudeHarmonica6()*cos((getOrdemHarmonica6()*2*3.14*60*i) + getAnguloHarmonica6()));
    }
    return (grafHarmonico6);
  }

	public ArrayList<Double> ondas(){
  	ArrayList<Double> grafresultante = new ArrayList<>();

    for (double i = 0; i < 101; i = (float) (i + 0.1)) {
        grafresultante.add(getAmplitudeComponenteFundamental()*cos((2*3.14*60*i) + getAmplitudeComponenteFundamental()) + getAmplitudeHarmonica1()*cos((getOrdemHarmonica1()*2*3.14*60*i) + getAnguloHarmonica1()) +getAmplitudeHarmonica2()*cos((getOrdemHarmonica2()*2*3.14*60*i) + getAnguloHarmonica2()) +
        getAmplitudeHarmonica3()*cos((getOrdemHarmonica3()*2*3.14*60*i) + getAnguloHarmonica3()) + getAmplitudeHarmonica4()*cos((getOrdemHarmonica4()*2*3.14*60*i) + getAnguloHarmonica4()) + getAmplitudeHarmonica5()*cos((getOrdemHarmonica5()*2*3.14*60*i) + getAnguloHarmonica5()) +
        getAmplitudeHarmonica6()*cos((getOrdemHarmonica6()*2*3.14*60*i) + getAnguloHarmonica6()));
    }
    return (grafresultante);
  }

	public String Fourrier() {
		String componenteFundamental = "",harmonico1 = "",harmonico2 = "",harmonico3 = "",
                harmonico4 ="",harmonico5 ="",harmonico6 ="", resultante = "";
    if(getAmplitudeComponenteFundamental() != 0){
    	componenteFundamental = getAmplitudeComponenteFundamental()+"cos(ωt + "+getAnguloComponenteFundamental()+")  ";
    }
    if(getAmplitudeHarmonica1() !=0){
        harmonico1 = "+"+getAmplitudeHarmonica1()+"cos("+getOrdemHarmonica1()+"ωt + "+getAnguloHarmonica1()+")  ";
    }
    if(getAmplitudeHarmonica2() !=0){
        harmonico2 = "+"+getAmplitudeHarmonica2()+"cos("+getOrdemHarmonica2()+"ωt + "+getAnguloHarmonica2()+")  ";
    }
    if(getAmplitudeHarmonica3() !=0){
        harmonico3 = "+"+getAmplitudeHarmonica3()+"cos("+getOrdemHarmonica3()+"ωt + "+getAnguloHarmonica3()+")  ";
    }
    if(getAmplitudeHarmonica4() !=0){
        harmonico4 = "+"+getAmplitudeHarmonica4()+"cos("+getOrdemHarmonica4()+"ωt + "+getAnguloHarmonica4()+")  ";
    }
    if(getAmplitudeHarmonica5() !=0){
        harmonico5 = "+"+getAmplitudeHarmonica5()+"cos("+getOrdemHarmonica5()+"ωt + "+getAnguloHarmonica5()+")  ";
    }
    if(getAmplitudeHarmonica6() !=0){
        harmonico6 = "+"+getAmplitudeHarmonica6()+"cos("+getOrdemHarmonica6()+"ωt + "+getAnguloHarmonica6()+")  ";
    }

    resultante = "f(t)= "+componenteFundamental+harmonico1+harmonico2+harmonico3+harmonico4+harmonico5+harmonico6;
    return (resultante);
  }
	public ArrayList<Double> pontosComponenteFundamental(){
    ArrayList<Double> pontosComponenteFundamental = new ArrayList<>();
    for (double i = 0; i <= 100; i=(float)(i + 0.1)) {
        pontosComponenteFundamental.add(getAmplitudeComponenteFundamental()*cos((2*3.14*60*i) + getAnguloComponenteFundamental()));
    }
    return (pontosComponenteFundamental);
	}

}

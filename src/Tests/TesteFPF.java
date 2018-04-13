package Tests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import Model.CalculosPotenciasdoFluxoPotenciaFundamental;

public class TesteFPF {
	private double pAtiva; 
	private double pReativa;
	private double pAparente;
	private double fatorPotencia;
	
	@Before
	public void antesDoTeste() {
		new CalculosPotenciasdoFluxoPotenciaFundamental();
		pAtiva = 0;
		pReativa = 0; 
		pAparente = 0;
		fatorPotencia = 0;
	}
	
	
	@Test
	public void test() {
		CalculosPotenciasdoFluxoPotenciaFundamental calculo = new CalculosPotenciasdoFluxoPotenciaFundamental();
		assertEquals(pAtiva,calculo.CalculapAtiva(), 10e-1);
		assertEquals(pReativa,calculo.CalculapReativa(), 10e-1);
		assertEquals(pAparente,calculo.CalculapAparente(), 10e-1);
		assertEquals(fatorPotencia,calculo.calculaFatorPotencia(), 10e-1); //Devido o atraso/adianto, pode haver divergências entre os resultados

	}

}

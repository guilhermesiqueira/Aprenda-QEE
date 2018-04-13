package main;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

import view.MenuInicial;

public class Main {

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
		    Thread novaThread = Thread.currentThread();
			public void run() {
				try {
					JFrame telaInicial = new JFrame("Aprenda QEE");
					telaInicial.setVisible(false);
					//telaInicial = new JFrame("Teste");
					telaInicial.setSize(2000, 3000);
					telaInicial.setLocationRelativeTo(null);
					telaInicial.setResizable(true);
		            Thread.sleep(1000);
					MenuInicial menuInicial = new MenuInicial(telaInicial);
				} catch (Exception e) {
					e.printStackTrace();
				} 
		
			}
		});
	}
}
	

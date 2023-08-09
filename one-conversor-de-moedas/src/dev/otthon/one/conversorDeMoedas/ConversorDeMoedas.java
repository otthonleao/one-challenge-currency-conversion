package dev.otthon.one.conversorDeMoedas;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {
	
	private Double brlUSD = 0.20;
	private Double brlCAD = 0.27;
	private Double brlEUR = 0.19;
	private Double brlGBR = 0.16;
	private Double brlARS = 58.16;
	private Double brlCLP = 175.79;
	
	private Double usdBRL = 4.90;
	private Double cadBRL = 3.65;
	private Double eurBRL = 5.38;
	private Double gbrBRL = 6.24;
	private Double arsBRL = 0.017;
	private Double clpBRL = 0.0057;
	
	public String converter(String country, double valor) {
	
	double valorCambio = 0;
	String text = null;
		
		try {
				switch(country) {
					case "Reais para Dólar Americano":
						valorCambio = valor * brlUSD;
						return text = "R$ " + valor + " convertidos são => USD "+ valorCambio;
					
					case "Reais para Dólar Canadense":
						valorCambio = valor * brlCAD;
						return text = "R$ " + valor + " convertidos são => CAD "+ valorCambio;
						
					case "Reais para Euro":
						valorCambio = valor * brlEUR;
						return text = "R$ " + valor + " convertidos são => EUR "+ valorCambio;
						
					case "Reais para Libras Esterlinas":
						valorCambio = valor * brlGBR;
						return text = "R$ " + valor + " convertidos são => GBP "+ valorCambio;
						
					case "Reais para Peso argentino":
						valorCambio = valor * brlARS;
						return text = "R$ " + valor + " convertidos são => ARS "+ valorCambio;
					
					case "Reais para Peso Chileno":
						valorCambio = valor * brlCLP;
						return text = "R$ " + valor + " convertidos são => CLP "+ valorCambio;
						
						
					case "Dólar Americano para Reais":
						valorCambio = valor * usdBRL;
						return text = "USD " + valor + " convertidos são => R$ "+ valorCambio;
						
					case "Dólar Canadense para Reais":
						valorCambio = valor * cadBRL;
						return text = "CAD " + valor + " convertidos são => R$ " + valorCambio;
						
					case "Euro para Reais":
						valorCambio = valor * eurBRL;
						return text = "EUR " + valor + " convertidos são => R$ " + valorCambio;
					
					case "Libras Esterlinas para Reais":
						valorCambio = valor * gbrBRL;
						return text = "GBR " + valor + " convertidos são => R$ " + valorCambio;
						
					case "Peso argentino para  Reais":
						valorCambio = valor * arsBRL;
						return text = "ARS" + valor + " convertidos são => R$ " + valorCambio;
						
					case "Peso Chileno para Reais":
						valorCambio = valor * clpBRL;
						return text = "CLP " + valor + " convertidos são => R$ " + valorCambio;
			}
			
			
			} catch (NumberFormatException  e) {
				JOptionPane.showMessageDialog(null, "Erro: Valor digitado não é válido");
			}
		
		return text;

	}
}

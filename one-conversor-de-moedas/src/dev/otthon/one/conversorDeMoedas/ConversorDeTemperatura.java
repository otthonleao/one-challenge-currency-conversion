package dev.otthon.one.conversorDeMoedas;

public class ConversorDeTemperatura {
		
	public String FahrenheitParaCelsius(double valor) {
		String text = null;
		double celsius = (valor - 32) / 1.8;
	    return text = celsius+"º Celsius";
	}

	public String CelsiusParaFahrenheit(double valor) {
		String text = null;
		double fahrenheit = (valor * 1.8) + 32;
	    return text = fahrenheit+"º Fahrenheit";
	}
}

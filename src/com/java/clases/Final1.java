package com.java.clases;

public class Final1 {
	
	private double cantidad;
	private String palabra;
	
	public Final1() {
		
	}
	
	public Final1(double cantidad, String palabra) {
		this.cantidad = cantidad;
		this.palabra = palabra;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public String piramide() {
		
		String car = "n";
		String piramide = "";
		
		for (int i = 1; i <= this.cantidad; i++) {
			for (int y = 1; y <= i; y++) {
				piramide = piramide + car;
				
			}
		        piramide = piramide + "\n"; // salto de linea	
			
		}
		
		return piramide;
			
	}
	
	public String segundo() {
		String frase = "";
		int numcar = palabra.replaceAll(" ", "").length();
		frase = frase + "El numero de caracteres es: " + numcar + "\n";
		
        int numesp = palabra.length() - numcar;
        frase = frase + "El numero de espacios es: " + numesp + "\n";
        
        frase = frase + "Los tres caracteres centrales son: " + this.palabra.substring((this.palabra.length()/2) -1 , (this.palabra.length()/2) +2)+  "\n";
        
        StringBuilder palabrainv = new StringBuilder(this.palabra);
        frase = frase + "La palabra al reves es: " + palabrainv.reverse() + "\n";
        
		return frase;	
		
		
		
	}
	

}

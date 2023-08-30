package com.java.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.clases.Final1;

public class junitmetodos {
	
	private Final1 f1 = new Final1(3, "boligrafo");

	@Test
	public void test() {
		String esperado = "n\nnn\nnnn\n";
		assertEquals(esperado, this.f1.piramide());
		
				
		
		
				
	}

}

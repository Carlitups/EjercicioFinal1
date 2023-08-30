package com.java.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.clases.Final1;

public class junit4metodo2 {
	
	private Final1 f1 = new Final1(3, "boligrafo");

	@Test
	public void test() {
		
		assertNotNull(this.f1.segundo());
		
	}
}

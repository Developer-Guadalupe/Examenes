package com.curso.v0;

public class Suma {
	
	//@Autowired
	CloudSuma cloudSuma; 

	int calculaSuma(int x, int y) {
		int resultado = cloudSuma.ejecutaSuma(x, y);
		return resultado;
	}

}

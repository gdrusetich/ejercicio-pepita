package ar.edu.utn.frba.dds.pepita;

public class Golondrina {
	int energia;
	Golondrina(int energiaInicial){
		this.energia = energiaInicial;
	}
	void volar() {
		this.energia-=10;
	}
	void comer(int cantidadDeAlpiste) {
		this.energia +=cantidadDeAlpiste*3;
	}
	int getEnergia() {
		return this.energia;
	}
}

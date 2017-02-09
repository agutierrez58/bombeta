package org.entitat;

/**
 * Classe que representa una bombeta d'intensitat variable. <br/>
 * La intensitat va de 1 a 5. Si la intensitat es 0, la bombeta esta apagada.
 * Si la intensitat sobrepassa el nivell 5, es crema. 
 * No es pot pujar ni baixar intensitat si la bombeta esta apagada.
 * @author Montse Madridejos
 * @version 1.1 Octubre de 2011
 */
public class Bombeta2 {

/* Comentari no-javadoc
la intensitat va de 1 a 4, amb 5 es crema
intensitat = 0 vol dir apagada, redundant */
private int intensitat;
private boolean apagada;
 
/** 
 * Constructor per defecte.Bombeta apagada i intensitat = 0
 */
public Bombeta2(){
	intensitat=0; //per defecte,
	apagada=true;
 }

/**
 * Retorna l'estat de la bombeta.Si esta apagada o no.
 * @return true si esta apagada, false altrament.
 */
public boolean isApagada(){
	return apagada;
}

/**
 * Modifica l'estat de la bombeta.
 * @param apagada es l'estat de la bombeta. True vol dir apagada
 */
public void setApagada(boolean apagada) {
	this.apagada = apagada;
}

/** 
 * Retorna el valor de la intensitat actual de la bombeta.
 * @return el valor de la intensitat, entre 0 i 5.
 */
public int getIntensitat() {
	return intensitat;
}
/**
 * Modifica el valor de la intensitat de la bombeta.
 * @version 2.0 caldria eliminar aquesta funció ja que no controla
 * si está  apagada o encesa
 * @param intensitat es la nova intensitat de la bombeta
 */
public void setIntensitat(int intensitat) {
	this.intensitat = intensitat;
}

/**
 * Apagar la bombeta significa posar la intensitat a 0 i l'estat apagada a true.
 */
public void apagar(){
	apagada=true;
	intensitat=0;
}

/** 
 * Encendre la bombeta vol dir posar la intensitat a 1 i l'estat apagada a false
 */
public void encendre(){
	apagada=false;
	intensitat=1;
}

/**
 * Metode que puja la intensitat de la bombeta 1 unitat fins a maxim 5.
 * Si es puja mes de 5, la bombeta es crema i, per tant, s'apaga.
 * No es pot pujar la intensitat si la bombeta esta apagada.
 */
public void pujarIntensitat(){
	//si esta apagada, no es pot pujar la intensitat
	if(!apagada){
		if(intensitat+1<=5) intensitat+=1;
		else apagar(); //es crema i s'apaga
	}
}

/**
 * Metode que baixa la intensitat de la bombeta en 1 unitat, 
 * sempre i quan estigui encesa. Si la intensitat arriba a 0, s'apaga.
 */
public void baixarIntensitat(){
	//si esta apagada, no es pot baixar la intensitat
	if(!apagada){
		if(intensitat-1>=1) intensitat-=1;
			//la intensitat no baixa de 0, quan s'apaga
		else apagar();
	}
}
}

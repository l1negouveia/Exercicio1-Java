package Pneu;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		Pneu pneu = new Pneu();
		pneu.idPneu = 1;
		pneu.indiceDeVida = 110;
		pneu.modelo = "Michelin";
		pneu.estado = 'N';
		pneu.horasDeUso = 0.0;
		boolean desgaste = pneu.desgastar(LocalTime.parse("04:00"), LocalTime.parse("14:00"));
		
		boolean desgaste2 = pneu.desgastar(LocalTime.parse("15:00"), LocalTime.parse("20:00"));
	
		boolean desgaste3 = pneu.desgastar(LocalTime.parse("21:00"), LocalTime.parse("23:00"));
		
	}

}

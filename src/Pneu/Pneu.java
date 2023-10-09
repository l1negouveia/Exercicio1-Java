package Pneu;

import java.time.LocalTime;
import java.time.Duration;

public class Pneu {
	int idPneu;
	String modelo;
	double indiceDeVida;
	char estado;
	double horasDeUso;
	
	public boolean desgastar(LocalTime horaInicial, LocalTime horaFinal) {
		if (estado == 'N' || estado == 'U') {
			if (estado == 'N') {
				estado = 'U';
			}
			Duration duracao = Duration.between(horaInicial, horaFinal);
			long minutosDeUso = duracao.toMinutes();
			double desgaste = minutosDeUso * 0.12345;
			indiceDeVida -= desgaste;
			if (indiceDeVida <= 0) {
				estado = 'F';
				System.out.println("Pneu fora de uso.");
				
				return false;
			}
			horasDeUso += minutosDeUso / 60;
			System.out.println("Indice de vida: " + indiceDeVida);
			System.out.println("Horas de uso: " + horasDeUso);
			System.out.println("Estado do Pneu: " + estado);
			return true;
			
		} else {
			System.out.println("Pneu fora de uso.");
			return false;
		}
		
		
		
		
	}
	
}

package atividade_poo_3;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		
		LocalDate data;
		data = LocalDate.of(1970, 5, 5);
		Produto1 g1 = new Produto1(124,"Mario",7,data,"ok pro", 1199);
		Produto1 g2 = new Jogo(123,"GTA",3,data,"RockStar", 50f, "CD");
		Produto1 g3 = new Console(125,"XBox",1,data,"Microsoft", 4999.90f, "256gb");
		
		g1.visualizar();
		
		g2.visualizar();
		
		g3.visualizar();
	}

}

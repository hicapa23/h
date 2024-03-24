/*  Zahlen 

Ein paar Dinge zum Ausprobieren

Schreiben Sie ein Programm, das Ihnen Folgendes sagt:
- Stunden im Jahr. Wie viele Stunden sind in einem Jahr?
- Minuten in einem Jahrzehnt. Wie viele Minuten sind in einem Jahrzehnt?
- Dein Alter in Sekunden. Wie viele Sekunden alt bist du? (Ich werde deine Antwort nicht überprüfen,
also sei so genau - oder auch nicht - wie du willst.)

Hier ist eine schwierigere Frage:
- Das Alter unseres lieben Autors. Wenn ich 1,160 Millionen Sekunden alt bin (was ich bin, obwohl ich irgendwo in den 800 Millionen war,
als ich dieses Buch begann), wie alt bin ich dann? */


public class StundenInJahr {
	public static void main (String []args){
	
	int stundenInJahr = 24 * 365;
	int stundenInSchaltjahr = 24 * 366;
	
	int minInSchaltjahren = 60 * 24 * 366 * 2;
	int minInNormalenJahren = 60 * 24 * 365 * 8;
	int minutenInJahrzent = minInSchaltjahren + minInNormalenJahren;
	
	int meineJahreInSekunden= 30 * 365 * 24 * 60 * 60;
	int meineTageInSekunden = 272 * 24 * 60 *60;
	int meinAlterInSekunden = meineJahreInSekunden + meineTageInSekunden;
	
	int alterDesAutors = 1_160_000_000 / 60 / 60 / 24 / 365;
	int alterDesAutorsAnfangDesBuches = 800_000_000 / 60 / 60 / 24 / 365;
	

	System.out.printf("\nIn einem Jahr sind:%d Stunden\n", stundenInJahr);
	System.out.printf("\nIn einem Jahr sind:%d Stunden\n", stundenInSchaltjahr);
	System.out.printf("\ndas ist mein Alter in Sekunden:%d Sekunden\n", meinAlterInSekunden);
	System.out.printf("\ndas ist das Alter des Autors, als er angefangen hat das buch zu schreiben:%d Jahre\nund das hier, sein aktuelles Alter:%d Jahre\n", alterDesAutorsAnfangDesBuches, alterDesAutors);
	
	}
}
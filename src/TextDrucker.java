/* 
„99 Flaschen Bier an der Wand.“  Schreiben Sie ein Programm, das den Text des beliebten Klassikers „99 Bottles of Beer on the Wall“ ausdruckt.

• " Gehörlose Oma.  Was auch immer Sie zu Oma sagen (was auch immer Sie eingeben), sie sollte wie folgt antworten:
HUH?!  SPREICH, SONNY!

es sei denn, Sie rufen es (geben Sie es in Großbuchstaben ein).  Wenn du schreist, kann sie dich hören (zumindest denkt sie es) und schreit zurück:
NEIN, NICHT SEIT 1938 "

Um Ihr Programm wirklich glaubwürdig zu machen, lassen Sie Oma jedes Mal ein anderes Jahr rufen (Jahrertsatz, wenn möglich mit dem Zufallsnummergenerator machen), 
vielleicht ein beliebiges Jahr zwischen 1930 und 1950. 

(Dieser Teil ist optional und wäre viel lustiger, wenn Sie den Abschnitt über Rubys Zufallszahlengenerator auf Seite 33 lesen würden.  ) Du kannst nicht aufhören, 
mit Oma zu reden, bis du BYE rufst.
Tipp 1: Chomp nicht vergessen!  „BYE“ mit einem Enter am Ende ist nicht dasselbe wie „BYE“ ohne!

Tipp 2: Versuchen Sie, immer wieder darüber nachzudenken, welche Teile Ihres Programms wiederholt werden sollen.  All das sollte sich in Ihrer while-Schleife befinden.

Tipp 3: Ich werde oft gefragt: „Wie kann ich dafür sorgen, dass Rand mir eine Zahl in einem Bereich gibt, der nicht bei Null beginnt?“  Aber das ist nicht nötig.  
Können Sie etwas mit der Zahl tun, die Rand an 
Sie zurückerhält?

• Gehörlose Oma verlängert.  Was ist, wenn Oma nicht möchte, dass du gehst?  Wenn du BYE rufst, könnte sie so tun, als würde sie dich nicht hören.  
ndern Sie Ihr bisheriges Programm so, dass Sie dreimal hintereinander BYE rufen müssen.  Stellen Sie sicher, dass Sie Ihr Programm testen: Wenn Sie dreimal BYE rufen, 
aber nicht hintereinander, sollten Sie immer noch mit Oma sprechen.
*/



import java.util.Scanner;
import java.util.Random;

public class TextDrucker {
    public static void main (String[ ] args){ 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRamdon = 1930;
        int maxRamdon = 1950;

        int numRamdonGenerator = random.nextInt(maxRamdon - minRamdon + 1) + minRamdon;

        String redeMitOma = "";

        int flascheMenge = 99;

        while (flascheMenge > 0){

            System.out.println(flascheMenge+" bottles of beer on the wall, " + flascheMenge + " bottles of beer.Take one down and pass it around, "+ (flascheMenge - 1) +" bottles of beer on the wall.\n");

            flascheMenge--;

        }

        System.out.println("\no more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.\n");

        do {
        
            System.out.println("\nWollen Sie etwas zu Oma sagen ja oder nein?");
            var antwort = scanner.nextLine();

            if ("ja".equalsIgnoreCase(antwort)) {

                System.out.println("\nWas möchten Sie zu Oma sagen?");
                var mitteilungFürOma= scanner.nextLine();

                System.out.println("\nMitteilung für Oma: " + mitteilungFürOma + "\n");

                if (mitteilungFürOma.equals(mitteilungFürOma.toUpperCase())){

                System.out.println("\nNEIN, NICHT SEIT "+ numRamdonGenerator+"\n"); 

                } 
                else {
                System.out.println("\nHUH?!  SPREICH, SONNY!\n");
                }
            
                for (int i=0; i < 3; i++){
                    System.out.println ("\nMoechten Sie noch mit Oma weiter reden? Wenn nicht, schreiben Sie 'BYE' ");
                    redeMitOma = scanner.nextLine();

                    if (!"BYE".equals(redeMitOma)){
                        break;
                    }
                }    

            } 

            else{
                break;
            }
            
        }while (!"BYE".equals(redeMitOma));
        
    } 

}


    
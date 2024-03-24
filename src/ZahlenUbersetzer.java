import java.util.Scanner;

public class ZahlenUbersetzer {
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        String romicheZahl;
        int zahl;

        System.out.println("Wuenschen Sie eine Übersetzung von Zahlen zu arabischen (Arabisch) oder romischen Zahlen (Romanisch)?");
        var auswahl = scanner.nextLine();

        if ("Romanisch".equalsIgnoreCase(auswahl)) {
             System.out.println("Geben Sie eine ganze Zahl zwischen 1 und 3999:");
            zahl = scanner.nextInt();

            if (zahl > 1 ){
                romicheZahl= konvertionZuRomischenZahlen(zahl);
                System.out.println(zahl+" In romischen Zahlen ist: "+romicheZahl);
            }
            
           
        }

        else{
            System.out.println("Geben Sie eine ganze Zahl zwischen 1 und 3999:");
            zahl = scanner.nextInt();

            if (zahl > 1 && zahl < 3999){
                romicheZahl= konvertionZuArabischenZahlen(zahl);
                System.out.println(zahl+" In romischen Zahlen ist: "+romicheZahl);
            }
            
            else {
                
                System.out.println("Die nummer soll im Rang sein");
            }

        }
        
    }

    public static String konvertionZuRomischenZahlen(int zahl ){

        String []  einheiten = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String []  zehner =  {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String []  hunderter =  {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String []  tausende =  {"", "M", "MM", "MMM"};

        int indexEinheiten, indexZehner, indexHunderter, indexTausende;

        indexTausende = zahl / 1000;
        zahl = zahl % 1000;
        indexHunderter = zahl  / 100;
        zahl = zahl % 100;
        indexZehner = zahl / 10;
        zahl = zahl % 10;
        indexEinheiten = zahl;

        return tausende[indexTausende] + hunderter[indexHunderter] + zehner[indexZehner] + einheiten [indexEinheiten];

    }

    public static String konvertionZuArabischenZahlen(int zahl ){

        String []  einheitenA = {".", "واحد", "اثنان", "ثلاثة", "أربعة", "خمسة", "ستة", "سبعة", "ثمانية", "تسعة", "عشرة"};
        String []  zehnerA =  {"", "عشرون", "ثلاثون", "أربعون", "خمسون", "ستون", "سبعون", "ثمانون", "ت  !سعون", "مئة"};
        String []  hunderterA =  {"", "مئة", "مئتان", "ثلاثمئة", "أربعمئة", "خمسمئة", "ستمئة", "سبعمئة", "ثمانمئة", "تسعمئة", "ألف"};
        String []  tausendeA =  {"", "ألف", "ألفان", "ثلاثة آلاف", "أربعة آلاف", "خمسة آلاف", "ستة آلاف", "سبعة آلاف", "ثمانية آلاف", "تسعة آلاف", "عشرة آلاف"};

        int indexEinheitenA, indexZehnerA, indexHunderterA, indexTausendeA;

        indexTausendeA = zahl / 1000;
        zahl = zahl % 1000;
        indexHunderterA = zahl  / 100;
        zahl = zahl % 100;
        indexZehnerA = zahl / 10;
        zahl = zahl % 10;
        indexEinheitenA = zahl;

        return tausendeA[indexTausendeA] + hunderterA[indexHunderterA] + zehnerA[indexZehnerA] + einheitenA [indexEinheitenA]    ;  
    }

}

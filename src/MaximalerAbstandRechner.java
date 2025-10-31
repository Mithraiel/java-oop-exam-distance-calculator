public class MaximalerAbstandRechner {

    //Mainmetode und Arrays aus der Aufgabe
    public static void main(String[] args) {
        int[] xs = new int[] {22,76,37,8,26,5,93,34,3,67,97,47,37,48,66,45,97,75,72,50,44,37,12,51,75,67,36,26,60,23,66,1,59,65,41,27,81,99,19,66,25,68,25,35,3,96,9,49,3,66,30,43,40,19,53,83,89,77,56,90};
        int[] ys = new int[] {45,30,79,56,3,23,43,62,55,64,65,88,97,33,81,58,83,61,77,85,12,30,34,85,53,3,56,22,59,90,73,78,97,59,8,36,77,6,11,20,62,8,19,2,16,92,81,81,41,17,44,70,51,64,8,9,29,81,5,73};

        double maximalerAbstand = 0.0;

        //Forschleife für bis Länge xy werte zu i
        for (int i = 0; i < xs.length; i++) {
            int x1 = xs[i];
            int y1 = ys[i];
            //Forschleife für Länge xy Werte j also zweiter Wert.
            for (int j = i + 1; j < xs.length; j++) {
                int x2 = xs[j];
                int y2 = ys[j];

                double aktuellerAbstand = berechneAbstand(x1, y1, x2, y2);

                if (aktuellerAbstand > maximalerAbstand) {
                    maximalerAbstand = aktuellerAbstand;
                }
            }
        }
        //Ausgabe vom maximalen Abstand
        System.out.println("Der maximale eukliidische Abstand ist: " + maximalerAbstand);
    }
    //Abstandberechnung
    public static double berechneAbstand(int x1, int y1, int x2, int y2) {
        double deltaX = x1 - x2;
        double deltaY = y1 - y2;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

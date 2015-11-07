package helloworld;

public class Durchschnitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gesamtmenge = 0; 
		while (gesamtmenge < 1){
			System.out.println("Bitte geben Sie die Anzahl der Werte an , fuer die sie das arithmethische Mittel berechnen wollen:");
			gesamtmenge = Integer.parseInt(System.console().readLine());
			if (gesamtmenge < 1) {
				System.out.println("Die eingegebene Anzahl ist nicht positiv!!!");
				}
			double mittelWert = 0;
			for (int i = 1; i<gesamtmenge; i++){
				mittelWert+=Integer.parseInt(System.console().readLine());
			}
			System.out.println("das arithmetische Mittel beträgt:" + mittelWert);
		}
	}

}

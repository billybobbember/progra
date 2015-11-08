package haus;

public class Haus {

	public static boolean inRechteck(double px, double py, double olx, double oly, double urx, double ury) {
		return (px <= urx) && (py <= ury) && (px >= olx) && (py >= oly);
	}
	public static boolean inRaute(double px, double py, double cx, double cy, double b) {
		return (Math.abs(px-cx)+Math.abs(py-cy))<=b;
	}
	public static boolean inKreis(double px, double py, double cx, double cy, double r) {
		return Math.sqrt((px-cx)*(px-cx)+(py-cy)*(py-cy)) <=r;
	}
	public static boolean inHaus (double px, double py, double w){
		return inRechteck(px, py, 0, w/2,w, w) || inRaute(px, py, w/2, w/2, w/2) && !inKreis(px, py, w/2, w/4, w/8) && !inRechteck(px, py, w/8, 5*w/8, 3*w/8,w); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub^
		int w = 0;
		while (w <20){
			System.out.print("Gesamtbreite? (min.20)");
			w = Integer.parseInt(System.console().readLine());
		}
		System.out.print("Aus welchen Zeichen soll das Haus bestehen?");
		System.out.println("1:   Plus  (+)");
		System.out.println("2:   Stern(*)");
		System.out.println("3:   "+"\u2665");
		int zeichen = Integer.parseInt(System.console().readLine());
		for (int y=0; y*2 <= w; y++){
			for (int x=0; x <= w; x++){
				if (inHaus(x, y*2, w))
					switch (zeichen){
						case 1:
							System.out.print("+"); break;
						case 2:
							System.out.print("*"); break;
						case 3:
							System.out.print("\u2665"); break;
						default:
							System.out.print("#");
					}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

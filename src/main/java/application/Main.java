package application;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		System.out.println("Ausgabe der Primzahlen  -----------------------------------");
		int zahlenumfang;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wie viele Primzahlen sollen ermittelt werden?");
		zahlenumfang = scanner.nextInt();

		PrimeNumbers pr = new PrimeNumbers();
		int [] primes = new int[zahlenumfang];

		long start = System.currentTimeMillis();

		primes=pr.getPrimeNumbers(zahlenumfang);

//		int zahl=3;
//		int[] primes = new int[zahlenumfang];
//		primes[0]=2;
//		boolean pz = true;
//
//
//		int counter=0;
//
//		while (counter <zahlenumfang-1) {
//			pz=true;
//			int i=0;
//			double wurzel = Math.sqrt(zahl);
//			if (zahl % wurzel == 0) {
//				pz = false;}
//
//			else {
//				while (pz && i < counter && primes[i] <= wurzel) {
////			while (pz && i<counter && primes[i]<=Math.sqrt(zahl)) {   // T20 = { 1, 2, 4, 5, 10, 20}, T9 = { 1, 3, 9}
//
//					if (zahl % primes[i] == 0) {
//						pz = false;
//					}
//					i++;
//				}
//			}
//
//			if (pz) {
//				counter++;
//				primes[counter]=zahl;
//			}
//			zahl=zahl+2; // ab 3 nur die ungeraden Zahlen
//		}
//
//
//

		long end = System.currentTimeMillis();

		System.out.println();

		for (int prime: primes) {
			System.out.println(prime);
		}
		System.out.println("It took " + ((end - start) / 1000) + " seconds");

	}
}
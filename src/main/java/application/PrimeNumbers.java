package application;

public class PrimeNumbers {
	
	/**
	 * This method calculates the first x prime numbers.
	 * Example: amountOfPrimeNumbers = 3 
	 * Return: [2, 3, 5]
	 * 
	 * @param amountOfPrimeNumbers
	 * @return an array containing only the calculated prime numbers
	 */
	public int[] getPrimeNumbers(int amountOfPrimeNumbers) {

		int zahl=3;
		int[] primes = new int[amountOfPrimeNumbers];
		primes[0]=2;
		boolean pz = true;

		int counter=0;
		while (counter < amountOfPrimeNumbers -1) {
			pz=true;
			int i=0;
			double wurzel = Math.sqrt(zahl);
			// Überprüft, ob die Zahl eine Quadratzahl ist --> falls ja, dann ist sie keine Primzahl
			if (zahl % wurzel == 0) {
				pz = false;
			}
			// Jede Zahl lässt sich in Primfaktoren aufteilen, die kleiner gleich der Zahl sind.
			// Es genügt also, die bereits ermittelten Primzahlen als Teiler zu prüfen
			else {
				while (pz && i < counter && primes[i] <= wurzel) {
					if (zahl % primes[i] == 0) {
						pz = false;
						break;
					}
					i++;
				}
			}
			//Falls es keine Teiler kleiner der Zahl gibt, ist es eine Primzahl
			if (pz) {
				counter++;
				primes[counter]=zahl;
			}
			zahl=zahl+2; // ab 3 werden nur die ungeraden Zahlen überprüft
		}

		return primes;
	}
}

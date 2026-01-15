import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercise12_23 {

	public static void main(String[] args) throws Exception {
		try {
			URL ur = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
			Scanner sc = new Scanner(ur.openStream());
			while (sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
			System.out.print(computeAverage(ur));
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		}

	}

	/** reads the scores from the file and compute the average */
	public static double computeAverage(URL ur1) throws Exception {
		double count = 0;
		double length = 0;
		Scanner sc = new Scanner(ur1.openStream());
		while (sc.hasNext()) {
			double i = sc.nextDouble();
			count += i;
			length++;
		}
		return count / length;

	}

}

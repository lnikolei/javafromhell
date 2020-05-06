package ms0.a2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Um zu prüfen, ob unsere Rechnung stimmt, nutzen wir die folgende Zahl zur Verfikation:");
		System.out.println("verifier:  " + "1.6180339887498948482045868343656" + "    33 Stellen von Wikipedia");
		System.out.println("Dann berechnen wir die Wurzel von 5 mit einer Präzision von 50 Nachkommastellen:");
		String sqrFive = sqrt(BigDecimal.valueOf(5), 50).toString();
		System.out.println(sqrFive);

		System.out.println("Als nächstes initialisieren wir unsere Variablen für die Rechnung.");
		BigDecimal a = new BigDecimal("1"), b = new BigDecimal("2"), c = new BigDecimal(sqrFive);
		System.out.println("Außerdem bestimmen wir unseren MathContext. Zur Orientierung:");
		MathContext mc = new MathContext(50, RoundingMode.HALF_UP);
		System.out.println(mc);

		System.out.println("Nun berechnen wir unser Ergebnis mit einer Präzision von 50 Stellen:");
		System.out.println("pre-result:  " + a.add(c).divide(b, mc).toString() + "  nach 50 Stellen gerundet");

		System.out.println(
				"Die Aufgabe fragt nun aber nur nach 30 Stellen. Also erstellen wir einen weiteren MathContext:");
		MathContext mc2 = new MathContext(30, RoundingMode.HALF_UP);
		System.out.println(mc2);

		System.out.println(
				"Nun berechnen wir unser tatsächliches Ergebnis, welches nach 30 Stellen aufgerundet wird, weshalb unser Ergebnis an der letzten Stelle von unserem Verifikationsmittel abweicht:");
		System.out.println("result:    " + a.add(c).divide(b, mc2).toString() + "  nach 30 Stellen gerundet");
		System.out.println("verifier:  " + "1.6180339887498948482045868343656" + "    33 Stellen von Wikipedia");
		System.out.println(
				"Zusätzliche wurde nach dem Unskalierten Wert sowie der Skalierung gefragt, welche wie folgt lauten:");
		System.out.println("Unskalierter Wert:  " + a.add(c).divide(b, mc2).unscaledValue());
		System.out.println("Skalierung  " + a.add(c).divide(b, mc2).scale());

	}

	public static BigDecimal sqrt(BigDecimal n, int pr) {
		BigDecimal TWO = BigDecimal.valueOf(2);
		MathContext mc = new MathContext(pr);
		BigDecimal result = BigDecimal.ONE;
		for (int i = 1; i <= pr; i++) {
			result = result.add(n.divide(result, mc)).divide(TWO, mc);
		}
		return result;

	}

}

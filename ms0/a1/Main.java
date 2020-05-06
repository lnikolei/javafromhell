package ms0.a1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Zun�chst muss ein Tokenizer erstellt und mit einem String initialisiert werden.");
		Tokenizer Test = new Tokenizer(" A 42 Epsilon Q 16 ");
		System.out.println("Bei der Erstellung wird der String initialisiert und gleichzeitig in Form gebracht, damit die erforderten Methoden genutzt werden k�nnen.");
		System.out.println("Mit der next-Methode k�nnen dann die Token nach und nach ausgegeben werden:");
		System.out.println(Test.next());
		System.out.println(Test.next());
		System.out.println(Test.next());
		System.out.println(Test.next());
		System.out.println("Wenn man einen Tokenizer auf diese Weise initalisiert, fragt man sich vielleicht irgendwann, ob noch weitere Tokens vorhanden sind. Daf�r gibt es die done-Methode:");
		System.out.println(Test.done());
		System.out.println("Gibt die Methode false zur�ck, gibt es noch Tokens die nicht ausgegeben wurden. Geben wir also jetzt den letzten Token aus.");
		System.out.println(Test.next());
		System.out.println("Pr�fen wir nun erneut, ob es noch weitere Tokens gibt:");
		System.out.println(Test.done());
		System.out.println("Die Methode gibt true zur�ck, wir wissen nun also das alle Tokens ausgegeben wurden.");
		System.out.println("Pr�fen wir nun auch, was die next-Methode zur�ckgibt, wenn keine Tokens mehr vorhanden sind:");
		System.out.println(Test.next());
		System.out.println("Es wird statt weiteren Tokens also null ausgegeben, wenn keine Tokens mehr vorliegen.");
		
		
		System.out.println("Nun soll der Tokenizer auch mit Strings ohne Leerstellen am Anfang und Ende getestet werden:");
		Tokenizer Test2 = new Tokenizer("B 12 ERUWAS W");
		System.out.println("Die next-Methode gibt die Tokens hier wie folgt aus:");
		System.out.println(Test2.next());
		System.out.println(Test2.next());
		System.out.println(Test2.next());
		System.out.println("Pr�ft man, ob alle Tokens zur�ckgegeben wurden, erh�lt man folgendes:");
		System.out.println(Test2.done());
		System.out.println("Es muss noch ein Token ausgegeben werden:");
		System.out.println(Test2.next());
		System.out.println("Erneutes pr�fen zeigt, dass nun alle Tokens ausgegeben wurden:");
		System.out.println(Test2.done());
		System.out.println("Man kann auch hier nochmal testen was passiert, wenn man ohne weitere Tokens die next-Methode anwendet:");
		System.out.println(Test2.next());
		System.out.println("Der Tokenizer funktioniert also auch bei Strings ohne Leerstellen am Anfang und Ende einwandfrei.");
		
		
		System.out.println("Als weiteren Edgecase testet man nun auch die Funktion des Tokenizers, wenn mehrere Leerstellen zwischen den Tokens, am Anfang oder Ende stehen:");
		Tokenizer Test3 = new Tokenizer("   BR    200    WT   019          ");
		System.out.println("Die next-Methode gibt die Tokens hier wie folgt aus:");
		System.out.println(Test3.next());
		System.out.println(Test3.next());
		System.out.println(Test3.next());
		System.out.println("Pr�ft man, ob alle Tokens zur�ckgegeben wurden, erh�lt man folgendes:");
		System.out.println(Test3.done());
		System.out.println("Es muss noch ein Token ausgegeben werden:");
		System.out.println(Test3.next());
		System.out.println("Erneutes pr�fen zeigt, dass nun alle Tokens ausgegeben wurden:");
		System.out.println(Test3.done());
		System.out.println("Man kann auch hier nochmal testen was passiert, wenn man ohne weitere Tokens die next-Methode anwendet:");
		System.out.println(Test3.next());
		System.out.println("Der Tokenizer funktioniert also auch bei Strings mit Leerstellen zwischen Tokens, am Anfang oder Ende, einwandfrei.");
	}

}

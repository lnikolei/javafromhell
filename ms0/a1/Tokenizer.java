package ms0.a1;

public class Tokenizer {

	int helper;
	String[] arrOfStr;

	Tokenizer(String x) {
		arrOfStr = x.trim().split("\\s+");
	}

	public String next() {
		if (helper == arrOfStr.length) {
			return null; 
		} else {
			
			helper++;
			return arrOfStr[helper-1];
		}
	}

	public boolean done() {
		if (helper == arrOfStr.length) {
			return true;
		} else {
			return false;
		}
	}

}

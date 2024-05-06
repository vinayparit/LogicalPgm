package Interview;

public class Password {
	// Length between 8-16
	// no consecutive alpha
	// No space
	// Alteast 1 number
	public static void main(String[] args) {

		String s = "Vinay123";// no consecutive alphabet or character
		// no space
		// atleast one digit
		Boolean flag = false;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.length() >= 8 && s.length() <= 16) && (s.matches(".*[A-Z]+.*")) && (s.matches(".*\\d+.*"))) {
				if (s.contains(" ")) {
					System.out.println("Password should not have Space ");
					break;
				}
				if (s.charAt(i) == s.charAt(i + 1)) {
					System.out.println("Password should not have consecutive characters");
					break;
				}
				flag = true;
			} else {
				System.out.println("Invalid Password");
				break;
			}
		}
		if (flag == true) {
			System.out.println(" Valid Password ");

		}
	}
}

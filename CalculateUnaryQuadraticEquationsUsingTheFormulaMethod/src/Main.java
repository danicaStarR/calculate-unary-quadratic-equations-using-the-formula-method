import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (true) {
            print("Welcome to Program,type '.exit' to exit");
            String inputStr = sc.nextLine();
            print(inputStr + " ok");
            if(inputStr == ".exit") {
                break;
            }
        }
    }
    
    // Simplify the code
    public static void print(Object print) {
        System.out.println(print);
    }
    
}

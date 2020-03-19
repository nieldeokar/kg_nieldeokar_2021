import java.util.*;

public class main {
	
	public static void main(String[] args) {

		if(args == null || args.length < 2){
			System.out.println("Program needs 2 command line arguments, String1 and String2 ");
			return;
		}

		if(args[0] == null || args[1] == null){
			System.out.println("Arguments can not be null");
			return;
		}
	}
}
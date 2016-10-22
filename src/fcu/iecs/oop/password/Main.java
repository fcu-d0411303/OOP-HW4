package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner PE = new Scanner(System.in);
		PasswordEncorder pass= new PasswordEncorder();
		
		int a=1;
		String e="exit";
		while(a==1){
		System.out.println("Please enter a password : ");
		String s = PE.next();
		if(s.compareToIgnoreCase(e)==0){
			a++;
		}
		else{
			System.out.println(pass.encode(s));
			
		}
		}
		}
	}



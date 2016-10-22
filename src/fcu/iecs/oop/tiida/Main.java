package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner n = new Scanner(System.in);
		 NissanTiida nissan = new NissanTiida();
		 
		 System.out.println("Please enter a number : ");
		 int N =  n.nextInt();
		 for(int i=0;i<N;i++){
			 nissan.tiida();
			 System.out.println("\n");
		 }
	}
}

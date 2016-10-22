package fcu.iecs.oop.tiida;

public class NissanTiida {
	
	public int num=1;
	public void tiida(){
		System.out.printf("²Ä%d¦¸©I¥s",num);
		for(int i=0;i<num;i++){
			System.out.println("\n");
			for(int j=0;j<num;j++){
				System.out.print("*");
			}			
		}
		num++;
	}

}

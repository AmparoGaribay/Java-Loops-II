import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int variable = in.nextInt();
		
		for(int i=0; i<variable;i++) {
	
			int a= in.nextInt();
	
			int b= in.nextInt();
	
			int c= in.nextInt();	
			
			for(int cont2 =0; cont2<c;cont2++) {//segundo ciclo ford
				a+= (int)Math.pow(2, cont2)*b;//toma la variable a la suma asi misma y la castea despues de optenerla de una potencia. 
				System.out.print(a + " ");//imprime
			}
			System.out.println();
		}//ciclofor
		in.close();//Cierra in
	}

}

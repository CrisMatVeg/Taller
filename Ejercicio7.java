import java.util.Scanner;
public class Ejercicio7{
	public static void main(String[] args){
		Scanner myObj= new Scanner(System.in);
		float peso= myObj.nextFloat();
		float altura= myObj.nextFloat();
		System.out.println("IMC = "+(peso/(altura*altura)));
	}
}
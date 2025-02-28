import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
		Scanner myObj= new Scanner(System.in);
		int bytes= myObj.nextInt();
		System.out.println(bytes*8+" Bits");
		System.out.println(bytes/1024.0+" Kilobytes");
	}
}
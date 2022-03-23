//13020200039_Nuralam_sabtu/19 maret jam 01.14
import java.io.*;

class Alam{
	public static void main(String [] args) throws IOException {
		char d;
		int bilangan;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader dataIn = new BufferedReader(isr);
		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print ("hello\n");
		
		System.out.print("baca 1 karakter : ");
		d = dataIn.readLine().charAt(0);
		System.out.print("baca 1 bilangan : ");
		bilangan = Integer.parseInt(datAIn.readLine());
		System.out.print(d +"\n" +bilangan +"\n");
		System.out.print("bye \n");
	}
}
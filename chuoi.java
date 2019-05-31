package baitap;
import java.util.Scanner;
public class chuoi {

	public static void main(String[] args) {
		String chuoi;
	    int dodai;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào chuỗi bất kỳ từ bàn phím: ");
	    chuoi = scanner.nextLine();
	         
	    dodai = chuoi.length();
	         
	    System.out.println("Chuỗi " + chuoi + " có độ dài = " + dodai);

	}

}

package baitap;
import java.util.Scanner;
public class mang {
public static void main(String[] args) {
	    int A, sum=0 , number;
	    float avg;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Nhập vào số phần tử của mạng: ");
	    A = scanner.nextInt();
	    int[] mang = new int[A];
	    
	    for(int i=0; i< A; i++){
	    System.out.print("Nhập phần tử số " + i +": ");
	    mang[i] = number = scanner.nextInt();     
	    sum += number;
	    }
	    System.out.println("Tổng của mảng là: " + sum);
	    avg = (float)sum/A;
	    System.out.println("Trung bình cộng của mạng là: " + avg);
	    }
}
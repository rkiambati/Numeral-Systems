import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.random.*;
import java.io.*;
public class Conversions {
	private int DectoBin(int dec) {
		int power = 7;
		int powernum = (int) Math.pow(2, power);
		Queue <Integer> numbers = new LinkedList<Integer>();
		while(dec > -1) {
			if((dec - powernum) != 0) {
				dec -= powernum;
				numbers.add(1);
			}else {
				numbers.add(0);
			}
			power++;
		}
		while(! numbers.isEmpty()) {
			numbers.remove();
		}
		
	}
	
	public static void main(String args[]) {
		int n = 20;
		System.out.println(Math.sqrt(n));
	}

}

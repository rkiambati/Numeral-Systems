import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.random.*;
import java.io.*;
public class Conversions {
	
	private String toString(int [] binary) {
		String binaryString = "";
		for(int i = 0; i < binary.length; i++) {
			binaryString = binaryString + Integer.toString(binary[i]);
		}
		
		return  binaryString;
		
	}
	
	private String hexLetter(int num) {
		String hexLetter = "";
		if(num == 10) {
			hexLetter = "a";
		}else if(num == 11) {
			hexLetter = "b";
		}else if(num == 12) {
			hexLetter = "c";
		}else if(num == 13) {
			hexLetter = "d";
		}else if(num == 14) {
			hexLetter = "e";
		}else if(num == 15) {
			hexLetter = "f";
		}else {
			return Integer.toString(num);
		}
		return hexLetter;
	}
	
	private String DectoBin(int dec) {
		int power = 7;
		int value = dec;
		int [] numbersarr = new int[8];
		Queue<Integer> numbers2 = new LinkedList<Integer>();
		while(power > -1) {
			int powernum = (int) Math.pow(2, power);
			if((value - powernum) >= 0) {
				value -= powernum;
				numbers2.add(1);
			}else if ((value - powernum) < 0){
				numbers2.add(0);
			}
			power--;
		}
		while(! numbers2.isEmpty()) {
			for(int i = 0; i < numbersarr.length; i++) {
				numbersarr[i] = numbers2.remove();
			}
		}
		String binaryConv = toString(numbersarr);
		return binaryConv;
		
	}
	
	private int BintoDec(String bin) {
		int total = 0;
		int power = 7;
		while(power > -1) {
			for(int i = 0; i < bin.length(); i++) {
				if(bin.charAt(i) == '1') {
					total += Math.pow(2, power);
				}
				power--;
			}
		}
		return total;
	}
	
	private String DectoHex(int dec) {
		int power1 = 3;
		int power2 = 3;
		int total1 = 0;
		int total2 = 0;
		String bin = DectoBin(dec);
		System.out.println(bin);
		
		while(power1 > -1) {
			for(int i = 0; i < 4; i++) {
				if(bin.charAt(i) == '1') {
					int powerNum = (int) Math.pow(2, power1);
					total1 += powerNum;
				}
				power1 --;
			}
		}
		while(power2 > -1) {
			for(int a = 4; a < bin.length(); a++) {
				if(bin.charAt(a) == '1') {
					int powerNum = (int) Math.pow(2, power2);
					total2 += powerNum;
				}
				power2 --;
			}
		}
		
		String hex = "s";
		if(total1 > 9 || total2 > 9) {
			hex = hexLetter(total1) + hexLetter(total2);
		}else {
			hex = Integer.toString(total1) + Integer.toString(total2);
		}
		return hex;
		
	}
	
	private String HextoBin(String hex) {
		String part1 = "";
		String part2 = "";
		String bin = "";
		
			if(hex.charAt(0) == '0') {
				part1 = part1 + "0000";
			}else if(hex.charAt(0) == '1') {
				part1 = part1 + "0001";
			}else if(hex.charAt(0) == '2') {
				part1 = part1 + "0010";
			}else if(hex.charAt(0) == '3') {
				part1 = part1 + "0011";
			}else if(hex.charAt(0) == '4') {
				part1 = part1 + "0100";
			}else if(hex.charAt(0) == '5') {
				part1 = part1 + "0101";
			}else if(hex.charAt(0) == '6') {
				part1 = part1 + "0110";
			}else if(hex.charAt(0) == '7') {
				part1 = part1 + "0111";
			}else if(hex.charAt(0) == '8') {
				part1 = part1 + "1000";
			}else if(hex.charAt(0) == '9') {
				part1 = part1 + "1001";
			}else if(hex.charAt(0) == 'a') {
				part1 = part1 + "1010";
			}else if(hex.charAt(0) == 'b') {
				part1 = part1 + "1011";
			}else if(hex.charAt(0) == 'c') {
				part1 = part1 + "1100";
			}else if(hex.charAt(0) == 'd') {
				part1 = part1 + "1101";
			}else if(hex.charAt(0) == 'e') {
				part1 = part1 + "1110";
			}else if(hex.charAt(0) == 'f') {
				part1 = part1 + "1111";
			}
			
			
			if(hex.charAt(1) == '0') {
				part1 = part1 + "0000";
			}else if(hex.charAt(1) == '1') {
				part1 = part1 + "0001";
			}else if(hex.charAt(1) == '2') {
				part1 = part1 + "0010";
			}else if(hex.charAt(1) == '3') {
				part1 = part1 + "0011";
			}else if(hex.charAt(1) == '4') {
				part1 = part1 + "0100";
			}else if(hex.charAt(1) == '5') {
				part1 = part1 + "0101";
			}else if(hex.charAt(1) == '6') {
				part1 = part1 + "0110";
			}else if(hex.charAt(1) == '7') {
				part1 = part1 + "0111";
			}else if(hex.charAt(1) == '8') {
				part1 = part1 + "1000";
			}else if(hex.charAt(1) == '9') {
				part1 = part1 + "1001";
			}else if(hex.charAt(1) == 'a') {
				part1 = part1 + "1010";
			}else if(hex.charAt(1) == 'b') {
				part1 = part1 + "1011";
			}else if(hex.charAt(1) == 'c') {
				part1 = part1 + "1100";
			}else if(hex.charAt(1) == 'd') {
				part1 = part1 + "1101";
			}else if(hex.charAt(1) == 'e') {
				part1 = part1 + "1110";
			}else if(hex.charAt(1) == 'f') {
				part1 = part1 + "1111";
			}
			
			bin = part1 + part2;
			return bin;
		
	}
	
	private int HextoDec(String hex) {
		String bin = HextoBin(hex);
		int total = BintoDec(bin);
		return total;
	}
	
	private String BintoOct(String bin) {
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int power1 = 2;
		int power2 = 2;
		int power3 = 2;
		
		while(power1 > -1) {
			for(int i = 0; i < 4; i++) {
				if(bin.charAt(i) == '1') {
					total1 += Math.pow(2, power1);
				}else {
					total1 += 0;
				}
				power1--;
			}
		}
		while(power2 > -1) {
			for(int a = 3; a < 7; a++) {
				if(bin.charAt(a) == '1') {
					total2 += Math.pow(2, power2);
				}else {
					total2 += 0;
				}
				power2--;
			}
		}
		while(power3 > 0) {
			for(int b = 6; b < bin.length(); b++) {
				if(bin.charAt(b) == '1') {
					total3 += Math.pow(2, power3);
				}
				power3--;
			}
		}
		
		String oct = Integer.toString(total1) + Integer.toString(total2) + Integer.toString(total3);
		return oct;
	}
	
	private String OcttoBin(String oct) {
		String part1 = "";
		String part2 = "";
		String part3 = "";
		String bin = "";
		
		if(oct.charAt(0) == '1') {
			part1 = part1 + "001";
		}else if(oct.charAt(0) == '2') {
			part1 = part1 + "010";
		}else if(oct.charAt(0) == '3') {
			part1 = part1 + "011";
		}else if(oct.charAt(0) == '4') {
			part1 = part1 + "100";
		}else if(oct.charAt(0) == '5') {
			part1 = part1 + "101";
		}else if(oct.charAt(0) == '6') {
			part1 = part1 + "110";
		}else if(oct.charAt(0) == '7') {
			part1 = part1 + "111";
		}else if(oct.charAt(0) == '0') {
			part1 = part1 + "000";
		}
		
		if(oct.charAt(1) == '1') {
			part2 = part2 + "001";
		}else if(oct.charAt(1) == '2') {
			part2 = part2 + "010";
		}else if(oct.charAt(1) == '3') {
			part2 = part2 + "011";
		}else if(oct.charAt(1) == '4') {
			part2 = part2 + "100";
		}else if(oct.charAt(1) == '5') {
			part2 = part2 + "101";
		}else if(oct.charAt(1) == '6') {
			part2 = part2 + "110";
		}else if(oct.charAt(1) == '7') {
			part2 = part2 + "111";
		}else if(oct.charAt(1) == '0') {
			part2 = part2 + "000";
		}
		
		if(oct.charAt(2) == '1') {
			part3 = part3 + "001";
		}else if(oct.charAt(2) == '2') {
			part3 = part3 + "010";
		}else if(oct.charAt(2) == '3') {
			part3 = part3 + "011";
		}else if(oct.charAt(2) == '4') {
			part3 = part3 + "100";
		}else if(oct.charAt(2) == '5') {
			part3 = part3 + "101";
		}else if(oct.charAt(2) == '6') {
			part3 = part3 + "110";
		}else if(oct.charAt(2) == '7') {
			part3 = part3 + "111";
		}else if(oct.charAt(2) == '0') {
			part3 = part3 + "000";
		}
		
		bin = part1 + part2 + part3;
		StringBuilder sb = new StringBuilder(bin);
		if(bin.charAt(8) == '0') {
			sb.deleteCharAt(8);
			return sb.toString();	
		}else {
			return bin;
		}
	}
	private int OcttoDec(String oct) {
		String bin = OcttoBin(oct);
		int dec = BintoDec(bin);
		return dec;
	}
	private String OcttoHex(String oct) {
		int dec = OcttoDec(oct);
		String hex = DectoHex(dec);
		return hex;
	}
	private String DectoOctal(int dec) {
		String bin = DectoBin(dec);
		String oct = BintoOct(bin);
		return oct;
	}
	
	private String HextoOctal(String hex) {
		String bin = HextoBin(hex);
		String oct = BintoOct(bin);
		return oct;
	}
	
	private String BintoHex(String bin) {
		int dec = BintoDec(bin);
		String hex = DectoHex(dec);
		return hex;
		
	}
	public static void main(String args[]) {
		Conversions n = new Conversions();
		int dec = 203;
		String binary = "11000101";
		//System.out.println(n.BintoOct(binary));
		String hex = "a5";
		String oct = "100";
		System.out.println(n.OcttoBin(oct));
		//System.out.println(n.HextoBin(hex));
		//System.out.println(n.HextoDec(hex));
		//System.out.println(n.BintoDec(binary));
		//System.out.println(n.DectoHex(dec));
	}

}
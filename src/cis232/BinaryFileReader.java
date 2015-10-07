package cis232;

import java.io.*;
import java.util.Scanner;

public class BinaryFileReader {
	
	public static void main(String[] args)throws IOException{
		
		
		
		
		//binary file read
		
		DataInputStream dataIn = new DataInputStream(new FileInputStream("numbers.dat"));
		int length = dataIn.readInt();
		dataIn.readChar();
		System.out.println("The detected read length is "+(length));
		for(int i = 0 ; i < length ; i ++ ){
			int dataFrom = dataIn.readInt();
			System.out.println(dataFrom);
			dataIn.readChar();
		}
		dataIn.close();
		
		
		
	}

}

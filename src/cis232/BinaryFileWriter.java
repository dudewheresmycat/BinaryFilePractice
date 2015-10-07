package cis232;

import java.io.*;
import java.util.Scanner;

public class BinaryFileWriter {

	public static void main(String[] args) throws IOException {
		PrintWriter outputText = new PrintWriter(new File("numbers.txt"));
		String length = "123";
		outputText.write(length);
		outputText.write(" \n");
		for(int i = 0 ; i < 123 ; i++){
			String newInt = "" + i;
			outputText.write(newInt);
			outputText.write(" ");
		}
		outputText.close();
		
		
		//binary file read
		
		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("numbers.dat"));
		dataOut.writeInt(100);
		dataOut.writeChar(' ');
		for(int n = 1 ; n < 999 ; n++){
			dataOut.writeInt(n);
			dataOut.writeChar(' ');
		}
		dataOut.close();
		DataOutputStream dataOut2 = new DataOutputStream(new FileOutputStream("numbers2.dat"));
		dataOut2.writeByte(123);
		dataOut2.writeChar(' ');
		for(int n = 2 ; n < 123 ; n++){
			dataOut2.writeByte(n);
			dataOut2.writeChar(' ');
		}
		dataOut2.close();
	}

}

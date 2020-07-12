package org.ismek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaIceriginiOkuma {

	 public static void main(String[] args) throws IOException  {

		    
		    String fileName = "Z://20190421//ismek.txt";
		    File file = new File(fileName);
		    FileReader fr = new FileReader(file);
		    BufferedReader br = new BufferedReader(fr);
		    String line;
		    while((line = br.readLine()) != null){
		        //process the line
		        System.out.println(line);
		    }
		    
		  }
}


package org.ismek;

import java.io.File;

public class KlasorIsimleriniYazdirma {

	public static void main(String[] args) {
		File folder = new File("Z://");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("* " + listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println( listOfFiles[i].getName());
		  }
		}

	}

}

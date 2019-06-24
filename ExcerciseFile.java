package ExcercieseInterviewWW;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

public class ExcerciseFile {
	
	public static void main(String[] args) {

		String path =System.getProperty("user.dir")+ "/" +"src\\ExcercieseInterviewWW"+"/"+ "WWfile.txt"; 
		ExcerciseFile.doesFileExist(path);

	}

	public static void doesFileExist(String path) {

		try {
			File file = new File(path);
			if (file.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String value;

				while ((value = br.readLine()) != null) {
					String[] Word = value.split("-");
					For1:
					for (int j=0;j<Word.length;j++){
						System.out.println(Word[j]);
						String [] Meaning = Word[j+1].split(",");
						for (int i = 0; i < Meaning.length; i++) {
							System.out.println(Meaning[i]);
						}
					break For1;
					}	
				}
			}
		} catch (Exception e) {
			System.out.println("Exception occured while accessing file: " + e);
			// e.printStackTrace();
			

		}

	}

	
	
	

}

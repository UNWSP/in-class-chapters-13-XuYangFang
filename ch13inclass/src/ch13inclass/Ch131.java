package ch13inclass;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
public class Ch131 {

	public static void main(String[] args) {
		Path textfile =
				Paths.get("C:\\users\\16062\\desktop\\11102022.txt");
		Path wordFile =
				Paths.get("C:\\users\\16062\\desktop\\11102022.docx");

		try
		{
			BasicFileAttributes attrText = 
					Files.readAttributes(textfile, BasicFileAttributes.class);
			BasicFileAttributes attrWord = 
					Files.readAttributes(wordFile, BasicFileAttributes.class);
			
			long textsize = attrText.size();
			long wordsize = attrWord.size();
			double ratio = textsize * 100.0/wordsize;
			System.out.println(textfile.toString() + " is " + textsize + " bytes long");
			System.out.println(wordFile.toString() + " is " + wordsize + " bytes long");
			System.out.println(" The text file is  " + ratio + "% of the size of the Word file");
			
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
		
}

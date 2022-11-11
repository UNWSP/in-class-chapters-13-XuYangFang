package ch13inclass;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class WriteCustomerList {

	public static void main(String[] args) {
		Path file =
				Paths.get("C:\\users\\16062\\desktop\\CustomerList.txt"); 
		Scanner kb = new Scanner (System.in);
		String[] array  = new String[3];
		String s = "";
		String delimiter = ",";
		String id;
		String firstname;
		String lastname;
		double balance;
		final String QUIT = "ZZZ";
		
		try
		{
			
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			System.out.print("Enter ID number or " + QUIT + " to quit >> ");
			id = kb.nextLine();
			while (!id.equals(QUIT))
			{
				System.out.print("Enter first name >> ");
				firstname = kb.nextLine();
				System.out.print("Enter last name >>");
				lastname = kb.nextLine();
				System.out.print("Enter balance >>");
				balance = kb.nextDouble();
				kb.nextLine();
				s = id + delimiter + firstname + delimiter + lastname + delimiter + balance + System.getProperty("line.separator");
				writer.write(s, 0, s.length());
				System.out.print("Enter ID number or " + QUIT + " to quit >>");
				id = kb.nextLine();
				
			}
			writer.close();
		}
			catch(Exception e) {
				System.out.println("Message: " + e);
			}
		}
	}
		


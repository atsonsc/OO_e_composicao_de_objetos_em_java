package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;



public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		Client cli = new Client("Atson Conceição", "atsonsc@gmail.com", sdf.parse("31/10/1989"));
		
		
		System.out.println(cli);
		
		
		sc.close();
	}

}

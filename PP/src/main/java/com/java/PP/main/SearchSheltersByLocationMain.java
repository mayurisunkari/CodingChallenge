package com.java.PP.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.PP.dao.SheltersDao;
import com.java.PP.dao.SheltersDaoImpl;
import com.java.PP.model.Shelters;
public class SearchSheltersByLocationMain {
public static void main(String[] args) {
		

		String Location;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Location");
		Location=sc.next();
		SheltersDao dao = new SheltersDaoImpl();
		try {
			List<Shelters>shellList=dao.SearchSheltersByLocation(Location);
			for (Shelters shell : shellList) {
				System.out.println(shell);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.PP.main;

import java.sql.SQLException;
import java.util.List;

import com.java.PP.dao.PetsDao;
import com.java.PP.dao.PetsDaoImpl;
import com.java.PP.model.Pets;

public class ShowpetsMain {
	 public static void main(String[] args) {
	        PetsDao dao = new PetsDaoImpl();
	        try {
	            List<Pets> petsList = dao.Showpets();
	            for (Pets pets : petsList) {
	                System.out.println(pets);
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }

}

package com.java.PP.main;
import java.sql.SQLException;
import java.util.List;

import com.java.PP.dao.SheltersDao;
import com.java.PP.dao.SheltersDaoImpl;
import com.java.PP.model.Shelters;
public class ShowShelterMain {
	public static void main(String[] args) {
		SheltersDao dao = new SheltersDaoImpl();
		try {
			List<Shelters> SheltersList = dao.ShowShelter() ;
			for (Shelters shell : SheltersList) {
				System.out.println(shell);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

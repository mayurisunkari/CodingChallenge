package com.java.PP.main;
import java.sql.SQLException;
import java.util.List;

import com.java.PP.dao.AdoptionsDao;
import com.java.PP.dao.AdoptionsDaoImpl;
import com.java.PP.model.Adoptions;
public class showAdoptionEventsMain {
	public static void main(String[] args) {
		AdoptionsDao dao= new AdoptionsDaoImpl();
		try {
			List<Adoptions> AdoptionsList = dao.showAdoptionEvents() ;
			for (Adoptions Adopt : AdoptionsList) {
				System.out.println(Adopt);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

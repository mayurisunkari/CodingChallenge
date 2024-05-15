package com.java.PP.main;
import java.sql.SQLException;
import java.util.List;

import com.java.PP.dao.DonationsDao;
import com.java.PP.dao.DonationsDaoImpl;

import com.java.PP.model.Donations;

public class showDonationMain {
	public static void main(String[] args) {
		DonationsDao dao = new DonationsDaoImpl();
		try {
			List<Donations> DonationsList = dao.showDonation() ;
			for (Donations donation : DonationsList) {
				System.out.println(donation);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

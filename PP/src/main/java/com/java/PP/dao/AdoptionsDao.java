package com.java.PP.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.PP.model.Adoptions;

public interface AdoptionsDao {
	List<Adoptions> showAdoptionEvents() throws ClassNotFoundException, SQLException;
	Boolean CreateAdoptionEvents(Adoptions adoptionevents) throws ClassNotFoundException, SQLException;
}

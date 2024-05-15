package com.java.PP.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.PP.model.Pets;

public interface PetsDao {
	List<Pets>Showpets() throws ClassNotFoundException, SQLException;
	Pets ShowPetsID(int PetID) throws ClassNotFoundException, SQLException;
	List<Pets>ShowpetsByType(String Type) throws SQLException, ClassNotFoundException ;
	List<Pets>ShowpetsByBreed(String Breed) throws ClassNotFoundException, SQLException;
	Boolean AddPets(Pets pet) throws ClassNotFoundException, SQLException;

}

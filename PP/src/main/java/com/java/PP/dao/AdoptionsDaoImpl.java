package com.java.PP.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.PP.Util.DBConnUtil;
import com.java.PP.Util.DBPropertyUtil;
import com.java.PP.model.Adoptions;

public class AdoptionsDaoImpl implements AdoptionsDao {
	Connection connection;
	PreparedStatement pst;
	@Override
	public List<Adoptions> showAdoptionEvents() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from AdoptionEvents";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Adoptions> AdoptionEventsList = new ArrayList<Adoptions>();
		Adoptions Adopt = null;
		while(rs.next()) {
			Adopt = new Adoptions();
			Adopt.setEventID(rs.getInt("EventID"));
			Adopt.setEventName(rs.getString("EventName"));
			Adopt.setEventDate(rs.getDate("EventDate"));
			Adopt.setLocation(rs.getString("Location"));
			
			AdoptionEventsList.add(Adopt);
		}
		return AdoptionEventsList;
	}
	@Override
	public Boolean CreateAdoptionEvents(Adoptions adoptionevents) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "Insert Into AdoptionEvents (EventID, EventName, EventDate, Location)Values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,adoptionevents.getEventID());
		pst.setString(2,adoptionevents.getEventName());
		pst.setDate(3,adoptionevents.getEventDate());
		pst.setString(4,adoptionevents.getLocation());
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
	}

}

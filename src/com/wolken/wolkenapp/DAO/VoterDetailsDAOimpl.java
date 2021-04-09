package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.VoterDetailsDTO;

public class VoterDetailsDAOimpl implements VoterDetailsDAO{

	@Override
	public void addVoterDetails(VoterDetailsDTO voterDetailsDTO) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");) {
			try (PreparedStatement preparedStatement = con
					.prepareStatement("Insert into voter_table values(?,?,?)");) {
				
				preparedStatement.setString(1, voterDetailsDTO.getVoterName());
				preparedStatement.setString(2, voterDetailsDTO.getVoterPlace());
				preparedStatement.setInt(3, voterDetailsDTO.getVoterAge());
				
				preparedStatement.executeUpdate();
				
			}
		}
	}

}

package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.VoterDetailsDTO;

public interface VoterDetailsDAO {
	
	public void addVoterDetails(VoterDetailsDTO voterDetailsDTO) throws SQLException, ClassNotFoundException;

}

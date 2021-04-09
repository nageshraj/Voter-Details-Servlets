package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.VoterDetailsDTO;

public interface VoterDetailsService {

	public boolean validateInsertVoterDetails(VoterDetailsDTO voterDetailsDTO) throws SQLException, ClassNotFoundException;
	
	
	
}

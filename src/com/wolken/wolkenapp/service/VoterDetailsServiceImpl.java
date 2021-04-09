package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.VoterDetailsDAO;
import com.wolken.wolkenapp.DAO.VoterDetailsDAOimpl;
import com.wolken.wolkenapp.DTO.VoterDetailsDTO;



public class VoterDetailsServiceImpl implements VoterDetailsService{

	VoterDetailsDAO voterDetailsDAO = new VoterDetailsDAOimpl();
	
	
	
	@Override
	public boolean validateInsertVoterDetails(VoterDetailsDTO voterDetailsDTO) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		if(voterDetailsDTO.getVoterAge()>18) {
			voterDetailsDAO.addVoterDetails(voterDetailsDTO);
			return true;
		}
		else {
			return false;
		}
			
		
	}

}

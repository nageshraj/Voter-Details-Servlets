package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.DTO.VoterDetailsDTO;
import com.wolken.wolkenapp.service.VoterDetailsService;
import com.wolken.wolkenapp.service.VoterDetailsServiceImpl;

// @WebServlet(urlPatterns = "/vote", loadOnStartup = +1) check web.xml for details
public class VoterDetailsServlet extends HttpServlet {
	// if HttpServlet is extended use particular Http methods eg: doGet(), doPost()
	// instead of overriding service of GenericServlet
	VoterDetailsService voterDetailsService = new VoterDetailsServiceImpl();
	VoterDetailsDTO voterDetailsDTO = new VoterDetailsDTO();

	public VoterDetailsServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("Object has been created");

	}

// In case of HttpRequest	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//	}
//	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("This is the init methhod");
		super.init();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Closing all resources now");
		super.destroy();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("Name");
		String place = request.getParameter("Place");
		String age = request.getParameter("Age");
		int intAge = Integer.parseInt(age);

		voterDetailsDTO.setVoterName(name);
		voterDetailsDTO.setVoterPlace(place);
		voterDetailsDTO.setVoterAge(intAge);

		try {
			voterDetailsService.validateInsertVoterDetails(voterDetailsDTO);
			System.out.println("inside validate of util ");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("hIiii");

		printWriter.flush();
		printWriter.close();

	}

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter printWriter = resp.getWriter();
//		
//		printWriter.print("This is inside doGet");
//		printWriter.flush();
//		printWriter.close();
		
		// doPost(req, resp);

	//}

}
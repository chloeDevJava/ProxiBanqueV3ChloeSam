package org.formation.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.entity.Client;
import org.formation.ws.ProxiBanqueRest;
import org.formation.ws.RestImplementation;

/**
 * Servlet implementation class ServletCreerClient
 */
@WebServlet("/ServletCreerClient")
public class ServletCreerClient extends HttpServlet {
	private ProxiBanqueRest ws = new RestImplementation();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreerClient() {
    	super();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		

		Client client1 = new Client("CREAC'H", "Yann", "yann@email.com");
		

		//request.setAttribute("client", client1);
		ws.addClient(client1);                                                                                                                         


//		
//		RequestDispatcher requestDispatcher;
//		requestDispatcher = request.getRequestDispatcher("client1");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

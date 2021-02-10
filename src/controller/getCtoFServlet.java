package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConvertToF;

/**
 * Servlet implementation class getCtoFServlet
 */
@WebServlet("/getCtoFServlet")
public class getCtoFServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCtoFServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userDegreesCelsius = request.getParameter("userDegreesCelsius");
		TempConvertToF userTemp = new TempConvertToF(Integer.parseInt(userDegreesCelsius));
		
		request.setAttribute("userDegreesToF", userTemp);
		
		getServletContext().getRequestDispatcher("/resultToFahrenheit.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userTemp.toString());
		//writer.close();
	}

}

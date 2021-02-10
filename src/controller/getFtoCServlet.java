package controller;
/**
 * @author ${user} - ejmanning
 * CIS175 - Spring 2021
 * ${date}
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConvertToC;

/**
 * Servlet implementation class getFtoCServlet
 */
@WebServlet("/getFtoCServlet")
public class getFtoCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFtoCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userDegreesFahrenheit = request.getParameter("userDegreesFahrenheit");
		TempConvertToC userTemp = new TempConvertToC(Integer.parseInt(userDegreesFahrenheit));
		
		request.setAttribute("userDegreesToC", userTemp);
		
		getServletContext().getRequestDispatcher("/resultToCelsius.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userTemp.toString());
		//writer.close();
	}

}

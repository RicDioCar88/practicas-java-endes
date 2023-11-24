
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DiaSemanaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num = request.getParameter("num");

		Integer numI = Integer.parseInt(num);

		PrintWriter out = response.getWriter();

		switch (numI) {
			case 1: {
				out.println("Hoy es LUNES!");
				break;
			}
			case 2: {
				out.println("Hoy es MARTES!");
				break;
			}
			case 3: {
				out.println("Hoy es MIÉRCOLES!");
				break;
			}
			case 4: {
				out.println("Hoy es JUEVES!");
				break;
			}
			case 5: {
				out.println("Hoy es VIERNES!");
				break;
			}
			case 6: {
				out.println("Hoy es SABADO!");
				break;
			}
			case 7: {
				out.println("Hoy es DOMINGO!");
				break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

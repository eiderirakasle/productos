package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloDescuento;
import modelo.dao.ModeloEstado;
import modelo.dao.ModeloTalla;

/**
 * Servlet implementation class AbrirFormCrearProducto
 */
@WebServlet("/abrirFormCrearProducto")
public class AbrirFormCrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AbrirFormCrearProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloEstado mEstado = new ModeloEstado();

		ModeloTalla mTalla = new ModeloTalla();

		ModeloDescuento mDescuento = new ModeloDescuento();
		

		request.setAttribute("descuentos", mDescuento.getAll());

		request.setAttribute("tallas", mTalla.getAll());

		request.setAttribute("estados", mEstado.getAll());

		

		request.getRequestDispatcher("formNuevoProducto.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

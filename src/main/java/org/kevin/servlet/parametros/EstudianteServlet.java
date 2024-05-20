package org.kevin.servlet.parametros;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/estudianteServlet")
public class EstudianteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        int edad = Integer.parseInt(req.getParameter("edad"));
        String curso = req.getParameter("curso");
        String genero = req.getParameter("genero");
        String[] lenguajes = req.getParameterValues("lenguajes");
        String descripcion = req.getParameter("descripcion");

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Datos del Estudiante</title>");
        out.println("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">");
        out.println("<style>");
        out.println("  .container {");
        out.println("      width: 40%;");
        out.println("      margin: 0 auto;");
        out.println("      padding: 20px;");
        out.println("      border: 1px solid #ccc;");
        out.println("      border-radius: 10px;");
        out.println("      background-color: #f9f9f9;");
        out.println("  }");
        out.println("  body {");
        out.println("      background: url('https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aHRtbHxlbnwwfHwwfHx8MA%3D%3D');");
        out.println("      background-size: cover;");
        out.println("      background-repeat: no-repeat;");
        out.println("      display: grid;");
        out.println("  }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container mt-5\">");
        out.println("<h1>Datos Personales</h1>");
        out.println("<p><strong>Nombre:</strong> " + nombre + "</p>");
        out.println("<p><strong>Apellidos:</strong> " + apellido + "</p>");
        out.println("<p><strong>Edad:</strong> " + edad + "</p>");
        out.println("<p><strong>Curso:</strong> " + curso + "</p>");
        out.println("<p><strong>Género:</strong> " + genero + "</p>");
        out.println("<p><strong>Lenguajes de Programación:</strong> " + (lenguajes != null ? Arrays.toString(lenguajes) : "Ninguno") + "</p>");
        out.println("<p><strong>Descripción:</strong> " + descripcion + "</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

    }

}

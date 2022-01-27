import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/add")
public class servletPractice extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int n1= Integer.parseInt(req.getParameter("n1"));
        int n2= Integer.parseInt(req.getParameter("n2"));
        int sum=n1+n2;
//        HttpSession session=req.getSession();//session
//        session.setAttribute("sum",sum);//session
//        Cookie cookie=new Cookie("sum",sum+"");//cookie
//        res.addCookie(cookie);//cookie
//        res.sendRedirect("sqrt");
//        res.sendRedirect("sqrt?sum="+sum);//URL Rewriting
//        req.setAttribute("sum",sum);
//          RequestDispatcher rd=req.getRequestDispatcher("add.jsp");
//          rd.forward(req,res);
//        res.sendRedirect("sqrt");
        PrintWriter out=res.getWriter();
        out.println("sum :"+sum);
    }
}

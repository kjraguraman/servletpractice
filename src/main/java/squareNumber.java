import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sqrt")
public class squareNumber extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out=res.getWriter();
//        int sum= (int) req.getAttribute("sum");
//        int sum= Integer.parseInt(req.getParameter("sum"));//URL Rewriting
//        HttpSession session=req.getSession();//session
//        int sum=(int) session.getAttribute("sum");//session
        int sum=0;
        Cookie cookies[]=req.getCookies();//cookie
        for(Cookie c:cookies){
            if(c.getName().equals("sum"))
                sum= Integer.parseInt(c.getValue());
        }
        out.println("sum = "+sum);
        out.println("Square of sum = "+(sum*sum));
//        out.println("Response received");
//        int num1= Integer.parseInt(req.getParameter("n1"));
//        int num2= Integer.parseInt(req.getParameter("n2"));
//        int sum=num1+num2;
//        out.println("Sum = "+sum);

    }
}

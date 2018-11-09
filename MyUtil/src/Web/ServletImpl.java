package Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logOut")
public class ServletImpl extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               resp.setContentType("text/html;charset=UTF-8");
               req.setCharacterEncoding("utf-8");
               PrintWriter writer = resp.getWriter();
               HttpSession session = req.getSession();
                int maxInactiveInterval = session.getMaxInactiveInterval();
                System.out.println("  "+maxInactiveInterval);
               
	writer.write("asd");
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}

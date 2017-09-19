package client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@WebServlet("/pattern")
public class QuestionWriter extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		Configuration cfg=new Configuration().configure("mapping/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
	}

}

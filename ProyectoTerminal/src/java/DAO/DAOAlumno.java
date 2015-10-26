/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Alumno;
import Util.HibernateUtil;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author eve
 */
public class DAOAlumno {
    
   private Session session; 
   
   public DAOAlumno(){
       HttpSession miSession=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
       miSession.setMaxInactiveInterval(5000);
   }
   
   
    public Alumno login(String nombre, String contrasena) {
        
        this.session=null;
        session = HibernateUtil.getSessionFactory().openSession();
	String hql = "from Alumno where nombre:nombre and contrasena:contrasena";
	Query query = session.createQuery(hql);
        query.setParameter("nombre", nombre);
        query.setParameter("contrasena", contrasena);

	Alumno alum= (Alumno)query.uniqueResult();
        session.close();
	return alum;
        
    }
  

    
}

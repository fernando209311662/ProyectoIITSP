/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import DAO.DAOAlumno;
import Modelo.Alumno;
import javax.jws.WebService;
/**
 *
 * @author eve
 */
@WebService(serviceName = "WebServiceIniciaSesion")
public class WebServiceIniciaSesion {

    /**
     * This is a sample web service operation
     * @param nombre
     * @param contrasena
     * @return 
     */

    public Alumno iniciaSesion(String nombre, String contrasena){
        
            DAOAlumno daoUsuario=new DAOAlumno();
            
            Alumno usuario =daoUsuario.login(nombre, contrasena);
            
            
         return usuario;
           
    }

}

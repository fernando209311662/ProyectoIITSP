/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import WebServices.WebServiceIniciaSesion;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 *
 */
@ManagedBean
@RequestScoped
@SessionScoped
public class BeanIniciaSesion {
    
    private String usuario;
    private String contraseña;
    private final HttpServletRequest httpServletRequest;
    private final FacesContext facesContext;
    private FacesMessage facesMessage;

    public BeanIniciaSesion(){
        
        facesContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)facesContext.getExternalContext().getRequest();
    } 

    public String loginAdmin() throws Exception {
		
       
        if(usuario.equals("Luis") && contraseña.equals("1234")){
            httpServletRequest.getSession().setAttribute("sessionUsuario", usuario);
            facesMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,"Acceso Administrador",null);
            facesContext.addMessage(null, facesMessage);
            return "acceso";
        }/*else{
           
            WebServiceIniciaSesion webServInSesion= new WebServiceIniciaSesion();
            
             if(webServInSesion.iniciaSesion(usuario,contraseña)!=null){
                httpServletRequest.getSession().setAttribute("sessionUsuario", usuario);
                facesMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,"Acceso Alumno",null);
                facesContext.addMessage(null, facesMessage);
                return "acceso";
                
             }else{
		  
                 facesMessage= new FacesMessage(FacesMessage.SEVERITY_ERROR,"Acceso Denegado",null);
                 facesContext.addMessage(null, facesMessage);
                 return "index";
	     }
            
        }*/
           return "index"; 
    }
    
    public String loginAlumno() throws Exception {
		
       
        
        WebServiceIniciaSesion webServInSesion= new WebServiceIniciaSesion();
            
        if(webServInSesion.iniciaSesion(usuario,contraseña)!=null){
                httpServletRequest.getSession().setAttribute("sessionUsuario", usuario);
                facesMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,"Acceso Alumno",null);
                facesContext.addMessage(null, facesMessage);
                return "acceso";
                
        }else{
		  
                 facesMessage= new FacesMessage(FacesMessage.SEVERITY_ERROR,"Acceso Denegado",null);
                 facesContext.addMessage(null, facesMessage);
                 return "index";
	}
            
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}

package Modelo;
// Generated 23/09/2015 04:37:04 PM by Hibernate Tools 4.3.1



/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private int matricula;
     private String nombre;
     private String contrasena;

    public Alumno() {
    }

	
    public Alumno(int matricula) {
        this.matricula = matricula;
    }
    public Alumno(int matricula, String nombre, String contrasena) {
       this.matricula = matricula;
       this.nombre = nombre;
       this.contrasena = contrasena;
    }
   
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }




}



package Modelo;
// Generated 23/09/2015 04:37:04 PM by Hibernate Tools 4.3.1



/**
 * Fase generated by hbm2java
 */
public class Fase  implements java.io.Serializable {


     private int idFase;
     private String nombreFase;

    public Fase() {
    }

    public Fase(int idFase, String nombreFase) {
       this.idFase = idFase;
       this.nombreFase = nombreFase;
    }
   
    public int getIdFase() {
        return this.idFase;
    }
    
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    public String getNombreFase() {
        return this.nombreFase;
    }
    
    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }




}



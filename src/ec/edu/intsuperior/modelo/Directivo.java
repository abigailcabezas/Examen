/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author abina
 */
public class Directivo {
   private Integer idDirecvtivo;
   private String categoria;
   private Integer sueldo;
  
public Directivo(){
    
}

    public Directivo(Integer idDirecvtivo, String categoria, Integer sueldo) {
        this.idDirecvtivo = idDirecvtivo;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public Integer getIdDirecvtivo() {
        return idDirecvtivo;
    }

    public void setIdDirecvtivo(Integer idDirecvtivo) {
        this.idDirecvtivo = idDirecvtivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "El idDirectivo es: "+getIdDirecvtivo()+"\n"
                +"La categoria que ocupa es: "+getCategoria()+"\n"
                +"El sueldo es: "+getSueldo()+"\n";
    }
    

}

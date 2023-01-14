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
public class Persona { 
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer edad;
    private Integer cedula;
    
    
    public Persona(){
           
    }

    public Persona(String nombre, String apellido, String nacionalidad, Integer edad, Integer cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.cedula=cedula;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "El nombre es:"+getNombre()+"\n" 
                +"El Apellido es: "+getApellido()+"\n"
                +"La Nacionalidad es: "+getNacionalidad()+"\n"
                +"La edad es: "+getEdad()+"\n"
                +"La cedula es:"+getCedula();
                
    }
    
}   


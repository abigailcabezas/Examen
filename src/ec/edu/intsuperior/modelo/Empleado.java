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
public class Empleado extends Persona{
    private Integer idEmpleado;
    private Integer sueldo;
    
public Empleado(){
    
}    

    public Empleado(Integer idEmpleado, Integer sueldo) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "idEmpleado es: "+getIdEmpleado()+"\n"
                +"El seuldo empleado es: "+getSueldo()+"\n";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author abina
 */
public class Aplicacion {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Scanner opcion = new Scanner(System.in);
    
        System.out.println("Bienvenidos\n"
                +"Elija una opcion\n"
                +"1.-Menu Empleado\n"
                +"2.-Menu Cliente\n"
                +"3.-Menu Directivo\n"
                +"4.-Menu Empresa\n"
                +"5.-Menu Salir\n");
        int opc=opcion.nextInt();
        switch(opc){
            case 1:
                System.out.println("Menu Empleado");
                System.out.println("1.-Ingrese el nombre: "+"\n"
                +"2.-Apellido: "+"\n"
                +"3.-Nacionalidad: "+"\n"
                +"4.-Edad: "+"\n"
                +"5.-Cedula: "+"\n"
                +"6.-idEmpleado: "+"\n"
                +"7.-Sueldo: "+"\n");
                Persona p=new Persona(leer.next(), leer.next(), leer.next(), leer.nextInt(), leer.nextInt());
                Empleado e=new Empleado(leer.nextInt(), leer.nextInt());
                System.out.println(p.toString());
                System.out.println(e.toString());
                break;
            case 2:
                System.out.println("Menu Cliente");
                System.out.println("1.-idCliente: "+"\n"
                        +"2.-Nombre: "+"\n"
                        +"3.-Apellido: "+"\n"
                        +"4.-Nacionalidad: "+"\n"
                        +"5.-Edad: "+"\n"
                        +"6.-Cedula: "+"\n");
             Persona p1=new Persona(leer.next(), leer.next(), leer.next(), leer.nextInt(), leer.nextInt());
             Cliente c=new Cliente (leer.nextInt());
             System.out.println(p1.toString());
             System.out.println(c.toString());
             break;
            case 3:
                System.out.println("Menu Directivo");
                System.out.println("1.-idDirectico: "+"\n"
                                  +"2.-Categoria: "+"\n"
                                  +"3.-Sueldo: "+"\n");
                Directivo d = new Directivo(leer.nextInt(), leer.next(), leer.nextInt());
                System.out.println(d.toString());
                break;
            case 4:
                System.out.println("Menu Empresa");
                    System.out.println("1.-idEmpresa: "+"\n"
                                  +"2.-Nombre: "+"\n"
                                  +"3.-Email: "+"\n"
                                  +"4.-Telefono: "+"\n");
                Empresa em = new Empresa(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
                System.out.println(em.toString());
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
                break;
                        
        }
    }
}
  
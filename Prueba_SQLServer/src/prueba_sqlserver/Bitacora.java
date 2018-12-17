/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_sqlserver;

/**
 *
 * @author iliana
 */
public class Bitacora {
     public String nombre;
     public String accion;
     public String descripcion;
     public String fecha;

    public Bitacora(String nombre, String accion, String descripcion, String fecha) {
        this.nombre = nombre;
        this.accion = accion;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
     
}

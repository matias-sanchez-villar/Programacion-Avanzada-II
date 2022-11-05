package com.example.donapp.Entity;

public class Solicitud extends EntidadEstadoBase{
    private String codigo;
    private String nombre;
    private String apellido;
    private String fecha;
    private Provincia provincia;
    private Localidad localidad;
    private String direccion;
    private int cantidadDonantes;

    public Solicitud() {
    }

    public Solicitud(String nombre, String apellido, String fecha, Provincia provincia, String direccion, int cantidadDonantes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.provincia = provincia;
        this.direccion = direccion;
        this.cantidadDonantes = cantidadDonantes;
    }

    public Solicitud(int id, String nombre, String apellido, String fecha, Provincia provincia, String direccion, int cantidadDonantes, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.provincia = provincia;
        this.direccion = direccion;
        this.cantidadDonantes = cantidadDonantes;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadDonantes() {
        return cantidadDonantes;
    }

    public void setCantidadDonantes(int cantidadDonantes) {
        this.cantidadDonantes = cantidadDonantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
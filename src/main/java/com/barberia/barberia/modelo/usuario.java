package com.barberia.barberia.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;
    private String nombre_apellido;
    private String correo;
    private String usua;
    private String 	clave;

    public usuario(){

    }

    public usuario(int idusuario, String nombre_apellido, String correo, String usua, String clave) {
        super();
        this.idusuario = idusuario;
        this.nombre_apellido = nombre_apellido;
        this.correo = correo;
        this.usua = usua;
        this.clave = clave;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsua() {
        return usua;
    }

    public void setUsua(String usua) {
        this.usua = usua;
    }
}

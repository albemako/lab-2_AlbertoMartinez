/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Alberto
 */
public class Contactos {
    private int Codigo;
    private String Nombre;
    private String Sexo;
    private Date Fecha_Nacimiento;
    private Color color;
    private String Direccion;
    private String Idioma;
    private String Hobbie1;
    private String Hobbie2;
    private String Hobbie3;
    private String Hobbie4;
    private String Hobbie5;
    public Contactos() {
    }
    public Contactos(int Codigo, String Nombre, String Sexo, Date Fecha_Nacimiento, Color color, String Direccion, String Idioma, String Hobbie1, String Hobbie2, String Hobbie3, String Hobbie4, String Hobbie5) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.color = color;
        this.Direccion = Direccion;
        this.Idioma = Idioma;
        this.Hobbie1 = Hobbie1;
        this.Hobbie2 = Hobbie2;
        this.Hobbie3 = Hobbie3;
        this.Hobbie4 = Hobbie4;
        this.Hobbie5 = Hobbie5;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }
    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getIdioma() {
        return Idioma;
    }
    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    public String getHobbie1() {
        return Hobbie1;
    }
    public void setHobbie1(String Hobbie1) {
        this.Hobbie1 = Hobbie1;
    }
    public String getHobbie2() {
        return Hobbie2;
    }
    public void setHobbie2(String Hobbie2) {
        this.Hobbie2 = Hobbie2;
    }
    public String getHobbie3() {
        return Hobbie3;
    }
    public void setHobbie3(String Hobbie3) {
        this.Hobbie3 = Hobbie3;
    }
    public String getHobbie4() {
        return Hobbie4;
    }
    public void setHobbie4(String Hobbie4) {
        this.Hobbie4 = Hobbie4;
    }
    public String getHobbie5() {
        return Hobbie5;
    }
    public void setHobbie5(String Hobbie5) {
        this.Hobbie5 = Hobbie5;
    }
    @Override
    public String toString() {
        return  Nombre ;
    }
}

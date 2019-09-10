/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author estudiante
 */
public class Persona {

    String Nombre;
    String Apellido;
    String Fecha_Nacimiento;
    String Tipo_Sangre;
    String Nacionalidad;
    String Identificación;
    String Telefono;
    String dirección;
    String Correo_Electronico;
    String Género;
    String Edad;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public String getTipo_Sangre() {
        return Tipo_Sangre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public void setTipo_Sangre(String Tipo_Sangre) {
        this.Tipo_Sangre = Tipo_Sangre;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setIdentificación(String Identificación) {
        this.Identificación = Identificación;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public void setGénero(String Género) {
        this.Género = Género;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getIdentificación() {
        return Identificación;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public String getGénero() {
        return Género;
    }

    public String getEdad() {
        return Edad;
    }

    public void printName() {
        System.out.println("Su nombre es: " + this.Nombre + " " + this.Apellido);

    }

    public void printFecha_Nacimiento() {
        System.out.println("Fecha en que nació: " + this.Fecha_Nacimiento);
    }

    public void printTipo_Sangre() {
        System.out.println("El tipo de sangre es: " + this.Tipo_Sangre);
    }

    public void printNacionalidad() {
        System.out.println("Su nacionalidad es: " + this.Nacionalidad);
    }

    public void printIdentificación() {
        System.out.println("Su identificación es " + this.Identificación);
    }

    public void printTelefono() {
        System.out.println("El telefono es: " + this.Telefono);
    }

    public void printDirección() {
        System.out.println("La dirección es: " + this.dirección);
    }

    public void printCorreo() {
        System.out.println("El correo electronico es: " + this.Correo_Electronico);
    }

    public void printGénero() {
        System.out.println("El Género es: " + this.Género);
    }

    public void printEdad() {
        System.out.println("La edad es: " + this.Edad);
    }
}

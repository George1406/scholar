/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

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
    public void printName (){
        System.out.println(this.Nombre + " " + this.Apellido);
        
    }
    
}





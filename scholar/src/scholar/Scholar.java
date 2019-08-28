package scholar;

/**
 *
 * @author estudiante
 */
public class Scholar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado();
        empleado1.Nombre="Jorge ";
        empleado1.Apellido="Ortiz";
        empleado1.Fecha_Nacimiento="06/09/2002 ";
        empleado1.Género="Masculino ";
        empleado1.Tipo_Sangre="O+ ";
        empleado1.Nacionalidad="Colombiano ";
        empleado1.Identificación="1001999206 ";
        empleado1.Telefono="3043809828 ";
        empleado1.Profesión="Estudiante ";
        empleado1.dirección="Calle 46 #11A 24 ";
        empleado1.Correo_Electronico="Georgeortizf06@gmail.com ";
       // System.out.println("El empleado se llama: " + empleado1.Nombre + empleado1.Apellido);
       empleado1.printName(); 
       System.out.println("Fecha en que nació: " + empleado1.Fecha_Nacimiento);
        System.out.println("Género: " + empleado1.Género);
        System.out.println("Tipo de sangre: " + empleado1.Tipo_Sangre);
        System.out.println("Nacionalidad: " + empleado1.Nacionalidad);
        System.out.println("Identificación: " + empleado1.Identificación);
        
    }

}

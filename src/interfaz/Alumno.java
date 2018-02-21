
package interfaz;

//Implementamos la interfaz Persona en la clase Alumno

public class Alumno implements Persona {

    @Override
    public void dimeTuNombre(String nombre) {
        System.out.println("El nombre del alumno es " +nombre);
    }

    @Override
    public void dimeTuEdad(int edad) {
        System.out.println("La edad del alumno es " +edad);
    }
    
}

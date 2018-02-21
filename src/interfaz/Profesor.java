
package interfaz;


//Implementamos la interfaz Persona en la clase Profesor


public class Profesor implements Persona{

    @Override
    public void dimeTuNombre(String nombre) {
        System.out.println("El nombre del profesor es " +nombre);
    }

    @Override
    public void dimeTuEdad(int edad) {
        System.out.println("La edad del profesor es " +edad);
    }
    
}

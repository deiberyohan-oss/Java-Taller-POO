public class Estudiante extends Persona {
    private float promedio;

    public Estudiante(int id, String nombre, String apellido, float promedio, String correo) {
        super(id, nombre, apellido, correo);
        this.promedio = promedio;
    }
    
    public float getPromedio() {
        return promedio;
    }
    
    public void setPromedio(float promedio) {
        this.promedio = promedio;

    }
    @Override 
    public String obtenerRol() {
        return "Estudiante";
    }
    @Override 
    public void mostrarInformacionEspecifica() {
        System.out.println("Promedio: " + promedio);
    }
}

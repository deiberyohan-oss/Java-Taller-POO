public class Administrativo extends Persona {
    private String ciudad;

    public Administrativo(int id, String nombre, String apellido, String correo, String ciudad) {
        super(id, nombre, apellido, correo);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String obtenerRol() {
        return "Administrativo";
    
    }
    @Override 
    public void mostrarInformacionEspecifica() {
        System.out.println("Ciudad: " + ciudad);
    }
}
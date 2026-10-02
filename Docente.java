public class Docente extends Persona {
    private double salario;

    public Docente(int id, String nombre, String apellido, double salario, String correo) {
        super(id, nombre, apellido, correo);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarInformacion() {
    }
      @Override 
    public String obtenerRol() {
        return "Docente";
    }
    @Override 
    public void mostrarInformacionEspecifica() {
        System.out.println("Salario: " + salario);
    }
}

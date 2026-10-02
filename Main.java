public class Main {
    public static void main(String[] args) {
        Persona[] comunidad = {
            new Estudiante(1, "Juan", "Perez", 8.5f, "juan.perez@example.com"),
            new Estudiante(2, "Maria", "Gomez", 9.2f, "maria.gomez@example.com"),
            new Docente(3, "Carlos", "Lopez", 5000.0, "carlos.lopez@example.com"),
            new Administrativo(4, "Ana", "Rodriguez", "ana.rodriguez@example.com", "Madrid")
        };
        for (Persona persona : comunidad) {
            persona.mostrarInformacion();
        }
    }
}
    


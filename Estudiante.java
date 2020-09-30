public class Estudiante extends Usuario implements  ProcesosEstudiantes{
    
    @Override
    public void enviarTarea() {
        System.out.println ("ITarea enviada");

    }

    @Override
    public void iniciarClase() {
       System.out.println ("Inicié clase como estudiante");

    }

    @Override
    public void salirClase() {
        System.out.println ("salí de clase como estudiante");

    }

    Estudiante(String nombre, Integer documento) {
       this.nombre=nombre;
       this.documento=documento;
       
    }

    @Override
    String gettipoUsuario() {
        
        return "ESTUDIANTE";
    }

    
}

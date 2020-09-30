public class Docente extends Usuario implements  ProcesosDocente {

    @Override
    public void calificar() {
        System.out.println ("Califico las tareas");

    }

    @Override
    public void iniciarClase() {
        System.out.println ("Inicié clase como docente");

    }

    @Override
    public void salirClase() {
        System.out.println ("Terminé clase como docente");

    }

   
    Docente(String nombre, Integer documento) {
        this.nombre=nombre;
       this.documento=documento;

    }

    @Override
    String gettipoUsuario() {
        return "DOCENTE";
    }
   

}

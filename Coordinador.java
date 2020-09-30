public class Coordinador extends Usuario {

  
    @Override
    public void iniciarClase() {
        System.out.println ("Inicié clase como coordinador");

    }

    @Override
    public void salirClase() {
        System.out.println ("Terminé clase como coordinador");

    }

    @Override
    String gettipoUsuario() {
       return "coordinador";
    }
    
}



public class Principal {
public static void main(final String[] args) {
  Usuario[] ListaUsuarios = {
    new Docente("Cristhell",123123),
    new Estudiante("Luigie",34234),
    new Estudiante("Jorge",4323423),
    new Docente("Jhon",3324),
    new Coordinador()
  };  
    

for (Usuario usuario : ListaUsuarios) {
  System.out.println(usuario.getmostrarUsuario()+" "+usuario.gettipoUsuario());
  usuario.iniciarClase();
 
}

}
}


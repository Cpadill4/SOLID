 abstract class Usuario implements Procesos {
     
  String nombre;
  Integer documento;
  String getmostrarUsuario (){return nombre+"-"+documento;} 
  abstract String gettipoUsuario();

}

 
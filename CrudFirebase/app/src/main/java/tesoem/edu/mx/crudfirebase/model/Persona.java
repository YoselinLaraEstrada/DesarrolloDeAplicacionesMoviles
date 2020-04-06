package tesoem.edu.mx.crudfirebase.model;

public class Persona
{
    public String uid;
    public String Nombre;
    public String Apellido;
    public String Correo;


public Persona() {
   }

   public String getUid(){
    return uid;
}
public void setUid(String uid){
    this.uid = uid;
}
public String getNombre(){
    return Nombre;
}
public void setNombre(String nombre){
    this.Nombre = nombre;
}
public String getApellido(){
    return Apellido;
}
public void setApellido(String apellido){
    this.Apellido = apellido;
}
public String getCorreo(){
    return Correo;
}
public void setCorreo(String correo){
    this.Correo = correo;
   }
   @Override
    public String toString() {
       return Nombre;
   }

}
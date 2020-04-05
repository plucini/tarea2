public class Usuario {

  String nombre;
  Integer cedula;
  String contrasena;
  Integer edad;
  Integer cantidad_de_hijos;
  Integer saldo;

    public String getNombre() {
        return nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getCantidad_de_hijos() {
        return cantidad_de_hijos;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCantidad_de_hijos(Integer cantidad_de_hijos) {
        this.cantidad_de_hijos = cantidad_de_hijos;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Usuario(String nombre, Integer cedula, String contrasena, Integer edad, Integer cantidad_de_hijos, Integer saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.edad = edad;
        this.cantidad_de_hijos = cantidad_de_hijos;
        this.saldo = saldo;
    }


    @Override
    public boolean equals(Object o){

    if(( o instanceof Usuario) && (((Usuario)o).getCedula() == this.cedula))

        {
        return true;
            }else{
        return false;
        }

    }






}

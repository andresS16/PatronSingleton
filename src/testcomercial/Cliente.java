
package testcomercial;


 class Cliente {
     protected String nombre;
     protected int documento;
     protected String email;

   public Cliente(String nombre, int documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }
      
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

   public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + ", email=" + email + '}';
    }   
}

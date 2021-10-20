
package testcomercial;

public class Servicio {
    protected String nombre;
    protected String codigo;
    protected String rubro;
    protected String subida;
    protected String tipoServicio;

    public Servicio(String nombre, String codigo, String rubro, String subida, String tipoServicio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.rubro = rubro;
        this.subida = subida;
        this.tipoServicio = tipoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getSubida() {
        return subida;
    }

    public void setSubida(String subida) {
        this.subida = subida;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "Nombre de servicio=" + nombre + ", codigo=" + codigo + ", rubro=" + rubro + ", subida=" + subida + ", tipoServicio=" + tipoServicio + '}';
    }   
}

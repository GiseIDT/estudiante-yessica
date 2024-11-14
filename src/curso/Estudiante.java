
package curso;


public class Estudiante {
    private String nombre;
    private String apellido;
    private  double  calificacion;
    private int  id;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, double calificacion, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


       @Override
       public String toString(){
           return  " nombre=" + nombre + ", apellido=" + apellido +", calificacion=" + calificacion+" ID: " +id;
       }
            
            
            
}

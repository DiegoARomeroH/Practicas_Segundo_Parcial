public class Estudiante {
    private String nombre;
    private String carrera;
    private int cuatrimestre;
    private char grupo;
    private double promedio;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public int getCuatrimestre() {
        return cuatrimestre;
    }
    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    public char getGrupo() {
        return grupo;
    }
    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}

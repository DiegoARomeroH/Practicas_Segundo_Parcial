public class App {
    public static void main(String[] args) {
        Estudiante[] grupo4c = new Estudiante[2];
        Estudiante miguel = new Estudiante();
        miguel.setNombre("Miguel");
        miguel.setCarrera("TIADSM");
        miguel.setCuatrimestre(4);
        miguel.setGrupo('c');
        miguel.setPromedio(3.5);
        grupo4c[0] = miguel;
        Estudiante juan = new Estudiante();
        juan.setNombre("Juan");
        juan.setCarrera("TIADSM");
        juan.setCuatrimestre(4);
        juan.setGrupo('c');
        juan.setPromedio(7.6);
        grupo4c[1] = juan;
        for ( Estudiante unEstudiante : grupo4c);
        System.out.println(unEstudiante.getNombre() + " - " + unEstudiante.getPromedio() );
    }
}

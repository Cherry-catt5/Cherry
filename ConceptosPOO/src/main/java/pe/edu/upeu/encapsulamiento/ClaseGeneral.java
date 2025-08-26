package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {
    public static void main(String[] args) {
        Persona p = new Persona();//p=objeto
       // p.nombre="Cherry";
       // p.edad=25;

        p.setNombre("Cherry");  //encapsulamiento
        p.setEdad(25);         //encapsulamiento
        p.apellido  = "Catt"; // no se esta aplicando encapsulamiento
        p.saludo();

        Trabajador t = new Trabajador();//t=objeto
        t.setNombre("Cherry");
        t.setApellido("Catt");
        t.setEdad(25);
        t.setCargo("Sistemas");
        t.setGenero('F');
        System.out.println(t);



    }
}

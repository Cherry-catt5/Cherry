package pe.edu.upeu.encapsulamiento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
//@Getter
//@Setter
public class Trabajador {
    private String nombre;
    private int edad;
    private String apellido;
    private String cargo;
    private char genero;

    @Override
    public String toString() {
        return "Tiene las siguientes caracteristicas:\n"+
                "Nombre:"+nombre+"\n"+
                "Apellido:"+apellido+"\n"
                ;
    }
}

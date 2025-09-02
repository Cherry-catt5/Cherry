package pe.edu.upeu.asistencia.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Carrera {
    SISTEMAS(Faculdad.FIA, "Ing. Sistemas"),
    CIVIL(Faculdad.FIA, "Ing. Civil"),
    AMBIENTAL(Faculdad.FACIHED, "Ing. Ambiental"),

    ADMINISTRACION(Faculdad.FCE,"Administracion"),
    NUTRICION(Faculdad.FCE,"Nutricion"),
    EDUCACION(Faculdad.FCE,"Educacion"),
    ;

    private Faculdad facultad;
    private String Descripcion;

}

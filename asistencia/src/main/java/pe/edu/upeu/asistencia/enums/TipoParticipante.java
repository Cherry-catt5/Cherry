package pe.edu.upeu.asistencia.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum TipoParticipante {
    ASISTENTE("Asistente"),
    ORGANIZADOR("Organizador"),
    PONENTE("Ponente");

    private String Descripcion;

}

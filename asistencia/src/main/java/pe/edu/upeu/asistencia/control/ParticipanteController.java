package pe.edu.upeu.asistencia.control;

import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.servicio.ParticipanteServicioI;

@Controller
public class ParticipanteController {

    @FXML
    private ComboBox<Carrera> cbxCarrera;

    @FXML
    private ComboBox<TipoParticipante> cbxTipoParticipante;

    @FXML TableView<Participante> tableView;
    ObservableList<Participante> participantes;
    TableColumn<Participante, String> dniCol, nombreCol, apellidosCol, carreraCol, tipoPartCol;

    @Autowired
    ParticipanteServicioI ps;

    @FXML
    public void initialize(){
        cbxCarrera.getItems().setAll(Carrera.values());
        cbxTipoParticipante.getItems().setAll(TipoParticipante.values());
        definirNombresColumnas();
        listarParticipante();
    }
    public void definirNombresColumnas(){
        dniCol = new TableColumn<>("DNI");
        nombreCol = new TableColumn<>("Nombres");
        apellidosCol = new TableColumn<>("Apellidos");
        apellidosCol.setMinWidth(150);
        carreraCol = new TableColumn<>("Carrera");
        tipoPartCol = new TableColumn<>("Tipo Participante");
        tableView.getColumns().addAll(dniCol, nombreCol, apellidosCol, carreraCol, tipoPartCol);
    }
    public void listarParticipante(){
        dniCol.setCellValueFactory(cellData->cellData.getValue().getDni());
        participantes = FXCollections.observableArrayList(ps.findAll());
        tableView.setItems(participantes);
    }


}

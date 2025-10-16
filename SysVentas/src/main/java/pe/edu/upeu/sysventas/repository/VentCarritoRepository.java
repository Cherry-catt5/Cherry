package pe.edu.upeu.sysventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upeu.sysventas.model.CarritoVenta;

import java.util.List;

public interface VentCarritoRepository extends ICrudGenericoRepository<CarritoVenta,Long>{
    @Query(value = "SELECT c.* FROM upeu_vent_carrito c WHERE c.dniruc=:dniruc", nativeQuery = true)
    List<CarritoVenta> listaCarritoCliente(@Param("dniruc") String dniruc);
    void deleteByDniruc(String dniruc);
}

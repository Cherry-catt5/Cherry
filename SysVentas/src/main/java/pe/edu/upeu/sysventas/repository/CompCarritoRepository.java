package pe.edu.upeu.sysventas.repository;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysventas.model.CarritoCompra;

@Repository
public interface CompCarritoRepository extends ICrudGenericoRepository<CarritoCompra, Long> {
}

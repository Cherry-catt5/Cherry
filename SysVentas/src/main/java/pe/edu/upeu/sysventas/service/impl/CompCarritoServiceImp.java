package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.CarritoCompra;
import pe.edu.upeu.sysventas.repository.CompCarritoRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICompCarritoService;

@RequiredArgsConstructor
@Service
public class CompCarritoServiceImp extends CrudGenericoServiceImp<CarritoCompra,Long> implements ICompCarritoService {

    private final CompCarritoRepository compCarritoRepository;

    @Override
    protected ICrudGenericoRepository<CarritoCompra, Long> getRepo() {
        return compCarritoRepository;
    }
}

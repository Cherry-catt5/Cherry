package pe.edu.upeu.sysventas.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysventas.model.CarritoVenta;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.VentCarritoRepository;
import pe.edu.upeu.sysventas.service.IVentCarritoService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VentCarritoServiceImp extends CrudGenericoServiceImp<CarritoVenta,Long> implements IVentCarritoService {
    private final VentCarritoRepository ventCarritoRepository;
    @Override
    protected ICrudGenericoRepository<CarritoVenta, Long> getRepo() {
        return ventCarritoRepository;
    }
    @Override
    public List<CarritoVenta> listaCarritoCliente(String dni) {
        return ventCarritoRepository.listaCarritoCliente(dni);
    }
    @Transactional
    @Override
    public void deleteCarAll(String dniruc) {
        ventCarritoRepository.deleteByDniruc(dniruc);
    }
}




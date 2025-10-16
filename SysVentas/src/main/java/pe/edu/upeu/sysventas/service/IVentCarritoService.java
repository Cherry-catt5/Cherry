package pe.edu.upeu.sysventas.service;


import pe.edu.upeu.sysventas.model.CarritoVenta;

import java.util.List;

public interface IVentCarritoService extends  ICrudGenericoService<CarritoVenta,Long>{
    List<CarritoVenta> listaCarritoCliente(String dni);
    void deleteCarAll(String dniruc);
}

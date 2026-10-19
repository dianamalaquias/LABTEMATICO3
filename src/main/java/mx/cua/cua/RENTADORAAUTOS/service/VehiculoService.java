package mx.cua.cua.RENTADORAAUTOS.service;

import mx.cua.cua.RENTADORAAUTOS.dto.VehiculoDTO;

import java.util.List;

public interface VehiculoService {

    List<VehiculoDTO> obtenerTodos();

    VehiculoDTO guardar(VehiculoDTO vehiculoDTO);

}
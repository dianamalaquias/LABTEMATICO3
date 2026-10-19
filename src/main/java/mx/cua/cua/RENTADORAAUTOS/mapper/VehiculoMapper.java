package mx.cua.cua.RENTADORAAUTOS.mapper;

import mx.cua.cua.RENTADORAAUTOS.dto.VehiculoDTO;
import mx.cua.cua.RENTADORAAUTOS.entity.Vehiculo;

public interface VehiculoMapper {

    Vehiculo toVehiculoEntity(VehiculoDTO vehiculoDTO);

    VehiculoDTO toVehiculoDTO(Vehiculo vehiculo);

}
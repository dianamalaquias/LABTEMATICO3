package mx.cua.cua.RENTADORAAUTOS.mapper.impl;

import mx.cua.cua.RENTADORAAUTOS.dto.VehiculoDTO;
import mx.cua.cua.RENTADORAAUTOS.entity.Vehiculo;
import mx.cua.cua.RENTADORAAUTOS.mapper.VehiculoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehiculoMapperImpl implements VehiculoMapper {

    @Override
    public Vehiculo toVehiculoEntity(VehiculoDTO vehiculoDTO) {

        Vehiculo vehiculo = new Vehiculo();

        BeanUtils.copyProperties(vehiculoDTO, vehiculo);

        return vehiculo;
    }

    @Override
    public VehiculoDTO toVehiculoDTO(Vehiculo vehiculo) {

        VehiculoDTO vehiculoDTO = new VehiculoDTO();

        BeanUtils.copyProperties(vehiculo, vehiculoDTO);

        return vehiculoDTO;
    }
}
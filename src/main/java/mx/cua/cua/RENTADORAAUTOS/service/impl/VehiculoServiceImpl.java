package mx.cua.cua.RENTADORAAUTOS.service.impl;

import mx.cua.cua.RENTADORAAUTOS.dto.VehiculoDTO;
import mx.cua.cua.RENTADORAAUTOS.entity.Vehiculo;
import mx.cua.cua.RENTADORAAUTOS.mapper.VehiculoMapper;
import mx.cua.cua.RENTADORAAUTOS.repository.VehiculoRepository;
import mx.cua.cua.RENTADORAAUTOS.service.VehiculoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    private final VehiculoMapper vehiculoMapper;
    private final VehiculoRepository vehiculoRepository;

    public VehiculoServiceImpl(VehiculoMapper vehiculoMapper,
                               VehiculoRepository vehiculoRepository) {
        this.vehiculoMapper = vehiculoMapper;
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public List<VehiculoDTO> obtenerTodos() {

        List<Vehiculo> vehiculos = vehiculoRepository.findAll();

        List<VehiculoDTO> vehiculosDTO = new ArrayList<>();

        for (Vehiculo vehiculo : vehiculos) {
            vehiculosDTO.add(vehiculoMapper.toVehiculoDTO(vehiculo));
        }

        return vehiculosDTO;
    }
    @Override
    public VehiculoDTO guardar(VehiculoDTO vehiculoDTO) {

        Vehiculo vehiculo = vehiculoMapper.toVehiculoEntity(vehiculoDTO);

        vehiculo = vehiculoRepository.save(vehiculo);

        return vehiculoMapper.toVehiculoDTO(vehiculo);
    }
}
package mx.cua.cua.RENTADORAAUTOS.controller;

import mx.cua.cua.RENTADORAAUTOS.dto.VehiculoDTO;
import mx.cua.cua.RENTADORAAUTOS.service.VehiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public List<VehiculoDTO> obtenerTodos() {
        return vehiculoService.obtenerTodos();
    }

    @PostMapping
    public VehiculoDTO guardar(@RequestBody VehiculoDTO vehiculoDTO) {
        return vehiculoService.guardar(vehiculoDTO);
    }
}
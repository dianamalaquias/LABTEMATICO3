
package mx.cua.cua.RENTADORAAUTOS.controller;

import mx.cua.cua.RENTADORAAUTOS.dto.ReservacionDTO;
import mx.cua.cua.RENTADORAAUTOS.service.ReservacionService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservaciones")
public class ReservacionController {

    private final ReservacionService reservacionService;

    public ReservacionController(ReservacionService reservacionService) {
        this.reservacionService = reservacionService;
    }

    @GetMapping
    public List<ReservacionDTO> listarReservaciones() {
        return reservacionService.listarReservaciones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservacionDTO> obtenerReservacionPorId(
            @PathVariable Integer id) {

        ReservacionDTO reservacion =
                reservacionService.obtenerReservacionPorId(id);

        if (reservacion == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(reservacion);
    }
}

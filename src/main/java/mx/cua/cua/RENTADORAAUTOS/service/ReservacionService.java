package mx.cua.cua.RENTADORAAUTOS.service;

import mx.cua.cua.RENTADORAAUTOS.dto.ReservacionDTO;
import java.util.List;

public interface ReservacionService {

    List<ReservacionDTO> listarReservaciones();

    ReservacionDTO obtenerReservacionPorId(Integer id);

    ReservacionDTO crearReservacion(ReservacionDTO reservacionDTO);

    ReservacionDTO cancelarReservacion(
            Integer id,
            String motivo
    );

}

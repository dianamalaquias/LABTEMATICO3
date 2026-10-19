
package mx.cua.cua.RENTADORAAUTOS.service.impl;

import mx.cua.cua.RENTADORAAUTOS.dto.ReservacionDTO;
import mx.cua.cua.RENTADORAAUTOS.mapper.ReservacionMapper;
import mx.cua.cua.RENTADORAAUTOS.repository.ReservacionRepository;
import mx.cua.cua.RENTADORAAUTOS.service.ReservacionService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservacionServiceImpl implements ReservacionService {

    private final ReservacionRepository reservacionRepository;
    private final ReservacionMapper reservacionMapper;

    public ReservacionServiceImpl(
            ReservacionRepository reservacionRepository,
            ReservacionMapper reservacionMapper) {

        this.reservacionRepository = reservacionRepository;
        this.reservacionMapper = reservacionMapper;
    }

    @Override
    public List<ReservacionDTO> listarReservaciones() {

        return reservacionRepository.findAll()
                .stream()
                .map(reservacionMapper::toDTO)
                .toList();
    }

    @Override
    public ReservacionDTO obtenerReservacionPorId(Integer id) {

        return reservacionRepository.findById(id)
                .map(reservacionMapper::toDTO)
                .orElse(null);
    }

    @Override
    public ReservacionDTO crearReservacion(ReservacionDTO reservacionDTO) {
        throw new UnsupportedOperationException(
                "La creación de reservaciones aún no está implementada"
        );
    }

    @Override
    public ReservacionDTO cancelarReservacion(Integer id, String motivo) {
        throw new UnsupportedOperationException(
                "La cancelación de reservaciones aún no está implementada"
        );
    }
}


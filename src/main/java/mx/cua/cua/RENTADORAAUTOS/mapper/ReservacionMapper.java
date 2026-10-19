package mx.cua.cua.RENTADORAAUTOS.mapper;

import mx.cua.cua.RENTADORAAUTOS.dto.ReservacionDTO;
import mx.cua.cua.RENTADORAAUTOS.entity.Reservacion;

public interface ReservacionMapper {

    ReservacionDTO toDTO(Reservacion reservacion);

    Reservacion toEntity(ReservacionDTO reservacionDTO);

}
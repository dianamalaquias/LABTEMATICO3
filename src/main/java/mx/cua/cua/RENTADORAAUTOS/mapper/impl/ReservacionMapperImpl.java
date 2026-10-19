package mx.cua.cua.RENTADORAAUTOS.mapper.impl;

import mx.cua.cua.RENTADORAAUTOS.dto.ReservacionDTO;
import mx.cua.cua.RENTADORAAUTOS.entity.Reservacion;
import mx.cua.cua.RENTADORAAUTOS.mapper.ReservacionMapper;
import org.springframework.stereotype.Component;

@Component
public class ReservacionMapperImpl implements ReservacionMapper {

    @Override
    public ReservacionDTO toDTO(Reservacion reservacion) {

        if (reservacion == null) {
            return null;
        }

        ReservacionDTO dto = new ReservacionDTO();

        dto.setIdReservacion(reservacion.getIdReservacion());
        dto.setFolio(reservacion.getFolio());
        dto.setIdCliente(reservacion.getIdCliente());
        dto.setIdVehiculo(reservacion.getIdVehiculo());
        dto.setFechaReservacion(reservacion.getFechaReservacion());
        dto.setFechaInicio(reservacion.getFechaInicio());
        dto.setFechaFin(reservacion.getFechaFin());
        dto.setCostoTotal(reservacion.getCostoTotal());
        dto.setMontoAnticipo(reservacion.getMontoAnticipo());
        dto.setEstado(reservacion.getEstado());
        dto.setFechaCancelacion(reservacion.getFechaCancelacion());
        dto.setMotivoCancelacion(reservacion.getMotivoCancelacion());

        return dto;
    }

    @Override
    public Reservacion toEntity(ReservacionDTO dto) {

        if (dto == null) {
            return null;
        }

        Reservacion reservacion = new Reservacion();

        reservacion.setIdReservacion(dto.getIdReservacion());
        reservacion.setFolio(dto.getFolio());
        reservacion.setIdCliente(dto.getIdCliente());
        reservacion.setIdVehiculo(dto.getIdVehiculo());
        reservacion.setFechaReservacion(dto.getFechaReservacion());
        reservacion.setFechaInicio(dto.getFechaInicio());
        reservacion.setFechaFin(dto.getFechaFin());
        reservacion.setCostoTotal(dto.getCostoTotal());
        reservacion.setMontoAnticipo(dto.getMontoAnticipo());
        reservacion.setEstado(dto.getEstado());
        reservacion.setFechaCancelacion(dto.getFechaCancelacion());
        reservacion.setMotivoCancelacion(dto.getMotivoCancelacion());

        return reservacion;
    }
}

package mx.cua.cua.RENTADORAAUTOS.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservaciones")
public class Reservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion")
    private Integer idReservacion;

    @Column(name = "folio", nullable = false, unique = true)
    private String folio;

    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;

    @Column(name = "id_vehiculo", nullable = false)
    private Integer idVehiculo;

    @Column(name = "fecha_reservacion", nullable = false)
    private LocalDateTime fechaReservacion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "costo_total", nullable = false)
    private BigDecimal costoTotal;

    @Column(name = "monto_anticipo", nullable = false)
    private BigDecimal montoAnticipo;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "fecha_cancelacion")
    private LocalDateTime fechaCancelacion;

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public LocalDateTime getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDateTime fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getMontoAnticipo() {
        return montoAnticipo;
    }

    public void setMontoAnticipo(BigDecimal montoAnticipo) {
        this.montoAnticipo = montoAnticipo;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(LocalDateTime fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    @Column(name = "motivo_cancelacion")
    private String motivoCancelacion;

}

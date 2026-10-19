package mx.cua.cua.RENTADORAAUTOS.repository;

import mx.cua.cua.RENTADORAAUTOS.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository
        extends JpaRepository<Vehiculo, Integer> {

}

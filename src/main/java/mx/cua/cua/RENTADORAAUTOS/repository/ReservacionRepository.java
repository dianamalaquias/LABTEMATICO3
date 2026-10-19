package mx.cua.cua.RENTADORAAUTOS.repository;

import mx.cua.cua.RENTADORAAUTOS.entity.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepository
        extends JpaRepository<Reservacion, Integer> {

}

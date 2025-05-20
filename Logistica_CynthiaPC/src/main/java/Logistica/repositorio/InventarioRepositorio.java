package Logistica.repositorio;

import Logistica.entidades.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InventarioRepositorio extends JpaRepository<Inventario.Integer> {
}

package Logistica.servicio;

import Logistica.entidades.Inventario;
import Logistica.repositorio.InventarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  java.util.List;
@Service
public class InventarioServicio {

    @Autowired
    private InventarioRepositorio InventarioRepositorio;

    public List<Inventario> listarInventario() {

        return InventarioRepositorio.findAll();
    }

    public Inventario agregarInventarioa(Inventario Inventario) {

        return InventarioRepositorio.save(Inventario);
    }

    public Inventario editarInventario(Integer IdInventario) {

        return InventarioRepositorio.findById(IdInventario).get();
    }

    public Inventario actualizarInventario(Inventario Inventario) {

        return InventarioRepositorio.save(Inventario);
    }

    public void eliminarInventario(Integer IdInventario) {

        InventarioRepositorio.deleteById(IdInventario);
    }
}

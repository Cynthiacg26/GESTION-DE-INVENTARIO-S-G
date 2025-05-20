package Logistica.Controlador;

import Logistica.entidades.Inventario;
import Logistica.servicio.InventarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/Inventariado")
public class InventarioControlador
{
    @Autowired
    private InventarioServicio InventarioServicio;

    @GetMapping
    public List<Inventario> index()
    {

        return InventarioServicio.listarInventario();
    }

    }

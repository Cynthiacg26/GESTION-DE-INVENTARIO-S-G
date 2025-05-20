package Logistica;

import Logistica.entidades.Inventario;
import Logistica.repositorio.InventarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner{
    @Autowired
    private InventarioRepositorio InventarioRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        }
    @Override
    public void run(String... args) throws Exception {

        Inventario = new Inventario("Mueble", "OBJ147", "Mueble 2m x 1m","1300");

        InventarioRepositorio.save(Inventario);
    }
}
package Logistica.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Inventariado")

public class Inventario
{
    @IdInventario
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdInventario;

    @Column(name = "NombreArticulo", nullable = false, length = 100)
    private String NombreArticulo;

    @Column(name = "CodigoIdentifica", nullable = false, length = 50)
    private String CodigoIdentifica;

    @Column(name = "Descripcion", nullable = false, length = 50)
    private String Descripcion;

    @Column(name = "Costo", nullable = false)
    private Double Costo;
}
public Inventario( Integer IdInventario,  String NombreArticulo, String CodigoIdentifica, String Descripcion,Double Costo ) {
    this.IdInventario = IdInventario;
    this.NombreArticulo = NombreArticulo;
    this.CodigoIdentifica = CodigoIdentifica;
    this.Descripcion = Descripcion;
    this.Costo = Costo;
}

public Integer getIdInventario() {
    return IdInventario;
}

public void setIdInventario(Integer IdInventario) {
    this.IdInventario = IdInventario;
}

public String getNombreArticulo() {
    return NombreArticulo;
}

public void setNombreArticulol(String NombreArticulo) {
    this.NombreArticulo = NombreArticulo;
}

public String getCodigoIdentifican() {
    return CodigoIdentifica;
}

public void setCodigoIdentifica(String CodigoIdentifica) {
    this.CodigoIdentifica = CodigoIdentifica;
}

public String getDescripcionn() {
    return Descripcion;
}

public void setDescripcion(String Descripcion) {
    this.Descripcion = Descripcion;
}

public String getCosto() {
    return Costo;
}

public void setCosto(Double Costo) {
    this.Costo = Costo;
}
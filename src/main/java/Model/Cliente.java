package Model;

import jakarta.persistence.*;

@Entity
@Table(name="Model.Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCliente;

    @Column
    private String nombre;

    @Column
    private boolean vip;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "direccion", column = @Column(name = "direccionEnvio")),
            @AttributeOverride(name = "ciudad", column = @Column(name = "ciudadEnvio")),
            @AttributeOverride(name = "provincia", column = @Column(name = "provinciaEnvio")),
            @AttributeOverride(name = "codigoPostal", column = @Column(name = "codigoPostalEnvio"))
    })
    private Direccion direccioEnvio;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "direccion", column = @Column(name = "direccionFacturacion")),
            @AttributeOverride(name = "ciudad", column = @Column(name = "ciudadFacturacion")),
            @AttributeOverride(name = "provincia", column = @Column(name = "provinciaFacturacion")),
            @AttributeOverride(name = "codigoPostal", column = @Column(name = "codigoPostalFacturacion"))
    })
    private Direccion direccionFacturacion;

    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccioEnvio() {
        return direccioEnvio;
    }

    public void setDireccioEnvio(Direccion direccioEnvio) {
        this.direccioEnvio = direccioEnvio;
    }

    public Direccion getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(Direccion direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public Cliente(String nombre, boolean vip) {
        this.nombre = nombre;
        this.vip = vip;
    }

}


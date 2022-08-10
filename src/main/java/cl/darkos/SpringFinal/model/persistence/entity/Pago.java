package cl.darkos.SpringFinal.model.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="pago")
public class Pago {

    @Id
    @Column(name="id_pago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;
    @Column(name="fecha_pago")
    private String fechaPago;
    @Column(name="rut_cliente")
    private Integer rutCliente;
    @Column(name="monto")
    private Integer monto;

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "idPago=" + idPago +
                ", fechaPago='" + fechaPago + '\'' +
                ", rutCliente=" + rutCliente +
                ", monto=" + monto +
                '}';
    }
}

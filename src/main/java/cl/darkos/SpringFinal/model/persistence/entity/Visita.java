package cl.darkos.SpringFinal.model.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="visita")
public class Visita {

    @Id
    @Column(name="id_visita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVisita;

    @Column(name="rut_cliente")
    private Integer rutCliente;

    @Column(name="dia")
    private String dia;

    @Column(name="hora")
    private String hora;

    @Column(name="lugar")
    private String lugar;

    @Column(name="comentarios")
    private String comentarios;

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "idVisita=" + idVisita +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}

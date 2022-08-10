package cl.darkos.SpringFinal.model.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="capacitacion")
public class Capacitacion {

   //**************************************************
   @Id
   @Column(name="id_capacitacion")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idCapacitacion;

   @Column(name="rut_cliente")
   private Integer rutCliente;

   @Column(name="dia_semana")
   private String diaSemana;

   @Column(name="hora")
   private String hora;

   @Column(name="lugar")
   private String lugar;

   @Column(name="duracion")
   private String duracion;

   @Column(name="cantidad_asistentes")
   private Integer cantidadAsistentes;

   //**************************************************
   public Integer getIdCapacitacion() {
      return idCapacitacion;
   }

   public void setIdCapacitacion(Integer idCapacitacion) {
      this.idCapacitacion = idCapacitacion;
   }

   public Integer getRutCliente() {
      return rutCliente;
   }

   public void setRutCliente(Integer rutCliente) {
      this.rutCliente = rutCliente;
   }

   public String getDiaSemana() {
      return diaSemana;
   }

   public void setDiaSemana(String diaSemana) {
      this.diaSemana = diaSemana;
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

   public String getDuracion() {
      return duracion;
   }

   public void setDuracion(String duracion) {
      this.duracion = duracion;
   }

   public Integer getCantidadAsistentes() {
      return cantidadAsistentes;
   }

   public void setCantidadAsistentes(Integer cantidadAsistentes) {
      this.cantidadAsistentes = cantidadAsistentes;
   }

   @Override
   public String toString() {
      return "Capacitacion{" +
            "idCapacitacion=" + idCapacitacion +
            ", rutCliente=" + rutCliente +
            ", diaSemana='" + diaSemana + '\'' +
            ", hora='" + hora + '\'' +
            ", lugar='" + lugar + '\'' +
            ", duracion='" + duracion + '\'' +
            ", cantidadAsistentes=" + cantidadAsistentes +
            '}';
   }
}

package cl.darkos.SpringFinal.model.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name="contacto")
public class Contacto {

    @Id
    @Column(name="id_contacto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContacto;
    @Column(name="correo_electronico")
    private String correoElectronico;
    @Column(name="mensaje")
    private String mensaje;

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idContacto +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}

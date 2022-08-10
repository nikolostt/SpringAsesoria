package cl.darkos.SpringFinal.model.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="administrativo")
public class Administrativo {
    @Id
    @Column(name="id_administrativo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdministrativo;
    @Column(name="nombre_usuario")
    private String nombreUsuario;
    @Column(name="fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name="run")
    private Integer run;
    @Column(name="clave")
    private String clave;
    @Column(name="perfil")
    private String perfil;
    @Column(name="area")
    private String area;
    @Column(name="experiencia_previa")
    private String experienciaPrevia;

    //*******************************************************

    public Integer getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(Integer idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo=" + idAdministrativo +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", clave='" + clave + '\'' +
                ", perfil='" + perfil + '\'' +
                ", area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}






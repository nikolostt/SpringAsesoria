package cl.darkos.SpringFinal.model.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name="profesional")
public class Profesional {

    @Id
    @Column(name="id_profesional")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfesional;
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
    @Column(name="titulo")
    private String titulo;
    @Column(name="fecha_ingreso")
    private String fechaIngreso;

//****************************************************


    public Integer getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(Integer idProfesional) {
        this.idProfesional = idProfesional;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "idProfesional=" + idProfesional +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", clave='" + clave + '\'' +
                ", perfil='" + perfil + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}

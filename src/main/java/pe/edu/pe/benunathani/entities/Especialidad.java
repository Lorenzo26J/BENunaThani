package pe.edu.pe.benunathani.entities;


import javax.persistence.*;

@Entity
@Table(name="Especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoEspecialidad", length = 70,nullable = false)
    private int id;
    @Column(name = "tipoEspecialidad", length = 50, nullable = false)
    private String tipoEspecialidad;
    @Column(name="centroEspecialidad",length = 50,nullable = false)
    private String centroEspecialidad;
    @Column(name = "descripcionEspecialidad",length = 40,nullable = false)
    private String descripcionEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int id, String tipoEspecialidad, String centroEspecialidad, String descripcionEspecialidad) {
        this.id = id;
        this.tipoEspecialidad = tipoEspecialidad;
        this.centroEspecialidad = centroEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getCentroEspecialidad() {
        return centroEspecialidad;
    }

    public void setCentroEspecialidad(String centroEspecialidad) {
        this.centroEspecialidad = centroEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }
}

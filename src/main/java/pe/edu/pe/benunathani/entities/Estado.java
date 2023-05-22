package pe.edu.pe.benunathani.entities;

import javax.persistence.*;

@Entity
@Table(name="Estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="disponibilidad", length = 60, nullable = false)
    private String disponibilidad;

    public Estado() {
    }

    public Estado(int id, String disponibilidad) {
        this.id = id;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

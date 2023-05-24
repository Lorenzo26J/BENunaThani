package pe.edu.pe.benunathani.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Disponibilidades")
public class Disponibilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "inicio_turno",nullable = false)
    private String inicio_turno;
    @Column(name="fin_turno",nullable = false)
    private String fin_turno;
    @Column(name = "dias_laborales",nullable = false)

    private LocalDate dias_laborales;

    public Disponibilidad() {
    }

    public Disponibilidad(int id, String inicio_turno, String fin_turno, LocalDate dias_laborales) {
        this.id = id;
        this.inicio_turno = inicio_turno;
        this.fin_turno = fin_turno;
        this.dias_laborales = dias_laborales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInicio_turno() {
        return inicio_turno;
    }

    public void setInicio_turno(String inicio_turno) {
        this.inicio_turno = inicio_turno;
    }

    public String getFin_turno() {
        return fin_turno;
    }

    public void setFin_turno(String fin_turno) {
        this.fin_turno = fin_turno;
    }

    public LocalDate getDias_laborales() {
        return dias_laborales;
    }

    public void setDias_laborales(LocalDate dias_laborales) {
        this.dias_laborales = dias_laborales;
    }
}

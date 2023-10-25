package es.ieslosmontecillos.AppAgendaDK.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="PROVINCIA")
public class Persona implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "APELLIDOS", nullable = true,length = 40)
    private String apellidos;

    @Basic
    @Column(name = "TELEFONO", nullable = true, length = 15)
    private String telefono;

    @Basic
    @Column(name = "EMAIL", nullable = true,length = 30)
    private String email;

    @ManyToOne
    @JoinColumn(name = "PROVINCIA", nullable = false)
    private Provincia provincia;
    @Basic
    @Column(name = "FECHA_NACIMIENTO",nullable = true)
    private Date fecha_nacimiento;

    @Basic
    @Column(name = "NUM_HIJOS", nullable = true)
    private int num_hijos;

    @Basic
    @Column(name = "ESTADO_CIVIL", nullable = true, length = 1)
    private char estado_civil;

    @Basic
    @Column(name = "SALARIO",nullable = true,precision = 9 , scale = 2)
    private BigDecimal salario;

    @Basic
    @Column(name = "JUBILADO",nullable = true)
    private boolean jubilado;

    @Basic
    @Column(name = "FOTO", nullable = true, length = 30)
    private String foto;

    public Persona() {
    }


    //ID

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellidos

    public String getApellidos(){
       return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos= apellidos;
    }

    //TELEFONO

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono= telefono;
    }

    //EMAIL

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //PROVINCIA

    public Provincia getProvincia(){
        return provincia;
    }

    public void setProvincia(Provincia provincia){
        this.provincia=provincia;
    }

    //FECHA_NACIMIENTO

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento){
        this.fecha_nacimiento=fecha_nacimiento;
    }
    //NUM_HIJOS

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijoss(int num_hijos) {
        this.num_hijos = num_hijos;
    }
    //ESTADO_CIVIL
    public char getEstado_civil(){
        return estado_civil;
    }

    public void setEstado_civil(char estado_civil) {
        this.estado_civil = estado_civil;
    }

    //SALARIO

    public BigDecimal getSalario(){
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    //JUBILADO


    public boolean isJubilado() {
        return jubilado;
    }

    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    //FOTO

    public String getFoto(){
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id) && Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos);
    }
}
package com.neuromotion.neuromotion.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="usuario")
public class Usuario  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USUARIO")
    @SequenceGenerator(sequenceName = "cd_empleado_sec",allocationSize = 1, name ="USUARIO")

    @Column(name="USUARIO_ID")
    private int usuarioId;

    private String NOMBRE;

    private String APELLIDO;

    @Column(name="FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date FECHANACIMIENTO;

    private  int CEDULA;

    private String CORREO;

    private String PASSWORD;

    public int usuarioId() {
        return usuarioId;
    }

    public Usuario setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
        return this;
    }

    public String NOMBRE() {
        return NOMBRE;
    }

    public Usuario setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
        return this;
    }

    public String APELLIDO() {
        return APELLIDO;
    }

    public Usuario setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
        return this;
    }

    public int CEDULA() {
        return CEDULA;
    }

    public Usuario setCEDULA(int CEDULA) {
        this.CEDULA = CEDULA;
        return this;
    }

    public String CORREO() {
        return CORREO;
    }

    public Usuario setCORREO(String CORREO) {
        this.CORREO = CORREO;
        return this;
    }

    public Date FECHANACIMIENTO() {
        return FECHANACIMIENTO;
    }

    public Usuario setFECHANACIMIENTO(Date FECHANACIMIENTO) {
        this.FECHANACIMIENTO = FECHANACIMIENTO;
        return this;
    }

    public String PASSWORD() {
        return PASSWORD;
    }

    public Usuario setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
        return this;
    }

}

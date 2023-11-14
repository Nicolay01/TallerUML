package one.model.administracion;

import java.util.Date;

/**
 *
 * @author decar
 */
public class Profesional extends Planta {

    private int nivel;
    private int salario;

    // DOCUMENTAR

    public Profesional(int idPersona, String nombrePersona, String apePersona, 
            String fechaNacimiento, String cuidadNacimiento, String genero, 
            int estrato, String dependencia, String titulo, String fechaVinculacion
            , int nivel, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, dependencia, titulo, fechaVinculacion);
        this.nivel = nivel;
        this.salario = salario;
    }
    

    // DOCUMENTAR
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // DOCUMENTAR
    public int calcularSueldo() {
        return 0;
    }

    public int liquidarProf() {
        return 0;
    }

    // void liquidacionProfesional
    public int mostrarLiqProf() {
        return 0;
    }

    // DOCUMENTAR
    @Override
    public String mostrarDatosAdminPlanta() {
        return "mostrar x datos";
    }

    @Override
    public void mostrarDG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularEPS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculaPension() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculaARL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularSENA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularCajas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculaICBF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculaAuxilio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nnivel: " + this.nivel
                + " salario: " + this.salario;
    }
}

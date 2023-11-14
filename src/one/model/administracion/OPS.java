package one.model.administracion;

import java.util.Date;

/**
 *
 * @author decar
 */
public class OPS extends Administrativos {

    private final String fechaVinculacion;
    private int numMeses;
    private int valorContrato;
    private int salario;

    public OPS(int idPersona, String nombrePersona, String apePersona, String fechaNacimiento, 
            String cuidadNacimiento, String genero, int estrato, 
            String dependencia, String titulo, String fechaVinculacion, int numMeses
            , int valorContrato, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, dependencia, titulo);
        this.fechaVinculacion = fechaVinculacion;
        this.numMeses = numMeses;
        this.valorContrato = valorContrato;
        this.salario = salario;
    }

    
    
    
    
    // DOCUMENTAR
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public int getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(int valorContrato) {
        this.valorContrato = valorContrato;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // DOCUMENTAR
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
                + "\nfechaVinculacion: " + this.fechaVinculacion
                + " numMeses: " + this.numMeses
                + " valorContrato: " + this.valorContrato
                + " salario: " + this.salario;
    }
}

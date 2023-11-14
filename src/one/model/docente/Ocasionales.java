package one.model.docente;

/**
 *
 * @author decar
 */
public class Ocasionales extends Docente {

    private String ultimoTitulo;
    private int numMeses;
    private int salario;

    // DOCUMENTAR
    public Ocasionales(int idPersona, String nombrePersona, String apePersona, 
            String fechaNacimiento, String cuidadNacimiento, String genero, 
            int estrato, String areaFormacion, String tituloProfesional, 
            String unidadAcademica, String ultimoTitulo, int numMeses, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, areaFormacion, tituloProfesional, unidadAcademica);
        this.ultimoTitulo = ultimoTitulo;
        this.numMeses = numMeses;
        this.salario = salario;
    }  
    
    // DOCUMENTAR   
    public String getUltimoTitulo() {
        return ultimoTitulo;
    }

    public void setUltimoTitulo(String ultimoTitulo) {
        this.ultimoTitulo = ultimoTitulo;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
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
                + "\n ultimoTitulo: " + this.ultimoTitulo
                + " numMese: " + this.numMeses
                + " salario: " + this.salario;
    }

}

package one.model.docente;

/**
 *
 * @author decar
 */
public class HoraCaterdra extends Docente {

    private String ultimoTitulo;
    private int numHoras;
    private int valorContrato;
    private int salario;

    // DOCUMENTAR
    public HoraCaterdra(int idPersona, String nombrePersona, String apePersona,
            String fechaNacimiento, String cuidadNacimiento, String genero,
            int estrato, String areaFormacion, String tituloProfesional,
            String unidadAcademica, String ultimoTitulo, int numHoras,
            int valorContrato, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, areaFormacion, tituloProfesional, unidadAcademica);
        this.ultimoTitulo = ultimoTitulo;
        this.numHoras = numHoras;
        this.valorContrato = valorContrato;
        this.salario = salario;
    }

    // DOCUMENTAR
    public String getUltimoTitulo() {
        return ultimoTitulo;
    }

    public void setUltimoTitulo(String ultimoTitulo) {
        this.ultimoTitulo = ultimoTitulo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
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
                + "\nultimoTitulo: " + this.ultimoTitulo
                + " numHoras: " + this.numHoras
                + " valorContrato: " + this.valorContrato
                + " salario: " + this.salario;
    }
}

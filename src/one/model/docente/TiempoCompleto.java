package one.model.docente;

/**
 *
 * @author decar
 */
public class TiempoCompleto extends Docente {

    private String categoria;
    private int puntos;
    private int salario;

    public static TiempoCompleto crearInstancia(String[] info) {
        // TODO SIGUEN EL ORDEN DE LOS PARAMETROS DE SUS CONTRUCTORES
        return new TiempoCompleto(
                Integer.parseInt(info[0]), info[1], info[2], info[3],
                info[4], info[5], Integer.parseInt(info[6]),
                info[7], info[8], info[9], info[10],
                Integer.parseInt(info[11]), Integer.parseInt(info[12]));
    }

    public TiempoCompleto(int idPersona, String nombrePersona, String apePersona,
            String fechaNacimiento, String cuidadNacimiento, String genero,
            int estrato, String areaFormacion, String tituloProfesional,
            String unidadAcademica, String categoria, int puntos, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, areaFormacion, tituloProfesional, unidadAcademica);
        this.categoria = categoria;
        this.puntos = puntos;
        this.salario = salario;
    }

    // DOCUMENTAR 
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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
                + "\ncategoria: " + this.categoria
                + " puntos: " + this.puntos
                + " salario: " + this.salario;
    }
}

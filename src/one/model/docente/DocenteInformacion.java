package one.model.docente;

/**
 *
 * @author decar
 */
public class DocenteInformacion {

    private final static String FIRST = "(id) (nombre) (apellido) (fechaNacimiento)"
            + " (cuidadNacimiento) (genero) (estrato) (areaFormacion)"
            + " (tituloProfesional) (unidadAcademica)";

    public static String horaCatedra() {
        return FIRST + " (ultimo titulo) (numHoras) (valorContrato) (salario)";
    }

    public static String ocasionales() {
        return FIRST + "(ultimoTitulo) (numMeses) (salario)";
    }

    public static String tiempoCompleto() {
        return FIRST + " (categoria) (puntos) (salario)";
    }
}

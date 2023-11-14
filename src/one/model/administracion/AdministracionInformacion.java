package one.model.administracion;

/**
 *
 * @author decar
 */
public class AdministracionInformacion {
    private static final String FIRST = "(id) (nombre) (apellido) (fechaNacimiento)"
            + " (cuidadNacimiento) (genero) (estrato) (dependencia) (titulo)";
    
    public static String OPS() {
        return FIRST + " (fechaVinculacion) (numMeses) (valorContrato) (salario)";
    }
    
    public static String profesional() {
        return FIRST + " (nivel) (salario)";
    }
    
    public static String tecnico() {
        return FIRST + " (nivel) (salario)";
    }
    
    public static String auxiliar() {
        return FIRST + " (nivel) (salario)";
    }
}

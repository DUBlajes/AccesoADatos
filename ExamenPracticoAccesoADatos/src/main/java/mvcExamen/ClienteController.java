package mvcExamen;
import java.util.List;
import java.sql.*;

public class ClienteController {
    private ClienteModel model; // Instancia del modelo
    private AlumnoView view;   // Instancia de la vista

    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public ClienteController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new ClienteModel(dbURL, dbUser, dbPassword); // Inicializa el modelo con la conexión a la base de datos
        view = new AlumnoView(); // Inicializa la vista
    }

    // Método para mostrar los clientes
    public void mostrarClientes() throws SQLException {
        List<Alumno> alumnos = model.getAllProductos();// Obtiene la lista de clientes desde el modelo
        view.mostrarProductos(alumnos); // Muestra los clientes en la vista
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        model.close(); // Cierra la conexión en el modelo
    }
}

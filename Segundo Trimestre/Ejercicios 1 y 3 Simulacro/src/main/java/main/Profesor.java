package main;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "profesores")

public class Profesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "cp")
	private String codigoPostal;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "telefono")
	private String telefono;
	
	
	//Constructor por defecto requerido por Hibernate
	
	public Profesor() {
		
	}
	
	
	
	public Profesor(String nombre, String apellidos, String direccion, String codigoPostal, String ciudad,
			String provincia, String telefono) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.telefono = telefono;
	}



	//Constructor para crear un objeto de tipo Clientes con un nombre y ciudad específicos


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



		//Método para imprimir la información del objeto Fabricante
		@Override
		public String toString() {
			return "Videojuego{" +
					"id=" + id +
					", Nombre='" + nombre + '\'' +
					", Apellidos='" + apellidos + '\'' +
					", Dirección='" + direccion + '\'' +
					", Código postal='" + codigoPostal + '\'' +
					", Ciudad='" + ciudad + '\'' +
					", Provincia='" + provincia + '\'' +
					", Teléfono='" + telefono + '\'' +
					'}';
		}
}

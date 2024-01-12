package modelo;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "clientes")

public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "ciudad")
	private String ciudad;
	
	//Constreuctor por defecto requerido por Hibernate
	
	public Clientes() {
		
	}
	
	//Constructor para crear un objeto de tipo Clientes con un nombre y ciudad específicos
	
	public Clientes(String nombre, String ciudad) {
		this.nombre=nombre;
		this.ciudad=ciudad;
	}
	
	//Getter y setter para el atributo id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	//Getter y setter para el atributo nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//Getter y setter para el atributo ciudad
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad=ciudad;
		}
	
	//Método para imprimir la información del objeto Fabricante
	@Override
	public String toString() {
		return "Clientes{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", ciudad='" + ciudad + '\'' +
				'}';
	}
}

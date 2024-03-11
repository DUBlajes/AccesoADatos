package main;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "asignaturas")

public class Asignaturas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "departamento")
	private String departamento;
	
	@Column(name = "creditos")
	private Integer creditos;
	
	@Column(name = "descripcion")
	private String descripcion;

	
	
	//Constructor por defecto requerido por Hibernate
	
	public Asignaturas() {
		
	}
	
	


	public Asignaturas(String nombre, String codigo, String departamento, Integer creditos,
			String descripcion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.departamento = departamento;
		this.creditos = creditos;
		this.descripcion = descripcion;
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




		public String getCodigo() {
			return codigo;
		}




		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}




		public String getDepartamento() {
			return departamento;
		}




		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}




		public Integer getCreditos() {
			return creditos;
		}




		public void setCreditos(Integer creditos) {
			this.creditos = creditos;
		}




		public String getDescripcion() {
			return descripcion;
		}




		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
		//Método para imprimir la información del objeto Fabricante
		@Override
		public String toString() {
			return "Asignatura{" +
					"id=" + id +
					", Nombre='" + nombre + '\'' +
					", Código='" + codigo + '\'' +
					", Departamento='" + departamento + '\'' +
					", Créditos='" + creditos + '\'' +
					", Descripción='" + descripcion + '\'' +

					'}';
		}
}

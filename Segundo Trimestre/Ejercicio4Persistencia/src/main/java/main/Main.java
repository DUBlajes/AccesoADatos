package main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		try {
			// Crear objeto fabricante
			Videojuego juego = new Videojuego("Wow",2010, "Blizzard",80.0, "Juegardo espectacular", "Todas");
			
			Videojuego juego2=new Videojuego(2010, "Blizzard Entertainment", "World of Warcraft", "PC", 80.00, "Pedazo de juego");

			// Obtener la sesión actual
			Session session = context.currentSession();
			// Iniciar transacción
			session.beginTransaction();
			// Guardar objeto en la base de datos
			session.save(juego2);

			// Hacer commit de la transacción
			session.getTransaction().commit();

			// Imprimir fabricante guardado en la base de datos
			System.out.println("Videojuego: " + juego2);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Desligar la sesión del contexto
			ThreadLocalSessionContext.unbind(sessionFactory);

			// Cerrar la sesión del Hibernate
			sessionFactory.close();
		}
	}
}

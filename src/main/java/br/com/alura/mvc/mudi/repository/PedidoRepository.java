package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	/* não precisa de entitymanager com springdata
	 * @PersistenceContext 
	 * private EntityManager entityManager;
	 */
	
	public List<Pedido> findAll();

	public List<Pedido> findByStatus(StatusPedido status);
	
	@Query("select p from Pedido p join p.user u where  u.username= :username")
	
	// select * from pedido inner join users on (pedido.user_username = users.username) where users.username= 'joao'; // sql convertido
	public List<Pedido> findAllByUsuario(@Param("username") String username);

	
	
	/* antigo pedido com springdata
	 * public List<Pedido> recuperaTodosOsPedidos(){ Query query =
	 * entityManager.createQuery("select p from Pedido p", Pedido.class); return
	 * query.getResultList(); }
	 */
}
package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
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
	
	
	/* antigo pedido com springdata
	 * public List<Pedido> recuperaTodosOsPedidos(){ Query query =
	 * entityManager.createQuery("select p from Pedido p", Pedido.class); return
	 * query.getResultList(); }
	 */
}
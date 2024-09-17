import br.com.rentatech.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;


public class ModelTest {
    public static void main (String [] args){

        EntityManager em = null;
        try {
            em = Persistence.createEntityManagerFactory("rentatech-orm").createEntityManager();
            Product product = new Product();
            product.setName("Playstation 5");
            product.setAvailability(true);
            product.setDescription("Jogue os melhores exclusivos");
            em.merge(product);
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally{
            if (em != null){
                em.close();
            }
            System.exit(0);
        }
    }
}

import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class Deletar {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        Produto p = produtoDao.buscarPorId(2);

        em.getTransaction().begin();
        produtoDao.deletar(p);
        em.getTransaction().commit();
        em.close();

    }
}

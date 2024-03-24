import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class Editar {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        Produto p = produtoDao.buscarPorId(2);
        System.out.println(p.getDescricao());

        em.getTransaction().begin();
        p.setDescricao("Gotas");
        em.getTransaction().commit();
        em.close();
        System.out.println(p.getDescricao());


    }
}

import br.com.alura.farmacia.dao.FabricanteDao;
import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Fabricante;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class Criar {
    public static void main(String[] args) {

        Fabricante fabricante = new Fabricante(3, "Cimed");
        Produto produto = new Produto(2, "Omeprazol", "20" +
                "comprimidos", 12.99, fabricante);

        EntityManager em = JPAUtil.getEntityManager();
        FabricanteDao fabricanteDao = new FabricanteDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        em.getTransaction().begin();
        fabricanteDao.cadastrar(fabricante);
        produtoDao.cadastrar(produto);
        em.getTransaction().commit();
        em.close();





    }
}

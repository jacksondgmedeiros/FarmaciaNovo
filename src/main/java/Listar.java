import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class Listar {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDao produtoDao = new ProdutoDao(em);

        List<Produto> listarTodos = produtoDao.listarTodosProdutos();
        listarTodos.forEach(l -> System.out.println(l.getNome()));

    }
}

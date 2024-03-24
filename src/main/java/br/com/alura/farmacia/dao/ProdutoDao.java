package br.com.alura.farmacia.dao;

import br.com.alura.farmacia.modelo.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto){
        this.em.persist(produto);
    }

    public List<Produto> listarTodosProdutos(){
        String jpql = "SELECT p FROM Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public Produto buscarPorId(int id){
        return em.find(Produto.class, id);
    }

    public Produto atualizarDescricao(String descricao){
        em.getTransaction().begin();

        return null;
    }

    public void deletar(Produto produto){
        produto = em.merge(produto);
        this.em.remove(produto);
    }
}

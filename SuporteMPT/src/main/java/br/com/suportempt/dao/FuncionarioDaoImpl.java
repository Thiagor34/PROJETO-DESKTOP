package br.com.suportempt.dao;

import br.com.suportempt.entidade.Funcionario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class FuncionarioDaoImpl extends BaseDaoImpl<Funcionario, Long>
        implements FuncionarioDao {

    @Override
    public Funcionario pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Funcionario.class, id);
    }

    @Override
    public List<Funcionario> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<Funcionario> consulta = sessao.createQuery("FROM Funcionario u WHERE u.nome LIKE :vNome");
        consulta.setParameter("vNome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<Funcionario> pesquisarTodos(Session sessao) throws HibernateException {
        Query<Funcionario> consulta = sessao.createQuery("FROM Funcionario u order by u.nome");
        return consulta.getResultList();
    }

    @Override
    public Funcionario logar(String login, String senha, Session sessao) throws HibernateException {
        Query<Funcionario> consulta = sessao.createQuery("FROM Funcionario u WHERE u.login = :login AND u.senha = :senha");
        consulta.setParameter("login", login);
        consulta.setParameter("senha", senha);
        return consulta.uniqueResult();
    }
}

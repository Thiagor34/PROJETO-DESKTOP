package br.com.suportempt.dao;

import br.com.suportempt.entidade.Funcionario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface FuncionarioDao extends BaseDao<Funcionario, Long> {

    List<Funcionario> pesquisarPorNome(String nome, Session sessao) throws HibernateException;

    List<Funcionario> pesquisarTodos(Session sessao) throws HibernateException;

    Funcionario logar(String login, String senha, Session sessao) throws HibernateException;
}

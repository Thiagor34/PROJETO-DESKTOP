package br.com.suportempt.dao;

import br.com.suportempt.entidade.Chamado;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface ChamadoDao extends BaseDao<Chamado, Long> {

    List<Chamado> pesquisarPorPatrimonio(String patrimonio, Boolean ativo, Session sessao) throws HibernateException;

    List<Chamado> pesquisarPorEquipamento(String equipamento, Boolean ativo, Session sessao) throws HibernateException;

    List<Chamado> pesquisarPorSala(String sala, Boolean ativo, Session sessao) throws HibernateException;

    List<Chamado> pesquisarPorData(Date data, Boolean ativo, Session sessao) throws HibernateException;

    List<Chamado> pesquisarTodos(Boolean ativo, Session sessao) throws HibernateException;
}

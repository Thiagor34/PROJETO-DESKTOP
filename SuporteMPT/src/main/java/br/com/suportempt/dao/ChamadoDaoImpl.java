package br.com.suportempt.dao;

import br.com.suportempt.entidade.Chamado;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class ChamadoDaoImpl extends BaseDaoImpl<Chamado, Long> implements ChamadoDao{

    @Override
    public Chamado pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Chamado.class, id);
    }

    @Override
    public List<Chamado> pesquisarPorPatrimonio(String patrimonio, Boolean ativo, Session sessao) throws HibernateException {
        Query<Chamado> consulta = sessao.createQuery("FROM Chamado c WHERE c.patrimonio = :patrimonio AND c.ativo = :ativo ORDER BY c.patrimonio");
        consulta.setParameter("patrimonio", patrimonio);
        consulta.setParameter("ativo", ativo);
        return consulta.getResultList();
    }

    @Override
    public List<Chamado> pesquisarPorEquipamento(String equipamento, Boolean ativo, Session sessao) throws HibernateException {
        Query<Chamado> consulta = sessao.createQuery("FROM Chamado c WHERE c.equipamento LIKE :equipamento AND c.ativo = :ativo ORDER BY c.equipamento");
        consulta.setParameter("equipamento", "%" + equipamento + "%");
        consulta.setParameter("ativo", ativo);
        return consulta.getResultList();
    }

    @Override
    public List<Chamado> pesquisarPorSala(String sala, Boolean ativo, Session sessao) throws HibernateException {
        Query<Chamado> consulta = sessao.createQuery("FROM Chamado c WHERE c.sala = :sala AND c.ativo = :ativo ORDER BY c.sala");
        consulta.setParameter("sala", sala);
        consulta.setParameter("ativo", ativo);
        return consulta.getResultList();
    }

    @Override
    public List<Chamado> pesquisarPorData(Date data, Boolean ativo, Session sessao) throws HibernateException {
        Query<Chamado> consulta = sessao.createQuery("FROM Chamado c WHERE c.dtAbertura = :data AND c.ativo = :ativo ORDER BY c.dtAbertura");
        consulta.setParameter("data", data);
        consulta.setParameter("ativo", ativo);
        return consulta.getResultList();
    }

    @Override
    public List<Chamado> pesquisarTodos(Boolean ativo, Session sessao) throws HibernateException {
        Query<Chamado> consulta = sessao.createQuery("FROM Chamado c WHERE c.ativo = :ativo ORDER BY c.id");
        consulta.setParameter("ativo", ativo);
        return consulta.getResultList();
    }

}

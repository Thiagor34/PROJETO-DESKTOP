package br.com.suportempt.dao;

import br.com.suportempt.entidade.Chamado;
import br.com.suportempt.entidade.Funcionario;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory; //Singleton

    static {
        try {
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Funcionario.class);
            cfg.addAnnotatedClass(Chamado.class);

            cfg.configure("/META-INF/hibernate.cfg.xml");
            StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().
                    applySettings(cfg.getProperties());
            sessionFactory = cfg.buildSessionFactory(build.build());
        } catch (HibernateException ex) {
            System.err.println("Erro ao criar Hibernate util." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session abrirConexao() throws HibernateException{
        return sessionFactory.openSession();
    }
}

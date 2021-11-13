/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author YOUSSEF
 */
public class UserDAO implements IDAO<User> {

    public UserDAO() {

    }

    public int insert(User M) {
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s.beginTransaction();
        s.persist(M);
        tx.commit();
        return 0;
    }

    public int update(User M) {
        Session s3 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s3.beginTransaction();
        s3.update(M);
        tx.commit();
        return 0;
    }

    public int delete(User M) {
        Session s2 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s2.beginTransaction();
        int id = M.getId();
        User p1 = (User) s2.load(User.class, new Integer(id));
        if (p1 != null) {
            s2.delete(p1);
        }
        tx.commit();
        return 0;
    }

    public User getone(User M) {
        Session s5 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s5.beginTransaction();
        int id = M.getId();
        User p1 = (User) s5.get(User.class, new Integer(id));
        tx.commit();
        return p1;
    }

    public List<User> Select() {
        Session s1 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s1.beginTransaction();
        List<User> ContactList = s1.createQuery("from User").list();
        tx.commit();
        return ContactList;
    }

 

}

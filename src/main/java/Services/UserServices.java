/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.UserDAO;
import Model.User;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name = "UserServices")
@SessionScoped
public class UserServices implements IDAOImp<User> {

    UserDAO dao;

    public UserServices() {
        dao=new UserDAO();
    }

    

    public int insert(User C) {
        System.out.println("hello    "+C);
        dao.insert(C);
        return 0;
    }

    public int update(User C) {
        dao.update(C);
        return 0;
    }

    public int delete(User C) {
        dao.delete(C);
        return 0;
    }

    public List<User> Select() {
        List<User> ContactList = dao.Select();
        return ContactList;
    }

    public User getone(User C) {
        return dao.getone(C);
    }

}

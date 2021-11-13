/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Services.UserServices;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "UserController")
@SessionScoped
public class UserController {

    UserServices src;

    public UserController() {
        src=new UserServices();
    }

    public String insert(User C) {
        src.insert(C);
        return "index";
    }

    public int update(User C) {
        src.update(C);
        return 0;
    }

    public String delete(User C) {
        src.delete(C);
        return "index";
    }

    public List<User> select() {
        List<User> ContactList = src.Select();
        return ContactList;
    }

    public User getone(User C) {
        return src.getone(C);
    }

}

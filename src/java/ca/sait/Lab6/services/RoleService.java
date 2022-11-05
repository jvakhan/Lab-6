package ca.sait.Lab6.services;

import ca.sait.Lab6.dataaccess.RoleDB;
import ca.sait.Lab6.dataaccess.UserDB;
import ca.sait.Lab6.models.Role;
import java.util.List;
import ca.sait.Lab6.models.User;

public class RoleService {
    private RoleDB roleDB = new RoleDB();
   
    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }

}

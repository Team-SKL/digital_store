package com.project.digital_store.func.security.manager;



import com.project.digital_store.model.User;

import java.util.List;

public interface SecurityManagerService {
    public List<User> getUserList();

    void unuseUser(String u_id);

    void useUser(String u_id);

    void unuseSeller(String u_id);

    void useSeller(String u_id);
}

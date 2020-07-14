package com.project.digital_store.func.user.buyer.address;

import com.project.digital_store.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserBuyerAddressService {

    public List<Address> select(String u_id);
    public void update(String phone,String province,String city,String detail);
    public void insert(String a_id,String u_id,String phone,String province,String city,String detail);
    public void delete(String a_id);

}

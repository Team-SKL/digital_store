package com.project.digital_store.func.user.buyer.address;

import com.project.digital_store.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserBuyerAddressService {

    List<Address> select(String u_id);
    void update(String phone,String province,String city,String detail);
    void insert(String u_id,String phone,String province,String city,String detail);
    void delete(String a_id);

}

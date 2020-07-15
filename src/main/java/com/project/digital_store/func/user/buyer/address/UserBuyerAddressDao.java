package com.project.digital_store.func.user.buyer.address;

import com.project.digital_store.model.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserBuyerAddressDao {

    int findMaxNumOfAddressId();
    List<Address> findAllAddress(@Param("u_id")String u_id);
    void updateAddress(@Param("phone")String phone,@Param("province")String province,@Param("city")String city,@Param("detail")String detail);
    void insertAddress(@Param("a_id")String a_id,@Param("u_id")String u_id,@Param("phone")String phone,
                       @Param("province")String province,@Param("city")String city,@Param("detail")String detail);
    void deleteAddress(@Param("a_id")String a_id);
}

package com.project.digital_store.func.user.buyer.address;

import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.base.Result;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("user/buyer/address")
public class UserBuyerAddressController {

    @Autowired
    private UserBuyerAddressService userBuyerAddressService;

    @RequestMapping("/findAll")
    public List<Address> select(HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        List<Address> addrList= null;
        try {
            addrList = userBuyerAddressService.select(currUser.getUserId());
        } catch (SysException e) {
            e.printStackTrace();
        }
        return addrList;
    }

    @RequestMapping("/edit")
    public Result edit(String phone,String province,String city,String detail){

        try {
            userBuyerAddressService.update(phone,province,city,detail);
            return Result.success("修改成功");
        } catch (SysException e) {
            return Result.fail("修改失败");
        }
    }

    @RequestMapping("/insert")
    public Result insert(String phone,String province,String city,String detail,HttpSession session){
        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String now_time = dateFormat.format(time);

        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        String u_id=currUser.getUserId();

        try {
            userBuyerAddressService.insert(now_time,u_id,phone,province,city,detail);
            return Result.success("添加成功");
        } catch (SysException e) {
            return Result.fail("添加失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(String a_id){
        try {
            userBuyerAddressService.delete(a_id);
            return Result.success("删除成功");
        } catch (SysException e) {
            return Result.fail("删除失败");
        }
    }

}

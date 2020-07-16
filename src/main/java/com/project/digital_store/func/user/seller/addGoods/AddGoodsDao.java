package com.project.digital_store.func.user.seller.addGoods;


import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.model.Camera;
import com.project.digital_store.model.Laptop;
import com.project.digital_store.model.Phone;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AddGoodsDao {

    @Select("select ifnull(convert(substring(max(g_id),2),unsigned),0) from laptop ")
    int findMaxNumLaptopId();

    @Select("select ifnull(convert(substring(max(g_id),2),unsigned),0) from camera ")
    int findMaxNumCameraId();

    @Select("select ifnull(convert(substring(max(g_id),2),unsigned),0) from phone ")
    int findMaxNumPhoneId();

    @Insert("insert into sellers_goods(s_id,g_id,g_price,g_quantity) values(#{u_id},#{g_id},#{g_price},#{g_quantity})")
    void insertNewEmp(GoodInfoDto goodInfoDto);

    @Insert("insert into camera(g_id,c_brand,g_model,c_weight,c_origin_place,c_classifcation,c_sensor_size,c_pixel,c_filter_diameter,c_function,c_purpose,c_color) " +
            "values(#{g_id},#{c_brand},#{g_model},#{c_weight},#{c_origin_place},#{c_classifcation},#{c_sensor_size},#{c_pixel},#{c_filter_diameter},#{c_function},#{c_purpose},#{c_color})")
    void insertCamera(Camera camera);

    @Insert("insert into phone(g_id,p_brand,g_model,p_weight,p_origin_place,p_cpu,p_memory,p_storage,p_micro_sd,p_camera_num,p_rear_cam_pixel,p_front_cam_pixel,p_screen_size,p_resolution,p_screen_ratio,p_screen_ratio,p_screen_and_front_cam,p_charger,p_os) " +
            "values(#{g_id},#{p_brand},#{g_model},#{p_weight},#{p_origin_place},#{p_cpu},#{p_memory},#{p_storage},#{p_micro_sd},#{p_camera_num},#{p_rear_cam_pixel},#{p_front_cam_pixel},#{p_screen_size},#{p_resolution},#{p_screen_ratio},#{p_screen_and_front_cam},#{p_charger},#{p_os})")
    void insertPhone(Phone phone);

    @Insert("insert into laptop(g_id,l_brand,g_model,l_weight,l_origin_place,l_screen_size,l_gpu_memory_size,l_bare_weight,l_memory,l_cpu,l_os,l_thickness,l_screen_refresh_rate,l_stand_by_time,l_gpu,l_screen_resolution,l_hdd,l_peculiarity,l_color) " +
            "values(#{g_id},#{l_brand},#{g_model},#{l_weight},#{l_origin_place},#{l_screen_size},#{l_gpu_memory_size},#{l_bare_weight},#{l_memory},#{l_cpu},#{l_os},#{l_thickness},#{l_screen_refresh_rate},#{l_stand_by_time},#{l_gpu},#{l_screen_resolution},#{l_hdd},#{l_peculiarity},#{l_color})")
    void insertLaptop(Laptop laptop);

}

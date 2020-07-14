package com.project.digital_store.base;

public enum UserStausEnum {

    已启用(1,"已启用"),
    已禁用(0,"已禁用");

    private Integer code;
    private String name;



    private UserStausEnum(Integer code, String name) {
        this.code=code;
        this.name=name;

    }

    public static String getName(Integer code) {
        UserStausEnum[] values = UserStausEnum.values();
        for(UserStausEnum value:values) {
            if(value.code.equals(code)) {
                return value.name;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

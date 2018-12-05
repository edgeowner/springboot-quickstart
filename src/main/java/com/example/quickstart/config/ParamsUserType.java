package com.example.quickstart.config;


public enum ParamsUserType {
    ENTERPRISE(1, "企业用户"),
    PERSONAL(2, "个人用户");
    private Integer id;
    private String value;

    private Integer code;
    private String name;

    ParamsUserType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ParamsUserType getByCode(Integer code) {
        for (ParamsUserType item : ParamsUserType.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }
}

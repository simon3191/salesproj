package com.dhee.fanmaisystem.entity;

public class Department {
    //小驼峰命名方式 不允许出现基本类型的属性，日期类型用字符串处理
    private Integer dId;
    private String dName;
    private String dPermission;

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dPermission='" + dPermission + '\'' +
                '}';
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdPermission() {
        return dPermission;
    }

    public void setdPermission(String dPermission) {
        this.dPermission = dPermission;
    }
}


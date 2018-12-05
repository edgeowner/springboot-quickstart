package com.example.quickstart.dao.po;

public class UserBasic {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String publicAddr;

    private Byte isDelete;

    public UserBasic(Long id, String name, String email, String phone, String publicAddr, Byte isDelete) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.publicAddr = publicAddr;
        this.isDelete = isDelete;
    }

    public UserBasic() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPublicAddr() {
        return publicAddr;
    }

    public void setPublicAddr(String publicAddr) {
        this.publicAddr = publicAddr;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}
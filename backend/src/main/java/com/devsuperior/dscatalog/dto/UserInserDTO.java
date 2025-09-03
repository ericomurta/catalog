package com.devsuperior.dscatalog.dto;

public class UserInserDTO extends UserDTO{
    private String password;

    UserInserDTO(){
        super();
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

package com.psst.dstkasir.goodjob.mdl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PsstCashier {

    @SerializedName("cashId")
    @Expose
    private Integer cashId;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("doc")
    @Expose
    private String doc;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("pwd")
    @Expose
    private String pwd;

    /**
     * No args constructor for use in serialization
     *
     */
    public PsstCashier() {
    }

    /**
     *
     * @param pwd
     * @param phone
     * @param cashId
     * @param email
     * @param createdAt
     * @param name
     * @param img
     * @param doc
     */
    public PsstCashier(Integer cashId, String createdAt, String doc, String email, String img, String name, String phone, String pwd) {
        super();
        this.cashId = cashId;
        this.createdAt = createdAt;
        this.doc = doc;
        this.email = email;
        this.img = img;
        this.name = name;
        this.phone = phone;
        this.pwd = pwd;
    }

    public Integer getCashId() {
        return cashId;
    }

    public void setCashId(Integer cashId) {
        this.cashId = cashId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

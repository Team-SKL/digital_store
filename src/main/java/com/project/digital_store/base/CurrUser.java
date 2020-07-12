package com.project.digital_store.base;

public class CurrUser {

    private String userId;
    private String userName;
    private String sellerId;
    private String storeName;

    public CurrUser(String userId, String userName, String sellerId, String storeName) {
        this.userId = userId;
        this.userName = userName;
        this.sellerId = sellerId;
        this.storeName = storeName;
    }

    public CurrUser(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getStoreName() {
        return storeName;
    }
}

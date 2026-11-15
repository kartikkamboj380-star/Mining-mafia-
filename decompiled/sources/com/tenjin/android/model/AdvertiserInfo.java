package com.tenjin.android.model;

/* JADX INFO: loaded from: classes3.dex */
public class AdvertiserInfo {
    private String advertisingId;
    private String appSetId;
    private String appSetIdScope;
    private String imei;
    private Boolean isFromLocalStorage;
    private Boolean limitAdTracking;
    private String oaid;

    public String getAdvertisingId() {
        return this.advertisingId;
    }

    public String getAppSetId() {
        return this.appSetId;
    }

    public String getAppSetIdScope() {
        return this.appSetIdScope;
    }

    public String getImei() {
        return this.imei;
    }

    public Boolean getIsFromLocalStorage() {
        return this.isFromLocalStorage;
    }

    public Boolean getLimitAdTracking() {
        return this.limitAdTracking;
    }

    public String getOaid() {
        return this.oaid;
    }

    public void setAdvertisingId(String str) {
        this.advertisingId = str;
    }

    public void setAppSetId(String str) {
        this.appSetId = str;
    }

    public void setAppSetIdScope(String str) {
        this.appSetIdScope = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setIsFromLocalStorage(Boolean bool) {
        this.isFromLocalStorage = bool;
    }

    public void setLimitAdTracking(Boolean bool) {
        this.limitAdTracking = bool;
    }

    public void setOaid(String str) {
        this.oaid = str;
    }
}

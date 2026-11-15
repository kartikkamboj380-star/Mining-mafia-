package com.tenjin.android.store;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class QueueEvent {

    @NonNull
    private Date date;

    @NonNull
    private String endpoint;
    private int id;

    @NonNull
    private Map<String, String> params;

    @NonNull
    public Date getDate() {
        return this.date;
    }

    @NonNull
    public String getEndpoint() {
        return this.endpoint;
    }

    public int getId() {
        return this.id;
    }

    @NonNull
    public Map<String, String> getParams() {
        return this.params;
    }

    public void setDate(@NonNull Date date) {
        this.date = date;
    }

    public void setEndpoint(@NonNull String str) {
        this.endpoint = str;
    }

    public void setId(int i10) {
        this.id = i10;
    }

    public void setParams(@NonNull Map<String, String> map) {
        this.params = map;
    }
}

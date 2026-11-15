package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PAGRequest {
    private Bundle bob = null;
    private String kq;
    private Map<String, Object> oq;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.bob == null) {
            this.bob = new Bundle();
        }
        this.bob.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.kq;
    }

    public Map<String, Object> getExtraInfo() {
        return this.oq;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.bob;
    }

    public void setAdString(String str) {
        this.kq = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.oq = map;
    }
}

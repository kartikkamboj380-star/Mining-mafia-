package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class fou {

    @NonNull
    private com.bytedance.sdk.openadsdk.core.vvw.fou kq = new com.bytedance.sdk.openadsdk.core.vvw.fou();
    private Set<com.bytedance.sdk.openadsdk.core.vvw.nn> oq = new HashSet();

    @NonNull
    public com.bytedance.sdk.openadsdk.core.vvw.fou kq() {
        return this.kq;
    }

    public Set<com.bytedance.sdk.openadsdk.core.vvw.nn> oq() {
        return this.oq;
    }

    public void kq(com.bytedance.sdk.openadsdk.core.vvw.fou fouVar) {
        if (fouVar == null) {
            fouVar = new com.bytedance.sdk.openadsdk.core.vvw.fou();
        }
        this.kq = fouVar;
    }

    public void oq(Set<com.bytedance.sdk.openadsdk.core.vvw.nn> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.oq.addAll(set);
    }

    public void kq(Set<com.bytedance.sdk.openadsdk.core.vvw.nn> set) {
        this.oq = set;
    }

    public void kq(uml umlVar) {
        com.bytedance.sdk.openadsdk.core.vvw.fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.kq(umlVar);
        }
    }
}

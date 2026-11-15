package com.bytedance.adsdk.oq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vvw<V> {
    private final V kq;
    private final Throwable oq;

    public vvw(V v10) {
        this.kq = v10;
        this.oq = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvw)) {
            return false;
        }
        vvw vvwVar = (vvw) obj;
        if (kq() != null && kq().equals(vvwVar.kq())) {
            return true;
        }
        if (oq() == null || vvwVar.oq() == null) {
            return false;
        }
        return oq().toString().equals(oq().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{kq(), oq()});
    }

    public V kq() {
        return this.kq;
    }

    public Throwable oq() {
        return this.oq;
    }

    public vvw(Throwable th) {
        this.oq = th;
        this.kq = null;
    }
}

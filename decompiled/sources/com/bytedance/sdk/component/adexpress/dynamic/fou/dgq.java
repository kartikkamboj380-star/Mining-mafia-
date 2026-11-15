package com.bytedance.sdk.component.adexpress.dynamic.fou;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class dgq {
    public float kq;
    public float oq;

    public dgq(float f10, float f11) {
        this.kq = f10;
        this.oq = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dgq dgqVar = (dgq) obj;
            if (Float.compare(dgqVar.kq, this.kq) == 0 && Float.compare(dgqVar.oq, this.oq) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.kq), Float.valueOf(this.oq)});
    }
}

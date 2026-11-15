package com.bytedance.adsdk.oq.bob;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public class rjo<T> {
    T kq;
    T oq;

    private static boolean oq(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return oq(pair.first, this.kq) && oq(pair.second, this.oq);
    }

    public int hashCode() {
        T t10 = this.kq;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.oq;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public void kq(T t10, T t11) {
        this.kq = t10;
        this.oq = t11;
    }

    public String toString() {
        return "Pair{" + this.kq + " " + this.oq + "}";
    }
}

package com.bytedance.sdk.openadsdk.fou.kq;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    public static ubx kq = new ubx();
    private final Map<String, kq> bob = new HashMap();
    private volatile boolean fou;
    private kq oq;

    public static class kq {
        private final int kq;
        private final int oq;

        public kq(int i10, int i11) {
            this.kq = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.oq = i11 < 10 ? 30 : i11;
        }

        public int kq() {
            return this.kq;
        }

        public int oq() {
            return this.oq;
        }
    }

    private int bob() {
        kq kqVar = this.oq;
        if (kqVar != null) {
            return kqVar.oq();
        }
        return 30;
    }

    private int oq() {
        kq kqVar = this.oq;
        if (kqVar != null) {
            return kqVar.kq();
        }
        return 3;
    }

    public void kq(kq kqVar) {
        this.oq = kqVar;
    }

    public void kq(String str, kq kqVar) {
        if (TextUtils.isEmpty(str) || kqVar == null) {
            return;
        }
        this.bob.put(str, kqVar);
    }

    public int oq(String str) {
        kq kqVar = this.bob.get(str);
        if (kqVar == null) {
            return bob();
        }
        return kqVar.oq();
    }

    public int kq(String str) {
        if (!kq()) {
            return 4;
        }
        kq kqVar = this.bob.get(str);
        if (kqVar == null) {
            return oq();
        }
        return kqVar.kq();
    }

    public boolean kq() {
        return this.fou;
    }

    public void kq(boolean z9) {
        this.fou = z9;
    }
}

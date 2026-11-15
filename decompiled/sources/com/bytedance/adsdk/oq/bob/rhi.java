package com.bytedance.adsdk.oq.bob;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private final String bob;
    public final float kq;
    public final float oq;

    public rhi(String str, float f10, float f11) {
        this.bob = str;
        this.oq = f11;
        this.kq = f10;
    }

    public boolean kq(String str) {
        if (this.bob.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.bob.endsWith("\r")) {
            String str2 = this.bob;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}

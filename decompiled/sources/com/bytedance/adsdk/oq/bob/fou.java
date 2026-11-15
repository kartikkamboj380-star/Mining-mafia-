package com.bytedance.adsdk.oq.bob;

import com.bytedance.adsdk.oq.bob.oq.mxq;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private final double bob;
    private final String csi;
    private final double fou;
    private final List<mxq> kq;
    private final char oq;
    private final String rhi;

    public fou(List<mxq> list, char c10, double d10, double d11, String str, String str2) {
        this.kq = list;
        this.oq = c10;
        this.bob = d10;
        this.fou = d11;
        this.csi = str;
        this.rhi = str2;
    }

    public static int kq(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return kq(this.oq, this.rhi, this.csi);
    }

    public double oq() {
        return this.fou;
    }

    public List<mxq> kq() {
        return this.kq;
    }
}

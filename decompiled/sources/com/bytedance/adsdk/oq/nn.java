package com.bytedance.adsdk.oq;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    private final String bob;
    private final String csi;
    private final int[][] dgq;
    private final String fou;
    private final int kq;
    private final JSONArray nn;
    private final int oq;
    private final String rhi;
    private final List<kq> rjo;
    private final String syt;
    private Bitmap ubx;

    public static class kq {
        public String bob;
        public int csi;
        public String fou;
        public int kq;
        public int oq;
        public int rhi;
        public String rjo;
    }

    public nn(int i10, int i11, String str, String str2, String str3, String str4, List<kq> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.kq = i10;
        this.oq = i11;
        this.bob = str;
        this.fou = str2;
        this.csi = str3;
        this.rhi = str4;
        this.rjo = list;
        this.syt = str5;
        this.dgq = iArr;
        this.nn = jSONArray;
    }

    public List<kq> bob() {
        return this.rjo;
    }

    public String csi() {
        return this.syt;
    }

    public String dgq() {
        return this.fou;
    }

    public String fou() {
        return this.rhi;
    }

    public int kq() {
        return this.kq;
    }

    public String nn() {
        return this.csi;
    }

    public int oq() {
        return this.oq;
    }

    public int[][] rhi() {
        return this.dgq;
    }

    public JSONArray rjo() {
        return this.nn;
    }

    public String syt() {
        return this.bob;
    }

    public Bitmap ubx() {
        return this.ubx;
    }

    public void kq(Bitmap bitmap) {
        this.ubx = bitmap;
    }
}

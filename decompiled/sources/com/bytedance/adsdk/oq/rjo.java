package com.bytedance.adsdk.oq;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private Map<String, List<com.bytedance.adsdk.oq.bob.bob.csi>> bob;
    private Map<String, com.bytedance.adsdk.oq.bob.bob> csi;
    private List<com.bytedance.adsdk.oq.bob.bob.csi> dgq;
    private Map<String, nn> fou;
    private oq gm;
    private bob mxq;
    private Rect nn;
    private List<com.bytedance.adsdk.oq.bob.rhi> rhi;
    private SparseArray<com.bytedance.adsdk.oq.bob.fou> rjo;
    private boolean suf;
    private LongSparseArray<com.bytedance.adsdk.oq.bob.bob.csi> syt;
    private float ubx;
    private float vvw;
    private kq wcx;
    private float wki;
    private final wcx kq = new wcx();
    private final HashSet<String> oq = new HashSet<>();
    private int nze = 0;
    private String sns = "";

    public static class bob {
        public String bob;
        public int[] csi;
        public String fou;
        public int kq;
        public String oq;
        public String rhi;
        public JSONArray rjo;
    }

    public static class kq {
        public Map<String, Object> bob;
        public int csi;
        public int fou;
        public int kq;
        public Map<String, Object> oq;
        public String rhi;
        public JSONArray rjo;
    }

    public static class oq {
        public JSONArray bob;
        public String kq;
        public int[][] oq;
    }

    public wcx bob() {
        return this.kq;
    }

    public float csi() {
        return (long) ((sns() / this.wki) * 1000.0f);
    }

    public String dgq() {
        return this.sns;
    }

    public Rect fou() {
        return this.nn;
    }

    public void kq(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.oq.bob.bob.csi> list, LongSparseArray<com.bytedance.adsdk.oq.bob.bob.csi> longSparseArray, Map<String, List<com.bytedance.adsdk.oq.bob.bob.csi>> map, Map<String, nn> map2, SparseArray<com.bytedance.adsdk.oq.bob.fou> sparseArray, Map<String, com.bytedance.adsdk.oq.bob.bob> map3, List<com.bytedance.adsdk.oq.bob.rhi> list2, bob bobVar, String str, kq kqVar, oq oqVar) {
        this.nn = rect;
        this.ubx = f10;
        this.vvw = f11;
        this.wki = f12;
        this.dgq = list;
        this.syt = longSparseArray;
        this.bob = map;
        this.fou = map2;
        this.rjo = sparseArray;
        this.csi = map3;
        this.rhi = list2;
        this.mxq = bobVar;
        this.sns = str;
        this.wcx = kqVar;
        this.gm = oqVar;
    }

    public Map<String, nn> mxq() {
        return this.fou;
    }

    public oq nn() {
        return this.gm;
    }

    public Map<String, com.bytedance.adsdk.oq.bob.bob> nze() {
        return this.csi;
    }

    public int oq() {
        return this.nze;
    }

    public float rhi() {
        return this.ubx;
    }

    public float rjo() {
        return this.vvw;
    }

    public float sns() {
        return this.vvw - this.ubx;
    }

    public SparseArray<com.bytedance.adsdk.oq.bob.fou> suf() {
        return this.rjo;
    }

    public bob syt() {
        return this.mxq;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.oq.bob.bob.csi> it = this.dgq.iterator();
        while (it.hasNext()) {
            sb.append(it.next().kq("\t"));
        }
        return sb.toString();
    }

    public kq ubx() {
        return this.wcx;
    }

    public float vvw() {
        return this.wki;
    }

    public List<com.bytedance.adsdk.oq.bob.bob.csi> wki() {
        return this.dgq;
    }

    public com.bytedance.adsdk.oq.bob.rhi bob(String str) {
        int size = this.rhi.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.oq.bob.rhi rhiVar = this.rhi.get(i10);
            if (rhiVar.kq(str)) {
                return rhiVar;
            }
        }
        return null;
    }

    public void oq(boolean z9) {
        this.kq.kq(z9);
    }

    public List<com.bytedance.adsdk.oq.bob.bob.csi> oq(String str) {
        return this.bob.get(str);
    }

    public void kq(String str) {
        this.oq.add(str);
    }

    public void kq(boolean z9) {
        this.suf = z9;
    }

    public void kq(int i10) {
        this.nze += i10;
    }

    public boolean kq() {
        return this.suf;
    }

    public com.bytedance.adsdk.oq.bob.bob.csi kq(long j10) {
        return this.syt.get(j10);
    }

    public float kq(float f10) {
        return com.bytedance.adsdk.oq.rhi.csi.kq(this.ubx, this.vvw, f10);
    }
}

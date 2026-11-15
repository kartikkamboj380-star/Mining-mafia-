package com.bytedance.adsdk.ugeno.kq;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private int bob;
    private long csi;
    private int dgq = 1;
    private String fou;
    private Map<String, TreeMap<Float, String>> kq;
    private JSONObject nn;
    private long oq;
    private kq rhi;
    private String rjo;
    private String syt;

    public static class kq {
        public String kq;
        public String oq;
    }

    public long bob() {
        return this.oq;
    }

    public String csi() {
        return this.fou;
    }

    public String dgq() {
        return this.syt;
    }

    public int fou() {
        return this.bob;
    }

    public JSONObject kq() {
        return this.nn;
    }

    public int nn() {
        return this.dgq;
    }

    public Map<String, TreeMap<Float, String>> oq() {
        return this.kq;
    }

    public long rhi() {
        return this.csi;
    }

    public kq rjo() {
        return this.rhi;
    }

    public String syt() {
        return this.rjo;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.kq + ", mDuration=" + this.oq + ", mPlayCount=" + this.bob + ", mPlayDirection=" + this.fou + ", mDelay=" + this.csi + ", mName=" + this.syt + ", mPlayState=" + this.dgq + ", mTransformOrigin='" + this.rhi + "', mTimingFunction='" + this.rjo + "'}";
    }

    public void bob(String str) {
        this.syt = str;
    }

    public void kq(JSONObject jSONObject) {
        this.nn = jSONObject;
    }

    public void oq(long j10) {
        this.csi = j10;
    }

    public void kq(Map<String, TreeMap<Float, String>> map) {
        this.kq = map;
    }

    public void oq(String str) {
        this.rjo = str;
    }

    public void kq(long j10) {
        this.oq = j10;
    }

    public void oq(int i10) {
        this.dgq = i10;
    }

    public void kq(int i10) {
        this.bob = i10;
    }

    public void kq(String str) {
        this.fou = str;
    }

    public void kq(kq kqVar) {
        this.rhi = kqVar;
    }
}

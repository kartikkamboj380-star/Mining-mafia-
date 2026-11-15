package com.bytedance.adsdk.oq.bob.oq;

/* JADX INFO: loaded from: classes.dex */
public class sns implements bob {
    private final com.bytedance.adsdk.oq.bob.kq.syt bob;
    private final boolean fou;
    private final String kq;
    private final int oq;

    public sns(String str, int i10, com.bytedance.adsdk.oq.bob.kq.syt sytVar, boolean z9) {
        this.kq = str;
        this.oq = i10;
        this.bob = sytVar;
        this.fou = z9;
    }

    public boolean bob() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public com.bytedance.adsdk.oq.bob.kq.syt oq() {
        return this.bob;
    }

    public String toString() {
        return "ShapePath{name=" + this.kq + ", index=" + this.oq + '}';
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.wcx(dgqVar, kqVar, this);
    }
}

package com.bytedance.adsdk.oq.bob.oq;

/* JADX INFO: loaded from: classes.dex */
public class dgq implements bob {
    private final boolean bob;
    private final String kq;
    private final kq oq;

    public enum kq {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static kq kq(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public dgq(String str, kq kqVar, boolean z9) {
        this.kq = str;
        this.oq = kqVar;
        this.bob = z9;
    }

    public boolean bob() {
        return this.bob;
    }

    public String kq() {
        return this.kq;
    }

    public kq oq() {
        return this.oq;
    }

    public String toString() {
        return "MergePaths{mode=" + this.oq + '}';
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.vvw(this);
    }
}

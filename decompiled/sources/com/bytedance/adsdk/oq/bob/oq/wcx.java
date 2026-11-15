package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.Paint;
import com.bytedance.adsdk.oq.kq.kq.fax;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wcx implements bob {
    private final List<com.bytedance.adsdk.oq.bob.kq.oq> bob;
    private final com.bytedance.adsdk.oq.bob.kq.fou csi;
    private final float dgq;
    private final com.bytedance.adsdk.oq.bob.kq.kq fou;
    private final String kq;
    private final boolean nn;
    private final com.bytedance.adsdk.oq.bob.kq.oq oq;
    private final com.bytedance.adsdk.oq.bob.kq.oq rhi;
    private final kq rjo;
    private final oq syt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.oq.bob.oq.wcx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;
        static final /* synthetic */ int[] oq;

        static {
            int[] iArr = new int[oq.values().length];
            oq = iArr;
            try {
                iArr[oq.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                oq[oq.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                oq[oq.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[kq.values().length];
            kq = iArr2;
            try {
                iArr2[kq.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kq[kq.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kq[kq.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum kq {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap kq() {
            int i10 = AnonymousClass1.kq[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum oq {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join kq() {
            int i10 = AnonymousClass1.oq[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public wcx(String str, com.bytedance.adsdk.oq.bob.kq.oq oqVar, List<com.bytedance.adsdk.oq.bob.kq.oq> list, com.bytedance.adsdk.oq.bob.kq.kq kqVar, com.bytedance.adsdk.oq.bob.kq.fou fouVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar2, kq kqVar2, oq oqVar3, float f10, boolean z9) {
        this.kq = str;
        this.oq = oqVar;
        this.bob = list;
        this.fou = kqVar;
        this.csi = fouVar;
        this.rhi = oqVar2;
        this.rjo = kqVar2;
        this.syt = oqVar3;
        this.dgq = f10;
        this.nn = z9;
    }

    public com.bytedance.adsdk.oq.bob.kq.fou bob() {
        return this.csi;
    }

    public List<com.bytedance.adsdk.oq.bob.kq.oq> csi() {
        return this.bob;
    }

    public float dgq() {
        return this.dgq;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq fou() {
        return this.rhi;
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new fax(dgqVar, kqVar, this);
    }

    public boolean nn() {
        return this.nn;
    }

    public com.bytedance.adsdk.oq.bob.kq.kq oq() {
        return this.fou;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq rhi() {
        return this.oq;
    }

    public kq rjo() {
        return this.rjo;
    }

    public oq syt() {
        return this.syt;
    }

    public String kq() {
        return this.kq;
    }
}

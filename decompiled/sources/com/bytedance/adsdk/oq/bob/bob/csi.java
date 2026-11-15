package com.bytedance.adsdk.oq.bob.bob;

import com.bytedance.adsdk.oq.bob.kq.ubx;
import com.bytedance.adsdk.oq.bob.kq.vvw;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private final String bob;
    private final kq csi;
    private final vvw dgq;
    private final List<com.bytedance.adsdk.oq.rjo.kq<Float>> fax;
    private final long fou;
    private final com.bytedance.adsdk.oq.bob.kq.oq gm;
    private final boolean jhe;
    private final List<com.bytedance.adsdk.oq.bob.oq.bob> kq;
    private final oq mq;
    private final float mxq;
    private final com.bytedance.adsdk.oq.csi.nn nb;
    private final int nn;
    private final float nze;
    private final com.bytedance.adsdk.oq.rjo oq;
    private final long rhi;
    private final String rjo;
    private final com.bytedance.adsdk.oq.bob.kq.nn sns;
    private final float suf;
    private final List<com.bytedance.adsdk.oq.bob.oq.syt> syt;
    private final int ubx;
    private final com.bytedance.adsdk.oq.bob.oq.kq uml;
    private final int vvw;
    private final ubx wcx;
    private final float wki;

    public enum kq {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum oq {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public csi(List<com.bytedance.adsdk.oq.bob.oq.bob> list, com.bytedance.adsdk.oq.rjo rjoVar, String str, long j10, kq kqVar, long j11, String str2, List<com.bytedance.adsdk.oq.bob.oq.syt> list2, vvw vvwVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.oq.bob.kq.nn nnVar, ubx ubxVar, List<com.bytedance.adsdk.oq.rjo.kq<Float>> list3, oq oqVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar2, boolean z9, com.bytedance.adsdk.oq.bob.oq.kq kqVar2, com.bytedance.adsdk.oq.csi.nn nnVar2) {
        this.kq = list;
        this.oq = rjoVar;
        this.bob = str;
        this.fou = j10;
        this.csi = kqVar;
        this.rhi = j11;
        this.rjo = str2;
        this.syt = list2;
        this.dgq = vvwVar;
        this.nn = i10;
        this.ubx = i11;
        this.vvw = i12;
        this.wki = f10;
        this.suf = f11;
        this.nze = f12;
        this.mxq = f13;
        this.sns = nnVar;
        this.wcx = ubxVar;
        this.fax = list3;
        this.mq = oqVar;
        this.gm = oqVar2;
        this.jhe = z9;
        this.uml = kqVar2;
        this.nb = nnVar2;
    }

    float bob() {
        return this.suf / this.oq.sns();
    }

    public long csi() {
        return this.fou;
    }

    float dgq() {
        return this.mxq;
    }

    ubx fax() {
        return this.wcx;
    }

    List<com.bytedance.adsdk.oq.rjo.kq<Float>> fou() {
        return this.fax;
    }

    com.bytedance.adsdk.oq.bob.kq.nn gm() {
        return this.sns;
    }

    public boolean jhe() {
        return this.jhe;
    }

    com.bytedance.adsdk.oq.rjo kq() {
        return this.oq;
    }

    com.bytedance.adsdk.oq.bob.kq.oq mq() {
        return this.gm;
    }

    int mxq() {
        return this.vvw;
    }

    public com.bytedance.adsdk.oq.csi.nn nb() {
        return this.nb;
    }

    List<com.bytedance.adsdk.oq.bob.oq.syt> nn() {
        return this.syt;
    }

    vvw nze() {
        return this.dgq;
    }

    float oq() {
        return this.wki;
    }

    public String rhi() {
        return this.bob;
    }

    public String rjo() {
        return this.rjo;
    }

    int sns() {
        return this.ubx;
    }

    List<com.bytedance.adsdk.oq.bob.oq.bob> suf() {
        return this.kq;
    }

    float syt() {
        return this.nze;
    }

    public String toString() {
        return kq("");
    }

    public kq ubx() {
        return this.csi;
    }

    public com.bytedance.adsdk.oq.bob.oq.kq uml() {
        return this.uml;
    }

    oq vvw() {
        return this.mq;
    }

    int wcx() {
        return this.nn;
    }

    long wki() {
        return this.rhi;
    }

    public String kq(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(rhi());
        sb.append("\n");
        csi csiVarKq = this.oq.kq(wki());
        if (csiVarKq != null) {
            sb.append("\t\tParents: ");
            sb.append(csiVarKq.rhi());
            csi csiVarKq2 = this.oq.kq(csiVarKq.wki());
            while (csiVarKq2 != null) {
                sb.append("->");
                sb.append(csiVarKq2.rhi());
                csiVarKq2 = this.oq.kq(csiVarKq2.wki());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!nn().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(nn().size());
            sb.append("\n");
        }
        if (wcx() != 0 && sns() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(wcx()), Integer.valueOf(sns()), Integer.valueOf(mxq())));
        }
        if (!this.kq.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.bytedance.adsdk.oq.bob.oq.bob bobVar : this.kq) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(bobVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

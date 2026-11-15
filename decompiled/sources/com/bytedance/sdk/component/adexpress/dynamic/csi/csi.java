package com.bytedance.sdk.component.adexpress.dynamic.csi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.oq.wki;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private com.bytedance.sdk.component.adexpress.dynamic.fou.syt bob;
    private kq fou;
    public com.bytedance.sdk.component.adexpress.dynamic.fou.oq kq;
    protected oq oq;

    static class kq {
        float bob;
        float kq;
        float oq;

        kq() {
        }
    }

    public csi(double d10, int i10, double d11, String str, wki wkiVar) {
        this.oq = new oq(d10, i10, d11, str, wkiVar);
    }

    public void kq(kq kqVar) {
        this.fou = kqVar;
    }

    public void kq() {
        this.oq.kq();
    }

    public void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        if (sytVar != null) {
            this.bob = sytVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar2 = this.bob;
        float fSyt = sytVar2.syt();
        float fDgq = sytVar2.dgq();
        float f12 = TextUtils.equals(sytVar2.nn().csi().ibd(), "fixed") ? fDgq : 65536.0f;
        this.oq.kq();
        this.oq.bob(sytVar2, fSyt, f12);
        oq.bob bobVarKq = this.oq.kq(sytVar2);
        com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVar = new com.bytedance.sdk.component.adexpress.dynamic.fou.oq();
        oqVar.kq = f10;
        oqVar.oq = f11;
        if (bobVarKq != null) {
            fSyt = bobVarKq.kq;
        }
        oqVar.bob = fSyt;
        if (bobVarKq != null) {
            fDgq = bobVarKq.oq;
        }
        oqVar.fou = fDgq;
        oqVar.csi = "root";
        oqVar.dgq = 1280.0f;
        oqVar.rhi = sytVar2;
        sytVar2.bob(f10);
        oqVar.rhi.fou(oqVar.oq);
        oqVar.rhi.csi(oqVar.bob);
        oqVar.rhi.rhi(oqVar.fou);
        com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVarKq = kq(oqVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.kq = oqVarKq;
        kq(oqVarKq);
    }

    public void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVar) {
        if (oqVar == null) {
            return;
        }
        oqVar.rhi.nn().oq();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.oq>> list = oqVar.rjo;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.fou.oq> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.oq> it = list2.iterator();
                while (it.hasNext()) {
                    kq(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0340  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    public com.bytedance.sdk.component.adexpress.dynamic.fou.oq kq(com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVar, float f10) {
        float fKq;
        float fKq2;
        float fKq3;
        float fKq4;
        float f11;
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar = oqVar.rhi;
        if (sytVar != null) {
            sytVar.mq();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> listSns = sytVar.sns();
            if (listSns != null && listSns.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = sytVar.nn().csi();
                float fSns = rhiVarCsi.sns();
                float fMxq = rhiVarCsi.mxq();
                float fSuf = rhiVarCsi.suf();
                float fNze = rhiVarCsi.nze();
                float fVvw = rhiVarCsi.vvw();
                String strWee = rhiVarCsi.wee();
                String strTvh = rhiVarCsi.tvh();
                float f12 = oqVar.kq + fNze;
                float f13 = oqVar.oq + fSns;
                float f14 = (oqVar.bob - fNze) - fMxq;
                float f15 = 2.0f;
                float f16 = fVvw * 2.0f;
                float f17 = f14 - f16;
                float f18 = ((oqVar.fou - fSns) - fSuf) - f16;
                com.bytedance.sdk.component.adexpress.dynamic.fou.dgq dgqVar = new com.bytedance.sdk.component.adexpress.dynamic.fou.dgq(f12, f13);
                if (oqVar.rjo == null) {
                    oqVar.rjo = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> it = listSns.iterator();
                float f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (it.hasNext()) {
                    float f20 = f15;
                    oq.bob bobVarKq = this.oq.kq(it.next());
                    if (bobVarKq != null) {
                        f19 += bobVarKq.oq;
                    }
                    f15 = f20;
                }
                float f21 = f15;
                String str = "space-between";
                String str2 = "space-around";
                int i10 = 1;
                if (f19 >= f18) {
                    fKq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    fKq2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    if (TextUtils.equals(strTvh, "center")) {
                        fKq2 = (f18 - f19) / f21;
                    } else if (TextUtils.equals(strTvh, "flex-end")) {
                        fKq2 = f18 - f19;
                    } else if (TextUtils.equals(strTvh, "space-around")) {
                        fKq2 = nn.kq((f18 - f19) / (listSns.size() + 1));
                        fKq = fKq2;
                    } else {
                        if (!TextUtils.equals(strTvh, "space-between") || listSns.size() <= 1) {
                            fKq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            fKq = nn.kq((f18 - f19) / (listSns.size() - 1));
                        }
                        fKq2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    fKq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                dgqVar.oq += fKq2;
                float f22 = f10;
                int i11 = 0;
                while (i11 < listSns.size()) {
                    List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list = listSns.get(i11);
                    i11++;
                    int i12 = i10;
                    if (i11 >= oqVar.rjo.size()) {
                        int i13 = 0;
                        for (int size = (i11 - oqVar.rjo.size()) + 1; i13 < size; size = size) {
                            oqVar.rjo.add(new ArrayList());
                            i13++;
                        }
                    }
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it2 = list.iterator();
                    float f23 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.fou.syt next = it2.next();
                        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi2 = next.nn().csi();
                        float f24 = f23;
                        String strRs = rhiVarCsi2.rs();
                        float f25 = fKq;
                        int iQip = rhiVarCsi2.qip();
                        f22 = f22;
                        if (TextUtils.equals(strRs, "flex") || iQip == i12 || iQip == 2) {
                            f23 = f24;
                        } else {
                            oq.bob bobVarKq2 = this.oq.kq(next);
                            f23 = bobVarKq2 != null ? f24 + bobVarKq2.kq : f24;
                        }
                        fKq = f25;
                        i12 = 1;
                    }
                    float f26 = fKq;
                    float f27 = f22;
                    float fMax = Math.max(f17 - f23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it3 = list.iterator();
                    float f28 = 0.0f;
                    while (it3.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.fou.syt next2 = it3.next();
                        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi3 = next2.nn().csi();
                        it3 = it3;
                        float f29 = f28;
                        if (rhiVarCsi3.qip() == 1 || rhiVarCsi3.qip() == 2) {
                            f28 = f29;
                        } else {
                            oq.bob bobVarKq3 = this.oq.kq(next2);
                            f28 = bobVarKq3 != null ? f29 + bobVarKq3.kq : f29;
                        }
                    }
                    float f30 = f28;
                    if (f30 >= f17) {
                        fKq3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        fKq4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        if (TextUtils.equals(strWee, "center")) {
                            fKq3 = (f17 - f30) / f21;
                        } else if (TextUtils.equals(strWee, "flex-end")) {
                            fKq3 = f17 - f30;
                        } else if (TextUtils.equals(strWee, str2)) {
                            fKq3 = nn.kq((f17 - f30) / (list.size() + 1));
                            fKq4 = fKq3;
                        } else if (!TextUtils.equals(strWee, str) || list.size() <= 1) {
                            fKq3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            fKq4 = nn.kq((f17 - f30) / (list.size() - 1.0f));
                            fKq3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fKq4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    dgqVar.kq += fKq3;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it4 = list.iterator();
                    float fMax2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (it4.hasNext()) {
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it5 = it4;
                        com.bytedance.sdk.component.adexpress.dynamic.fou.syt next3 = it4.next();
                        float f31 = fKq4;
                        float f32 = this.oq.kq(next3) != null ? this.oq.kq(next3).oq : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi4 = next3.nn().csi();
                        fMax2 = Math.max(fMax2, (rhiVarCsi4.qip() == 1 || rhiVarCsi4.qip() == 2) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f32);
                        it4 = it5;
                        fKq4 = f31;
                    }
                    float f33 = fKq4;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.fou.syt next4 = it6.next();
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it7 = it6;
                        oq.bob bobVarKq4 = this.oq.kq(next4);
                        String str3 = str;
                        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi5 = next4.nn().csi();
                        String str4 = strWee;
                        float fLs = rhiVarCsi5.ls();
                        float fOxe = rhiVarCsi5.oxe();
                        float fRz = rhiVarCsi5.rz();
                        float fPfu = rhiVarCsi5.pfu();
                        float f34 = bobVarKq4 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : bobVarKq4.kq;
                        float f35 = bobVarKq4 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : bobVarKq4.oq;
                        float f36 = f34;
                        float f37 = TextUtils.equals(sytVar.bob(), "root") ? i11 : f27;
                        float f38 = fMax2;
                        com.bytedance.sdk.component.adexpress.dynamic.fou.dgq dgqVarKq = rhiVarCsi5.qip() == 2 ? kq(rhiVarCsi5, this.oq.kq(this.bob), new oq.bob((f36 - fOxe) - fPfu, (f35 - fLs) - fRz)) : rhiVarCsi5.qip() == 1 ? kq(oqVar, rhiVarCsi5, (f36 - fOxe) - fPfu, (f35 - fLs) - fRz) : dgqVar;
                        String strMz = rhiVarCsi.mz();
                        if (f38 <= f35 || TextUtils.equals(strMz, "flex-start")) {
                            f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            strMz.getClass();
                            if (strMz.equals("center")) {
                                f11 = (f38 - f35) / f21;
                            } else if (strMz.equals("flex-end")) {
                                f11 = f38 - f35;
                            } else {
                                f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVar2 = new com.bytedance.sdk.component.adexpress.dynamic.fou.oq();
                        oqVar2.kq = dgqVarKq.kq + fPfu;
                        oqVar2.oq = dgqVarKq.oq + fLs + f11;
                        oqVar2.bob = (f36 - fOxe) - fPfu;
                        oqVar2.fou = (f35 - fLs) - fRz;
                        oqVar2.csi = oqVar.csi + "." + next4.bob();
                        oqVar2.syt = oqVar;
                        oqVar2.rhi = next4;
                        oqVar2.dgq = fMax;
                        oqVar2.nn = list;
                        next4.bob(oqVar2.kq);
                        oqVar2.rhi.fou(oqVar2.oq);
                        oqVar2.rhi.csi(oqVar2.bob);
                        oqVar2.rhi.rhi(oqVar2.fou);
                        oqVar.rjo.get(i11).add(kq(oqVar2, f37));
                        if (rhiVarCsi5.qip() != 1 && rhiVarCsi5.qip() != 2) {
                            dgqVar.kq += f36 + f33;
                        }
                        f27 = f37;
                        strWee = str4;
                        str = str3;
                        fMax2 = f38;
                        f17 = f17;
                        str2 = str2;
                        it6 = it7;
                    }
                    dgqVar.kq = f12;
                    dgqVar.oq += fMax2 + f26;
                    i10 = 1;
                    listSns = listSns;
                    f22 = f27;
                    fKq = f26;
                }
            }
        }
        return oqVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.fou.dgq kq(com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVar, oq.bob bobVar, oq.bob bobVar2) {
        float fNoa = rhiVar.noa();
        float fWxb = rhiVar.wxb();
        float fRao = rhiVar.rao();
        float fRrl = rhiVar.rrl();
        boolean zXk = rhiVar.xk();
        boolean zUi = rhiVar.ui();
        boolean zUaj = rhiVar.uaj();
        boolean zHlh = rhiVar.hlh();
        if (!zXk) {
            if (zUi) {
                float f10 = this.fou.kq;
                fNoa = ((f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f10, bobVar.kq) : bobVar.kq) - fRao) - bobVar2.kq;
            } else {
                fNoa = 0.0f;
            }
        }
        if (!zUaj) {
            if (zHlh) {
                float f11 = this.fou.oq;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = bobVar.oq;
                }
                fWxb = (f11 - fRrl) - bobVar2.oq;
            } else {
                fWxb = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.fou.dgq(fNoa, fWxb);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.fou.dgq kq(com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = oqVar.kq;
        float f15 = oqVar.oq;
        float fNoa = rhiVar.noa();
        float fWxb = rhiVar.wxb();
        float fRao = rhiVar.rao();
        float fRrl = rhiVar.rrl();
        boolean zXk = rhiVar.xk();
        boolean zUi = rhiVar.ui();
        boolean zUaj = rhiVar.uaj();
        boolean zHlh = rhiVar.hlh();
        String strYsx = rhiVar.ysx();
        float f16 = oqVar.bob;
        float f17 = oqVar.fou;
        if (TextUtils.equals(strYsx, "0")) {
            if (zXk) {
                f14 = oqVar.kq + fNoa;
            } else if (zUi) {
                f14 = ((oqVar.kq + f16) - fRao) - f10;
            }
            if (zUaj) {
                f13 = oqVar.oq;
                f15 = f13 + fWxb;
            } else if (zHlh) {
                f12 = oqVar.oq;
                f15 = ((f12 + f17) - fRrl) - f11;
            }
        } else if (TextUtils.equals(strYsx, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
            f14 = oqVar.kq + ((f16 - f10) / 2.0f);
            if (zUaj) {
                f13 = oqVar.oq;
                f15 = f13 + fWxb;
            } else if (zHlh) {
                f12 = oqVar.oq;
                f15 = ((f12 + f17) - fRrl) - f11;
            }
        } else if (TextUtils.equals(strYsx, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            f15 = oqVar.oq + ((f17 - f11) / 2.0f);
            if (zXk) {
                f14 = oqVar.kq + fNoa;
            } else if (zUi) {
                f14 = ((oqVar.kq + f16) - fRao) - f10;
            }
        } else if (TextUtils.equals(strYsx, "3")) {
            f14 = oqVar.kq + ((f16 - f10) / 2.0f);
            f15 = oqVar.oq + ((f17 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.fou.dgq(f14, f15);
    }
}

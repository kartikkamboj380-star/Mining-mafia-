package com.bytedance.sdk.component.adexpress.dynamic.csi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.oq.wki;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private double csi;
    private wki dgq;
    private int rhi;
    private double rjo;
    private String syt;
    public Map<String, bob> kq = new HashMap();
    public Map<String, bob> oq = new HashMap();
    public Map<String, bob> bob = new HashMap();
    private double fou = Math.random();

    static class bob {
        float kq;
        float oq;

        public bob() {
        }

        public String toString() {
            return "UnitSize{width=" + this.kq + ", height=" + this.oq + '}';
        }

        public bob(float f10, float f11) {
            this.kq = f10;
            this.oq = f11;
        }
    }

    static class kq implements Cloneable {
        float bob;
        float kq;
        boolean oq;

        kq() {
        }

        public Object clone() {
            try {
                return (kq) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.csi.oq$oq, reason: collision with other inner class name */
    static class C0236oq {
        int bob;
        float csi;
        double fou;
        float kq;
        int oq;

        C0236oq() {
        }

        static JSONObject kq(C0236oq c0236oq) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0236oq.kq);
                jSONObject.put("letterSpacing", c0236oq.oq);
                jSONObject.put("lineHeight", c0236oq.fou);
                jSONObject.put("maxWidth", c0236oq.csi);
                jSONObject.put("fontWeight", c0236oq.bob);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public oq(double d10, int i10, double d11, String str, wki wkiVar) {
        this.csi = d10;
        this.rhi = i10;
        this.rjo = d11;
        this.syt = str;
        this.dgq = wkiVar;
    }

    private bob csi(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        String str = sytVar.bob() + "_" + f10 + "_" + f11;
        if (this.bob.containsKey(str)) {
            return this.bob.get(str);
        }
        bob bobVarRhi = rhi(sytVar, f10, f11);
        this.bob.put(str, bobVarRhi);
        return bobVarRhi;
    }

    private bob rhi(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        new bob();
        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = sytVar.nn().csi();
        sytVar.nn().bob();
        rhiVarCsi.pms();
        float fWcx = rhiVarCsi.wcx();
        int iJq = rhiVarCsi.jq();
        double dYe = rhiVarCsi.ye();
        int iXp = rhiVarCsi.xp();
        boolean zWbn = rhiVarCsi.wbn();
        boolean zEa = rhiVarCsi.ea();
        int iSyw = rhiVarCsi.syw();
        C0236oq c0236oq = new C0236oq();
        c0236oq.kq = fWcx;
        c0236oq.oq = iJq;
        c0236oq.bob = iXp;
        c0236oq.fou = dYe;
        c0236oq.csi = f10;
        return kq(sytVar.nn().bob(), c0236oq, zWbn, zEa, iSyw, sytVar);
    }

    public bob bob(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        if (sytVar == null) {
            return null;
        }
        bob bobVarKq = kq(sytVar);
        if (bobVarKq != null && (bobVarKq.kq != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || bobVarKq.oq != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return bobVarKq;
        }
        bob bobVarFou = fou(sytVar, f10, f11);
        kq(sytVar, bobVarFou);
        return bobVarFou;
    }

    public bob fou(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        bob bobVar = new bob();
        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bobVar.kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bobVar.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return bobVar;
        }
        if (sytVar.wcx()) {
            return kq(sytVar, f10, f11);
        }
        float fSyt = sytVar.syt();
        float fDgq = sytVar.dgq();
        float fNze = sytVar.nze();
        float fMxq = sytVar.mxq();
        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = sytVar.nn().csi();
        String strRs = rhiVarCsi.rs();
        String strIbd = rhiVarCsi.ibd();
        float fMin2 = ((TextUtils.equals(strRs, "flex") || TextUtils.equals(strRs, "auto")) ? f10 : Math.min(fSyt, f10)) - fNze;
        if (TextUtils.equals(strIbd, "scale")) {
            fMin = Math.round(fMin2 / fDgq) + fMxq;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fMxq) * fDgq);
            }
        } else {
            fMin = (TextUtils.equals(strIbd, "auto") || TextUtils.equals(strIbd, "flex")) ? f11 : Math.min(fDgq, f11);
        }
        float f15 = fMin - fMxq;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> listSns = sytVar.sns();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list : listSns) {
            float f16 = f14;
            float f17 = fNze;
            bob bobVarOq = oq(list, fMin2, f15);
            if (oq(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, bobVarOq.kq);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = sytVar.nn().oq().equals("carousel") ? Math.max(sytVar.dgq(), bobVarOq.oq) : fMax2 + bobVarOq.oq;
            fNze = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fNze;
        if (!TextUtils.equals(strRs, "auto")) {
            f12 = f21;
        } else if (f20 == listSns.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list2 : listSns) {
                bob(list2);
                oq(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strIbd, "auto")) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                kq(listSns, f12, f15);
            }
        } else if ((TextUtils.equals(strIbd, "fixed") || TextUtils.equals(strIbd, "flex")) && f15 < fMax2) {
            kq(listSns, f12, f15);
        }
        bobVar.kq = Math.min(f12 + f22, f10);
        bobVar.oq = Math.min(f15 + fMxq, f11);
        return bobVar;
    }

    public bob kq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(sytVar.nn().bob()) && sytVar.nn().csi().qdf() == null) {
            return new bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (TextUtils.equals(sytVar.nn().oq(), "creative-playable-bait")) {
            return new bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float fSyt = sytVar.syt();
        float fDgq = sytVar.dgq();
        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = sytVar.nn().csi();
        String strRs = rhiVarCsi.rs();
        String strIbd = rhiVarCsi.ibd();
        float fWki = sytVar.wki();
        float fSuf = sytVar.suf();
        float fNze = sytVar.nze();
        float fMxq = sytVar.mxq();
        if (TextUtils.equals(strRs, "fixed")) {
            f10 = Math.min(fSyt, f10);
            if (TextUtils.equals(strIbd, "auto")) {
                f12 = oq(sytVar, f10 - fNze, f11 - fMxq).oq;
                fDgq = f12 + fMxq;
            }
        } else if (TextUtils.equals(strRs, "auto")) {
            bob bobVarOq = oq(sytVar, f10 - fNze, f11 - fMxq);
            f10 = bobVarOq.kq + fNze;
            if (TextUtils.equals(strIbd, "auto")) {
                f12 = bobVarOq.oq;
                fDgq = f12 + fMxq;
            }
        } else if (!TextUtils.equals(strRs, "flex")) {
            f10 = fSyt;
        } else if (TextUtils.equals(strIbd, "auto")) {
            f12 = oq(sytVar, f10 - fNze, f11 - fMxq).oq;
            fDgq = f12 + fMxq;
        }
        if (TextUtils.equals(strIbd, "scale")) {
            float fRound = Math.round((f10 - fWki) / fDgq) + fSuf;
            if (fRound > f11) {
                f10 = Math.round((f11 - fSuf) * fDgq) + fWki;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strIbd, "fixed")) {
            f11 = Math.min(fDgq + fSuf, f11);
        } else if (!TextUtils.equals(strIbd, "flex")) {
            f11 = fDgq;
        }
        bob bobVar = new bob();
        bobVar.kq = f10;
        bobVar.oq = f11;
        return bobVar;
    }

    public bob oq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, float f10, float f11) {
        bob bobVar = new bob();
        if (sytVar.nn().csi() == null) {
            return bobVar;
        }
        bob bobVarCsi = csi(sytVar, f10, f11);
        float f12 = bobVarCsi.kq;
        float f13 = bobVarCsi.oq;
        bobVar.kq = Math.min(f12, f10);
        bobVar.oq = Math.min(f13, f11);
        return bobVar;
    }

    private bob bob(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list, float f10, float f11) {
        float fMax;
        fou(list);
        bob bobVar = new bob();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = sytVar.nn().csi();
            if (rhiVarCsi.qip() == 1 || rhiVarCsi.qip() == 2) {
                arrayList.add(sytVar);
            }
            if (rhiVarCsi.qip() != 1 && rhiVarCsi.qip() != 2) {
                arrayList2.add(sytVar);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bob((com.bytedance.sdk.component.adexpress.dynamic.fou.syt) obj, f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return bobVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            arrayList3.add(Float.valueOf(bob((com.bytedance.sdk.component.adexpress.dynamic.fou.syt) obj2, f10, f11).kq));
        }
        List<kq> arrayList4 = new ArrayList<>();
        int i12 = 0;
        while (true) {
            int size3 = arrayList2.size();
            fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i12 >= size3) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar2 = (com.bytedance.sdk.component.adexpress.dynamic.fou.syt) arrayList2.get(i12);
            String strRs = sytVar2.nn().csi().rs();
            float fSyt = sytVar2.syt();
            boolean zEquals = TextUtils.equals(strRs, "flex");
            if (TextUtils.equals(strRs, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> listSns = sytVar2.sns();
                if (listSns == null || listSns.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> it = listSns.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (oq(it.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            kq kqVar = new kq();
            if (!zEquals) {
                fSyt = ((Float) arrayList3.get(i12)).floatValue();
            }
            kqVar.kq = fSyt;
            kqVar.oq = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i12)).floatValue();
            }
            kqVar.bob = fMax;
            arrayList4.add(kqVar);
            i12++;
        }
        kq(arrayList4, f10, arrayList2);
        List<kq> listKq = nn.kq(f10, arrayList4);
        float f12 = 0.0f;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            f12 += listKq.get(i13).kq;
            if (((Float) arrayList3.get(i13)).floatValue() != listKq.get(i13).kq) {
                fou((com.bytedance.sdk.component.adexpress.dynamic.fou.syt) arrayList2.get(i13));
            }
        }
        int size4 = arrayList2.size();
        int i14 = 0;
        boolean z9 = false;
        int i15 = 0;
        while (i15 < size4) {
            Object obj3 = arrayList2.get(i15);
            i15++;
            i14++;
            if (!oq((com.bytedance.sdk.component.adexpress.dynamic.fou.syt) obj3)) {
                z9 = false;
                break;
            }
            if (i14 == arrayList2.size()) {
                z9 = true;
            }
        }
        if (z9) {
            fMax = f11;
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar3 = (com.bytedance.sdk.component.adexpress.dynamic.fou.syt) arrayList2.get(i16);
            bob bobVarBob = bob(sytVar3, listKq.get(i16).kq, f11);
            if (!oq(sytVar3)) {
                fMax = Math.max(fMax, bobVarBob.oq);
            }
            arrayList5.add(bobVarBob);
        }
        ArrayList arrayList6 = new ArrayList();
        int size5 = arrayList5.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            arrayList6.add(Float.valueOf(((bob) obj4).oq));
        }
        if (!z9) {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar4 = (com.bytedance.sdk.component.adexpress.dynamic.fou.syt) arrayList2.get(i18);
                if (oq(sytVar4) && ((Float) arrayList6.get(i18)).floatValue() != fMax) {
                    fou(sytVar4);
                    bob(sytVar4, listKq.get(i18).kq, fMax);
                }
            }
        }
        bobVar.kq = f12;
        bobVar.oq = fMax;
        return bobVar;
    }

    private boolean oq(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> listSns;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().nn().csi().rs(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z9 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar : list) {
                if (TextUtils.equals(sytVar.nn().csi().rs(), "auto") && (listSns = sytVar.sns()) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> it2 = listSns.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> next = it2.next();
                            i10++;
                            if (oq(next)) {
                                if (i10 == next.size()) {
                                    z9 = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z9;
        }
    }

    private String csi(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        return sytVar.bob();
    }

    private bob oq(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list, float f10, float f11) {
        bob bobVarKq = kq(list);
        if (bobVarKq != null && (bobVarKq.kq != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || bobVarKq.oq != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return bobVarKq;
        }
        bob bobVarBob = bob(list, f10, f11);
        kq(list, bobVarBob);
        return bobVarBob;
    }

    private boolean oq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        if (sytVar == null) {
            return false;
        }
        if (TextUtils.equals(sytVar.nn().csi().ibd(), "flex")) {
            return true;
        }
        return bob(sytVar);
    }

    private bob kq(String str, C0236oq c0236oq, boolean z9, boolean z10, int i10, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        return ubx.kq(str, sytVar.nn().oq(), C0236oq.kq(c0236oq).toString(), z9, z10, i10, sytVar, this.csi, this.rhi, this.rjo, this.syt, this.dgq);
    }

    private void kq(List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (kq(it.next(), false)) {
                z9 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list2 : list) {
            kq kqVar = new kq();
            boolean zKq = kq(list2, !z9);
            kqVar.kq = zKq ? 1.0f : oq(list2, f10, f11).oq;
            kqVar.oq = !zKq;
            arrayList.add(kqVar);
        }
        List<kq> listKq = nn.kq(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((kq) arrayList.get(i10)).kq != listKq.get(i10).kq) {
                List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list3 = list.get(i10);
                bob(list3);
                oq(list3, f10, listKq.get(i10).kq);
            }
        }
    }

    private void fou(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        this.kq.remove(csi(sytVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> listSns = sytVar.sns();
        if (listSns == null || listSns.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> it = listSns.iterator();
        while (it.hasNext()) {
            bob(it.next());
        }
    }

    private String fou(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strBob = list.get(i10).bob();
            if (i10 < list.size() - 1) {
                sb.append(strBob);
                sb.append("-");
            } else {
                sb.append(strBob);
            }
        }
        return sb.toString();
    }

    private boolean kq(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list, boolean z9) {
        for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = sytVar.nn().csi();
            String strIbd = rhiVarCsi.ibd();
            if (TextUtils.equals(strIbd, "flex") || (z9 && ((TextUtils.equals(rhiVarCsi.rs(), "flex") && TextUtils.equals(rhiVarCsi.ibd(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.fou.csi.kq.get(sytVar.nn().oq()).intValue() == 7) || TextUtils.equals(strIbd, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it = list.iterator();
        while (it.hasNext()) {
            if (bob(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean bob(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> listSns;
        if (!sytVar.wcx() && TextUtils.equals(sytVar.nn().csi().ibd(), "auto") && (listSns = sytVar.sns()) != null && listSns.size() > 0) {
            if (listSns.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it = listSns.get(0).iterator();
                while (it.hasNext()) {
                    if (!oq(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>> it2 = listSns.iterator();
            while (it2.hasNext()) {
                if (kq(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void kq(List<kq> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list2) {
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (kq kqVar : list) {
            if (kqVar.oq) {
                f11 += kqVar.kq;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).oq && list2.get(i11).jhe()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    kq kqVar2 = list.get(i12);
                    if (kqVar2.oq && list2.get(i12).jhe()) {
                        kqVar2.kq -= fCeil;
                    }
                }
            }
        }
    }

    private void bob(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.oq.remove(fou(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it = list.iterator();
        while (it.hasNext()) {
            fou(it.next());
        }
    }

    public void kq() {
        this.bob.clear();
        this.kq.clear();
        this.oq.clear();
    }

    public bob kq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        return this.kq.get(csi(sytVar));
    }

    public bob kq(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list) {
        return this.oq.get(fou(list));
    }

    private void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, bob bobVar) {
        this.kq.put(csi(sytVar), bobVar);
    }

    private void kq(List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> list, bob bobVar) {
        this.oq.put(fou(list), bobVar);
    }
}

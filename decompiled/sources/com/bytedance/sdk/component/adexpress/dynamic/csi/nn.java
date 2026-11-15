package com.bytedance.sdk.component.adexpress.dynamic.csi;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    public static float kq(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<oq.kq> kq(float f10, List<oq.kq> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<oq.kq> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((oq.kq) it.next().clone());
        }
        int size = arrayList.size();
        boolean z9 = true;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            oq.kq kqVar = (oq.kq) obj;
            if (kqVar.oq) {
                i10 = (int) (i10 + kqVar.kq);
            } else {
                i11 = (int) (i11 + kqVar.kq);
                z9 = false;
            }
        }
        if (!z9 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                boolean z10 = false;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    oq.kq kqVar2 = (oq.kq) obj2;
                    if (!kqVar2.oq) {
                        float f14 = kqVar2.bob;
                        if (f14 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && kqVar2.kq * f13 > f14) {
                            kqVar2.kq = f14;
                            kqVar2.oq = true;
                            z10 = true;
                        }
                    }
                    arrayList2.add(kqVar2);
                }
                if (z10) {
                    return kq(f10, arrayList2);
                }
            }
            int size3 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                oq.kq kqVar3 = (oq.kq) obj3;
                if (kqVar3.oq) {
                    kqVar3.kq = kq(kqVar3.kq * f12);
                } else {
                    kqVar3.kq = kq(kqVar3.kq * f13);
                }
                i14 = (int) (i14 + kqVar3.kq);
            }
            float f15 = i14;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size4 = 0; size4 < arrayList.size() && f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT; size4 = (size4 + 1) % arrayList.size()) {
                    oq.kq kqVar4 = (oq.kq) arrayList.get(size4);
                    if ((f10 < f11 && kqVar4.oq) || (f10 > f11 && !kqVar4.oq)) {
                        kqVar4.kq += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}

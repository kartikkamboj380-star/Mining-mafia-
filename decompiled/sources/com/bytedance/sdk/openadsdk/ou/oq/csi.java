package com.bytedance.sdk.openadsdk.ou.oq;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ha;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.wol;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static final Map<Integer, oq> kq = new ConcurrentHashMap();

    public static class kq {
        public int kq;
        public int oq = -1;

        public kq(int i10) {
            this.kq = i10;
        }
    }

    private static boolean bob(uml umlVar) {
        if (umlVar == null) {
            return false;
        }
        String strKq = wol.kq(umlVar);
        return ((!"open_ad".equals(strKq) && !"fullscreen_interstitial_ad".equals(strKq) && !"rewarded_video".equals(strKq)) || ha.oq(umlVar) || umlVar.ui() == 5 || umlVar.ui() == 33 || !uml.csi(umlVar) || umlVar.job() == null) ? false : true;
    }

    public static void kq(View view, uml umlVar, kq kqVar) {
        if (view == null || umlVar == null || umlVar.hcm()) {
            return;
        }
        boolean zBob = bob(umlVar);
        if (ha.oq(umlVar) && kqVar != null) {
            kqVar.kq = -1;
        }
        kq(kq(view, umlVar, zBob, kqVar));
    }

    public static void oq(Integer num) {
        kq.remove(num);
    }

    public static Integer oq(uml umlVar) {
        return Integer.valueOf((umlVar.jp() + umlVar.dra()).hashCode());
    }

    private static oq kq(View view, uml umlVar, boolean z9, kq kqVar) {
        if (view == null || umlVar == null || umlVar.dra() == null) {
            return null;
        }
        Integer numOq = oq(umlVar);
        Map<Integer, oq> map = kq;
        if (map.containsKey(numOq)) {
            oq oqVar = map.get(numOq);
            if (oqVar != null) {
                oqVar.kq(view);
            }
            return oqVar;
        }
        oq oqVarKq = oq.kq(z9, numOq, view, umlVar, kqVar);
        map.put(numOq, oqVarKq);
        return oqVarKq;
    }

    private static void kq(oq oqVar) {
        if (oqVar == null) {
            return;
        }
        oqVar.kq();
    }

    public static void kq(uml umlVar, int i10) {
        if (umlVar == null || umlVar.dra() == null) {
            return;
        }
        kq(kq.get(oq(umlVar)), i10);
    }

    public static void kq(oq oqVar, int i10) {
        if (oqVar == null) {
            return;
        }
        oqVar.kq(i10);
    }

    public static void kq(uml umlVar) {
        if (umlVar == null || umlVar.dra() == null) {
            return;
        }
        Integer numOq = oq(umlVar);
        Map<Integer, oq> map = kq;
        oq oqVar = map.get(numOq);
        if (oqVar != null) {
            oqVar.nn();
        }
        oq(numOq);
        if (map.size() <= 0) {
            rjo.kq();
        }
    }

    public static oq kq(Integer num) {
        return kq.get(num);
    }
}

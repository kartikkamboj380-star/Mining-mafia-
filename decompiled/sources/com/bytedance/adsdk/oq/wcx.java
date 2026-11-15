package com.bytedance.adsdk.oq;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class wcx {
    private boolean kq = false;
    private final Set<Object> oq = new kq();
    private final Map<String, com.bytedance.adsdk.oq.rhi.fou> bob = new HashMap();
    private final Comparator<Pair<String, Float>> fou = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.oq.wcx.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    void kq(boolean z9) {
        this.kq = z9;
    }

    public void kq(String str, float f10) {
        if (this.kq) {
            com.bytedance.adsdk.oq.rhi.fou fouVar = this.bob.get(str);
            if (fouVar == null) {
                fouVar = new com.bytedance.adsdk.oq.rhi.fou();
                this.bob.put(str, fouVar);
            }
            fouVar.kq(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.oq.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public final class zaad {
    private final Map zaa = Collections.synchronizedMap(new WeakHashMap());
    private final Map zab = Collections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z9, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.zaa) {
            map = new HashMap(this.zaa);
        }
        synchronized (this.zab) {
            map2 = new HashMap(this.zab);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C7094k) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    final void zac(BasePendingResult basePendingResult, boolean z9) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z9));
        basePendingResult.addStatusListener(new C1422c(this, basePendingResult));
    }

    final void zad(C7094k c7094k, boolean z9) {
        this.zab.put(c7094k, Boolean.valueOf(z9));
        c7094k.a().addOnCompleteListener(new C1423d(this, c7094k));
    }

    final void zae(int i10, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        zah(true, new Status(20, sb.toString()));
    }

    public final void zaf() {
        zah(false, GoogleApiManager.zaa);
    }

    final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}

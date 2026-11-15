package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class H implements Comparator {
    H() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        Q q11 = (Q) obj2;
        G g10 = new G(q10);
        G g11 = new G(q11);
        while (g10.hasNext() && g11.hasNext()) {
            int iCompareTo = Integer.valueOf(g10.zza() & 255).compareTo(Integer.valueOf(g11.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(q10.d()).compareTo(Integer.valueOf(q11.d()));
    }
}

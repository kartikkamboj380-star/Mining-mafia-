package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6090h0 implements Comparator {
    C6090h0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC6117q0 abstractC6117q0 = (AbstractC6117q0) obj;
        AbstractC6117q0 abstractC6117q1 = (AbstractC6117q0) obj2;
        C6087g0 c6087g0 = new C6087g0(abstractC6117q0);
        C6087g0 c6087g1 = new C6087g0(abstractC6117q1);
        while (c6087g0.hasNext() && c6087g1.hasNext()) {
            int iCompareTo = Integer.valueOf(c6087g0.zza() & 255).compareTo(Integer.valueOf(c6087g1.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC6117q0.d()).compareTo(Integer.valueOf(abstractC6117q1.d()));
    }
}

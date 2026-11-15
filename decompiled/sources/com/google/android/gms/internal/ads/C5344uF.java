package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5344uF implements OG, InterfaceC5472vG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3502fb0 f33758a;

    public C5344uF(Context context, C3502fb0 c3502fb0, C5544vq c5544vq) {
        this.f33758a = c3502fb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void P(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void e(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void h(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        C5670wq c5670wq = this.f33758a.f28402d0;
        if (c5670wq == null || !c5670wq.f34633a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = c5670wq.f34634b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}

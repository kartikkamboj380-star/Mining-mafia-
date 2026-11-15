package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3345eM implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f27763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f27764b;

    /* synthetic */ C3345eM(C3723hM c3723hM, View view, byte[] bArr) {
        this.f27763a = new WeakReference(c3723hM);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.te)).booleanValue()) {
            this.f27764b = new WeakReference(view);
        } else {
            this.f27764b = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        C3723hM c3723hM = (C3723hM) this.f27763a.get();
        if (c3723hM == null) {
            return;
        }
        c3723hM.w().zza();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.te)).booleanValue()) {
            c3723hM.v((View) this.f27764b.get());
        }
    }
}

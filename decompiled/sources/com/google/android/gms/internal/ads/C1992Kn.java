package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1992Kn implements InterfaceC2783Zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2044Ln f20275a;

    C1992Kn(C2044Ln c2044Ln) {
        Objects.requireNonNull(c2044Ln);
        this.f20275a = c2044Ln;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2783Zt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final InterfaceC3651gn interfaceC3651gn = (InterfaceC3651gn) obj;
        AbstractC2315Qt.f22478f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Jn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                AbstractC0786o0.k("maybeDestroy > Destroying engine.");
                InterfaceC3651gn interfaceC3651gn2 = interfaceC3651gn;
                interfaceC3651gn2.w0("/result", AbstractC2040Ll.f20649o);
                interfaceC3651gn2.d();
            }
        });
    }
}

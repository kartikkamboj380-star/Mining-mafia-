package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;

/* JADX INFO: loaded from: classes2.dex */
public final class RW implements OG, InterfaceC3082cG {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22829c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22830d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0790q0 f22831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2991bX f22832b;

    public RW(C2991bX c2991bX, InterfaceC0790q0 interfaceC0790q0) {
        this.f22832b = c2991bX;
        this.f22831a = interfaceC0790q0;
    }

    private final void a(boolean z9) {
        int i10;
        int iIntValue;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29822f7)).booleanValue() && !this.f22831a.v()) {
            Object obj = f22829c;
            synchronized (obj) {
                i10 = f22830d;
                iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f29833g7)).intValue();
            }
            if (i10 < iIntValue) {
                this.f22832b.b(z9);
                synchronized (obj) {
                    f22830d++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(H4.Z0 z9) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        a(true);
    }
}

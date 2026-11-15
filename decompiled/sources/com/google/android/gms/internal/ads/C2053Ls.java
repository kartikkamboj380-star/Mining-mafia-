package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import K4.InterfaceC0790q0;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2053Ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0790q0 f20679a;

    C2053Ls(Clock clock, InterfaceC0790q0 interfaceC0790q0, C2521Us c2521Us) {
        this.f20679a = interfaceC0790q0;
    }

    public final void a(int i10, long j10) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29761a1)).booleanValue()) {
            return;
        }
        InterfaceC0790q0 interfaceC0790q0 = this.f20679a;
        if (j10 - interfaceC0790q0.t() < 0) {
            AbstractC0786o0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29772b1)).booleanValue()) {
            interfaceC0790q0.K0(i10);
            interfaceC0790q0.I0(j10);
        } else {
            interfaceC0790q0.K0(-1);
            interfaceC0790q0.I0(j10);
        }
    }
}

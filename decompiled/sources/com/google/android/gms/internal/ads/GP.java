package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import H4.InterfaceC0600g1;
import K4.AbstractC0786o0;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class GP extends B4.w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OM f19039a;

    public GP(OM om) {
        this.f19039a = om;
    }

    private static InterfaceC0600g1 f(OM om) {
        InterfaceC0591d1 interfaceC0591d1L0 = om.l0();
        if (interfaceC0591d1L0 == null) {
            return null;
        }
        try {
            return interfaceC0591d1L0.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // B4.w.a
    public final void a() {
        InterfaceC0600g1 interfaceC0600g1F = f(this.f19039a);
        if (interfaceC0600g1F == null) {
            return;
        }
        try {
            interfaceC0600g1F.c();
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // B4.w.a
    public final void c() {
        InterfaceC0600g1 interfaceC0600g1F = f(this.f19039a);
        if (interfaceC0600g1F == null) {
            return;
        }
        try {
            interfaceC0600g1F.zzg();
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // B4.w.a
    public final void e() {
        InterfaceC0600g1 interfaceC0600g1F = f(this.f19039a);
        if (interfaceC0600g1F == null) {
            return;
        }
        try {
            interfaceC0600g1F.zze();
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Unable to call onVideoEnd()", e10);
        }
    }
}

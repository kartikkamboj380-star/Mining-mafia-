package com.google.android.gms.internal.ads;

import B4.C0564a;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2201Oo implements N4.l, N4.r, N4.u, N4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1578Co f21672a;

    public C2201Oo(InterfaceC1578Co interfaceC1578Co) {
        this.f21672a = interfaceC1578Co;
    }

    @Override // N4.r, N4.y, N4.i
    public final void a(C0564a c0564a) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdFailedToShow.");
        int iA = c0564a.a();
        String strC = c0564a.c();
        String strB = c0564a.b();
        int length = String.valueOf(iA).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(strC).length() + 16 + String.valueOf(strB).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(iA);
        sb.append(". Error Message = ");
        sb.append(strC);
        sb.append(" Error Domain = ");
        sb.append(strB);
        L4.p.f(sb.toString());
        try {
            this.f21672a.w1(c0564a.d());
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.l, N4.r
    public final void b() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdLeftApplication.");
        try {
            this.f21672a.c();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void g() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called reportAdImpression.");
        try {
            this.f21672a.zzk();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void h() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called reportAdClicked.");
        try {
            this.f21672a.zze();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdClosed.");
        try {
            this.f21672a.b();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdOpened.");
        try {
            this.f21672a.zzi();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }
}

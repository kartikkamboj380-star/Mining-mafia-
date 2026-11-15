package com.google.android.gms.internal.ads;

import B4.C0564a;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5170ss implements N4.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1578Co f33244a;

    public C5170ss(InterfaceC1578Co interfaceC1578Co) {
        this.f33244a = interfaceC1578Co;
    }

    @Override // N4.y, N4.i
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
            this.f33244a.w1(c0564a.d());
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.y
    public final void c(U4.b bVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onUserEarnedReward.");
        try {
            this.f33244a.O4(new BinderC5296ts(bVar));
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.y
    public final void d() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onVideoComplete.");
        try {
            this.f33244a.g();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.y
    public final void e(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdFailedToShow.");
        L4.p.f("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f33244a.b0(str);
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.y
    public final void f() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onVideoStart.");
        try {
            this.f33244a.zzo();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void g() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called reportAdImpression.");
        try {
            this.f33244a.zzk();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void h() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called reportAdClicked.");
        try {
            this.f33244a.zze();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdClosed.");
        try {
            this.f33244a.b();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.InterfaceC0821c
    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onAdOpened.");
        try {
            this.f33244a.zzi();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // N4.y
    public final void onUserEarnedReward() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        L4.p.a("Adapter called onUserEarnedReward.");
        try {
            this.f33244a.m();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }
}

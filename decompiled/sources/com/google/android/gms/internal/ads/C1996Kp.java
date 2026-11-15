package com.google.android.gms.internal.ads;

import B4.C0564a;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1996Kp implements N4.l, N4.r, N4.y, N4.u, N4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC1578Co f20281a;

    C1996Kp(InterfaceC1578Co interfaceC1578Co) {
        this.f20281a = interfaceC1578Co;
    }

    @Override // N4.r, N4.y, N4.i
    public final void a(C0564a c0564a) {
        try {
            int iA = c0564a.a();
            String strC = c0564a.c();
            String strB = c0564a.b();
            StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 59 + String.valueOf(strC).length() + 16 + String.valueOf(strB).length());
            sb.append("Mediated ad failed to show: Error Code = ");
            sb.append(iA);
            sb.append(". Error Message = ");
            sb.append(strC);
            sb.append(" Error Domain = ");
            sb.append(strB);
            L4.p.f(sb.toString());
            this.f20281a.w1(c0564a.d());
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.l, N4.r
    public final void b() {
        try {
            this.f20281a.c();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.y
    public final void c(U4.b bVar) {
        try {
            this.f20281a.O4(new BinderC5296ts(bVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.y
    public final void d() {
        try {
            this.f20281a.zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.y
    public final void e(String str) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("Mediated ad failed to show: ");
            sb.append(str);
            L4.p.f(sb.toString());
            this.f20281a.b0(str);
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.y
    public final void f() {
        try {
            this.f20281a.zzo();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.InterfaceC0821c
    public final void g() {
        try {
            this.f20281a.zzk();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.InterfaceC0821c
    public final void h() {
        try {
            this.f20281a.zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.InterfaceC0821c
    public final void onAdClosed() {
        try {
            this.f20281a.b();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.InterfaceC0821c
    public final void onAdOpened() {
        try {
            this.f20281a.zzi();
        } catch (RemoteException unused) {
        }
    }

    @Override // N4.y
    public final void onUserEarnedReward() {
        try {
            this.f20281a.m();
        } catch (RemoteException unused) {
        }
    }
}

package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import K4.AbstractC0786o0;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4941r20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5571w20 f32767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0582a1 f32769c;

    public C4941r20(InterfaceC5571w20 interfaceC5571w20, String str) {
        this.f32767a = interfaceC5571w20;
        this.f32768b = str;
    }

    public final synchronized boolean a() {
        return this.f32767a.zzb();
    }

    public final synchronized void b(H4.h2 h2Var, int i10) {
        this.f32769c = null;
        C5697x20 c5697x20 = new C5697x20(i10);
        C4690p20 c4690p20 = new C4690p20(this);
        this.f32767a.a(h2Var, this.f32768b, c5697x20, c4690p20);
    }

    public final synchronized String c() {
        InterfaceC0582a1 interfaceC0582a1;
        try {
            interfaceC0582a1 = this.f32769c;
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
            return null;
        }
        return interfaceC0582a1 != null ? interfaceC0582a1.zze() : null;
    }

    public final synchronized String d() {
        InterfaceC0582a1 interfaceC0582a1;
        try {
            interfaceC0582a1 = this.f32769c;
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
            return null;
        }
        return interfaceC0582a1 != null ? interfaceC0582a1.zze() : null;
    }

    final /* synthetic */ void e(InterfaceC0582a1 interfaceC0582a1) {
        this.f32769c = interfaceC0582a1;
    }
}

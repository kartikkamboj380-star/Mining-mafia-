package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class QS implements BS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FS f22369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BinderC2590Wa0 f22370c;

    QS(long j10, Context context, FS fs, AbstractC2791Zx abstractC2791Zx, String str) {
        this.f22368a = j10;
        this.f22369b = fs;
        InterfaceC2694Ya0 interfaceC2694Ya0Z = abstractC2791Zx.z();
        interfaceC2694Ya0Z.e(context);
        interfaceC2694Ya0Z.j(str);
        this.f22370c = interfaceC2694Ya0Z.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final void a(H4.h2 h2Var) {
        try {
            this.f22370c.V0(h2Var, new OS(this));
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    final /* synthetic */ long b() {
        return this.f22368a;
    }

    final /* synthetic */ FS c() {
        return this.f22369b;
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final void zzb() {
        try {
            BinderC2590Wa0 binderC2590Wa0 = this.f22370c;
            binderC2590Wa0.C5(new PS(this));
            binderC2590Wa0.t0(com.google.android.gms.dynamic.b.N0(null));
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final void zzc() {
    }
}

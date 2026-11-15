package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import K4.AbstractC0786o0;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3934j20 implements InterfaceC0580a, InterfaceC4599oK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H4.F f30284a;

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final synchronized void F0() {
    }

    public final synchronized void b(H4.F f10) {
        this.f30284a = f10;
    }

    @Override // H4.InterfaceC0580a
    public final synchronized void onAdClicked() {
        H4.F f10 = this.f30284a;
        if (f10 != null) {
            try {
                f10.zzb();
            } catch (RemoteException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.g("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final synchronized void t0() {
        H4.F f10 = this.f30284a;
        if (f10 != null) {
            try {
                f10.zzb();
            } catch (RemoteException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.g("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }
}

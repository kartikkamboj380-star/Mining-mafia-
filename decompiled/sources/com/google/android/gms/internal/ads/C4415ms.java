package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4415ms implements U4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2727Yr f31582b;

    public C4415ms(InterfaceC2727Yr interfaceC2727Yr) {
        this.f31582b = interfaceC2727Yr;
    }

    @Override // U4.b
    public final int a() {
        InterfaceC2727Yr interfaceC2727Yr = this.f31582b;
        if (interfaceC2727Yr != null) {
            try {
                return interfaceC2727Yr.b();
            } catch (RemoteException e10) {
                L4.p.g("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // U4.b
    public final String getType() {
        InterfaceC2727Yr interfaceC2727Yr = this.f31582b;
        if (interfaceC2727Yr != null) {
            try {
                return interfaceC2727Yr.zze();
            } catch (RemoteException e10) {
                L4.p.g("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}

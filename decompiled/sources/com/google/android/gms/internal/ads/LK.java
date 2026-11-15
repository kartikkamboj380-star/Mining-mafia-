package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class LK extends AbstractC3214dJ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20428b;

    protected LK(Set set) {
        super(set);
    }

    public final void j1() {
        g1(GK.f19030a);
    }

    public final synchronized void k1() {
        try {
            if (!this.f20428b) {
                g1(JK.f19832a);
                this.f20428b = true;
            }
            g1(IK.f19518a);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zza() {
        g1(KK.f20168a);
    }

    public final synchronized void zzc() {
        g1(HK.f19268a);
        this.f20428b = true;
    }
}

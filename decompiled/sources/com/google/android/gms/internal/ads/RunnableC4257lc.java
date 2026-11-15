package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4257lc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4383mc f31301a;

    RunnableC4257lc(C4383mc c4383mc) {
        Objects.requireNonNull(c4383mc);
        this.f31301a = c4383mc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        C4383mc c4383mc = this.f31301a;
        if (c4383mc.f31548b != null) {
            return;
        }
        synchronized (C4383mc.f31544c) {
            if (c4383mc.f31548b != null) {
                return;
            }
            boolean z9 = false;
            try {
                zBooleanValue = ((Boolean) AbstractC3892ii.f29884l3.e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    C4383mc.f31545d = C1619Di0.b(this.f31301a.b().f25323a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z9 = zBooleanValue;
            this.f31301a.f31548b = Boolean.valueOf(z9);
            C4383mc.f31544c.open();
        }
    }
}

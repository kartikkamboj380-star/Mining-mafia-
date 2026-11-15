package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4520nh0 implements Runnable {
    RunnableC4520nh0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C4646oh0.f32174j != null) {
            C4646oh0.f32174j.post(C4646oh0.f32175k);
            C4646oh0.f32174j.postDelayed(C4646oh0.f32176l, 200L);
        }
    }
}

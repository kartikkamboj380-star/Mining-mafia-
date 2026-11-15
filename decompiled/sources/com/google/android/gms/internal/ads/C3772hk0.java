package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3772hk0 extends AbstractC3646gk0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static C3772hk0 f29104i;

    private C3772hk0(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final C3772hk0 i(Context context) {
        C3772hk0 c3772hk0;
        synchronized (C3772hk0.class) {
            try {
                if (f29104i == null) {
                    f29104i = new C3772hk0(context);
                }
                c3772hk0 = f29104i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3772hk0;
    }

    public final C3269dk0 j(long j10, boolean z9) {
        C3269dk0 c3269dk0A;
        synchronized (C3772hk0.class) {
            c3269dk0A = a(null, null, j10, z9);
        }
        return c3269dk0A;
    }

    public final C3269dk0 k(String str, String str2, long j10, boolean z9) {
        C3269dk0 c3269dk0A;
        synchronized (C3772hk0.class) {
            c3269dk0A = a(str, str2, j10, z9);
        }
        return c3269dk0A;
    }

    public final void l() {
        synchronized (C3772hk0.class) {
            c(false);
        }
    }

    public final void m() {
        synchronized (C3772hk0.class) {
            c(true);
        }
    }
}

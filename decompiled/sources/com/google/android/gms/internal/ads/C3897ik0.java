package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ik0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3897ik0 extends AbstractC3646gk0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static C3897ik0 f30057i;

    private C3897ik0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final C3897ik0 i(Context context) {
        C3897ik0 c3897ik0;
        synchronized (C3897ik0.class) {
            try {
                if (f30057i == null) {
                    f30057i = new C3897ik0(context);
                }
                c3897ik0 = f30057i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3897ik0;
    }

    public final C3269dk0 j(long j10, boolean z9) {
        synchronized (C3897ik0.class) {
            try {
                if (this.f28727g.c()) {
                    return a(null, null, j10, z9);
                }
                return new C3269dk0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (C3897ik0.class) {
            try {
                if (g(false)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

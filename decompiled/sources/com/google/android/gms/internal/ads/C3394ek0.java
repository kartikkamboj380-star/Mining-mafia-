package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3394ek0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C3394ek0 f28055b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C3520fk0 f28056a;

    private C3394ek0(Context context) {
        this.f28056a = C3520fk0.a(context);
    }

    public static final C3394ek0 a(Context context) {
        C3394ek0 c3394ek0;
        synchronized (C3394ek0.class) {
            try {
                if (f28055b == null) {
                    f28055b = new C3394ek0(context);
                }
                c3394ek0 = f28055b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3394ek0;
    }

    public final void b(boolean z9) {
        synchronized (C3394ek0.class) {
            try {
                C3520fk0 c3520fk0 = this.f28056a;
                c3520fk0.b("paidv2_publisher_option", Boolean.valueOf(z9));
                if (!z9) {
                    c3520fk0.f("paidv2_creation_time");
                    c3520fk0.f("paidv2_id");
                    c3520fk0.f("vendor_scoped_gpid_v2_id");
                    c3520fk0.f("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean zE;
        synchronized (C3394ek0.class) {
            zE = this.f28056a.e("paidv2_publisher_option", true);
        }
        return zE;
    }

    public final void d(boolean z9) {
        synchronized (C3394ek0.class) {
            this.f28056a.b("paidv2_user_option", Boolean.valueOf(z9));
        }
    }

    public final boolean e() {
        boolean zE;
        synchronized (C3394ek0.class) {
            zE = this.f28056a.e("paidv2_user_option", true);
        }
        return zE;
    }
}

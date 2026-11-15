package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4022jk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4022jk0 f30555b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C3520fk0 f30556a;

    private C4022jk0(Context context) {
        this.f30556a = C3520fk0.a(context);
        C3394ek0.a(context);
    }

    public static final C4022jk0 a(Context context) {
        C4022jk0 c4022jk0;
        synchronized (C4022jk0.class) {
            try {
                if (f30555b == null) {
                    f30555b = new C4022jk0(context);
                }
                c4022jk0 = f30555b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4022jk0;
    }

    public final void b(C3269dk0 c3269dk0) {
        synchronized (C4022jk0.class) {
            C3520fk0 c3520fk0 = this.f30556a;
            c3520fk0.f("vendor_scoped_gpid_v2_id");
            c3520fk0.f("vendor_scoped_gpid_v2_creation_time");
        }
    }
}

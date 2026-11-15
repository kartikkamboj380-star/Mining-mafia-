package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static L3 f36409a;

    public static synchronized void a(L3 l10) {
        if (f36409a != null) {
            throw new IllegalStateException("init() already called");
        }
        f36409a = l10;
    }

    public static synchronized L3 b() {
        try {
            if (f36409a == null) {
                a(new P3());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f36409a;
    }
}

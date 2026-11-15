package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class GY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f19065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f19066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ M00 f19067c;

    public GY(M00 m00, EX ex, Executor executor) {
        Objects.requireNonNull(m00);
        this.f19067c = m00;
        this.f19065a = new WeakReference(ex);
        this.f19066b = executor;
    }

    public final boolean a() {
        return this.f19065a.get() == null;
    }

    public final void b() {
        this.f19066b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fY
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f28349a.c();
            }
        });
    }

    final /* synthetic */ void c() {
        EX ex = (EX) this.f19065a.get();
        if (ex != null) {
            ex.a(this.f19067c.c());
        }
    }
}

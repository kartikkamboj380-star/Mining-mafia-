package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5550vt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5676wt f34187c;

    public C5550vt(C5676wt c5676wt) {
        Objects.requireNonNull(c5676wt);
        this.f34187c = c5676wt;
        this.f34185a = -1L;
        this.f34186b = -1L;
    }

    public final long a() {
        return this.f34186b;
    }

    public final void b() {
        this.f34186b = this.f34187c.k().elapsedRealtime();
    }

    public final void c() {
        this.f34185a = this.f34187c.k().elapsedRealtime();
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f34185a);
        bundle.putLong("tclose", this.f34186b);
        return bundle;
    }
}

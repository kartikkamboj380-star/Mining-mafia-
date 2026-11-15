package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Uri f35919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f35920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f35921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f35922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f35923e;

    private I(String str, Uri uri, String str2, String str3, boolean z9, boolean z10, boolean z11, boolean z12, Q q10) {
        this.f35919a = uri;
        this.f35920b = "";
        this.f35921c = "";
        this.f35922d = z9;
        this.f35923e = z11;
    }

    public final I a() {
        return new I(null, this.f35919a, this.f35920b, this.f35921c, this.f35922d, false, true, false, null);
    }

    public final I b() {
        if (this.f35920b.isEmpty()) {
            return new I(null, this.f35919a, this.f35920b, this.f35921c, true, false, this.f35923e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final M c(String str, double d10) {
        return new G(this, str, Double.valueOf(0.0d), true);
    }

    public final M d(String str, long j10) {
        return new E(this, str, Long.valueOf(j10), true);
    }

    public final M e(String str, boolean z9) {
        return new F(this, str, Boolean.valueOf(z9), true);
    }

    public final M f(String str, Object obj, N1 n10) {
        return new H(this, "getTokenRefactor__blocked_packages", obj, true, n10);
    }

    public I(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}

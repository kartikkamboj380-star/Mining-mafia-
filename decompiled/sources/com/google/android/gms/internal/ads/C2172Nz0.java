package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2172Nz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f21427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f21428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f21430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21431e;

    /* synthetic */ C2172Nz0(C4454nA0 c4454nA0, byte[] bArr) {
        this.f21427a = c4454nA0.f31730a;
        this.f21428b = c4454nA0.f31733d;
        this.f21429c = c4454nA0.f31734e;
        this.f21430d = c4454nA0.f31735f;
        this.f21431e = c4454nA0.f31736g;
    }

    public final C2172Nz0 a(Uri uri) {
        this.f21427a = uri;
        return this;
    }

    public final C2172Nz0 b(Map map) {
        this.f21428b = map;
        return this;
    }

    public final C2172Nz0 c(long j10) {
        this.f21429c = j10;
        return this;
    }

    public final C2172Nz0 d(int i10) {
        this.f21431e = 6;
        return this;
    }

    public final C4454nA0 e() {
        AbstractC2418Ss0.k(this.f21427a, "The uri must be set.");
        return new C4454nA0(this.f21427a, 0L, 1, null, this.f21428b, this.f21429c, this.f21430d, null, this.f21431e, null, null);
    }

    public C2172Nz0() {
        this.f21428b = Collections.EMPTY_MAP;
        this.f21430d = -1L;
    }
}

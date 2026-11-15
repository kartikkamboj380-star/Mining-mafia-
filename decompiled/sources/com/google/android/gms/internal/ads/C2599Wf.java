package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2599Wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f24851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24855e;

    private C2599Wf(InputStream inputStream, boolean z9, boolean z10, long j10, boolean z11) {
        this.f24851a = inputStream;
        this.f24852b = z9;
        this.f24853c = z10;
        this.f24854d = j10;
        this.f24855e = z11;
    }

    public static C2599Wf a(InputStream inputStream, boolean z9, boolean z10, long j10, boolean z11) {
        return new C2599Wf(inputStream, z9, z10, j10, z11);
    }

    public final InputStream b() {
        return this.f24851a;
    }

    public final boolean c() {
        return this.f24852b;
    }

    public final boolean d() {
        return this.f24853c;
    }

    public final long e() {
        return this.f24854d;
    }

    public final boolean f() {
        return this.f24855e;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4248lX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JY0 f31283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JY0 f31284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UV0 f31287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2529Uw f31288f;

    private C4248lX0(JY0 jy0, JY0 jy1, int i10, int i11, UV0 uv0, C2529Uw c2529Uw) {
        this.f31283a = jy0;
        this.f31284b = jy1;
        this.f31285c = i10;
        this.f31286d = i11;
        this.f31287e = uv0;
        this.f31288f = c2529Uw;
    }

    final /* synthetic */ C4248lX0 a(UV0 uv0) {
        return new C4248lX0(this.f31283a, this.f31284b, this.f31285c, this.f31286d, uv0, this.f31288f);
    }

    final /* synthetic */ boolean b(C4248lX0 c4248lX0) {
        return c4248lX0.f31287e.equals(this.f31287e);
    }

    final /* synthetic */ long c(long j10) {
        return AbstractC4634ob0.N(j10, this.f31283a.f19907H);
    }

    final /* synthetic */ long d(long j10) {
        return AbstractC4634ob0.N(j10, this.f31287e.f24022b);
    }

    final /* synthetic */ C4498nW0 e() {
        UV0 uv0 = this.f31287e;
        return new C4498nW0(uv0.f24021a, uv0.f24022b, uv0.f24023c, false, false, uv0.f24025e);
    }

    final /* synthetic */ boolean f() {
        return Objects.equals(this.f31283a.f19929o, "audio/raw");
    }

    final /* synthetic */ JY0 g() {
        return this.f31283a;
    }

    final /* synthetic */ JY0 h() {
        return this.f31284b;
    }

    final /* synthetic */ int i() {
        return this.f31285c;
    }

    final /* synthetic */ int j() {
        return this.f31286d;
    }

    final /* synthetic */ UV0 k() {
        return this.f31287e;
    }

    final /* synthetic */ C2529Uw l() {
        return this.f31288f;
    }

    /* synthetic */ C4248lX0(JY0 jy0, JY0 jy1, int i10, int i11, UV0 uv0, C2529Uw c2529Uw, byte[] bArr) {
        this(jy0, jy1, i10, i11, uv0, c2529Uw);
    }
}

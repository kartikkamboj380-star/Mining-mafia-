package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4680oy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32224a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1495Ay0 f32226c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4428my0 f32225b = C4428my0.f31625b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4806py0 f32227d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4932qy0 f32228e = null;

    /* synthetic */ C4680oy0(AbstractC1495Ay0 abstractC1495Ay0, byte[] bArr) {
        this.f32226c = abstractC1495Ay0;
    }

    public final C4680oy0 a() {
        C4932qy0 c4932qy0 = this.f32228e;
        if (c4932qy0 != null) {
            c4932qy0.c();
        }
        this.f32224a = true;
        return this;
    }

    public final C4680oy0 b() {
        this.f32227d = C4806py0.f32524a;
        return this;
    }

    final /* synthetic */ boolean c() {
        return this.f32224a;
    }

    final /* synthetic */ void d(boolean z9) {
        this.f32224a = false;
    }

    final /* synthetic */ C4428my0 e() {
        return this.f32225b;
    }

    final /* synthetic */ AbstractC1495Ay0 f() {
        return this.f32226c;
    }

    final /* synthetic */ C4806py0 g() {
        return this.f32227d;
    }

    final /* synthetic */ C4932qy0 h() {
        return this.f32228e;
    }

    final /* synthetic */ void i(C4932qy0 c4932qy0) {
        this.f32228e = c4932qy0;
    }
}

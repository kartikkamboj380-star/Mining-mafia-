package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f32759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5186t f32760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32761c;

    public r(Handler handler, InterfaceC5186t interfaceC5186t) {
        this.f32759a = handler;
        this.f32760b = interfaceC5186t;
    }

    public final void a() {
        this.f32761c = true;
    }

    final /* synthetic */ Handler b() {
        return this.f32759a;
    }

    final /* synthetic */ InterfaceC5186t c() {
        return this.f32760b;
    }

    final /* synthetic */ boolean d() {
        return this.f32761c;
    }
}

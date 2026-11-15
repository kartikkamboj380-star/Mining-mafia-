package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4939r10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5860yL f32765a;

    public C4939r10(AbstractC5860yL abstractC5860yL) {
        this.f32765a = abstractC5860yL;
    }

    public final /* bridge */ /* synthetic */ Object a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, View view, C4310m10 c4310m10) {
        C4688p10 c4688p10 = new C4688p10(this, new C4562o10(this, c3502fb0));
        RK rkD = this.f32765a.d(new FD(c5011rb0, c3502fb0, null), c4688p10);
        c4310m10.b(new C4814q10(this, rkD));
        return rkD.h();
    }
}

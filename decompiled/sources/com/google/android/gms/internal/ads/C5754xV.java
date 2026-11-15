package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5754xV implements IH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2521Us f34904b;

    C5754xV(Context context, C2521Us c2521Us) {
        this.f34903a = context;
        this.f34904b = c2521Us;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
        String str = c5011rb0.f32991b.f32672b.f29458e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2521Us c2521Us = this.f34904b;
        Context context = this.f34903a;
        c2521Us.c(context, c5011rb0.f32990a.f31840a.f35795d);
        c2521Us.m(context, str);
    }
}

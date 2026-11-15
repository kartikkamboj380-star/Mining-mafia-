package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3638gg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28705a;

    final boolean a() {
        return this.f28705a;
    }

    final void b(Context context) {
        AbstractC3640gh0.b(context, "Application Context cannot be null");
        if (this.f28705a) {
            return;
        }
        this.f28705a = true;
        C2134Ng0.a().b(context);
        C1667Eg0.i().d(context);
        AbstractC3012bh0.a(context);
        AbstractC3137ch0.a(context);
        AbstractC3514fh0.a(context);
        C1979Kg0.a().c(context);
        C1615Dg0.a().c(context);
        C2238Pg0.a().b(context);
    }
}

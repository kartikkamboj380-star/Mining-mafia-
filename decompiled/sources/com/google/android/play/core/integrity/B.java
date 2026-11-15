package com.google.android.play.core.integrity;

import V5.AbstractC0973j;
import android.content.Context;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class B extends V5.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f39789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f39790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(J j10, C7094k c7094k, Context context) {
        super(c7094k);
        this.f39790c = j10;
        this.f39789b = context;
    }

    @Override // V5.F
    protected final void b() {
        this.f39790c.f39810c.e(Integer.valueOf(AbstractC0973j.a(this.f39789b)));
    }
}

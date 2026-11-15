package com.google.android.play.core.integrity;

import V5.C0970g;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
abstract class I extends V5.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f39807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(J j10, C7094k c7094k) {
        super(c7094k);
        this.f39807b = j10;
    }

    @Override // V5.F
    public final void a(Exception exc) {
        if (!(exc instanceof C0970g)) {
            super.a(exc);
        } else if (J.i(this.f39807b)) {
            super.a(new C6688b(-2, exc));
        } else {
            super.a(new C6688b(-9, exc));
        }
    }
}

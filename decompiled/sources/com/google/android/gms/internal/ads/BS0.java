package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class BS0 extends AbstractC4000jZ0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2337Re f17601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BS0(CS0 cs0, AbstractC5270tf abstractC5270tf) {
        super(abstractC5270tf);
        Objects.requireNonNull(cs0);
        this.f17601c = new C2337Re();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe d(int i10, C4891qe c4891qe, boolean z9) {
        AbstractC5270tf abstractC5270tf = this.f30485b;
        C4891qe c4891qeD = abstractC5270tf.d(i10, c4891qe, z9);
        if (abstractC5270tf.b(c4891qeD.f32697c, this.f17601c, 0L).b()) {
            c4891qeD.a(c4891qe.f32695a, c4891qe.f32696b, c4891qe.f32697c, c4891qe.f32698d, 0L, C1480Ar.f17414e, true);
            return c4891qeD;
        }
        c4891qeD.f32700f = true;
        return c4891qeD;
    }
}

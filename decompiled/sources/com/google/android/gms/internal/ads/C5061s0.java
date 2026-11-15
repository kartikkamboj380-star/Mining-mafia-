package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5061s0 implements InterfaceC1472An {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5914ym f33062a = new C4935r0(false);

    public C5061s0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1472An
    public final InterfaceC1630Do a(Context context, C3470fL0 c3470fL0, TR0 tr0, InterfaceC3025bo interfaceC3025bo, Executor executor, long j10, boolean z9) {
        try {
            ((InterfaceC1472An) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(InterfaceC5914ym.class).newInstance(this.f33062a)).a(context, c3470fL0, tr0, interfaceC3025bo, executor, 0L, false);
            return null;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class KR0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f20201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntConsumer f20202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LR0 f20203c;

    /* synthetic */ KR0(LR0 lr0, Context context, byte[] bArr) {
        Objects.requireNonNull(lr0);
        this.f20203c = lr0;
        this.f20201a = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.GR0
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i10) {
                LR0 lr1 = this.f19047a.f20203c;
                if (lr1.V()) {
                    return;
                }
                lr1.K(1, 19, Integer.valueOf(i10));
            }
        };
        this.f20202b = intConsumer;
        final InterfaceC4739pR interfaceC4739pRA = lr0.P().a(lr0.O(), null);
        Objects.requireNonNull(interfaceC4739pRA);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.HR0
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                interfaceC4739pRA.g(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void a() {
        Context context = (Context) this.f20201a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.f20202b);
    }
}

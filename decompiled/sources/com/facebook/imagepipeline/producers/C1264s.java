package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1264s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f14260b;

    public C1264s(d0 inputProducer, ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f14259a = inputProducer;
        this.f14260b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1264s this$0, InterfaceC1260n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.f14259a.b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(final InterfaceC1260n consumer, final e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        U2.b bVarM = context.M();
        ScheduledExecutorService scheduledExecutorService = this.f14260b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.r
                @Override // java.lang.Runnable
                public final void run() {
                    C1264s.d(this.f14248a, consumer, context);
                }
            }, bVarM.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f14259a.b(consumer, context);
        }
    }
}

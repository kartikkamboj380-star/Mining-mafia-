package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4827q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f32580a;

    public C4827q8(Handler handler) {
        this.f32580a = new ExecutorC4575o8(this, handler);
    }

    public final void a(AbstractC5960z8 abstractC5960z8, E8 e10, Runnable runnable) {
        abstractC5960z8.q();
        abstractC5960z8.d("post-response");
        ((ExecutorC4575o8) this.f32580a).f31969a.post(new RunnableC4701p8(abstractC5960z8, e10, runnable));
    }

    public final void b(AbstractC5960z8 abstractC5960z8, H8 h10) {
        abstractC5960z8.d("post-error");
        ((ExecutorC4575o8) this.f32580a).f31969a.post(new RunnableC4701p8(abstractC5960z8, E8.b(h10), null));
    }
}

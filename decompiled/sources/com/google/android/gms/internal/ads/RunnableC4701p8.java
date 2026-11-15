package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4701p8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5960z8 f32315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E8 f32316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f32317c;

    public RunnableC4701p8(AbstractC5960z8 abstractC5960z8, E8 e10, Runnable runnable) {
        this.f32315a = abstractC5960z8;
        this.f32316b = e10;
        this.f32317c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5960z8 abstractC5960z8 = this.f32315a;
        abstractC5960z8.m();
        E8 e10 = this.f32316b;
        if (e10.c()) {
            abstractC5960z8.t(e10.f18421a);
        } else {
            abstractC5960z8.u(e10.f18423c);
        }
        if (e10.f18424d) {
            abstractC5960z8.d("intermediate-response");
        } else {
            abstractC5960z8.e("done");
        }
        Runnable runnable = this.f32317c;
        if (runnable != null) {
            runnable.run();
        }
    }
}

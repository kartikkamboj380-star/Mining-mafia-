package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2168Nx0 extends AbstractC1855Hw0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f21403h;

    RunnableC2168Nx0(Runnable runnable) {
        runnable.getClass();
        this.f21403h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final String n() {
        String string = this.f21403h.toString();
        StringBuilder sb = new StringBuilder(string.length() + 7);
        sb.append("task=[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21403h.run();
        } catch (Throwable th) {
            l(th);
            throw th;
        }
    }
}

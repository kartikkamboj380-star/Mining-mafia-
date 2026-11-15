package K4;

import java.util.Objects;

/* JADX INFO: renamed from: K4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC0757a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f2643a;

    RunnableC0757a(B b10) {
        Objects.requireNonNull(b10);
        this.f2643a = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B b10 = this.f2643a;
        b10.c(Thread.currentThread());
        b10.a();
    }
}

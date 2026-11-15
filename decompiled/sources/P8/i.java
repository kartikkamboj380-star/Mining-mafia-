package P8;

import I8.T;

/* JADX INFO: loaded from: classes3.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f4768c;

    public i(Runnable runnable, long j10, boolean z9) {
        super(j10, z9);
        this.f4768c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4768c.run();
    }

    public String toString() {
        return "Task[" + T.a(this.f4768c) + '@' + T.b(this.f4768c) + ", " + this.f4766a + ", " + j.c(this.f4767b) + ']';
    }
}

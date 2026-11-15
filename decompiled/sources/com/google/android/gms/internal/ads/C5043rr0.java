package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5043rr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1781Gl0 f33035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4148kk0 f33036b;

    C5043rr0(C4148kk0 c4148kk0, InterfaceC1781Gl0 interfaceC1781Gl0) {
        this.f33035a = interfaceC1781Gl0;
        this.f33036b = c4148kk0;
    }

    public final C4792pr0 a(int i10) {
        return new C4792pr0(i10, this.f33036b, this.f33035a);
    }

    public final void b(int i10) {
        this.f33035a.b(i10 - 1, -1L, null, null);
    }

    public final void c(int i10, String str) {
        this.f33035a.b(i10 - 1, -1L, null, str);
    }

    public final void d(int i10, Throwable th) {
        this.f33035a.b(i10 - 1, -1L, th, null);
    }

    public final com.google.common.util.concurrent.p e(int i10, com.google.common.util.concurrent.p pVar) {
        C4792pr0 c4792pr0A = a(i10);
        c4792pr0A.a();
        AbstractC5685wx0.r(pVar, new C4918qr0(this, c4792pr0A), AbstractC2272Px0.a());
        return pVar;
    }

    public final void f(int i10, Runnable runnable) {
        C4792pr0 c4792pr0A = a(i10);
        try {
            c4792pr0A.a();
            runnable.run();
            c4792pr0A.c();
        } catch (Throwable th) {
            try {
                c4792pr0A.b(th);
                throw th;
            } catch (Throwable th2) {
                c4792pr0A.c();
                throw th2;
            }
        }
    }
}

package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1249c implements InterfaceC1260n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14134a = false;

    public static boolean d(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean e(int i10) {
        return !d(i10);
    }

    public static int k(boolean z9) {
        return z9 ? 1 : 0;
    }

    public static boolean l(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int n(int i10, int i11) {
        return i10 & (~i11);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1260n
    public synchronized void a() {
        if (this.f14134a) {
            return;
        }
        this.f14134a = true;
        try {
            f();
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1260n
    public synchronized void b(Object obj, int i10) {
        try {
            if (this.f14134a) {
                return;
            }
            this.f14134a = d(i10);
            try {
                h(obj, i10);
            } catch (Exception e10) {
                j(e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1260n
    public synchronized void c(float f10) {
        if (this.f14134a) {
            return;
        }
        try {
            i(f10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    protected abstract void f();

    protected abstract void g(Throwable th);

    protected abstract void h(Object obj, int i10);

    protected abstract void i(float f10);

    protected void j(Exception exc) {
        Z1.a.M(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1260n
    public synchronized void onFailure(Throwable th) {
        if (this.f14134a) {
            return;
        }
        this.f14134a = true;
        try {
            g(th);
        } catch (Exception e10) {
            j(e10);
        }
    }
}

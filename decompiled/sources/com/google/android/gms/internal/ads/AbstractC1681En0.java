package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.En0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1681En0 implements InterfaceCallableC1629Dn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2718Ym0 f18567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1966Ka f18568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4792pr0 f18569e;

    public AbstractC1681En0(String str, String str2, C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, C4792pr0 c4792pr0) {
        this.f18565a = str;
        this.f18566b = str2;
        this.f18568d = c1966Ka;
        this.f18567c = interfaceC2718Ym0;
        this.f18569e = c4792pr0;
    }

    protected abstract void a(Method method, C1966Ka c1966Ka);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.f18569e.a();
            Method methodO = this.f18567c.o(this.f18565a, this.f18566b);
            if (methodO != null) {
                a(methodO, this.f18568d);
            }
            this.f18569e.c();
            return null;
        } catch (Throwable th) {
            try {
                this.f18569e.b(th);
                throw th;
            } catch (Throwable th2) {
                this.f18569e.c();
                throw th2;
            }
        }
    }
}

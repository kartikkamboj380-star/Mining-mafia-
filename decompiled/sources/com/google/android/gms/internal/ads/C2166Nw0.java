package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2166Nw0 extends AbstractC1959Jw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f21396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f21397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f21398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f21399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f21400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f21401f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(C2322Qw0.f22536a);
            }
            try {
                f21398c = unsafe.objectFieldOffset(AbstractC2270Pw0.class.getDeclaredField("c"));
                f21397b = unsafe.objectFieldOffset(AbstractC2270Pw0.class.getDeclaredField("b"));
                f21399d = unsafe.objectFieldOffset(AbstractC2270Pw0.class.getDeclaredField("a"));
                f21400e = unsafe.objectFieldOffset(C2218Ow0.class.getDeclaredField("a"));
                f21401f = unsafe.objectFieldOffset(C2218Ow0.class.getDeclaredField("b"));
                f21396a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    /* synthetic */ C2166Nw0(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    public final void a(C2218Ow0 c2218Ow0, Thread thread) {
        f21396a.putObject(c2218Ow0, f21400e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final void b(C2218Ow0 c2218Ow0, C2218Ow0 c2218Ow1) {
        f21396a.putObject(c2218Ow0, f21401f, c2218Ow1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean c(AbstractC2270Pw0 abstractC2270Pw0, C2218Ow0 c2218Ow0, C2218Ow0 c2218Ow1) {
        return AbstractC2114Mw0.a(f21396a, abstractC2270Pw0, f21398c, c2218Ow0, c2218Ow1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean d(AbstractC2270Pw0 abstractC2270Pw0, C1751Fw0 c1751Fw0, C1751Fw0 c1751Fw1) {
        return AbstractC2114Mw0.a(f21396a, abstractC2270Pw0, f21397b, c1751Fw0, c1751Fw1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final C2218Ow0 e(AbstractC2270Pw0 abstractC2270Pw0, C2218Ow0 c2218Ow0) {
        C2218Ow0 c2218Ow1;
        do {
            c2218Ow1 = abstractC2270Pw0.f22233c;
            if (c2218Ow0 == c2218Ow1) {
                break;
            }
        } while (!c(abstractC2270Pw0, c2218Ow1, c2218Ow0));
        return c2218Ow1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final C1751Fw0 f(AbstractC2270Pw0 abstractC2270Pw0, C1751Fw0 c1751Fw0) {
        C1751Fw0 c1751Fw1;
        do {
            c1751Fw1 = abstractC2270Pw0.f22232b;
            if (c1751Fw0 == c1751Fw1) {
                break;
            }
        } while (!d(abstractC2270Pw0, c1751Fw1, c1751Fw0));
        return c1751Fw1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean g(AbstractC2270Pw0 abstractC2270Pw0, Object obj, Object obj2) {
        return AbstractC2114Mw0.a(f21396a, abstractC2270Pw0, f21399d, obj, obj2);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCallableC2127Nd implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C2645Xc f21298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f21299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f21300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C1966Ka f21301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Method f21302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f21303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f21304g;

    public AbstractCallableC2127Nd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        this.f21298a = c2645Xc;
        this.f21299b = str;
        this.f21300c = str2;
        this.f21301d = c1966Ka;
        this.f21303f = i10;
        this.f21304g = i11;
    }

    protected abstract void a();

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            C2645Xc c2645Xc = this.f21298a;
            Method methodO = c2645Xc.o(this.f21299b, this.f21300c);
            this.f21302e = methodO;
            if (methodO == null) {
                return null;
            }
            a();
            C4383mc c4383mcH = c2645Xc.h();
            if (c4383mcH == null || (i10 = this.f21303f) == Integer.MIN_VALUE) {
                return null;
            }
            c4383mcH.a(this.f21304g, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}

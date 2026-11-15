package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f36171a;

    z1(Unsafe unsafe) {
        this.f36171a = unsafe;
    }

    public abstract double a(Object obj, long j10);

    public abstract float b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z9);

    public abstract void d(Object obj, long j10, double d10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract boolean f(Object obj, long j10);
}

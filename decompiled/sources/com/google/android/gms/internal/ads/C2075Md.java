package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2075Md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2645Xc f20891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20893c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class[] f20895e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Method f20894d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f20896f = new CountDownLatch(1);

    public C2075Md(C2645Xc c2645Xc, String str, String str2, Class... clsArr) {
        this.f20891a = c2645Xc;
        this.f20892b = str;
        this.f20893c = str2;
        this.f20895e = clsArr;
        c2645Xc.d().submit(new RunnableC2024Ld(this));
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f20891a.f().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f20894d != null) {
            return this.f20894d;
        }
        try {
            if (this.f20896f.await(2L, TimeUnit.SECONDS)) {
                return this.f20894d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void b() {
        try {
            C2645Xc c2645Xc = this.f20891a;
            Class<?> clsLoadClass = c2645Xc.e().loadClass(c(c2645Xc.g(), this.f20892b));
            if (clsLoadClass != null) {
                this.f20894d = clsLoadClass.getMethod(c(c2645Xc.g(), this.f20893c), this.f20895e);
            }
        } catch (C6020zc | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            this.f20896f.countDown();
        }
    }
}

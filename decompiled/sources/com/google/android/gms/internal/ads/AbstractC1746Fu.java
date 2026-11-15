package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1746Fu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f18863a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f18864b = new AtomicInteger(0);

    public static int G() {
        return f18863a.get();
    }

    public static int H() {
        return f18864b.get();
    }

    protected static AtomicInteger I() {
        return f18863a;
    }

    protected static AtomicInteger J() {
        return f18864b;
    }

    public abstract long A();

    public abstract long B();

    public abstract int C();

    public abstract void D(boolean z9);

    public abstract long E();

    public abstract long F();

    public abstract Integer K();

    public abstract void L(Integer num);

    public abstract void M(Uri[] uriArr, String str);

    public abstract void N(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z9);

    public abstract void O(InterfaceC1694Eu interfaceC1694Eu);

    public abstract void P();

    public abstract void Q(Surface surface, boolean z9);

    public abstract void R(float f10, boolean z9);

    public abstract void S();

    public abstract void T(long j10);

    public abstract void U(int i10);

    public abstract void V(int i10);

    public abstract void r(int i10);

    public abstract boolean s();

    public abstract int t();

    public abstract long u();

    public abstract void v(boolean z9);

    public abstract void w(int i10);

    public abstract void x(int i10);

    public abstract long y();

    public abstract long z();
}

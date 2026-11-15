package com.facebook.imagepipeline.memory;

import R2.w;
import R2.y;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p013b2.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f13954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p023c2.a f13955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13956c;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ f(e eVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i11 & 2) != 0 ? eVar.B() : i10);
    }

    private final void c() {
        if (!p023c2.a.V(this.f13955b)) {
            throw new a();
        }
    }

    @Override // p013b2.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        p023c2.a.x(this.f13955b);
        this.f13955b = null;
        this.f13956c = -1;
        super.close();
    }

    public final void h(int i10) throws Throwable {
        c();
        p023c2.a aVar = this.f13955b;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.c(aVar);
        if (i10 <= ((w) aVar.G()).a()) {
            return;
        }
        Object obj = this.f13954a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        w wVar = (w) obj;
        p023c2.a aVar2 = this.f13955b;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.c(aVar2);
        ((w) aVar2.G()).w(0, wVar, 0, this.f13956c);
        p023c2.a aVar3 = this.f13955b;
        Intrinsics.c(aVar3);
        aVar3.close();
        this.f13955b = p023c2.a.a0(wVar, this.f13954a);
    }

    @Override // p013b2.k
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public y a() {
        c();
        p023c2.a aVar = this.f13955b;
        if (aVar != null) {
            return new y(aVar, this.f13956c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p013b2.k
    public int size() {
        return this.f13956c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    public f(e pool, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i10 > 0) {
            this.f13954a = pool;
            this.f13956c = 0;
            this.f13955b = p023c2.a.a0(pool.get(i10), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws Throwable {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= buffer.length) {
            c();
            h(this.f13956c + i11);
            p023c2.a aVar = this.f13955b;
            if (aVar != null) {
                ((w) aVar.G()).v(this.f13956c, buffer, i10, i11);
                this.f13956c += i11;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}

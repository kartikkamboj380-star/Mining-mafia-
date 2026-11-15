package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class UM0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f23985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ XM0 f23986d;

    /* synthetic */ UM0(XM0 xm0, byte[] bArr) {
        Objects.requireNonNull(xm0);
        this.f23986d = xm0;
        this.f23983a = -1;
    }

    private final Iterator a() {
        if (this.f23985c == null) {
            this.f23985c = this.f23986d.l().entrySet().iterator();
        }
        return this.f23985c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f23983a + 1;
        XM0 xm0 = this.f23986d;
        if (i10 >= xm0.k()) {
            return !xm0.l().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f23984b = true;
        int i10 = this.f23983a + 1;
        this.f23983a = i10;
        XM0 xm0 = this.f23986d;
        return i10 < xm0.k() ? (TM0) xm0.j()[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23984b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f23984b = false;
        XM0 xm0 = this.f23986d;
        xm0.i();
        int i10 = this.f23983a;
        if (i10 >= xm0.k()) {
            a().remove();
        } else {
            this.f23983a = i10 - 1;
            xm0.h(i10);
        }
    }
}

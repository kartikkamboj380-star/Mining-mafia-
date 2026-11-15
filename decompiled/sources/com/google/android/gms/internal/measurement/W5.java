package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class W5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f36533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y5 f36534d;

    /* synthetic */ W5(Y5 y9, byte[] bArr) {
        Objects.requireNonNull(y9);
        this.f36534d = y9;
        this.f36531a = -1;
    }

    private final Iterator a() {
        if (this.f36533c == null) {
            this.f36533c = this.f36534d.l().entrySet().iterator();
        }
        return this.f36533c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f36531a + 1;
        Y5 y9 = this.f36534d;
        if (i10 >= y9.k()) {
            return !y9.l().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f36532b = true;
        int i10 = this.f36531a + 1;
        this.f36531a = i10;
        Y5 y9 = this.f36534d;
        return i10 < y9.k() ? (V5) y9.j()[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f36532b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f36532b = false;
        Y5 y9 = this.f36534d;
        y9.i();
        int i10 = this.f36531a;
        if (i10 >= y9.k()) {
            a().remove();
        } else {
            this.f36531a = i10 - 1;
            y9.h(i10);
        }
    }
}

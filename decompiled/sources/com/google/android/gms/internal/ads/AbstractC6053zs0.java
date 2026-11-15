package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6053zs0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f35869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35870b = 2;

    protected AbstractC6053zs0() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f35870b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2418Ss0.i(this.f35870b != 4);
        int i10 = this.f35870b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f35870b = 4;
            this.f35869a = a();
            if (this.f35870b != 3) {
                this.f35870b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f35870b = 2;
        Object obj = this.f35869a;
        this.f35869a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

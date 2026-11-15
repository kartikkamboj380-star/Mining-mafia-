package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class v implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f36231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36232b = 2;

    protected v() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f36232b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C.a(this.f36232b != 4);
        int i10 = this.f36232b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f36232b = 4;
            this.f36231a = a();
            if (this.f36232b != 3) {
                this.f36232b = 1;
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
        this.f36232b = 2;
        Object obj = this.f36231a;
        this.f36231a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

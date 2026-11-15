package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ut0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5425ut0 extends AbstractC2112Mv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f33935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33936b = 2;

    protected AbstractC5425ut0() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f33936b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2418Ss0.i(this.f33936b != 4);
        int i10 = this.f33936b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f33936b = 4;
            this.f33935a = a();
            if (this.f33936b != 3) {
                this.f33936b = 1;
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
        this.f33936b = 2;
        Object obj = this.f33935a;
        this.f33935a = null;
        return obj;
    }
}

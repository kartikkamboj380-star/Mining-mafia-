package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.au0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2912au0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f26663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3414eu0 f26666d;

    /* synthetic */ AbstractC2912au0(C3414eu0 c3414eu0, byte[] bArr) {
        Objects.requireNonNull(c3414eu0);
        this.f26666d = c3414eu0;
        this.f26663a = c3414eu0.w();
        this.f26664b = c3414eu0.j();
        this.f26665c = -1;
    }

    private final void b() {
        if (this.f26666d.w() != this.f26663a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26664b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26664b;
        this.f26665c = i10;
        Object objA = a(i10);
        this.f26664b = this.f26666d.k(this.f26664b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC2418Ss0.j(this.f26665c >= 0, "no calls to next() since the last call to remove()");
        this.f26663a += 32;
        int i10 = this.f26665c;
        C3414eu0 c3414eu0 = this.f26666d;
        c3414eu0.remove(c3414eu0.s(i10));
        this.f26664b--;
        this.f26665c = -1;
    }
}

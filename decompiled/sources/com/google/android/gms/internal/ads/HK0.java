package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class HK0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IK0 f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IK0 f19270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ JK0 f19272d;

    HK0(JK0 jk0) {
        Objects.requireNonNull(jk0);
        this.f19272d = jk0;
        this.f19269a = jk0.f19839f.f19522d;
        this.f19270b = null;
        this.f19271c = jk0.f19838e;
    }

    final IK0 a() {
        JK0 jk0 = this.f19272d;
        IK0 ik0 = this.f19269a;
        if (ik0 == jk0.f19839f) {
            throw new NoSuchElementException();
        }
        if (jk0.f19838e != this.f19271c) {
            throw new ConcurrentModificationException();
        }
        this.f19269a = ik0.f19522d;
        this.f19270b = ik0;
        return ik0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19269a != this.f19272d.f19839f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        IK0 ik0 = this.f19270b;
        if (ik0 == null) {
            throw new IllegalStateException();
        }
        JK0 jk0 = this.f19272d;
        jk0.e(ik0, true);
        this.f19270b = null;
        this.f19271c = jk0.f19838e;
    }
}

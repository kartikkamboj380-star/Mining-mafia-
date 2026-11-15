package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2318Qu0 extends AbstractC2112Mv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22499b;

    C2318Qu0(Object obj) {
        this.f22498a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f22499b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f22499b) {
            throw new NoSuchElementException();
        }
        this.f22499b = true;
        return this.f22498a;
    }
}

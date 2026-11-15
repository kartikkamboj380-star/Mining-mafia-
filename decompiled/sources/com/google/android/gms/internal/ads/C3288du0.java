package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.du0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3288du0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3414eu0 f27524a;

    /* synthetic */ C3288du0(C3414eu0 c3414eu0, byte[] bArr) {
        Objects.requireNonNull(c3414eu0);
        this.f27524a = c3414eu0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f27524a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C3414eu0 c3414eu0 = this.f27524a;
        Map mapG = c3414eu0.g();
        return mapG != null ? mapG.values().iterator() : new C2732Yt0(c3414eu0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f27524a.size();
    }
}

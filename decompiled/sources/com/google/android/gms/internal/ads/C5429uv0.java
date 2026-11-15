package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5429uv0 extends AbstractC5931yu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5555vv0 f33940d;

    C5429uv0(C5555vv0 c5555vv0) {
        Objects.requireNonNull(c5555vv0);
        this.f33940d = c5555vv0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C5555vv0 c5555vv0 = this.f33940d;
        AbstractC2418Ss0.m(i10, c5555vv0.D(), "index");
        int i11 = i10 + i10;
        Object obj = c5555vv0.C()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = c5555vv0.C()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33940d.D();
    }
}

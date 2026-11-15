package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3706hD0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f28886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f28887b;

    C3706hD0(C4082kD0 c4082kD0, List list, List list2) {
        this.f28886a = list;
        this.f28887b = list2;
        Objects.requireNonNull(c4082kD0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3956jD0(this.f28886a.iterator(), this.f28887b.iterator(), null);
    }
}

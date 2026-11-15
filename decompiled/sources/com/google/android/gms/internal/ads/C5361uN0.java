package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5361uN0 extends C4983rN0 implements Set, A8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f33798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5361uN0(Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33798b = delegate;
    }

    @Override // com.google.android.gms.internal.ads.C4983rN0, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C4983rN0, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5235tN0(this.f33798b.iterator());
    }
}

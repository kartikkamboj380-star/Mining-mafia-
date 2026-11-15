package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5613wN0 implements Map.Entry, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Map.Entry f34535a;

    public C5613wN0(Map.Entry delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f34535a = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34535a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34535a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

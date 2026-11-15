package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3036bt0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f26951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3790ht0 f26952b;

    C3036bt0(C3790ht0 c3790ht0, CharSequence charSequence) {
        this.f26951a = charSequence;
        Objects.requireNonNull(c3790ht0);
        this.f26952b = c3790ht0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f26952b.f(this.f26951a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        AbstractC2054Ls0.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}

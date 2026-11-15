package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class KW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f20213a;

    public final boolean a(int i10) {
        return this.f20213a.get(i10);
    }

    public final int b() {
        return this.f20213a.size();
    }

    public final int c(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f20213a;
        AbstractC2418Ss0.m(i10, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KW0) {
            return this.f20213a.equals(((KW0) obj).f20213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20213a.hashCode();
    }
}

package com.swmansion.rnscreens.utils;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42609b;

    public b(int i10, boolean z9) {
        this.f42608a = i10;
        this.f42609b = z9;
    }

    public final int a() {
        return this.f42608a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f42608a == bVar.f42608a && this.f42609b == bVar.f42609b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f42608a) * 31) + Boolean.hashCode(this.f42609b);
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.f42608a + ", isTitleEmpty=" + this.f42609b + ")";
    }
}

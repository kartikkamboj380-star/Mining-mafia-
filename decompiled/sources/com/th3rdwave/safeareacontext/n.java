package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f42707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f42708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f42709c;

    public n(a insets, o mode, m edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f42707a = insets;
        this.f42708b = mode;
        this.f42709c = edges;
    }

    public final m a() {
        return this.f42709c;
    }

    public final a b() {
        return this.f42707a;
    }

    public final o c() {
        return this.f42708b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.b(this.f42707a, nVar.f42707a) && this.f42708b == nVar.f42708b && Intrinsics.b(this.f42709c, nVar.f42709c);
    }

    public int hashCode() {
        return (((this.f42707a.hashCode() * 31) + this.f42708b.hashCode()) * 31) + this.f42709c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f42707a + ", mode=" + this.f42708b + ", edges=" + this.f42709c + ")";
    }
}

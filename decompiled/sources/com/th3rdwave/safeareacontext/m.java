package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f42703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f42704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f42705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f42706d;

    public m(l top, l right, l bottom, l left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.f42703a = top;
        this.f42704b = right;
        this.f42705c = bottom;
        this.f42706d = left;
    }

    public final l a() {
        return this.f42705c;
    }

    public final l b() {
        return this.f42706d;
    }

    public final l c() {
        return this.f42704b;
    }

    public final l d() {
        return this.f42703a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f42703a == mVar.f42703a && this.f42704b == mVar.f42704b && this.f42705c == mVar.f42705c && this.f42706d == mVar.f42706d;
    }

    public int hashCode() {
        return (((((this.f42703a.hashCode() * 31) + this.f42704b.hashCode()) * 31) + this.f42705c.hashCode()) * 31) + this.f42706d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f42703a + ", right=" + this.f42704b + ", bottom=" + this.f42705c + ", left=" + this.f42706d + ")";
    }
}

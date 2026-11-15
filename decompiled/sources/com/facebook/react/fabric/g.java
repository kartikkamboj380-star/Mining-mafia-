package com.facebook.react.fabric;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14851c;

    public g(int i10, int i11, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f14849a = i10;
        this.f14850b = i11;
        this.f14851c = eventName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14849a == gVar.f14849a && this.f14850b == gVar.f14850b && Intrinsics.b(this.f14851c, gVar.f14851c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f14849a) * 31) + Integer.hashCode(this.f14850b)) * 31) + this.f14851c.hashCode();
    }

    public String toString() {
        return "SynchronousEvent(surfaceId=" + this.f14849a + ", viewTag=" + this.f14850b + ", eventName=" + this.f14851c + ")";
    }
}

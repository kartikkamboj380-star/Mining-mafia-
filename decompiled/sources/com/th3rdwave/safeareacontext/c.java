package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f42683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f42684d;

    public c(float f10, float f11, float f12, float f13) {
        this.f42681a = f10;
        this.f42682b = f11;
        this.f42683c = f12;
        this.f42684d = f13;
    }

    public final float a() {
        return this.f42684d;
    }

    public final float b() {
        return this.f42683c;
    }

    public final float c() {
        return this.f42681a;
    }

    public final float d() {
        return this.f42682b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f42681a, cVar.f42681a) == 0 && Float.compare(this.f42682b, cVar.f42682b) == 0 && Float.compare(this.f42683c, cVar.f42683c) == 0 && Float.compare(this.f42684d, cVar.f42684d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f42681a) * 31) + Float.hashCode(this.f42682b)) * 31) + Float.hashCode(this.f42683c)) * 31) + Float.hashCode(this.f42684d);
    }

    public String toString() {
        return "Rect(x=" + this.f42681a + ", y=" + this.f42682b + ", width=" + this.f42683c + ", height=" + this.f42684d + ")";
    }
}

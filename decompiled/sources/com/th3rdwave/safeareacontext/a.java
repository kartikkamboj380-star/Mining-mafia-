package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f42676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f42677d;

    public a(float f10, float f11, float f12, float f13) {
        this.f42674a = f10;
        this.f42675b = f11;
        this.f42676c = f12;
        this.f42677d = f13;
    }

    public final float a() {
        return this.f42676c;
    }

    public final float b() {
        return this.f42677d;
    }

    public final float c() {
        return this.f42675b;
    }

    public final float d() {
        return this.f42674a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f42674a, aVar.f42674a) == 0 && Float.compare(this.f42675b, aVar.f42675b) == 0 && Float.compare(this.f42676c, aVar.f42676c) == 0 && Float.compare(this.f42677d, aVar.f42677d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f42674a) * 31) + Float.hashCode(this.f42675b)) * 31) + Float.hashCode(this.f42676c)) * 31) + Float.hashCode(this.f42677d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f42674a + ", right=" + this.f42675b + ", bottom=" + this.f42676c + ", left=" + this.f42677d + ")";
    }
}

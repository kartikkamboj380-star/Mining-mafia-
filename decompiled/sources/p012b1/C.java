package p012b1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f11499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11500g;

    public C(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f11494a = str;
        this.f11495b = str2;
        this.f11496c = str3;
        this.f11497d = str4;
        this.f11498e = str5;
        this.f11499f = str6;
        this.f11500g = str7;
    }

    public final String a() {
        return this.f11497d;
    }

    public final String b() {
        return this.f11498e;
    }

    public final String c() {
        return this.f11496c;
    }

    public final String d() {
        return this.f11495b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && Intrinsics.b(((C) obj).f11494a, this.f11494a);
    }

    public int hashCode() {
        return this.f11494a.hashCode();
    }

    public String toString() {
        return this.f11494a;
    }
}

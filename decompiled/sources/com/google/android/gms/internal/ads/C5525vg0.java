package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5525vg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34147b;

    private C5525vg0(String str, String str2) {
        this.f34146a = str;
        this.f34147b = str2;
    }

    public static C5525vg0 a(String str, String str2) {
        AbstractC3640gh0.c(str, "Name is null or empty");
        AbstractC3640gh0.c(str2, "Version is null or empty");
        return new C5525vg0(str, str2);
    }

    public final String b() {
        return this.f34146a;
    }

    public final String c() {
        return this.f34147b;
    }
}

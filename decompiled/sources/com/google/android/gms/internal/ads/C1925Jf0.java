package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1925Jf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.b f19965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19966c;

    /* synthetic */ C1925Jf0(C1873If0 c1873If0, byte[] bArr) {
        this.f19964a = c1873If0.b();
        this.f19965b = c1873If0.c();
        this.f19966c = c1873If0.d();
    }

    public final String a() {
        return this.f19964a;
    }

    public final String b() {
        B4.b bVar = this.f19965b;
        return bVar == null ? "unknown" : bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final String c() {
        return this.f19966c;
    }

    public final boolean equals(Object obj) {
        B4.b bVar;
        B4.b bVar2;
        if (obj instanceof C1925Jf0) {
            C1925Jf0 c1925Jf0 = (C1925Jf0) obj;
            if (this.f19964a.equals(c1925Jf0.f19964a) && (bVar = this.f19965b) != null && (bVar2 = c1925Jf0.f19965b) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19964a, this.f19965b);
    }
}

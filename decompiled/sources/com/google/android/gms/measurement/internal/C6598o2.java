package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6598o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6612q2 f38238d;

    C6598o2(C6612q2 c6612q2, int i10, boolean z9, boolean z10) {
        Objects.requireNonNull(c6612q2);
        this.f38238d = c6612q2;
        this.f38235a = i10;
        this.f38236b = z9;
        this.f38237c = z10;
    }

    public final void a(String str) {
        this.f38238d.y(this.f38235a, this.f38236b, this.f38237c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f38238d.y(this.f38235a, this.f38236b, this.f38237c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f38238d.y(this.f38235a, this.f38236b, this.f38237c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f38238d.y(this.f38235a, this.f38236b, this.f38237c, str, obj, obj2, obj3);
    }
}

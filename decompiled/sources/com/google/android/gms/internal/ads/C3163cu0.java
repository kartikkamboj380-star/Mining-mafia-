package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3163cu0 extends AbstractC2160Nt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3414eu0 f27243c;

    C3163cu0(C3414eu0 c3414eu0, int i10) {
        Objects.requireNonNull(c3414eu0);
        this.f27243c = c3414eu0;
        this.f27241a = c3414eu0.s(i10);
        this.f27242b = i10;
    }

    private final void a() {
        int i10 = this.f27242b;
        if (i10 != -1) {
            C3414eu0 c3414eu0 = this.f27243c;
            if (i10 < c3414eu0.size() && Objects.equals(this.f27241a, c3414eu0.s(this.f27242b))) {
                return;
            }
        }
        this.f27242b = this.f27243c.m(this.f27241a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2160Nt0, java.util.Map.Entry
    public final Object getKey() {
        return this.f27241a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2160Nt0, java.util.Map.Entry
    public final Object getValue() {
        C3414eu0 c3414eu0 = this.f27243c;
        Map mapG = c3414eu0.g();
        if (mapG != null) {
            return mapG.get(this.f27241a);
        }
        a();
        int i10 = this.f27242b;
        if (i10 == -1) {
            return null;
        }
        return c3414eu0.t(i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3414eu0 c3414eu0 = this.f27243c;
        Map mapG = c3414eu0.g();
        if (mapG != null) {
            return mapG.put(this.f27241a, obj);
        }
        a();
        int i10 = this.f27242b;
        if (i10 == -1) {
            c3414eu0.put(this.f27241a, obj);
            return null;
        }
        Object objT = c3414eu0.t(i10);
        c3414eu0.u(this.f27242b, obj);
        return objT;
    }
}

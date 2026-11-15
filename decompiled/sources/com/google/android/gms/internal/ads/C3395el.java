package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3395el {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3395el f28057b = new C3395el(AbstractC5931yu0.l());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5931yu0 f28058a;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
    }

    public C3395el(List list) {
        this.f28058a = AbstractC5931yu0.u(list);
    }

    public final AbstractC5931yu0 a() {
        return this.f28058a;
    }

    public final boolean b(int i10) {
        int i11 = 0;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f28058a;
            if (i11 >= abstractC5931yu0.size()) {
                return false;
            }
            C1778Gk c1778Gk = (C1778Gk) abstractC5931yu0.get(i11);
            if (c1778Gk.b() && c1778Gk.d() == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3395el.class != obj.getClass()) {
            return false;
        }
        return this.f28058a.equals(((C3395el) obj).f28058a);
    }

    public final int hashCode() {
        return this.f28058a.hashCode();
    }
}

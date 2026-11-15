package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LS0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LS0 f20525i = new LS0(new KS0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1903Iu0 f20526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f20527b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f20528c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20529d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20530e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20533h = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20531f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20532g = true;

    private LS0(KS0 ks0) {
        this.f20526a = ks0.a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof LS0) && this.f20526a.equals(((LS0) obj).f20526a);
    }

    public final int hashCode() {
        AbstractC1903Iu0 abstractC1903Iu0 = this.f20526a;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(abstractC1903Iu0, null, null, bool, bool, bool, bool, bool);
    }
}

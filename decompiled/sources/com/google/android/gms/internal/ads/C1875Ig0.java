package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ig0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1875Ig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5527vh0 f19595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC4644og0 f19597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19598d = "Ad overlay";

    public C1875Ig0(View view, EnumC4644og0 enumC4644og0, String str) {
        this.f19595a = new C5527vh0(view);
        this.f19596b = view.getClass().getCanonicalName();
        this.f19597c = enumC4644og0;
    }

    public final C5527vh0 a() {
        return this.f19595a;
    }

    public final String b() {
        return this.f19596b;
    }

    public final EnumC4644og0 c() {
        return this.f19597c;
    }

    public final String d() {
        return this.f19598d;
    }
}

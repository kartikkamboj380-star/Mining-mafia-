package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import p201u0.C7136b;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4123kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30824a;

    C4123kY(Context context) {
        this.f30824a = context;
    }

    public final com.google.common.util.concurrent.p a(boolean z9) {
        try {
            C7136b c7136bA = new C7136b.a().b(MobileAds.ERROR_DOMAIN).c(z9).a();
            p181s0.a aVarA = p181s0.a.a(this.f30824a);
            return aVarA != null ? aVarA.b(c7136bA) : AbstractC5685wx0.c(new IllegalStateException());
        } catch (Exception e10) {
            return AbstractC5685wx0.c(e10);
        }
    }
}

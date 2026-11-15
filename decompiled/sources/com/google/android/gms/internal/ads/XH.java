package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class XH {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f25174b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25175a;

    static {
        String str = AbstractC4634ob0.f32117a;
        f25174b = Integer.toString(0, 36);
    }

    public XH(String str) {
        this.f25175a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f25174b, this.f25175a);
        return bundle;
    }
}

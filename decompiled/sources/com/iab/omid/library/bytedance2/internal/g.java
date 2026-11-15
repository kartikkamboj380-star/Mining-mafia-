package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f41781b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f41782a;

    private g() {
    }

    public static g b() {
        return f41781b;
    }

    public Context a() {
        return this.f41782a;
    }

    public void a(Context context) {
        this.f41782a = context != null ? context.getApplicationContext() : null;
    }
}

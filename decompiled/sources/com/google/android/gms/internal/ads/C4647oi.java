package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4647oi {
    public static final void a(C4521ni c4521ni, C4269li c4269li) {
        if (c4269li.b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(c4269li.c())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        c4521ni.a(c4269li.b(), c4269li.c(), c4269li.a(), c4269li.d());
    }
}

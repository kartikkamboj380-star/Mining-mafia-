package com.facebook.react.devsupport;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f14801a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14802b;

    static {
        f14802b = Build.VERSION.SDK_INT < 26 ? 2006 : 2038;
    }

    private v0() {
    }
}

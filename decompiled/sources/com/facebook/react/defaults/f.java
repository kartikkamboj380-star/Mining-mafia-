package com.facebook.react.defaults;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f14575a = new f();

    private f() {
    }

    public static final synchronized void a() {
        SoLoader.t("react_newarchdefaults");
        try {
            SoLoader.t("appmodules");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}

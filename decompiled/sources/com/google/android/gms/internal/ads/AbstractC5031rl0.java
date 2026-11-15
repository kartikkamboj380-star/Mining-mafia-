package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5031rl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final File f33007a;

    public AbstractC5031rl0(File file) {
        this.f33007a = file;
    }

    public final File a() {
        return this.f33007a;
    }

    public abstract com.google.common.util.concurrent.p b();

    public abstract com.google.common.util.concurrent.p c(Object obj);
}

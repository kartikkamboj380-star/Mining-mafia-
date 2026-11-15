package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class VP0 extends YP0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Logger f24260a;

    public VP0(String str) {
        this.f24260a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.YP0
    public final void a(String str) {
        this.f24260a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}

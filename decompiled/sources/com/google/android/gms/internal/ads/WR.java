package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class WR extends AbstractC2855aS {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final R4.a f24765k;

    public WR(Executor executor, L4.v vVar, R4.a aVar, R4.c cVar, Context context) {
        super(executor, vVar, cVar, context);
        this.f24765k = aVar;
        aVar.a(this.f26502a);
    }

    public final Map j() {
        return new HashMap(this.f26502a);
    }
}

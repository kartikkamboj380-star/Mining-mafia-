package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3696h80 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f28853a;

    public C3696h80(C5418uq c5418uq, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f28853a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.k(AbstractC5685wx0.i(AbstractC5685wx0.a(new Bundle()), ((Long) H4.B.c().d(AbstractC3892ii.f29798d5)).longValue(), TimeUnit.MILLISECONDS, this.f28853a), C3570g80.f28583a, AbstractC2315Qt.f22473a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 49;
    }
}

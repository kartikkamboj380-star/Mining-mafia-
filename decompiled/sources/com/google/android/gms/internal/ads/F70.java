package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class F70 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18681e;

    private F70(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        this.f18677a = interfaceC4864qQ1;
        this.f18678b = interfaceC4864qQ2;
        this.f18679c = interfaceC4864qQ4;
        this.f18680d = interfaceC4864qQ5;
        this.f18681e = interfaceC4864qQ6;
    }

    public static F70 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        return new F70(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5, interfaceC4864qQ6);
    }

    public static D70 b(C5424ut c5424ut, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z9, boolean z10) {
        return new D70(c5424ut, context, scheduledExecutorService, executor, i10, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new D70(C3825iA.a(), ((C4049jy) this.f18677a).a(), (ScheduledExecutorService) this.f18678b.zzb(), C3129cd0.b(), ((C4450n80) this.f18679c).zzb().intValue(), ((C4576o80) this.f18680d).zzb().booleanValue(), ((C4702p80) this.f18681e).zzb().booleanValue());
    }
}

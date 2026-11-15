package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1713Fd0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.util.concurrent.p f18800d = AbstractC5685wx0.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f18801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1765Gd0 f18803c;

    public AbstractC1713Fd0(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, ScheduledExecutorService scheduledExecutorService, InterfaceC1765Gd0 interfaceC1765Gd0) {
        this.f18801a = interfaceExecutorServiceC1805Gx0;
        this.f18802b = scheduledExecutorService;
        this.f18803c = interfaceC1765Gd0;
    }

    public final C1661Ed0 a(Object obj, com.google.common.util.concurrent.p pVar) {
        return new C1661Ed0(this, obj, null, pVar, Collections.singletonList(pVar), pVar, null);
    }

    public final C5645wd0 b(Object obj, com.google.common.util.concurrent.p... pVarArr) {
        return new C5645wd0(this, obj, Arrays.asList(pVarArr), null);
    }

    protected abstract String c(Object obj);

    final /* synthetic */ InterfaceExecutorServiceC1805Gx0 e() {
        return this.f18801a;
    }

    final /* synthetic */ ScheduledExecutorService f() {
        return this.f18802b;
    }

    final /* synthetic */ InterfaceC1765Gd0 g() {
        return this.f18803c;
    }
}

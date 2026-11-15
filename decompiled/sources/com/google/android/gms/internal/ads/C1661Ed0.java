package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1661Ed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f18534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f18536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1713Fd0 f18537f;

    /* synthetic */ C1661Ed0(AbstractC1713Fd0 abstractC1713Fd0, Object obj, String str, com.google.common.util.concurrent.p pVar, List list, com.google.common.util.concurrent.p pVar2, byte[] bArr) {
        this(abstractC1713Fd0, obj, null, pVar, list, pVar2);
    }

    public final C1661Ed0 a(String str) {
        return new C1661Ed0(this.f18537f, this.f18532a, str, this.f18534c, this.f18535d, this.f18536e);
    }

    public final C1661Ed0 b(final InterfaceC4386md0 interfaceC4386md0) {
        return c(new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Dd0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return AbstractC5685wx0.a(interfaceC4386md0.zza(obj));
            }
        });
    }

    public final C1661Ed0 c(InterfaceC3294dx0 interfaceC3294dx0) {
        return d(interfaceC3294dx0, this.f18537f.e());
    }

    public final C1661Ed0 d(InterfaceC3294dx0 interfaceC3294dx0, Executor executor) {
        return new C1661Ed0(this.f18537f, this.f18532a, this.f18533b, this.f18534c, this.f18535d, AbstractC5685wx0.j(this.f18536e, interfaceC3294dx0, executor));
    }

    public final C1661Ed0 e(final com.google.common.util.concurrent.p pVar) {
        return d(new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Ad0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return pVar;
            }
        }, AbstractC2315Qt.f22479g);
    }

    public final C1661Ed0 f(Class cls, final InterfaceC4386md0 interfaceC4386md0) {
        return g(cls, new InterfaceC3294dx0(interfaceC4386md0) { // from class: com.google.android.gms.internal.ads.Bd0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return AbstractC5685wx0.a("");
            }
        });
    }

    public final C1661Ed0 g(Class cls, InterfaceC3294dx0 interfaceC3294dx0) {
        AbstractC1713Fd0 abstractC1713Fd0 = this.f18537f;
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0E = abstractC1713Fd0.e();
        return new C1661Ed0(abstractC1713Fd0, this.f18532a, this.f18533b, this.f18534c, this.f18535d, AbstractC5685wx0.h(this.f18536e, cls, interfaceC3294dx0, interfaceExecutorServiceC1805Gx0E));
    }

    public final C1661Ed0 h(long j10, TimeUnit timeUnit) {
        AbstractC1713Fd0 abstractC1713Fd0 = this.f18537f;
        ScheduledExecutorService scheduledExecutorServiceF = abstractC1713Fd0.f();
        return new C1661Ed0(abstractC1713Fd0, this.f18532a, this.f18533b, this.f18534c, this.f18535d, AbstractC5685wx0.i(this.f18536e, j10, timeUnit, scheduledExecutorServiceF));
    }

    public final C5393ud0 i() {
        Object obj = this.f18532a;
        String strC = this.f18533b;
        if (strC == null) {
            strC = this.f18537f.c(obj);
        }
        final C5393ud0 c5393ud0 = new C5393ud0(obj, strC, this.f18536e);
        this.f18537f.g().u(c5393ud0);
        com.google.common.util.concurrent.p pVar = this.f18534c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Cd0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17916a.f18537f.g().p(c5393ud0);
            }
        };
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22479g;
        pVar.e(runnable, interfaceExecutorServiceC1805Gx0);
        AbstractC5685wx0.r(c5393ud0, new C6023zd0(this, c5393ud0), interfaceExecutorServiceC1805Gx0);
        return c5393ud0;
    }

    public final C1661Ed0 j(Object obj) {
        return this.f18537f.a(obj, i());
    }

    private C1661Ed0(AbstractC1713Fd0 abstractC1713Fd0, Object obj, String str, com.google.common.util.concurrent.p pVar, List list, com.google.common.util.concurrent.p pVar2) {
        Objects.requireNonNull(abstractC1713Fd0);
        this.f18537f = abstractC1713Fd0;
        this.f18532a = obj;
        this.f18533b = str;
        this.f18534c = pVar;
        this.f18535d = list;
        this.f18536e = pVar2;
    }
}

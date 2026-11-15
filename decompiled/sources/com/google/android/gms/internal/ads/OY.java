package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class OY implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21581g;

    private OY(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        this.f21575a = interfaceC4864qQ0;
        this.f21576b = interfaceC4864qQ1;
        this.f21577c = interfaceC4864qQ2;
        this.f21578d = interfaceC4864qQ3;
        this.f21579e = interfaceC4864qQ4;
        this.f21580f = interfaceC4864qQ5;
        this.f21581g = interfaceC4864qQ6;
    }

    public static OY b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        return new OY(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5, interfaceC4864qQ6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NY zzb() {
        return new NY((LC) this.f21575a.zzb(), (Context) this.f21576b.zzb(), (Executor) this.f21577c.zzb(), (C3857iQ) this.f21578d.zzb(), ((PF) this.f21579e).a(), (InterfaceC1899Is0) this.f21580f.zzb(), (JR) this.f21581g.zzb());
    }
}

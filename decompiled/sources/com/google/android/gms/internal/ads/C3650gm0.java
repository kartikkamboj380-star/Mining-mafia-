package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3650gm0 implements InterfaceC1573Cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1571Ck0 f28730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3147cm0 f28731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2560Vl0 f28732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f28733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5043rr0 f28734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f28735f = new AtomicReference();

    C3650gm0(C1571Ck0 c1571Ck0, C3147cm0 c3147cm0, InterfaceC2560Vl0 interfaceC2560Vl0, ExecutorService executorService, C5043rr0 c5043rr0) {
        this.f28730a = c1571Ck0;
        this.f28731b = c3147cm0;
        this.f28732c = interfaceC2560Vl0;
        this.f28733d = executorService;
        this.f28734e = c5043rr0;
    }

    public final com.google.common.util.concurrent.p a(Context context) {
        return ((InterfaceC2508Ul0) this.f28735f.get()).e(context);
    }

    public final com.google.common.util.concurrent.p b(Context context, String str, View view, Activity activity) {
        return ((InterfaceC2508Ul0) this.f28735f.get()).a(context, null, view, activity);
    }

    public final com.google.common.util.concurrent.p c(Context context, String str, View view, Activity activity) {
        return ((InterfaceC2508Ul0) this.f28735f.get()).b(context, str, view, null);
    }

    public final void d(InputEvent inputEvent) {
        InterfaceC2508Ul0 interfaceC2508Ul0 = (InterfaceC2508Ul0) this.f28735f.get();
        if (interfaceC2508Ul0 == null) {
            this.f28734e.b(54);
        } else {
            interfaceC2508Ul0.c(inputEvent);
        }
    }

    final /* synthetic */ InterfaceC2508Ul0 e(InterfaceC2508Ul0 interfaceC2508Ul0) {
        this.f28735f.set(interfaceC2508Ul0);
        return interfaceC2508Ul0;
    }

    final /* synthetic */ InterfaceC2560Vl0 f() {
        return this.f28732c;
    }

    public final int g() {
        InterfaceC2508Ul0 interfaceC2508Ul0 = (InterfaceC2508Ul0) this.f28735f.get();
        if (interfaceC2508Ul0 == null) {
            return 1;
        }
        return interfaceC2508Ul0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        C3147cm0 c3147cm0 = this.f28731b;
        C1571Ck0 c1571Ck0 = this.f28730a;
        AbstractC4678ox0 abstractC4678ox0 = (AbstractC4678ox0) AbstractC5685wx0.k(AbstractC4678ox0.B(c3147cm0.b(c1571Ck0.h0(), c1571Ck0.j0())), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.fm0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                InterfaceC2508Ul0 interfaceC2508Ul0 = (InterfaceC2508Ul0) obj;
                this.f28475a.e(interfaceC2508Ul0);
                return interfaceC2508Ul0;
            }
        }, AbstractC2272Px0.a());
        AbstractC5685wx0.r(abstractC4678ox0, new C3398em0(this), this.f28733d);
        return abstractC4678ox0;
    }
}

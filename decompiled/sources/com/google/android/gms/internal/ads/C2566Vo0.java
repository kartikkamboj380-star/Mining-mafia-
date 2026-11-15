package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2566Vo0 implements InterfaceC1995Ko0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1463Ai0 f24556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1789Gp0 f24557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1687Eq0 f24558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5043rr0 f24559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f24560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f24561f = new AtomicReference("2.825731049.-1");

    C2566Vo0(C1463Ai0 c1463Ai0, InterfaceC1789Gp0 interfaceC1789Gp0, InterfaceC1687Eq0 interfaceC1687Eq0, C5043rr0 c5043rr0, ExecutorService executorService) {
        this.f24556a = c1463Ai0;
        this.f24557b = interfaceC1789Gp0;
        this.f24558c = interfaceC1687Eq0;
        this.f24559d = c5043rr0;
        this.f24560e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final com.google.common.util.concurrent.p a(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return AbstractC5685wx0.d(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.Ro0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final /* synthetic */ Context f22918b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final /* synthetic */ View f22919c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final /* synthetic */ Activity f22920d;

            {
                this.f22919c = view;
                this.f22920d = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f22917a.i(this.f22918b, null, this.f22919c, this.f22920d);
            }
        }, this.f24560e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final com.google.common.util.concurrent.p b(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return AbstractC5685wx0.d(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.So0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final /* synthetic */ Context f23322b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final /* synthetic */ String f23323c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final /* synthetic */ View f23324d;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f23321a.j(this.f23322b, this.f23323c, this.f23324d, null);
            }
        }, this.f24560e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final void c(InputEvent inputEvent) {
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f24556a.b();
        if (interfaceC1877Ih0B == null) {
            this.f24559d.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                interfaceC1877Ih0B.a(null, (MotionEvent) inputEvent);
            } catch (C5907yi0 e10) {
                this.f24559d.d(15005, e10);
            }
        }
    }

    final /* synthetic */ boolean d(C2456Tl0 c2456Tl0) {
        if (this.f24558c.a(c2456Tl0) && c2456Tl0 != null) {
            return true;
        }
        this.f24559d.b(15003);
        throw new C2047Lo0(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final com.google.common.util.concurrent.p e(final Context context) {
        return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.Qo0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f22455a.h(context);
            }
        }, this.f24560e);
    }

    final /* synthetic */ com.google.common.util.concurrent.p f(Boolean bool) {
        return this.f24557b.zze();
    }

    final /* synthetic */ boolean g(final C4774pi0 c4774pi0) {
        if (c4774pi0 == null) {
            throw new C2047Lo0(3);
        }
        File fileB = c4774pi0.b();
        if (Build.VERSION.SDK_INT >= 34) {
            fileB.setReadOnly();
        }
        this.f24559d.f(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.To0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f23616a.k(c4774pi0);
            }
        });
        return true;
    }

    final /* synthetic */ String h(Context context) {
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f24556a.b();
        if (interfaceC1877Ih0B == null) {
            this.f24559d.b(15004);
            return "";
        }
        String strB = interfaceC1877Ih0B.b(context, null);
        if (strB != null) {
            return strB;
        }
        this.f24559d.b(15006);
        return "";
    }

    final /* synthetic */ String i(Context context, String str, View view, Activity activity) {
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f24556a.b();
        if (interfaceC1877Ih0B == null) {
            this.f24559d.b(15004);
            return "";
        }
        String strC = interfaceC1877Ih0B.c(context, null, view, activity);
        if (strC != null) {
            return strC;
        }
        this.f24559d.b(15007);
        return "";
    }

    final /* synthetic */ String j(Context context, String str, View view, Activity activity) {
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f24556a.b();
        if (interfaceC1877Ih0B == null) {
            this.f24559d.b(15004);
            return "";
        }
        String strD = interfaceC1877Ih0B.d(context, null, str, view, null);
        if (strD != null) {
            return strD;
        }
        this.f24559d.b(15008);
        return "";
    }

    final /* synthetic */ void k(C4774pi0 c4774pi0) {
        if (!this.f24556a.a(c4774pi0)) {
            throw new C2047Lo0(2);
        }
        this.f24561f.set("2.825731049.".concat(String.valueOf(c4774pi0.a().d0())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final String zza() {
        return (String) this.f24561f.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final com.google.common.util.concurrent.p zzb() {
        return (AbstractC4678ox0) AbstractC5685wx0.k((AbstractC4678ox0) AbstractC5685wx0.k((AbstractC4678ox0) AbstractC5685wx0.j((AbstractC4678ox0) AbstractC5685wx0.k((AbstractC4678ox0) AbstractC5685wx0.g(AbstractC4678ox0.B(this.f24557b.zzb()), Throwable.class, C2514Uo0.f24086a, AbstractC2272Px0.a()), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.Mo0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                this.f20926a.d((C2456Tl0) obj);
                return new Boolean(true);
            }
        }, AbstractC2272Px0.a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.No0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f21343a.f((Boolean) obj);
            }
        }, AbstractC2272Px0.a()), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.Oo0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                this.f21673a.g((C4774pi0) obj);
                return new Boolean(true);
            }
        }, AbstractC2272Px0.a()), C2254Po0.f22195a, AbstractC2272Px0.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1995Ko0
    public final int zzg() {
        return 3;
    }
}

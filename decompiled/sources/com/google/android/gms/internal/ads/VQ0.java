package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public final class VQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f24261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InterfaceC3471fM f24262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    InterfaceC4166kt0 f24263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC4166kt0 f24264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceC4166kt0 f24265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    InterfaceC4166kt0 f24266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    InterfaceC4166kt0 f24267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    InterfaceC1899Is0 f24268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Looper f24269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f24270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    C4966rF f24271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f24272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f24273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MS0 f24274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    LS0 f24275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long f24276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    long f24277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f24278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f24279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f24280t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f24281u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f24282v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f24283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f24284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    BQ0 f24285y;

    public VQ0(final Context context, final JS0 js0) {
        InterfaceC4166kt0 interfaceC4166kt0 = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.UQ0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return js0;
            }
        };
        InterfaceC4166kt0 interfaceC4166kt1 = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.OQ0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return new C3876iZ0(context, new E1());
            }
        };
        InterfaceC4166kt0 interfaceC4166kt2 = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.QQ0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return new C3048c(context);
            }
        };
        NQ0 nq0 = NQ0.f21252a;
        InterfaceC4166kt0 interfaceC4166kt3 = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.RQ0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return C5690x.c(context);
            }
        };
        MQ0 mq0 = MQ0.f20831a;
        context.getClass();
        this.f24261a = context;
        this.f24263c = interfaceC4166kt0;
        this.f24264d = interfaceC4166kt1;
        this.f24265e = interfaceC4166kt2;
        this.f24266f = nq0;
        this.f24267g = interfaceC4166kt3;
        this.f24268h = mq0;
        this.f24269i = AbstractC4634ob0.A();
        this.f24271k = C4966rF.f32864b;
        this.f24272l = 1;
        this.f24273m = true;
        this.f24274n = MS0.f20838e;
        this.f24275o = LS0.f20525i;
        this.f24285y = new BQ0(0.97f, 1.03f, 1000L, 1.0E-7f, AbstractC4634ob0.M(20L), AbstractC4634ob0.M(500L), 0.999f, null);
        this.f24262b = InterfaceC3471fM.f28270a;
        this.f24276p = 500L;
        this.f24277q = 2000L;
        this.f24278r = 600000;
        this.f24279s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f24280t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f24281u = 600000;
        this.f24282v = true;
        this.f24284x = "";
        this.f24270j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i10 = KQ0.f20193a;
        }
    }
}

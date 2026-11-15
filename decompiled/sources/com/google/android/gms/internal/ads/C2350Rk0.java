package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2350Rk0 implements InterfaceC1575Cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1883Ik0 f22898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2194Ok0 f22899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f22901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f22902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f22903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f22904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1966Ka f22905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC2894al0 f22906i;

    /* synthetic */ C2350Rk0(C1883Ik0 c1883Ik0, C2194Ok0 c2194Ok0, byte[] bArr) {
        this.f22898a = c1883Ik0;
        this.f22899b = c2194Ok0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* bridge */ /* synthetic */ InterfaceC1575Cm0 a(Map map) {
        this.f22904g = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* bridge */ /* synthetic */ InterfaceC1575Cm0 b(Context context) {
        context.getClass();
        this.f22900c = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* bridge */ /* synthetic */ InterfaceC1575Cm0 c(C1966Ka c1966Ka) {
        c1966Ka.getClass();
        this.f22905h = c1966Ka;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* bridge */ /* synthetic */ InterfaceC1575Cm0 d(EnumC2894al0 enumC2894al0) {
        enumC2894al0.getClass();
        this.f22906i = enumC2894al0;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* synthetic */ InterfaceC1575Cm0 e(Activity activity) {
        this.f22902e = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* synthetic */ InterfaceC1575Cm0 f(View view) {
        this.f22901d = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final /* synthetic */ InterfaceC1575Cm0 k(String str) {
        this.f22903f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1575Cm0
    public final InterfaceC1627Dm0 zza() {
        AbstractC4738pQ0.c(this.f22900c, Context.class);
        AbstractC4738pQ0.c(this.f22904g, Map.class);
        AbstractC4738pQ0.c(this.f22905h, C1966Ka.class);
        AbstractC4738pQ0.c(this.f22906i, EnumC2894al0.class);
        return new C2402Sk0(this.f22898a, this.f22899b, this.f22900c, this.f22901d, this.f22902e, this.f22903f, this.f22904g, this.f22905h, this.f22906i);
    }
}

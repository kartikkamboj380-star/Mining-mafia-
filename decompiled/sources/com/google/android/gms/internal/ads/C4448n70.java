package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4448n70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f31700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f31701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f31702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f31703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f31704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f31705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f31706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f31707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f31708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f31709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f31710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f31711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f31712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f31713t;

    public C4448n70(boolean z9, boolean z10, String str, boolean z11, boolean z12, boolean z13, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z14, String str6, long j10, boolean z15, String str7, int i10, String str8, String str9, String str10) {
        this.f31694a = z9;
        this.f31695b = z10;
        this.f31696c = str;
        this.f31697d = z11;
        this.f31698e = z12;
        this.f31699f = z13;
        this.f31700g = str2;
        this.f31701h = str8;
        this.f31703j = arrayList;
        this.f31704k = str3;
        this.f31705l = str4;
        this.f31706m = str5;
        this.f31707n = z14;
        this.f31708o = str6;
        this.f31709p = j10;
        this.f31710q = z15;
        this.f31711r = str7;
        this.f31712s = i10;
        this.f31713t = str10;
        this.f31702i = str9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0072  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = ((AF) obj).f17275a;
        bundle.putBoolean("cog", this.f31694a);
        bundle.putBoolean("coh", this.f31695b);
        bundle.putString("gl", this.f31696c);
        bundle.putBoolean("simulator", this.f31697d);
        bundle.putBoolean("is_latchsky", this.f31698e);
        bundle.putInt("build_api_level", this.f31712s);
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.zc)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f31699f);
        }
        bundle.putString("hl", this.f31700g);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ue)).booleanValue()) {
            bundle.putString("dlc", this.f31701h);
        } else if (((Boolean) H4.B.c().d(AbstractC3892ii.Ve)).booleanValue()) {
            bundle.putString("dlc", this.f31701h);
        }
        ArrayList<String> arrayList = this.f31703j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.f31702i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f31704k);
        bundle.putString("submodel", this.f31708o);
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.f31706m);
        bundleA.putLong("remaining_data_partition_space", this.f31709p);
        Bundle bundleA2 = AbstractC2176Ob0.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f31707n);
        String str3 = this.f31705l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleA3 = AbstractC2176Ob0.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", str3);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Pc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f31710q);
        }
        String str4 = this.f31711r;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Jc)).booleanValue()) {
            AbstractC2176Ob0.d(bundle, "gotmt_l", true, ((Boolean) H4.B.c().d(AbstractC3892ii.Gc)).booleanValue());
            AbstractC2176Ob0.d(bundle, "gotmt_i", true, ((Boolean) H4.B.c().d(AbstractC3892ii.Fc)).booleanValue());
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.Lf)).booleanValue() || (str = this.f31713t) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AF) obj).f17276b;
        bundle.putBoolean("simulator", this.f31697d);
        bundle.putInt("build_api_level", this.f31712s);
        ArrayList<String> arrayList = this.f31703j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.f31708o);
    }
}

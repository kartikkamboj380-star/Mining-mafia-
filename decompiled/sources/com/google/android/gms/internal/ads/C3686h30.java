package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3686h30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4.m2 f28828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f28837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F.b f28838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z20 f28839l;

    public C3686h30(H4.m2 m2Var, String str, boolean z9, String str2, float f10, int i10, int i11, String str3, int i12, boolean z10, F.b bVar, Z20 z20) {
        Preconditions.checkNotNull(m2Var, "the adSize must not be null");
        this.f28828a = m2Var;
        this.f28829b = str;
        this.f28830c = z9;
        this.f28831d = str2;
        this.f28832e = f10;
        this.f28833f = i10;
        this.f28834g = i11;
        this.f28835h = str3;
        this.f28836i = i12;
        this.f28837j = z10;
        this.f28838k = bVar;
        this.f28839l = z20;
    }

    private final void a(Bundle bundle) {
        H4.m2 m2Var = this.f28828a;
        int i10 = m2Var.f1375e;
        AbstractC2176Ob0.b(bundle, "smart_w", "full", i10 == -1);
        int i11 = m2Var.f1372b;
        AbstractC2176Ob0.b(bundle, "smart_h", "auto", i11 == -2);
        AbstractC2176Ob0.d(bundle, "ene", true, m2Var.f1380j);
        AbstractC2176Ob0.b(bundle, "rafmt", "102", m2Var.f1383m);
        AbstractC2176Ob0.b(bundle, "rafmt", "103", m2Var.f1384v);
        AbstractC2176Ob0.b(bundle, "rafmt", "105", m2Var.f1385w);
        AbstractC2176Ob0.d(bundle, "inline_adaptive_slot", true, this.f28837j);
        AbstractC2176Ob0.d(bundle, "interscroller_slot", true, m2Var.f1385w);
        AbstractC2176Ob0.e(bundle, "format", this.f28829b);
        AbstractC2176Ob0.b(bundle, "fluid", "height", this.f28830c);
        String str = this.f28831d;
        AbstractC2176Ob0.b(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f28832e);
        bundle.putInt("sw", this.f28833f);
        bundle.putInt("sh", this.f28834g);
        String str2 = this.f28835h;
        AbstractC2176Ob0.b(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i12 = this.f28836i;
        if (i12 != -1) {
            bundle.putInt("u_mso", i12);
        }
        F.b bVar = this.f28838k;
        if (bVar != null) {
            bundle.putInt("sam_t", bVar.f651b);
            bundle.putInt("sam_b", bVar.f653d);
            bundle.putInt("sam_l", bVar.f650a);
            bundle.putInt("sam_r", bVar.f652c);
        }
        Z20 z20 = this.f28839l;
        if (z20 != null) {
            bundle.putInt("rc_tl", z20.f26089a);
            bundle.putInt("rc_tr", z20.f26090b);
            bundle.putInt("rc_bl", z20.f26091c);
            bundle.putInt("rc_br", z20.f26092d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        H4.m2[] m2VarArr = m2Var.f1377g;
        if (m2VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i11);
            bundle2.putInt("width", i10);
            bundle2.putBoolean("is_fluid_height", m2Var.f1379i);
            arrayList.add(bundle2);
        } else {
            for (H4.m2 m2Var2 : m2VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", m2Var2.f1379i);
                bundle3.putInt("height", m2Var2.f1372b);
                bundle3.putInt("width", m2Var2.f1375e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* synthetic */ void zza(Object obj) {
        a(((AF) obj).f17275a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* synthetic */ void zzb(Object obj) {
        a(((AF) obj).f17276b);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4824q60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f32571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32575f;

    public C4824q60(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f32570a = str;
        this.f32571b = num;
        this.f32572c = str2;
        this.f32573d = str3;
        this.f32574e = str4;
        this.f32575f = str5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        AbstractC2176Ob0.e(bundle, "pn", this.f32570a);
        AbstractC2176Ob0.h(bundle, "vc", this.f32571b);
        AbstractC2176Ob0.e(bundle, "vnm", this.f32572c);
        AbstractC2176Ob0.e(bundle, "dl", this.f32573d);
        AbstractC2176Ob0.e(bundle, "ins_pn", this.f32574e);
        AbstractC2176Ob0.e(bundle, "ini_pn", this.f32575f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AF) obj).f17276b;
        AbstractC2176Ob0.e(bundle, "pn", this.f32570a);
        AbstractC2176Ob0.e(bundle, "dl", this.f32573d);
    }
}

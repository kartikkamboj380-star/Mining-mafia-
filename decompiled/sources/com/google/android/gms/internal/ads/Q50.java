package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class Q50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22297e;

    public Q50(String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f22293a = str;
        this.f22294b = z9;
        this.f22295c = z10;
        this.f22296d = z11;
        this.f22297e = z12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        String str = this.f22293a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z9 = this.f22294b;
        bundle.putInt("test_mode", z9 ? 1 : 0);
        boolean z10 = this.f22295c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z9 || z10) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ha)).booleanValue()) {
                bundle.putInt("risd", !this.f22296d ? 1 : 0);
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.La)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f22297e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AF) obj).f17276b;
        String str = this.f22293a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z9 = this.f22294b;
        bundle.putInt("test_mode", z9 ? 1 : 0);
        boolean z10 = this.f22295c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z9 || z10) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.La)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f22297e);
            }
        }
    }
}

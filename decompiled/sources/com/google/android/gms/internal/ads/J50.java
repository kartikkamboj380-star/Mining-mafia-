package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class J50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f19755a;

    public J50(Boolean bool) {
        this.f19755a = bool;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.f19755a;
        AF af = (AF) obj;
        if (bool != null) {
            af.f17275a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class A50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f17240a;

    public A50(Integer num) {
        this.f17240a = num;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.f17240a;
        AF af = (AF) obj;
        if (num != null) {
            af.f17275a.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}

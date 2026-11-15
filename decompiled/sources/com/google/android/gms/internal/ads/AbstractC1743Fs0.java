package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1743Fs0 implements InterfaceC2470Ts0 {
    protected AbstractC1743Fs0() {
    }

    public static AbstractC1743Fs0 b(char c10) {
        return new C1587Cs0(c10);
    }

    public abstract boolean a(char c10);

    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ts0
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}

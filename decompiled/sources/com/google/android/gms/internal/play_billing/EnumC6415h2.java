package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6415h2 implements InterfaceC6452r0 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final InterfaceC6456s0 f37224f = new InterfaceC6456s0() { // from class: com.google.android.gms.internal.play_billing.f2
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37226a;

    EnumC6415h2(int i10) {
        this.f37226a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f37226a);
    }
}

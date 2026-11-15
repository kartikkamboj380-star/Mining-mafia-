package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6411g2 implements InterfaceC6460t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final InterfaceC6460t0 f37216a = new C6411g2();

    private C6411g2() {
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6460t0
    public final boolean a(int i10) {
        EnumC6415h2 enumC6415h2;
        EnumC6415h2 enumC6415h3 = EnumC6415h2.BROADCAST_ACTION_UNSPECIFIED;
        if (i10 == 0) {
            enumC6415h2 = EnumC6415h2.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            enumC6415h2 = EnumC6415h2.PURCHASES_UPDATED_ACTION;
        } else if (i10 != 2) {
            enumC6415h2 = i10 != 3 ? null : EnumC6415h2.ALTERNATIVE_BILLING_ACTION;
        } else {
            enumC6415h2 = EnumC6415h2.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return enumC6415h2 != null;
    }
}

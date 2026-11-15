package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
final class U1 implements InterfaceC6460t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final InterfaceC6460t0 f37143a = new U1();

    private U1() {
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6460t0
    public final boolean a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (i10) {
                    case 22:
                    case 23:
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 25:
                    case 26:
                        return true;
                    default:
                        return false;
                }
        }
    }
}

package p117l6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p087i6.g;

/* JADX INFO: renamed from: l6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C7044e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float f46155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46156b;

    private C7044e(Float f10, boolean z9) {
        this.f46156b = z9;
        this.f46155a = f10;
    }

    public static C7044e a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            g.f().e("An error occurred getting battery state.", e10);
        }
        return new C7044e(fD, zE);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f46155a;
    }

    public int c() {
        Float f10;
        if (!this.f46156b || (f10 = this.f46155a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}

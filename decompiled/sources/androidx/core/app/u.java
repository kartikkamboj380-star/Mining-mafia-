package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    private static int a(boolean z9, int i10) {
        int i11;
        if (!z9) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i11 | i10;
    }

    public static PendingIntent b(Context context, int i10, Intent intent, int i11, boolean z9) {
        return PendingIntent.getActivity(context, i10, intent, a(z9, i11));
    }
}

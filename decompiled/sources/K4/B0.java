package K4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class B0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ F0 f2590a;

    /* synthetic */ B0(F0 f10, byte[] bArr) {
        Objects.requireNonNull(f10);
        this.f2590a = f10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.f2590a.b0(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f2590a.b0(false);
        }
    }
}

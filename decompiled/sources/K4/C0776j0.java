package K4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: K4.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0776j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0778k0 f2671a;

    C0776j0(C0778k0 c0778k0) {
        Objects.requireNonNull(c0778k0);
        this.f2671a = c0778k0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2671a.d(context, intent);
    }
}

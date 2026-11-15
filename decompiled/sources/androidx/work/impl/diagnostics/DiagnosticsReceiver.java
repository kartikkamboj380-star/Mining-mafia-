package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.B;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.q;
import androidx.work.s;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11334a = q.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q.e().a(f11334a, "Requesting diagnostics");
        try {
            B.h(context).c(s.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            q.e().d(f11334a, "WorkManager is not initialized", e10);
        }
    }
}

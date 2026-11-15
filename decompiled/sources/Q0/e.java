package Q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f4783f;

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, U0.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f4783f = new a();
    }

    @Override // Q0.h
    public void h() {
        q.e().a(f.f4785a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f4783f, j());
    }

    @Override // Q0.h
    public void i() {
        q.e().a(f.f4785a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f4783f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}

package androidx.work.impl.background.systemalarm;

import T0.x;
import android.content.Intent;
import androidx.lifecycle.AbstractServiceC1175v;
import androidx.work.q;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC1175v implements e.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11287d = q.i("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f11288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11289c;

    private void e() {
        e eVar = new e(this);
        this.f11288b = eVar;
        eVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f11289c = true;
        q.e().a(f11287d, "All commands completed in dispatcher");
        x.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC1175v, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f11289c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC1175v, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11289c = true;
        this.f11288b.j();
    }

    @Override // androidx.lifecycle.AbstractServiceC1175v, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f11289c) {
            q.e().f(f11287d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f11288b.j();
            e();
            this.f11289c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11288b.a(intent, i11);
        return 3;
    }
}

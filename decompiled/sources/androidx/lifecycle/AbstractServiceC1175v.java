package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1175v extends Service implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f10244a = new Q(this);

    @Override // androidx.lifecycle.r
    public AbstractC1164j getLifecycle() {
        return this.f10244a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f10244a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f10244a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f10244a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f10244a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}

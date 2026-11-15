package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2238Pg0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2238Pg0 f22144d = new C2238Pg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f22145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22146b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22147c = false;

    public static C2238Pg0 a() {
        return f22144d;
    }

    public final void b(Context context) {
        if (context == null) {
            return;
        }
        this.f22145a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C2186Og0(this), intentFilter);
    }

    public final void c() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f22145a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        d(this.f22146b, zIsDeviceLocked);
        this.f22147c = zIsDeviceLocked;
    }

    public final void d(boolean z9, boolean z10) {
        if ((z10 || z9) == (this.f22147c || this.f22146b)) {
            return;
        }
        Iterator it = C1719Fg0.a().e().iterator();
        while (it.hasNext()) {
            ((C4266lg0) it.next()).g().g(z10 || z9);
        }
    }

    final /* synthetic */ void e(boolean z9) {
        this.f22146b = z9;
    }

    final /* synthetic */ boolean f() {
        return this.f22147c;
    }
}

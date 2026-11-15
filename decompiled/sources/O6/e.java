package O6;

import W6.k;
import X6.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final R6.a f4561i = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4562a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f4563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X6.f f4564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f4565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p007a6.f f4566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final G6.b f4567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final H6.e f4568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G6.b f4569h;

    e(p007a6.f fVar, G6.b bVar, H6.e eVar, G6.b bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f4565d = null;
        this.f4566e = fVar;
        this.f4567f = bVar;
        this.f4568g = eVar;
        this.f4569h = bVar2;
        if (fVar == null) {
            this.f4565d = Boolean.FALSE;
            this.f4563b = aVar;
            this.f4564c = new X6.f(new Bundle());
            return;
        }
        k.k().r(fVar, eVar, bVar2);
        Context contextM = fVar.m();
        X6.f fVarA = a(contextM);
        this.f4564c = fVarA;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f4563b = aVar;
        aVar.Q(fVarA);
        aVar.O(contextM);
        sessionManager.setApplicationContext(contextM);
        this.f4565d = aVar.j();
        R6.a aVar2 = f4561i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", R6.b.b(fVar.r().g(), contextM.getPackageName())));
        }
    }

    private static X6.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new X6.f(bundle) : new X6.f();
    }

    public static e c() {
        return (e) p007a6.f.o().k(e.class);
    }

    public static Trace h(String str) {
        Trace traceC = Trace.c(str);
        traceC.start();
        return traceC;
    }

    public Map b() {
        return new HashMap(this.f4562a);
    }

    public boolean d() {
        Boolean bool = this.f4565d;
        return bool != null ? bool.booleanValue() : p007a6.f.o().x();
    }

    public S6.g e(String str, String str2) {
        return new S6.g(str, str2, k.k(), new l());
    }

    public Trace f(String str) {
        return Trace.c(str);
    }

    public synchronized void g(Boolean bool) {
        try {
            p007a6.f.o();
            if (this.f4563b.i().booleanValue()) {
                f4561i.f("Firebase Performance is permanently disabled");
                return;
            }
            this.f4563b.P(bool);
            if (bool != null) {
                this.f4565d = bool;
            } else {
                this.f4565d = this.f4563b.j();
            }
            if (Boolean.TRUE.equals(this.f4565d)) {
                f4561i.f("Firebase Performance is Enabled");
            } else if (Boolean.FALSE.equals(this.f4565d)) {
                f4561i.f("Firebase Performance is Disabled");
            }
        } catch (IllegalStateException unused) {
        }
    }
}

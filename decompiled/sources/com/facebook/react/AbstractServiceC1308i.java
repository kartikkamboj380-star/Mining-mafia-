package com.facebook.react;

import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1308i extends Service implements p224w3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14856b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static PowerManager.WakeLock f14857c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f14858a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: com.facebook.react.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            PowerManager.WakeLock wakeLock;
            Intrinsics.checkNotNullParameter(context, "context");
            if (AbstractServiceC1308i.f14857c == null || !((wakeLock = AbstractServiceC1308i.f14857c) == null || wakeLock.isHeld())) {
                Object systemService = context.getSystemService("power");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, AbstractServiceC1308i.class.getCanonicalName());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                AbstractServiceC1308i.f14857c = wakeLockNewWakeLock;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.i$b */
    public static final class b implements InterfaceC1412z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p224w3.a f14860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactHost f14861c;

        b(p224w3.a aVar, ReactHost reactHost) {
            this.f14860b = aVar;
            this.f14861c = reactHost;
        }

        @Override // com.facebook.react.InterfaceC1412z
        public void a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractServiceC1308i.this.m(context, this.f14860b);
            this.f14861c.removeReactInstanceEventListener(this);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.i$c */
    public static final class c implements InterfaceC1412z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p224w3.a f14863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f14864c;

        c(p224w3.a aVar, H h10) {
            this.f14863b = aVar;
            this.f14864c = h10;
        }

        @Override // com.facebook.react.InterfaceC1412z
        public void a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractServiceC1308i.this.m(context, this.f14863b);
            this.f14864c.o0(this);
        }
    }

    public static final void g(Context context) {
        f14856b.a(context);
    }

    private final void h(p224w3.a aVar) {
        if (!p204u3.i.a()) {
            H hN = k().n();
            Intrinsics.checkNotNullExpressionValue(hN, "getReactInstanceManager(...)");
            hN.s(new c(aVar, hN));
            hN.z();
            return;
        }
        ReactHost reactHostJ = j();
        if (reactHostJ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHostJ.addReactInstanceEventListener(new b(aVar, reactHostJ));
        reactHostJ.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ReactContext reactContext, final p224w3.a aVar) {
        final p224w3.e eVarA = p224w3.e.f50263g.a(reactContext);
        eVarA.e(this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC1308i.n(eVarA, aVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(p224w3.e eVar, p224w3.a aVar, AbstractServiceC1308i abstractServiceC1308i) {
        abstractServiceC1308i.f14858a.add(Integer.valueOf(eVar.q(aVar)));
    }

    @Override // p224w3.f
    public void a(int i10) {
    }

    @Override // p224w3.f
    public void b(int i10) {
        this.f14858a.remove(Integer.valueOf(i10));
        if (this.f14858a.isEmpty()) {
            stopSelf();
        }
    }

    protected final ReactContext i() {
        if (!p204u3.i.a()) {
            H hN = k().n();
            Intrinsics.checkNotNullExpressionValue(hN, "getReactInstanceManager(...)");
            return hN.D();
        }
        ReactHost reactHostJ = j();
        if (reactHostJ != null) {
            return reactHostJ.getCurrentReactContext();
        }
        throw new IllegalStateException("ReactHost is not initialized in New Architecture");
    }

    protected ReactHost j() {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.d(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) application).getReactHost();
    }

    protected M k() {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.d(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) application).getReactNativeHost();
    }

    protected abstract p224w3.a l(Intent intent);

    protected final void o(p224w3.a taskConfig) {
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        UiThreadUtil.assertOnUiThread();
        f14856b.a(this);
        ReactContext reactContextI = i();
        if (reactContextI == null) {
            h(taskConfig);
        } else {
            m(reactContextI, taskConfig);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReactContext reactContextI = i();
        if (reactContextI != null) {
            p224w3.e.f50263g.a(reactContextI).k(this);
        }
        PowerManager.WakeLock wakeLock = f14857c;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        p224w3.a aVarL = l(intent);
        if (aVarL == null) {
            return 2;
        }
        o(aVarL);
        return 3;
    }
}

package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f14943l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f14944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Choreographer f14945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f14946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f14947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f14948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f14953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14954k;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f14944a = reactContext;
        this.f14946c = new d();
        this.f14947d = -1L;
        this.f14948e = -1L;
        this.f14953j = 60.0d;
        this.f14954k = true;
    }

    private final int h() {
        return this.f14952i - 1;
    }

    private final int i() {
        return (int) ((this.f14948e - this.f14947d) / 1000000.0d);
    }

    public static /* synthetic */ void m(h hVar, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = hVar.f14953j;
        }
        hVar.l(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f14945b = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f14945b = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(hVar);
        }
    }

    public final int c() {
        return this.f14951h;
    }

    public final int d() {
        return (int) (((this.f14953j * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f14947d == -1) {
            this.f14947d = j10;
        }
        long j11 = this.f14948e;
        this.f14948e = j10;
        if (this.f14946c.d(j11, j10)) {
            this.f14952i++;
        }
        this.f14949f++;
        int iD = d();
        if ((iD - this.f14950g) - 1 >= 4) {
            this.f14951h++;
        }
        this.f14950g = iD;
        Choreographer choreographer = this.f14945b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f14948e == this.f14947d) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / (this.f14948e - this.f14947d);
    }

    public final double f() {
        if (this.f14948e == this.f14947d) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / (this.f14948e - this.f14947d);
    }

    public final int g() {
        return this.f14949f - 1;
    }

    public final boolean j() {
        return this.f14954k;
    }

    public final void k() {
        this.f14947d = -1L;
        this.f14948e = -1L;
        this.f14949f = 0;
        this.f14951h = 0;
        this.f14952i = 0;
    }

    public final void l(double d10) {
        if (!p084i3.a.f45070f) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f14944a.getNativeModule(UIManagerModule.class);
            if (this.f14944a.isBridgeless()) {
                this.f14954k = true;
            } else {
                this.f14944a.getCatalystInstance().addBridgeIdleDebugListener(this.f14946c);
                this.f14954k = false;
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(this.f14946c);
            }
        }
        this.f14953j = d10;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.f
            @Override // java.lang.Runnable
            public final void run() {
                h.n(this.f14941a);
            }
        });
    }

    public final void o() {
        if (!p084i3.a.f45070f) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f14944a.getNativeModule(UIManagerModule.class);
            if (!this.f14944a.isBridgeless()) {
                this.f14944a.getCatalystInstance().removeBridgeIdleDebugListener(this.f14946c);
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(null);
            }
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.g
            @Override // java.lang.Runnable
            public final void run() {
                h.p(this.f14942a);
            }
        });
    }
}

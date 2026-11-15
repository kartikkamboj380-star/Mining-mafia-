package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4101kN extends AbstractBinderC3142ck implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, NN {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC5931yu0 f30763w = AbstractC5931yu0.p("2011", "1009", "3010");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30764a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f30766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f30767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f30768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f30769f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JM f30771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC5772xe f30772i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC2607Wj f30774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30775l;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private GestureDetector f30777v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f30765b = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.dynamic.a f30773j = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30776m = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30770g = ModuleDescriptor.MODULE_VERSION;

    public ViewTreeObserverOnGlobalLayoutListenerC4101kN(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.f30766c = frameLayout;
        this.f30767d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f30764a = str;
        G4.t.c();
        C3287du.a(frameLayout, this);
        G4.t.c();
        C3287du.b(frameLayout, this);
        this.f30768e = AbstractC2315Qt.f22478f;
        this.f30772i = new ViewOnAttachStateChangeListenerC5772xe(this.f30766c.getContext(), this.f30766c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void b0(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f30767d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f30767d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        L4.p.g("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.f30767d.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void g() {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.Yc)).booleanValue() || this.f30771h.r() == 0) {
            return;
        }
        this.f30777v = new GestureDetector(this.f30766c.getContext(), new GestureDetectorOnGestureListenerC5108sN(this.f30771h, this));
    }

    private final synchronized void zzu() {
        this.f30768e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jN
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30411a.f();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void B5(com.google.android.gms.dynamic.a aVar) {
        if (this.f30776m) {
            return;
        }
        this.f30773j = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void E4(String str, com.google.android.gms.dynamic.a aVar) {
        t1(str, (View) com.google.android.gms.dynamic.b.h0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void G1(com.google.android.gms.dynamic.a aVar) {
        onTouch(this.f30766c, (MotionEvent) com.google.android.gms.dynamic.b.h0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized com.google.android.gms.dynamic.a H(String str) {
        return com.google.android.gms.dynamic.b.N0(T(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void J3(InterfaceC2607Wj interfaceC2607Wj) {
        if (!this.f30776m) {
            this.f30775l = true;
            this.f30774k = interfaceC2607Wj;
            JM jm = this.f30771h;
            if (jm != null) {
                jm.A().b(interfaceC2607Wj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized View T(String str) {
        WeakReference weakReference;
        if (!this.f30776m && (weakReference = (WeakReference) this.f30765b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void W(com.google.android.gms.dynamic.a aVar) {
        if (this.f30776m) {
            return;
        }
        Object objH0 = com.google.android.gms.dynamic.b.h0(aVar);
        if (!(objH0 instanceof JM)) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        JM jm = this.f30771h;
        if (jm != null) {
            jm.b0(this);
        }
        zzu();
        JM jm2 = (JM) objH0;
        this.f30771h = jm2;
        jm2.a0(this);
        this.f30771h.y(this.f30766c);
        this.f30771h.z(this.f30767d);
        if (this.f30775l) {
            this.f30771h.A().b(this.f30774k);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29624M4)).booleanValue() && !TextUtils.isEmpty(this.f30771h.v())) {
            b0(this.f30771h.v());
        }
        g();
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final /* synthetic */ View W4() {
        return this.f30766c;
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized JSONObject a() {
        JM jm = this.f30771h;
        if (jm == null) {
            return null;
        }
        return jm.g0(this.f30766c, d(), zzk());
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final ViewOnAttachStateChangeListenerC5772xe c() {
        return this.f30772i;
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized Map d() {
        return this.f30765b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void e0(com.google.android.gms.dynamic.a aVar) {
        this.f30771h.h0((View) com.google.android.gms.dynamic.b.h0(aVar));
    }

    final /* synthetic */ void f() {
        if (this.f30769f == null) {
            View view = new View(this.f30766c.getContext());
            this.f30769f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f30766c != this.f30769f.getParent()) {
            this.f30766c.addView(this.f30769f);
        }
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized JSONObject h() {
        JM jm = this.f30771h;
        if (jm == null) {
            return null;
        }
        return jm.f0(this.f30766c, d(), zzk());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        JM jm = this.f30771h;
        if (jm == null || !jm.s()) {
            return;
        }
        this.f30771h.j0();
        this.f30771h.c0(view, this.f30766c, d(), zzk(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        JM jm = this.f30771h;
        if (jm != null) {
            FrameLayout frameLayout = this.f30766c;
            jm.e0(frameLayout, d(), zzk(), JM.t(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        JM jm = this.f30771h;
        if (jm != null) {
            FrameLayout frameLayout = this.f30766c;
            jm.e0(frameLayout, d(), zzk(), JM.t(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        JM jm = this.f30771h;
        if (jm != null) {
            jm.d0(view, motionEvent, this.f30766c);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Yc)).booleanValue() && this.f30777v != null && this.f30771h.r() != 0) {
                this.f30777v.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void q0(com.google.android.gms.dynamic.a aVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized void t1(String str, View view, boolean z9) {
        if (!this.f30776m) {
            if (view == null) {
                this.f30765b.remove(str);
                return;
            }
            this.f30765b.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (K4.V.a(this.f30770g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final FrameLayout x3() {
        return this.f30767d;
    }

    public final FrameLayout z6() {
        return this.f30766c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final synchronized void zze() {
        try {
            if (this.f30776m) {
                return;
            }
            JM jm = this.f30771h;
            if (jm != null) {
                jm.b0(this);
                this.f30771h = null;
            }
            this.f30765b.clear();
            this.f30766c.removeAllViews();
            this.f30767d.removeAllViews();
            this.f30765b = null;
            this.f30766c = null;
            this.f30767d = null;
            this.f30769f = null;
            this.f30772i = null;
            this.f30776m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized Map zzk() {
        return this.f30765b;
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized Map zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final synchronized String zzn() {
        return this.f30764a;
    }

    @Override // com.google.android.gms.internal.ads.NN
    public final com.google.android.gms.dynamic.a zzo() {
        return this.f30773j;
    }
}

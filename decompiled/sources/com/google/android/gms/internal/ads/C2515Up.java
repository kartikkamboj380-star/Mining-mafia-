package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.unity3d.ads.BuildConfig;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2515Up extends C2903aq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f24094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f24095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC1750Fw f24096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Activity f24097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2479Tx f24098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f24099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f24100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC3029bq f24101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PopupWindow f24102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RelativeLayout f24103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ViewGroup f24104t;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public C2515Up(InterfaceC1750Fw interfaceC1750Fw, InterfaceC3029bq interfaceC3029bq) {
        super(interfaceC1750Fw, "resize");
        this.f24087c = "top-right";
        this.f24088d = true;
        this.f24089e = 0;
        this.f24090f = 0;
        this.f24091g = -1;
        this.f24092h = 0;
        this.f24093i = 0;
        this.f24094j = -1;
        this.f24095k = new Object();
        this.f24096l = interfaceC1750Fw;
        this.f24097m = interfaceC1750Fw.d();
        this.f24101q = interfaceC3029bq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m(boolean z9) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.oc)).booleanValue()) {
            this.f24103s.removeView((View) this.f24096l);
            this.f24102r.dismiss();
        } else {
            this.f24102r.dismiss();
            this.f24103s.removeView((View) this.f24096l);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.pc)).booleanValue()) {
            View view = (View) this.f24096l;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f24104t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f24099o);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.qc)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.f24104t;
                    InterfaceC1750Fw interfaceC1750Fw = this.f24096l;
                    viewGroup2.addView((View) interfaceC1750Fw);
                    interfaceC1750Fw.S0(this.f24098n);
                } catch (IllegalStateException e10) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.d("Unable to add webview back to view hierarchy.", e10);
                    G4.t.l().j(e10, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.f24104t;
                InterfaceC1750Fw interfaceC1750Fw2 = this.f24096l;
                viewGroup3.addView((View) interfaceC1750Fw2);
                interfaceC1750Fw2.S0(this.f24098n);
            }
        }
        if (z9) {
            f(BuildConfig.FLAVOR);
            InterfaceC3029bq interfaceC3029bq = this.f24101q;
            if (interfaceC3029bq != null) {
                interfaceC3029bq.zzb();
            }
        }
        this.f24102r = null;
        this.f24103s = null;
        this.f24104t = null;
        this.f24100p = null;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x019b A[PHI: r18
      0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Map map) {
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        int i15;
        synchronized (this.f24095k) {
            try {
                Activity activity = this.f24097m;
                if (activity == null) {
                    b("Not an activity context. Cannot resize.");
                    return;
                }
                InterfaceC1750Fw interfaceC1750Fw = this.f24096l;
                if (interfaceC1750Fw.E() == null) {
                    b("Webview is not yet available, size is not set.");
                    return;
                }
                if (interfaceC1750Fw.E().g()) {
                    b("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (interfaceC1750Fw.r()) {
                    b("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    G4.t.g();
                    this.f24094j = K4.F0.u((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    G4.t.g();
                    this.f24091g = K4.F0.u((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    G4.t.g();
                    this.f24092h = K4.F0.u((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    G4.t.g();
                    this.f24093i = K4.F0.u((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.f24088d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.f24087c = str;
                }
                if (this.f24094j < 0 || this.f24091g < 0) {
                    b("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    G4.t.g();
                    int[] iArrD = K4.F0.D(activity);
                    G4.t.g();
                    int[] iArrY = K4.F0.y(activity);
                    int i16 = iArrD[0];
                    int i17 = iArrD[1];
                    int i18 = this.f24094j;
                    int[] iArr = null;
                    if (i18 < 50 || i18 > i16) {
                        i10 = 50;
                        int i19 = AbstractC0786o0.f2696b;
                        L4.p.f("Width is too small or too large.");
                    } else {
                        int i20 = this.f24091g;
                        if (i20 < 50 || i20 > i17) {
                            i10 = 50;
                            int i21 = AbstractC0786o0.f2696b;
                            L4.p.f("Height is too small or too large.");
                        } else if (i20 == i17 && i18 == i16) {
                            int i22 = AbstractC0786o0.f2696b;
                            L4.p.f("Cannot resize to a full-screen ad.");
                            i10 = 50;
                        } else if (this.f24088d) {
                            String str2 = this.f24087c;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    i10 = 50;
                                    if (!str2.equals("center")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 2;
                                    }
                                    break;
                                case -1012429441:
                                    i10 = 50;
                                    if (!str2.equals("top-left")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 0;
                                    }
                                    break;
                                case -655373719:
                                    i10 = 50;
                                    if (!str2.equals("bottom-left")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 3;
                                    }
                                    break;
                                case 1163912186:
                                    i10 = 50;
                                    if (!str2.equals("bottom-right")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 5;
                                    }
                                    break;
                                case 1288627767:
                                    i10 = 50;
                                    if (!str2.equals("bottom-center")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 4;
                                    }
                                    break;
                                case 1755462605:
                                    i10 = 50;
                                    if (!str2.equals("top-center")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 1;
                                    }
                                    break;
                                default:
                                    i10 = 50;
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0) {
                                i12 = this.f24089e + this.f24092h;
                                i13 = this.f24090f;
                            } else if (b10 != 1) {
                                if (b10 != 2) {
                                    if (b10 == 3) {
                                        i12 = this.f24089e + this.f24092h;
                                        i15 = this.f24090f;
                                    } else if (b10 == 4) {
                                        i12 = ((this.f24089e + this.f24092h) + (i18 >> 1)) - 25;
                                        i15 = this.f24090f;
                                    } else if (b10 != 5) {
                                        i12 = ((this.f24089e + this.f24092h) + i18) - 50;
                                        i13 = this.f24090f;
                                    } else {
                                        i12 = ((this.f24089e + this.f24092h) + i18) - 50;
                                        i15 = this.f24090f;
                                    }
                                    i14 = ((i15 + this.f24093i) + i20) - 50;
                                } else {
                                    i12 = ((this.f24089e + this.f24092h) + (i18 >> 1)) - 25;
                                    i14 = ((this.f24090f + this.f24093i) + (i20 >> 1)) - 25;
                                }
                                if (i12 >= 0 && i12 + 50 <= i16 && i14 >= iArrY[0] && i14 + 50 <= iArrY[1]) {
                                    iArr = new int[]{this.f24089e + this.f24092h, this.f24090f + this.f24093i};
                                }
                            } else {
                                i12 = ((this.f24089e + this.f24092h) + (i18 >> 1)) - 25;
                                i13 = this.f24090f;
                            }
                            i14 = i13 + this.f24093i;
                            if (i12 >= 0) {
                                iArr = new int[]{this.f24089e + this.f24092h, this.f24090f + this.f24093i};
                            }
                        } else {
                            i10 = 50;
                            G4.t.g();
                            int[] iArrD2 = K4.F0.D(activity);
                            G4.t.g();
                            int[] iArrY2 = K4.F0.y(activity);
                            int i23 = iArrD2[0];
                            int i24 = this.f24089e + this.f24092h;
                            int i25 = this.f24090f + this.f24093i;
                            if (i24 < 0) {
                                i11 = 0;
                            } else {
                                int i26 = this.f24094j;
                                i11 = i24 + i26 > i23 ? i23 - i26 : i24;
                            }
                            int i27 = iArrY2[0];
                            if (i25 < i27) {
                                i25 = i27;
                            } else {
                                int i28 = this.f24091g;
                                int i29 = i25 + i28;
                                int i30 = iArrY2[1];
                                if (i29 > i30) {
                                    i25 = i30 - i28;
                                }
                            }
                            iArr = new int[]{i11, i25};
                        }
                    }
                    if (iArr == null) {
                        b("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    C0654z.a();
                    int iC = L4.g.c(activity, this.f24094j);
                    C0654z.a();
                    int iC2 = L4.g.c(activity, this.f24091g);
                    ViewParent parent = ((View) interfaceC1750Fw).getParent();
                    if (!(parent instanceof ViewGroup)) {
                        b("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) interfaceC1750Fw);
                    PopupWindow popupWindow = this.f24102r;
                    if (popupWindow == null) {
                        this.f24104t = viewGroup;
                        G4.t.g();
                        ((View) interfaceC1750Fw).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) interfaceC1750Fw).getDrawingCache());
                        ((View) interfaceC1750Fw).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(activity);
                        this.f24099o = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.f24098n = interfaceC1750Fw.E();
                        this.f24104t.addView(this.f24099o);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(activity);
                    this.f24103s = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.f24103s.setLayoutParams(new ViewGroup.LayoutParams(iC, iC2));
                    G4.t.g();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.f24103s, iC, iC2, false);
                    this.f24102r = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.f24102r.setTouchable(true);
                    this.f24102r.setClippingEnabled(!this.f24088d);
                    byte b11 = -1;
                    this.f24103s.addView((View) interfaceC1750Fw, -1, -1);
                    this.f24100p = new LinearLayout(activity);
                    C0654z.a();
                    int i31 = i10;
                    int iC3 = L4.g.c(activity, i31);
                    C0654z.a();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iC3, L4.g.c(activity, i31));
                    String str3 = this.f24087c;
                    switch (str3.hashCode()) {
                        case -1364013995:
                            if (str3.equals("center")) {
                                b11 = 2;
                            }
                            break;
                        case -1012429441:
                            if (str3.equals("top-left")) {
                                b11 = 0;
                            }
                            break;
                        case -655373719:
                            if (str3.equals("bottom-left")) {
                                b11 = 3;
                            }
                            break;
                        case 1163912186:
                            if (str3.equals("bottom-right")) {
                                b11 = 5;
                            }
                            break;
                        case 1288627767:
                            if (str3.equals("bottom-center")) {
                                b11 = 4;
                            }
                            break;
                        case 1755462605:
                            if (str3.equals("top-center")) {
                                b11 = 1;
                            }
                            break;
                    }
                    if (b11 == 0) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (b11 == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                    } else if (b11 == 2) {
                        layoutParams.addRule(13);
                    } else if (b11 == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (b11 == 4) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                    } else if (b11 != 5) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    }
                    this.f24100p.setOnClickListener(new ViewOnClickListenerC2411Sp(this));
                    this.f24100p.setContentDescription("Close button");
                    this.f24103s.addView(this.f24100p, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.f24102r;
                        View decorView = window.getDecorView();
                        C0654z.a();
                        int iC4 = L4.g.c(activity, iArr[0]);
                        C0654z.a();
                        popupWindow3.showAtLocation(decorView, 0, iC4, L4.g.c(activity, iArr[1]));
                        int i32 = iArr[0];
                        int i33 = iArr[1];
                        InterfaceC3029bq interfaceC3029bq = this.f24101q;
                        if (interfaceC3029bq != null) {
                            interfaceC3029bq.a(i32, i33, this.f24094j, this.f24091g);
                        }
                        this.f24096l.S0(C2479Tx.c(iC, iC2));
                        int i34 = iArr[0];
                        int i35 = iArr[1];
                        G4.t.g();
                        d(i34, i35 - K4.F0.y(this.f24097m)[0], this.f24094j, this.f24091g);
                        f("resized");
                        return;
                    } catch (RuntimeException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                        sb.append("Cannot show popup window: ");
                        sb.append(message);
                        b(sb.toString());
                        RelativeLayout relativeLayout2 = this.f24103s;
                        InterfaceC1750Fw interfaceC1750Fw2 = this.f24096l;
                        relativeLayout2.removeView((View) interfaceC1750Fw2);
                        ViewGroup viewGroup2 = this.f24104t;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.f24099o);
                            this.f24104t.addView((View) interfaceC1750Fw2);
                            interfaceC1750Fw2.S0(this.f24098n);
                        }
                        return;
                    }
                }
                b("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(final boolean z9) {
        synchronized (this.f24095k) {
            try {
                if (this.f24102r != null) {
                    if (!((Boolean) H4.B.c().d(AbstractC3892ii.nc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        m(z9);
                    } else {
                        AbstractC2315Qt.f22478f.j0(new Runnable() { // from class: com.google.android.gms.internal.ads.Tp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f23618a.m(z9);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(int i10, int i11, boolean z9) {
        synchronized (this.f24095k) {
            this.f24089e = i10;
            this.f24090f = i11;
        }
    }

    public final boolean k() {
        boolean z9;
        synchronized (this.f24095k) {
            z9 = this.f24102r != null;
        }
        return z9;
    }

    public final void l(int i10, int i11) {
        this.f24089e = i10;
        this.f24090f = i11;
    }
}

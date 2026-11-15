package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.notifee.core.event.LogEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1590Cu extends FrameLayout implements InterfaceC5300tu {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Bitmap f17987G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ImageView f17988H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f17989I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2265Pu f17990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f17991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f17992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5780xi f17993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final RunnableC2369Ru f17994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC5426uu f17996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18002m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f18003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String[] f18004w;

    public C1590Cu(Context context, InterfaceC2265Pu interfaceC2265Pu, int i10, boolean z9, C5780xi c5780xi, C2213Ou c2213Ou, QR qr) {
        AbstractC5426uu textureViewSurfaceTextureListenerC5174su;
        C5780xi c5780xi2;
        AbstractC5426uu c5430uw;
        super(context);
        this.f17990a = interfaceC2265Pu;
        this.f17993d = c5780xi;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17991b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(interfaceC2265Pu.zzk());
        AbstractC5552vu abstractC5552vu = interfaceC2265Pu.zzk().f931a;
        C2317Qu c2317Qu = new C2317Qu(context, interfaceC2265Pu.f(), interfaceC2265Pu.e(), c5780xi, interfaceC2265Pu.zzi());
        if (i10 == 3) {
            c5430uw = new C5430uw(context, c2317Qu);
            c5780xi2 = c5780xi;
        } else {
            if (i10 == 2) {
                textureViewSurfaceTextureListenerC5174su = new TextureViewSurfaceTextureListenerC3793hv(context, c2317Qu, interfaceC2265Pu, z9, AbstractC5552vu.a(interfaceC2265Pu), c2213Ou, qr);
                c5780xi2 = c5780xi;
            } else {
                c5780xi2 = c5780xi;
                textureViewSurfaceTextureListenerC5174su = new TextureViewSurfaceTextureListenerC5174su(context, interfaceC2265Pu, z9, AbstractC5552vu.a(interfaceC2265Pu), c2213Ou, new C2317Qu(context, interfaceC2265Pu.f(), interfaceC2265Pu.e(), c5780xi, interfaceC2265Pu.zzi()), qr);
            }
            c5430uw = textureViewSurfaceTextureListenerC5174su;
        }
        this.f17996g = c5430uw;
        View view = new View(context);
        this.f17992c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(c5430uw, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29925p0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29892m0)).booleanValue()) {
            g();
        }
        this.f17988H = new ImageView(context);
        this.f17995f = ((Long) H4.B.c().d(AbstractC3892ii.f29947r0)).longValue();
        boolean zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.f29914o0)).booleanValue();
        this.f18000k = zBooleanValue;
        if (c5780xi2 != null) {
            c5780xi2.d("spinner_used", true != zBooleanValue ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        this.f17994e = new RunnableC2369Ru(this);
        c5430uw.j(this);
    }

    private final boolean m() {
        return this.f17988H.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void l(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numP = p();
        if (numP != null) {
            map.put("playerId", numP.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f17990a.b("onVideoEvent", map);
    }

    private final void o() {
        InterfaceC2265Pu interfaceC2265Pu = this.f17990a;
        if (interfaceC2265Pu.d() == null || !this.f17998i || this.f17999j) {
            return;
        }
        interfaceC2265Pu.d().getWindow().clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        this.f17998i = false;
    }

    public final void A(float f10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.f33938b.b(f10);
        abstractC5426uu.a();
    }

    public final void B(int i10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.B(i10);
    }

    public final void C(int i10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.C(i10);
    }

    public final void D(int i10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.f(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void a(String str, String str2) {
        l("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void b(String str, String str2) {
        l(LogEvent.LEVEL_ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void c() {
        if (this.f17989I && this.f17987G != null && !m()) {
            ImageView imageView = this.f17988H;
            imageView.setImageBitmap(this.f17987G);
            imageView.invalidate();
            FrameLayout frameLayout = this.f17991b;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.f17994e.a();
        this.f18002m = this.f18001l;
        K4.F0.f2598l.post(new RunnableC5804xu(this));
    }

    public final void d(int i10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.g(i10);
    }

    public final void e(int i10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.h(i10);
    }

    public final void f(MotionEvent motionEvent) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.dispatchTouchEvent(motionEvent);
    }

    public final void finalize() throws Throwable {
        try {
            this.f17994e.a();
            final AbstractC5426uu abstractC5426uu = this.f17996g;
            if (abstractC5426uu != null) {
                AbstractC2315Qt.f22478f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        abstractC5426uu.l();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        TextView textView = new TextView(abstractC5426uu.getContext());
        Resources resourcesI = G4.t.l().i();
        textView.setText(String.valueOf(resourcesI == null ? "AdMob - " : resourcesI.getString(F4.d.f736u)).concat(abstractC5426uu.i()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.f17991b;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void h() {
        this.f17994e.a();
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu != null) {
            abstractC5426uu.l();
        }
        o();
    }

    final void i() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        long jP = abstractC5426uu.p();
        if (this.f18001l == jP || jP <= 0) {
            return;
        }
        float f10 = jP / 1000.0f;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30004w2)).booleanValue()) {
            l("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(abstractC5426uu.w()), "qoeCachedBytes", String.valueOf(abstractC5426uu.v()), "qoeLoadedBytes", String.valueOf(abstractC5426uu.u()), "droppedFrames", String.valueOf(abstractC5426uu.x()), "reportTime", String.valueOf(G4.t.o().currentTimeMillis()));
        } else {
            l("timeupdate", "time", String.valueOf(f10));
        }
        this.f18001l = jP;
    }

    final /* synthetic */ void j(boolean z9) {
        l("windowFocusChanged", "hasWindowFocus", String.valueOf(z9));
    }

    final /* synthetic */ void k() {
        l("firstFrameRendered", new String[0]);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            this.f17994e.b();
        } else {
            this.f17994e.a();
            this.f18002m = this.f18001l;
        }
        K4.F0.f2598l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Bu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17733a.j(z9);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void onWindowVisibilityChanged(int i10) {
        boolean z9;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.f17994e.b();
            z9 = true;
        } else {
            this.f17994e.a();
            this.f18002m = this.f18001l;
            z9 = false;
        }
        K4.F0.f2598l.post(new RunnableC5930yu(this, z9));
    }

    public final Integer p() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu != null) {
            return abstractC5426uu.y();
        }
        return null;
    }

    public final void q(int i10) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29925p0)).booleanValue()) {
            this.f17991b.setBackgroundColor(i10);
            this.f17992c.setBackgroundColor(i10);
        }
    }

    public final void r(int i10, int i11, int i12, int i13) {
        if (AbstractC0786o0.m()) {
            int length = String.valueOf(i10).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length() + 3 + String.valueOf(i13).length());
            sb.append("Set video bounds to x:");
            sb.append(i10);
            sb.append(";y:");
            sb.append(i11);
            sb.append(";w:");
            sb.append(i12);
            sb.append(";h:");
            sb.append(i13);
            AbstractC0786o0.k(sb.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.f17991b.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void s(String str, String[] strArr) {
        this.f18003v = str;
        this.f18004w = strArr;
    }

    public final void t(float f10, float f11) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu != null) {
            abstractC5426uu.r(f10, f11);
        }
    }

    public final void u(Integer num) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f18003v)) {
            l("no_src", new String[0]);
        } else {
            abstractC5426uu.z(this.f18003v, this.f18004w, num);
        }
    }

    public final void v() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.n();
    }

    public final void w() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.m();
    }

    public final void x(int i10) {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.q(i10);
    }

    public final void y() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.f33938b.a(true);
        abstractC5426uu.a();
    }

    public final void z() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null) {
            return;
        }
        abstractC5426uu.f33938b.a(false);
        abstractC5426uu.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zza() {
        this.f17994e.b();
        K4.F0.f2598l.post(new RunnableC5678wu(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zzb() {
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu != null && this.f18002m == 0) {
            l("canplaythrough", "duration", String.valueOf(abstractC5426uu.o() / 1000.0f), "videoWidth", String.valueOf(abstractC5426uu.s()), "videoHeight", String.valueOf(abstractC5426uu.t()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zzc() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30026y2)).booleanValue()) {
            this.f17994e.b();
        }
        InterfaceC2265Pu interfaceC2265Pu = this.f17990a;
        if (interfaceC2265Pu.d() != null && !this.f17998i) {
            boolean z9 = (interfaceC2265Pu.d().getWindow().getAttributes().flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
            this.f17999j = z9;
            if (!z9) {
                interfaceC2265Pu.d().getWindow().addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                this.f17998i = true;
            }
        }
        this.f17997h = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zzd() {
        l("pause", new String[0]);
        o();
        this.f17997h = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zze() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30026y2)).booleanValue()) {
            this.f17994e.a();
        }
        l("ended", new String[0]);
        o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zzi() {
        if (this.f17997h && m()) {
            this.f17991b.removeView(this.f17988H);
        }
        AbstractC5426uu abstractC5426uu = this.f17996g;
        if (abstractC5426uu == null || this.f17987G == null) {
            return;
        }
        long jElapsedRealtime = G4.t.o().elapsedRealtime();
        if (abstractC5426uu.getBitmap(this.f17987G) != null) {
            this.f17989I = true;
        }
        long jElapsedRealtime2 = G4.t.o().elapsedRealtime() - jElapsedRealtime;
        if (AbstractC0786o0.m()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            AbstractC0786o0.k(sb.toString());
        }
        if (jElapsedRealtime2 > this.f17995f) {
            L4.p.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f18000k = false;
            this.f17987G = null;
            C5780xi c5780xi = this.f17993d;
            if (c5780xi != null) {
                c5780xi.d("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zzj(int i10, int i11) {
        if (this.f18000k) {
            AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29936q0;
            int iMax = Math.max(i10 / ((Integer) H4.B.c().d(abstractC2759Zh)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) H4.B.c().d(abstractC2759Zh)).intValue(), 1);
            Bitmap bitmap = this.f17987G;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f17987G.getHeight() == iMax2) {
                return;
            }
            this.f17987G = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f17989I = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300tu
    public final void zzk() {
        this.f17992c.setVisibility(4);
        K4.F0.f2598l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Au
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17428a.k();
            }
        });
    }
}

package K4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC2315Qt;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.BT;
import com.google.android.gms.internal.ads.EnumC5750xT;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1805Gx0;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: K4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0794u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BT f2740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f2742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f2743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f2744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PointF f2747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PointF f2748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f2749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Runnable f2750l;

    public C0794u(Context context) {
        this.f2745g = 0;
        this.f2750l = new Runnable() { // from class: K4.t
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f2707a.g();
            }
        };
        this.f2739a = context;
        this.f2746h = ViewConfiguration.get(context).getScaledTouchSlop();
        G4.t.w().a();
        this.f2749k = G4.t.w().b();
        this.f2740b = G4.t.s().b();
    }

    private final boolean s(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f2747i.x - f10) < ((float) this.f2746h) && Math.abs(this.f2747i.y - f11) < ((float) this.f2746h) && Math.abs(this.f2748j.x - f12) < ((float) this.f2746h) && Math.abs(this.f2748j.y - f13) < ((float) this.f2746h);
    }

    private final void t(Context context) {
        final int i10;
        ArrayList arrayList = new ArrayList();
        int iU = u(arrayList, "None", true);
        final int iU2 = u(arrayList, "Shake", true);
        final int iU3 = u(arrayList, "Flick", true);
        int iOrdinal = this.f2740b.g().ordinal();
        if (iOrdinal != 1) {
            i10 = iOrdinal != 2 ? iU : iU3;
        } else {
            i10 = iU2;
        }
        G4.t.g();
        AlertDialog.Builder builderP = F0.p(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderP.setTitle("Setup gesture");
        builderP.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: K4.k
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderP.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: K4.l
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                this.f2678a.b();
            }
        });
        builderP.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: K4.m
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                this.f2682a.i(atomicInteger, i10, iU2, iU3, dialogInterface, i11);
            }
        });
        builderP.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: K4.n
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.f2693a.b();
            }
        });
        builderP.create().show();
    }

    private static final int u(List list, String str, boolean z9) {
        if (!z9) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f2745g = 0;
            this.f2747i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f2745g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f2745g = 5;
                this.f2748j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f2749k.postDelayed(this.f2750l, ((Long) H4.B.c().d(AbstractC3892ii.f29665Q5)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z9 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z9 |= !s(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (s(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z9) {
                    return;
                }
            }
            this.f2745g = -1;
            this.f2749k.removeCallbacks(this.f2750l);
        }
    }

    public final void b() {
        try {
            Context context = this.f2739a;
            if (!(context instanceof Activity)) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.e("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(G4.t.s().i())) {
                str = "Creative preview";
            }
            String str2 = true != G4.t.s().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iU = u(arrayList, "Ad information", true);
            final int iU2 = u(arrayList, str, true);
            final int iU3 = u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue();
            final int iU4 = u(arrayList, "Open ad inspector", zBooleanValue);
            final int iU5 = u(arrayList, "Ad inspector settings", zBooleanValue);
            G4.t.g();
            AlertDialog.Builder builderP = F0.p(context);
            builderP.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: K4.e
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                    this.f2654a.h(iU, iU2, iU3, iU4, iU5, dialogInterface, i11);
                }
            });
            builderP.create().show();
        } catch (WindowManager.BadTokenException e10) {
            AbstractC0786o0.l("", e10);
        }
    }

    public final void c(String str) {
        this.f2742d = str;
    }

    public final void d(String str) {
        this.f2743e = str;
    }

    public final void e(String str) {
        this.f2741c = str;
    }

    public final void f(String str) {
        this.f2744f = str;
    }

    final /* synthetic */ void g() {
        this.f2745g = 4;
        b();
    }

    final /* synthetic */ void h(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                int i16 = AbstractC0786o0.f2696b;
                L4.p.a("Debug mode [Creative Preview] selected.");
                AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: K4.g
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f2662a.o();
                    }
                });
                return;
            }
            if (i15 == i12) {
                int i17 = AbstractC0786o0.f2696b;
                L4.p.a("Debug mode [Troubleshooting] selected.");
                AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: K4.h
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f2664a.p();
                    }
                });
                return;
            }
            if (i15 == i13) {
                BT bt = this.f2740b;
                final InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22478f;
                InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx1 = AbstractC2315Qt.f22473a;
                if (bt.t()) {
                    interfaceExecutorServiceC1805Gx0.execute(new Runnable() { // from class: K4.r
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f2700a.l();
                        }
                    });
                    return;
                } else {
                    interfaceExecutorServiceC1805Gx1.execute(new Runnable() { // from class: K4.q
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f2698a.k(interfaceExecutorServiceC1805Gx0);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                BT bt2 = this.f2740b;
                final InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx2 = AbstractC2315Qt.f22478f;
                InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx3 = AbstractC2315Qt.f22473a;
                if (bt2.t()) {
                    interfaceExecutorServiceC1805Gx2.execute(new Runnable() { // from class: K4.f
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f2661a.n();
                        }
                    });
                    return;
                } else {
                    interfaceExecutorServiceC1805Gx3.execute(new Runnable() { // from class: K4.s
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f2702a.m(interfaceExecutorServiceC1805Gx2);
                        }
                    });
                    return;
                }
            }
            return;
        }
        Context context = this.f2739a;
        if (!(context instanceof Activity)) {
            int i18 = AbstractC0786o0.f2696b;
            L4.p.e("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f2741c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            G4.t.g();
            Map mapV = F0.v(uriBuild);
            for (String str3 : mapV.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapV.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        G4.t.g();
        AlertDialog.Builder builderP = F0.p(context);
        builderP.setMessage(str2);
        builderP.setTitle("Ad Information");
        builderP.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: K4.o
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i19) {
                this.f2694a.j(str2, dialogInterface2, i19);
            }
        });
        builderP.setNegativeButton("Close", DialogInterfaceOnClickListenerC0787p.f2697a);
        builderP.create().show();
    }

    final /* synthetic */ void i(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.f2740b.f(EnumC5750xT.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.f2740b.f(EnumC5750xT.FLICK);
            } else {
                this.f2740b.f(EnumC5750xT.NONE);
            }
        }
        b();
    }

    final /* synthetic */ void j(String str, DialogInterface dialogInterface, int i10) {
        G4.t.g();
        F0.B(this.f2739a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void k(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        C0798y c0798yS = G4.t.s();
        Context context = this.f2739a;
        if (c0798yS.e(context, this.f2742d, this.f2743e)) {
            interfaceExecutorServiceC1805Gx0.execute(new Runnable() { // from class: K4.j
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f2670a.r();
                }
            });
        } else {
            G4.t.s().f(context, this.f2742d, this.f2743e);
        }
    }

    final /* synthetic */ void l() {
        G4.t.s().c(this.f2739a);
    }

    final /* synthetic */ void m(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        C0798y c0798yS = G4.t.s();
        Context context = this.f2739a;
        if (c0798yS.e(context, this.f2742d, this.f2743e)) {
            interfaceExecutorServiceC1805Gx0.execute(new Runnable() { // from class: K4.i
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f2667a.q();
                }
            });
        } else {
            G4.t.s().f(context, this.f2742d, this.f2743e);
        }
    }

    final /* synthetic */ void n() {
        t(this.f2739a);
    }

    final /* synthetic */ void o() {
        C0798y c0798yS = G4.t.s();
        Context context = this.f2739a;
        String str = this.f2742d;
        String str2 = this.f2743e;
        if (!c0798yS.d(context, str, str2)) {
            c0798yS.n(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        String str3 = c0798yS.f2774f;
        if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str3)) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("Creative is not pushed for this device.");
            c0798yS.n(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str3)) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.a("The app is not linked for creative preview.");
            c0798yS.f(context, str, str2);
        } else if ("0".equals(str3)) {
            int i12 = AbstractC0786o0.f2696b;
            L4.p.a("Device is linked for in app preview.");
            c0798yS.n(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    final /* synthetic */ void p() {
        C0798y c0798yS = G4.t.s();
        String str = this.f2742d;
        String str2 = this.f2743e;
        String str3 = this.f2744f;
        boolean zM = c0798yS.m();
        Context context = this.f2739a;
        c0798yS.l(c0798yS.e(context, str, str2));
        if (!c0798yS.m()) {
            c0798yS.f(context, str, str2);
            return;
        }
        if (!zM && !TextUtils.isEmpty(str3)) {
            c0798yS.h(context, str2, str3, str);
        }
        int i10 = AbstractC0786o0.f2696b;
        L4.p.a("Device is linked for debug signals.");
        c0798yS.n(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void q() {
        t(this.f2739a);
    }

    final /* synthetic */ void r() {
        G4.t.s().c(this.f2739a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f2741c);
        sb.append(",DebugSignal: ");
        sb.append(this.f2744f);
        sb.append(",AFMA Version: ");
        sb.append(this.f2743e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f2742d);
        sb.append("}");
        return sb.toString();
    }

    public C0794u(Context context, String str) {
        this(context);
        this.f2741c = str;
    }
}

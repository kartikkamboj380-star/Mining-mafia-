package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2821aB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0790q0 f26440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3873iY f26441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4611oQ f26442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f26444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f26445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    InterfaceC2309Qq f26446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    InterfaceC2309Qq f26447i;

    C2821aB(Context context, InterfaceC0790q0 interfaceC0790q0, C3873iY c3873iY, C4611oQ c4611oQ, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx1, ScheduledExecutorService scheduledExecutorService) {
        this.f26439a = context;
        this.f26440b = interfaceC0790q0;
        this.f26441c = c3873iY;
        this.f26442d = c4611oQ;
        this.f26443e = interfaceExecutorServiceC1805Gx0;
        this.f26444f = interfaceExecutorServiceC1805Gx1;
        this.f26445g = scheduledExecutorService;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) H4.B.c().d(AbstractC3892ii.Gb));
    }

    private final com.google.common.util.concurrent.p k(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) H4.B.c().d(AbstractC3892ii.Gb)) || this.f26440b.v()) {
                return AbstractC5685wx0.a(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) H4.B.c().d(AbstractC3892ii.Hb), String.valueOf(random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (AbstractC4678ox0) AbstractC5685wx0.h((AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(this.f26441c.a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.UA
                    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                    public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                        return this.f23938a.e(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f26444f), Throwable.class, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.VA
                    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                    public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                        return this.f24207a.f(builderBuildUpon, (Throwable) obj);
                    }
                }, this.f26443e);
            }
            builderBuildUpon.appendQueryParameter((String) H4.B.c().d(AbstractC3892ii.Ib), "11");
            return AbstractC5685wx0.a(builderBuildUpon.toString());
        } catch (Exception e10) {
            return AbstractC5685wx0.c(e10);
        }
    }

    public final void a(String str, C3636gf0 c3636gf0, Random random, L4.w wVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC5685wx0.r(AbstractC5685wx0.i(k(str, this.f26442d.b(), random), ((Integer) H4.B.c().d(AbstractC3892ii.Mb)).intValue(), TimeUnit.MILLISECONDS, this.f26445g), new TA(this, c3636gf0, str, wVar), this.f26443e);
    }

    public final com.google.common.util.concurrent.p b(final String str, Random random) {
        return TextUtils.isEmpty(str) ? AbstractC5685wx0.a(str) : AbstractC5685wx0.h(k(str, this.f26442d.b(), random), Throwable.class, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.ZA
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f26125a.d(str, (Throwable) obj);
            }
        }, this.f26443e);
    }

    final /* synthetic */ com.google.common.util.concurrent.p d(String str, final Throwable th) {
        this.f26443e.j0(new Runnable() { // from class: com.google.android.gms.internal.ads.YA
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25547a.h(th);
            }
        });
        return AbstractC5685wx0.a(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.p e(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) H4.B.c().d(AbstractC3892ii.Ib), "10");
            return AbstractC5685wx0.a(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) H4.B.c().d(AbstractC3892ii.Jb), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        builderBuildUpon.appendQueryParameter((String) H4.B.c().d(AbstractC3892ii.Ib), "12");
        if (str.contains((CharSequence) H4.B.c().d(AbstractC3892ii.Kb))) {
            builderBuildUpon.authority((String) H4.B.c().d(AbstractC3892ii.Lb));
        }
        return (AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(this.f26441c.b(builderBuildUpon.build(), inputEvent)), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.WA
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                String str2 = (String) H4.B.c().d(AbstractC3892ii.Ib);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return AbstractC5685wx0.a(builder2.toString());
            }
        }, this.f26444f);
    }

    final /* synthetic */ com.google.common.util.concurrent.p f(Uri.Builder builder, final Throwable th) {
        this.f26443e.j0(new Runnable() { // from class: com.google.android.gms.internal.ads.XA
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25156a.g(th);
            }
        });
        builder.appendQueryParameter((String) H4.B.c().d(AbstractC3892ii.Ib), "9");
        return AbstractC5685wx0.a(builder.toString());
    }

    final /* synthetic */ void g(Throwable th) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Nb)).booleanValue()) {
            InterfaceC2309Qq interfaceC2309QqE = C2205Oq.e(this.f26439a);
            this.f26447i = interfaceC2309QqE;
            interfaceC2309QqE.b(th, "AttributionReporting");
        } else {
            InterfaceC2309Qq interfaceC2309QqC = C2205Oq.c(this.f26439a);
            this.f26446h = interfaceC2309QqC;
            interfaceC2309QqC.b(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void h(Throwable th) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Nb)).booleanValue()) {
            InterfaceC2309Qq interfaceC2309QqE = C2205Oq.e(this.f26439a);
            this.f26447i = interfaceC2309QqE;
            interfaceC2309QqE.b(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            InterfaceC2309Qq interfaceC2309QqC = C2205Oq.c(this.f26439a);
            this.f26446h = interfaceC2309QqC;
            interfaceC2309QqC.b(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ Context i() {
        return this.f26439a;
    }

    final /* synthetic */ InterfaceExecutorServiceC1805Gx0 j() {
        return this.f26443e;
    }
}

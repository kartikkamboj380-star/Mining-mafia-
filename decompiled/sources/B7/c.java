package B7;

import B4.C0564a;
import N4.InterfaceC0823e;
import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends B4.j implements N4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N4.j f307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0823e f308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D4.a f309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N4.i f310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f311e;

    public c(N4.j mediationAppOpenAdConfiguration, InterfaceC0823e mediationAdLoadCallback) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f307a = mediationAppOpenAdConfiguration;
        this.f308b = mediationAdLoadCallback;
        this.f311e = "";
    }

    @Override // N4.h
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        i("ad is showing");
        D4.a aVar = this.f309c;
        if (aVar == null) {
            Intrinsics.r("adManagerAppOpenAd");
            aVar = null;
        }
        aVar.f((Activity) context);
    }

    @Override // B4.j
    public final void b() {
        i("ad clicked");
        N4.i iVar = this.f310d;
        if (iVar == null) {
            Intrinsics.r("appOpenAdCallback");
            iVar = null;
        }
        iVar.h();
    }

    @Override // B4.j
    public final void c() {
        i("fullscreen ad content dismissed by user");
        N4.i iVar = this.f310d;
        if (iVar == null) {
            Intrinsics.r("appOpenAdCallback");
            iVar = null;
        }
        iVar.onAdClosed();
    }

    @Override // B4.j
    public final void d(C0564a adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        i("fullscreen ad content failed to show due to " + adError);
        this.f308b.b(adError);
        N4.i iVar = this.f310d;
        if (iVar == null) {
            Intrinsics.r("appOpenAdCallback");
            iVar = null;
        }
        iVar.a(adError);
    }

    @Override // B4.j
    public final void e() {
        i("ad impression is recorded");
        N4.i iVar = this.f310d;
        if (iVar == null) {
            Intrinsics.r("appOpenAdCallback");
            iVar = null;
        }
        iVar.g();
    }

    @Override // B4.j
    public final void f() {
        i("fullscreen ad content is shown");
        N4.i iVar = this.f310d;
        if (iVar == null) {
            Intrinsics.r("appOpenAdCallback");
            iVar = null;
        }
        iVar.onAdOpened();
    }

    public final void i(String str) {
        v.a("[AppOpen/" + this.f311e + "] " + str);
    }
}

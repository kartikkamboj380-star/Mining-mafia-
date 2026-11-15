package B7;

import B4.C0564a;
import N4.InterfaceC0823e;
import N4.x;
import N4.y;
import N4.z;
import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends B4.j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0823e f336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U4.c f337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f339e;

    public m(z mediationRewardedAdConfiguration, InterfaceC0823e mediationAdLoadCallback) {
        Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f335a = mediationRewardedAdConfiguration;
        this.f336b = mediationAdLoadCallback;
        this.f339e = "";
    }

    public static final void h(m mVar, U4.b rewardItem) {
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        int iA = rewardItem.a();
        String type = rewardItem.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        mVar.j("user earned the reward " + iA + "(" + type + ").");
        y yVar = mVar.f338d;
        if (yVar != null) {
            yVar.c(rewardItem);
        }
    }

    @Override // N4.x
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j("ad is showing");
        if (!(context instanceof Activity)) {
            j("ad failed to show as there was no activity context.");
            y yVar = this.f338d;
            if (yVar != null) {
                yVar.e("ad failed to show as there was no activity context.");
                return;
            }
            return;
        }
        U4.c cVar = this.f337c;
        if (cVar != null) {
            cVar.i((Activity) context, new B4.p() { // from class: B7.l
                @Override // B4.p
                public final void c(U4.b bVar) {
                    m.h(this.f334a, bVar);
                }
            });
            return;
        }
        j("ad failed to show as the rewarded ad wasn't ready yet.");
        y yVar2 = this.f338d;
        if (yVar2 != null) {
            yVar2.e("ad failed to show as the rewarded ad wasn't ready yet.");
        }
    }

    @Override // B4.j
    public final void b() {
        j("ad clicked");
        y yVar = this.f338d;
        if (yVar != null) {
            yVar.h();
        }
    }

    @Override // B4.j
    public final void c() {
        j("fullscreen ad content dismissed by user");
        this.f337c = null;
        y yVar = this.f338d;
        if (yVar != null) {
            yVar.onAdClosed();
        }
    }

    @Override // B4.j
    public final void d(C0564a adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        j("fullscreen ad content failed to show due to " + adError);
        this.f337c = null;
        y yVar = this.f338d;
        if (yVar != null) {
            yVar.a(adError);
        }
    }

    @Override // B4.j
    public final void e() {
        j("ad impression is recorded");
        y yVar = this.f338d;
        if (yVar != null) {
            yVar.g();
        }
    }

    @Override // B4.j
    public final void f() {
        j("fullscreen ad content is shown");
        y yVar = this.f338d;
        if (yVar != null) {
            yVar.onAdOpened();
        }
    }

    public final void j(String str) {
        v.a("[Rewarded/" + this.f339e + "] " + str);
    }
}

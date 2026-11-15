package B7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends B4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f348a;

    public u(Function1 nativeActionsListener) {
        Intrinsics.checkNotNullParameter(nativeActionsListener, "nativeActionsListener");
        this.f348a = nativeActionsListener;
    }

    public static void u(String str) {
        v.a("[NativeAd/] " + str);
    }

    @Override // B4.d
    public final void i() {
        super.i();
        u("onAdClosed");
        this.f348a.invoke(p.f344a);
    }

    @Override // B4.d
    public final void j(B4.k adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        super.j(adError);
        u("onAdFailedToLoad " + adError);
        this.f348a.invoke(new q(adError));
    }

    @Override // B4.d
    public final void k() {
        super.k();
        u("onAdImpression");
        this.f348a.invoke(r.f346a);
    }

    @Override // B4.d
    public final void o() {
        super.o();
        u("onAdOpened");
        this.f348a.invoke(s.f347a);
    }

    @Override // B4.d
    public final void onAdClicked() {
        super.onAdClicked();
        u("onAdClicked");
        this.f348a.invoke(o.f343a);
    }
}

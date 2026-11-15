package B7;

import N4.D;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends D {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NativeAd f340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public N4.u f342u;

    public n(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f340s = nativeAd;
        E(true);
        F(true);
        z(String.valueOf(nativeAd.e()));
        w(String.valueOf(nativeAd.c()));
        x(String.valueOf(nativeAd.d()));
        G(String.valueOf(nativeAd.i()));
        Double dK = nativeAd.k();
        H(dK == null ? Double.valueOf(0.0d) : dK);
        I(String.valueOf(nativeAd.l()));
        v(String.valueOf(nativeAd.b()));
        B4.l lVarH = nativeAd.h();
        if (lVarH != null) {
            C(lVarH.b());
            y(lVarH.a());
        }
        NativeAd.b bVarF = nativeAd.f();
        if (bVarF != null) {
            Drawable drawableA = bVarF.a();
            Uri uriC = bVarF.c();
            if (drawableA != null && uriC != null) {
                A(new j(drawableA, uriC));
            }
        }
        List<NativeAd.b> listG = nativeAd.g();
        Intrinsics.c(listG);
        if (listG.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(listG.size());
        for (NativeAd.b bVar : listG) {
            Drawable drawableA2 = bVar.a();
            Uri uriC2 = bVar.c();
            if (drawableA2 != null && uriC2 != null) {
                arrayList.add(new j(drawableA2, uriC2));
            }
        }
        B(arrayList);
    }

    public static void R(String str) {
        v.a("[NativeAd/] " + str);
    }

    @Override // N4.D
    public final void J(View containerView, Map clickableAssetViews, Map nonClickableAssetViews) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonClickableAssetViews, "nonClickableAssetViews");
        super.J(containerView, clickableAssetViews, nonClickableAssetViews);
        try {
            if (containerView instanceof com.google.android.gms.ads.nativead.d) {
                ((com.google.android.gms.ads.nativead.d) containerView).setNativeAd(this.f340s);
            }
        } catch (Exception e10) {
            R("trackViews failed: " + e10.getMessage());
        }
    }

    @Override // N4.D
    public final void K(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.K(view);
    }

    public final void Q(N4.u uVar) {
        this.f342u = uVar;
    }

    @Override // N4.D
    public final void r(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        R("handleClick() called");
        try {
            N4.u uVar = this.f342u;
            if (uVar != null) {
                uVar.h();
            }
            N4.u uVar2 = this.f342u;
            if (uVar2 != null) {
                uVar2.onAdOpened();
            }
        } catch (Exception e10) {
            R("reportAdClicked() failed: " + e10.getMessage());
        }
    }

    @Override // N4.D
    public final void t() {
        if (this.f341t) {
            return;
        }
        R("recordImpression()");
        this.f341t = true;
        try {
            N4.u uVar = this.f342u;
            if (uVar != null) {
                uVar.g();
            }
        } catch (Exception e10) {
            R("reportAdImpression() failed: " + e10.getMessage());
        }
    }
}

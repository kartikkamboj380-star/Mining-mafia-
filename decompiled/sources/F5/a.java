package F5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f741e;

    public a(View view) {
        this.f738b = view;
        Context context = view.getContext();
        this.f737a = d.g(context, p186s5.a.f48604Q, Q.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        this.f739c = d.f(context, p186s5.a.f48595H, 300);
        this.f740d = d.f(context, p186s5.a.f48598K, 150);
        this.f741e = d.f(context, p186s5.a.f48597J, 100);
    }
}

package J4;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageButton f2255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0746i f2256b;

    public E(Context context, D d10, InterfaceC0746i interfaceC0746i) {
        super(context);
        this.f2256b = interfaceC0746i;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f2255a = imageButton;
        f();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C0654z.a();
        int iC = L4.g.c(context, d10.f2251a);
        C0654z.a();
        int iC2 = L4.g.c(context, 0);
        C0654z.a();
        int iC3 = L4.g.c(context, d10.f2252b);
        C0654z.a();
        imageButton.setPadding(iC, iC2, iC3, L4.g.c(context, d10.f2253c));
        imageButton.setContentDescription("Interstitial close button");
        C0654z.a();
        int iC4 = L4.g.c(context, d10.f2254d + d10.f2251a + d10.f2252b);
        C0654z.a();
        addView(imageButton, new FrameLayout.LayoutParams(iC4, L4.g.c(context, d10.f2254d + d10.f2253c), 17));
        long jLongValue = ((Long) H4.B.c().d(AbstractC3892ii.f29591J1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        C c10 = ((Boolean) H4.B.c().d(AbstractC3892ii.f29601K1)).booleanValue() ? new C(this) : null;
        imageButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(c10);
    }

    private final void f() {
        String str = (String) H4.B.c().d(AbstractC3892ii.f29581I1);
        if (TextUtils.isEmpty(str) || BuildConfig.FLAVOR.equals(str)) {
            this.f2255a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesI = G4.t.l().i();
        if (resourcesI == null) {
            this.f2255a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesI.getDrawable(F4.a.f711b);
            } else if ("black".equals(str)) {
                drawable = resourcesI.getDrawable(F4.a.f710a);
            }
        } catch (Resources.NotFoundException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.f2255a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.f2255a;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void b(boolean z9) {
        if (!z9) {
            this.f2255a.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.f2255a;
        imageButton.setVisibility(8);
        if (((Long) H4.B.c().d(AbstractC3892ii.f29591J1)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    final /* synthetic */ ImageButton e() {
        return this.f2255a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0746i interfaceC0746i = this.f2256b;
        if (interfaceC0746i != null) {
            interfaceC0746i.zzd();
        }
    }
}

package p233x2;

import V2.b;
import Y1.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import p223w2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ImageView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f50523g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.C0557a f50524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f50525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f50526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f50528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f50529f;

    public c(Context context) {
        super(context);
        this.f50524a = new a.C0557a();
        this.f50525b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f50527d = false;
        this.f50528e = false;
        this.f50529f = null;
        c(context);
    }

    private void c(Context context) {
        boolean zD;
        try {
            if (b.d()) {
                b.a("DraweeView#init");
            }
            if (this.f50527d) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            boolean z9 = true;
            this.f50527d = true;
            this.f50526c = b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f50523g || context.getApplicationInfo().targetSdkVersion < 24) {
                z9 = false;
            }
            this.f50528e = z9;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f50528e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z9) {
        f50523g = z9;
    }

    protected void a() {
        this.f50526c.i();
    }

    protected void b() {
        this.f50526c.j();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f50525b;
    }

    public a getController() {
        return this.f50526c.e();
    }

    public Object getExtraData() {
        return this.f50529f;
    }

    public p223w2.b getHierarchy() {
        return this.f50526c.f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f50526c.g();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a.C0557a c0557a = this.f50524a;
        c0557a.f50515a = i10;
        c0557a.f50516b = i11;
        a.b(c0557a, this.f50525b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0557a c0557a2 = this.f50524a;
        super.onMeasure(c0557a2.f50515a, c0557a2.f50516b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f50526c.k(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d();
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.f50525b) {
            return;
        }
        this.f50525b = f10;
        requestLayout();
    }

    public void setController(a aVar) {
        this.f50526c.o(aVar);
        super.setImageDrawable(this.f50526c.g());
    }

    public void setExtraData(Object obj) {
        this.f50529f = obj;
    }

    public void setHierarchy(p223w2.b bVar) {
        this.f50526c.p(bVar);
        super.setImageDrawable(this.f50526c.g());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f50526c.m();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f50526c.m();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        c(getContext());
        this.f50526c.m();
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f50526c.m();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z9) {
        this.f50528e = z9;
    }

    @Override // android.view.View
    public String toString() {
        i.a aVarB = i.b(this);
        b bVar = this.f50526c;
        return aVarB.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}

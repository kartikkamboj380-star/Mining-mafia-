package androidx.swiperefreshlayout.widget;

import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
class a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f10948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10950c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private static class C0175a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f10951a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f10953c;

        C0175a(a aVar, int i10) {
            this.f10953c = aVar;
            this.f10952b = i10;
            b((int) rect().width());
        }

        private void b(int i10) {
            float f10 = i10 / 2;
            this.f10951a.setShader(new RadialGradient(f10, f10, this.f10952b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f10953c.getWidth() / 2;
            float f10 = width;
            float height = this.f10953c.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.f10951a);
            canvas.drawCircle(f10, height, width - this.f10952b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            b((int) f10);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * f10);
        this.f10949b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(E0.a.f563f);
        this.f10950c = typedArrayObtainStyledAttributes.getColor(E0.a.f564g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC0845c0.u0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0175a(this, this.f10949b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f10949b, i11, i10, 503316480);
            int i12 = this.f10949b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f10950c);
        AbstractC0845c0.q0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f10948a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f10948a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f10948a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f10949b * 2), getMeasuredHeight() + (this.f10949b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f10950c = i10;
        }
    }
}

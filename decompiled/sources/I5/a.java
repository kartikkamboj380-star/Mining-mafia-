package I5;

import K5.g;
import K5.k;
import K5.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f1651a;

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f1651a = new b(this.f1651a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f1651a;
        if (bVar.f1653b) {
            bVar.f1652a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f1651a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1651a.f1652a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1651a.f1652a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f1651a.f1652a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = I5.b.e(iArr);
        b bVar = this.f1651a;
        if (bVar.f1653b == zE) {
            return zOnStateChange;
        }
        bVar.f1653b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1651a.f1652a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1651a.f1652a.setColorFilter(colorFilter);
    }

    @Override // K5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f1651a.f1652a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f1651a.f1652a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1651a.f1652a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1651a.f1652a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f1652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1653b;

        public b(g gVar) {
            this.f1652a = gVar;
            this.f1653b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f1652a = (g) bVar.f1652a.getConstantState().newDrawable();
            this.f1653b = bVar.f1653b;
        }
    }

    private a(b bVar) {
        this.f1651a = bVar;
    }
}

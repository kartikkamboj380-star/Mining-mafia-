package p193t2;

import Y1.k;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7129a extends Drawable implements Drawable.Callback, D, C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f49523a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable[] f49525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC7131c[] f49526d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7132d f49524b = new C7132d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f49527e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49528f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49529g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49530h = false;

    /* JADX INFO: renamed from: t2.a$a, reason: collision with other inner class name */
    class C0537a implements InterfaceC7131c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49531a;

        C0537a(int i10) {
            this.f49531a = i10;
        }

        @Override // p193t2.InterfaceC7131c
        public Drawable h(Drawable drawable) {
            return AbstractC7129a.this.g(this.f49531a, drawable);
        }

        @Override // p193t2.InterfaceC7131c
        public Drawable s() {
            return AbstractC7129a.this.b(this.f49531a);
        }
    }

    public AbstractC7129a(Drawable[] drawableArr) {
        int i10 = 0;
        k.g(drawableArr);
        this.f49525c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f49525c;
            if (i10 >= drawableArr2.length) {
                this.f49526d = new InterfaceC7131c[drawableArr2.length];
                return;
            } else {
                C7133e.d(drawableArr2[i10], this, this);
                i10++;
            }
        }
    }

    private InterfaceC7131c a(int i10) {
        return new C0537a(i10);
    }

    public Drawable b(int i10) {
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f49525c.length));
        return this.f49525c[i10];
    }

    @Override // p193t2.C
    public void c(D d10) {
        this.f49523a = d10;
    }

    public InterfaceC7131c d(int i10) {
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f49526d.length));
        InterfaceC7131c[] interfaceC7131cArr = this.f49526d;
        if (interfaceC7131cArr[i10] == null) {
            interfaceC7131cArr[i10] = a(i10);
        }
        return this.f49526d[i10];
    }

    @Override // p193t2.D
    public void e(Matrix matrix) {
        D d10 = this.f49523a;
        if (d10 != null) {
            d10.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public int f() {
        return this.f49525c.length;
    }

    public Drawable g(int i10, Drawable drawable) {
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f49525c.length));
        Drawable drawable2 = this.f49525c[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f49530h) {
                drawable.mutate();
            }
            C7133e.d(this.f49525c[i10], null, null);
            C7133e.d(drawable, null, null);
            C7133e.e(drawable, this.f49524b);
            C7133e.a(drawable, this);
            C7133e.d(drawable, this, this);
            this.f49529g = false;
            this.f49525c[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f49525c.length == 0) {
            return -2;
        }
        int i10 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f49527e;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f49529g) {
            this.f49528f = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f49525c;
                boolean z9 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z10 = this.f49528f;
                if (drawable == null || !drawable.isStateful()) {
                    z9 = false;
                }
                this.f49528f = z10 | z9;
                i10++;
            }
            this.f49529g = true;
        }
        return this.f49528f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                this.f49530h = true;
                return this;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.mutate();
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z9 = false;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i11 >= drawableArr.length) {
                return z9;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z9 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return z9;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z9 = true;
            }
            i10++;
        }
    }

    @Override // p193t2.D
    public void p(RectF rectF) {
        D d10 = this.f49523a;
        if (d10 != null) {
            d10.p(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49524b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        this.f49524b.d(z9);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z9);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        this.f49524b.e(z9);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z9);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f49525c;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z9, z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

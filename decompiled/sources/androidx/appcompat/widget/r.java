package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class r extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1084e f8410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1096q f8411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8412c;

    public r(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            c1084e.b();
        }
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            c1096q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            return c1084e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            return c1084e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            return c1096q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            return c1096q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f8411b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            c1084e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            c1084e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            c1096q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1096q c1096q = this.f8411b;
        if (c1096q != null && drawable != null && !this.f8412c) {
            c1096q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1096q c1096q2 = this.f8411b;
        if (c1096q2 != null) {
            c1096q2.c();
            if (this.f8412c) {
                return;
            }
            this.f8411b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f8412c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            c1096q.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            c1096q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            c1084e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1084e c1084e = this.f8410a;
        if (c1084e != null) {
            c1084e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            c1096q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1096q c1096q = this.f8411b;
        if (c1096q != null) {
            c1096q.k(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        this.f8412c = false;
        d0.a(this, getContext());
        C1084e c1084e = new C1084e(this);
        this.f8410a = c1084e;
        c1084e.e(attributeSet, i10);
        C1096q c1096q = new C1096q(this);
        this.f8411b = c1096q;
        c1096q.g(attributeSet, i10);
    }
}

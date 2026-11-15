package p070h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import p060g.j;
import p120m.b;

/* JADX INFO: renamed from: h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6986a {
    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z9);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z9);

    public abstract void r(boolean z9);

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z9);

    public abstract void u(CharSequence charSequence);

    public abstract void v(CharSequence charSequence);

    public b w(b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public static class C0431a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44563a;

        public C0431a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44563a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f44245t);
            this.f44563a = typedArrayObtainStyledAttributes.getInt(j.f44250u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0431a(int i10, int i11) {
            super(i10, i11);
            this.f44563a = 8388627;
        }

        public C0431a(C0431a c0431a) {
            super((ViewGroup.MarginLayoutParams) c0431a);
            this.f44563a = 0;
            this.f44563a = c0431a.f44563a;
        }

        public C0431a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44563a = 0;
        }
    }

    void m() {
    }

    public void l(Configuration configuration) {
    }
}

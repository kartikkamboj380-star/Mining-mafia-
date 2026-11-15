package O2;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f4471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4472e;

    public i(Drawable drawable) {
        this.f4471d = drawable;
    }

    @Override // O2.f
    public Drawable G0() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f4471d;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // O2.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4471d = null;
        this.f4472e = true;
    }

    @Override // O2.d
    public int f0() {
        return getWidth() * getHeight() * 4;
    }

    @Override // O2.d, O2.l
    public int getHeight() {
        Drawable drawable = this.f4471d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // O2.d, O2.l
    public int getWidth() {
        Drawable drawable = this.f4471d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // O2.d
    public boolean isClosed() {
        return this.f4472e;
    }
}

package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j f36187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f36188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f36189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36191m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f36192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36193w;

    public k(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? i.f36175a : drawable;
        this.f36188j = drawable;
        drawable.setCallback(this);
        j jVar = this.f36187i;
        jVar.f36178b = drawable.getChangingConfigurations() | jVar.f36178b;
        drawable2 = drawable2 == null ? i.f36175a : drawable2;
        this.f36189k = drawable2;
        drawable2.setCallback(this);
        j jVar2 = this.f36187i;
        jVar2.f36178b = drawable2.getChangingConfigurations() | jVar2.f36178b;
    }

    public final Drawable a() {
        return this.f36189k;
    }

    public final void b(int i10) {
        this.f36181c = this.f36182d;
        this.f36184f = 0;
        this.f36183e = 250;
        this.f36179a = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.f36190l) {
            boolean z9 = false;
            if (this.f36188j.getConstantState() != null && this.f36189k.getConstantState() != null) {
                z9 = true;
            }
            this.f36191m = z9;
            this.f36190l = true;
        }
        return this.f36191m;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z9;
        int i10;
        int i11 = this.f36179a;
        int i12 = 0;
        if (i11 == 1) {
            this.f36180b = SystemClock.uptimeMillis();
            this.f36179a = 2;
            z9 = false;
        } else if (i11 == 2 && this.f36180b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f36180b) / this.f36183e;
            z9 = fUptimeMillis >= 1.0f;
            if (z9) {
                this.f36179a = 0;
            }
            this.f36184f = (int) ((this.f36181c * Math.min(fUptimeMillis, 1.0f)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            z9 = true;
        }
        int i13 = this.f36184f;
        boolean z10 = this.f36185g;
        Drawable drawable = this.f36188j;
        Drawable drawable2 = this.f36189k;
        if (!z9) {
            if (z10) {
                drawable.setAlpha(this.f36182d - i13);
                i12 = 1;
            }
            drawable.draw(canvas);
            if (i12 != 0) {
                drawable.setAlpha(this.f36182d);
            }
            if (i13 > 0) {
                drawable2.setAlpha(i13);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f36182d);
            }
            invalidateSelf();
            return;
        }
        if (z10) {
            if (i13 == 0) {
            }
            i10 = this.f36182d;
            if (i13 == i10) {
                drawable2.setAlpha(i10);
                drawable2.draw(canvas);
            }
        }
        i12 = i13;
        drawable.draw(canvas);
        i13 = i12;
        i10 = this.f36182d;
        if (i13 == i10) {
            drawable2.setAlpha(i10);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.f36187i;
        return changingConfigurations | jVar.f36177a | jVar.f36178b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!c()) {
            return null;
        }
        this.f36187i.f36177a = getChangingConfigurations();
        return this.f36187i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f36188j.getIntrinsicHeight(), this.f36189k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f36188j.getIntrinsicWidth(), this.f36189k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f36192v) {
            this.f36193w = Drawable.resolveOpacity(this.f36188j.getOpacity(), this.f36189k.getOpacity());
            this.f36192v = true;
        }
        return this.f36193w;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f36186h || super.mutate() != this) {
            return this;
        }
        if (!c()) {
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
        }
        this.f36188j.mutate();
        this.f36189k.mutate();
        this.f36186h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f36188j.setBounds(rect);
        this.f36189k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f36184f == this.f36182d) {
            this.f36184f = i10;
        }
        this.f36182d = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36188j.setColorFilter(colorFilter);
        this.f36189k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    k(j jVar) {
        this.f36179a = 0;
        this.f36182d = 255;
        this.f36184f = 0;
        this.f36185g = true;
        this.f36187i = new j(jVar);
    }
}

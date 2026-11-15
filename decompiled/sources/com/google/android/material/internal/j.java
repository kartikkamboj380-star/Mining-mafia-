package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39316d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H5.d f39319g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f39313a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H5.f f39314b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39317e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f39318f = new WeakReference(null);

    class a extends H5.f {
        a() {
        }

        @Override // H5.f
        public void a(int i10) {
            j.this.f39317e = true;
            b bVar = (b) j.this.f39318f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // H5.f
        public void b(Typeface typeface, boolean z9) {
            if (z9) {
                return;
            }
            j.this.f39317e = true;
            b bVar = (b) j.this.f39318f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        return str == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.abs(this.f39313a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        return charSequence == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f39313a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f39315c = d(str);
        this.f39316d = c(str);
        this.f39317e = false;
    }

    public H5.d e() {
        return this.f39319g;
    }

    public float f(String str) {
        if (!this.f39317e) {
            return this.f39316d;
        }
        i(str);
        return this.f39316d;
    }

    public TextPaint g() {
        return this.f39313a;
    }

    public float h(String str) {
        if (!this.f39317e) {
            return this.f39315c;
        }
        i(str);
        return this.f39315c;
    }

    public void j(b bVar) {
        this.f39318f = new WeakReference(bVar);
    }

    public void k(H5.d dVar, Context context) {
        if (this.f39319g != dVar) {
            this.f39319g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f39313a, this.f39314b);
                b bVar = (b) this.f39318f.get();
                if (bVar != null) {
                    this.f39313a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f39313a, this.f39314b);
                this.f39317e = true;
            }
            b bVar2 = (b) this.f39318f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z9) {
        this.f39317e = z9;
    }

    public void m(boolean z9) {
        this.f39317e = z9;
    }

    public void n(Context context) {
        this.f39319g.n(context, this.f39313a, this.f39314b);
    }
}

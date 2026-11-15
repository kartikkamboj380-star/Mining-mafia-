package H5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f1481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f1482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f1483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f1492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f1493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f1494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f1495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1496p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f1497q;

    class a extends E.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f1498a;

        a(f fVar) {
            this.f1498a = fVar;
        }

        @Override // E.h.e
        public void f(int i10) {
            d.this.f1496p = true;
            this.f1498a.a(i10);
        }

        @Override // E.h.e
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f1497q = Typeface.create(typeface, dVar.f1485e);
            d.this.f1496p = true;
            this.f1498a.b(d.this.f1497q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f1501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f1502c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f1500a = context;
            this.f1501b = textPaint;
            this.f1502c = fVar;
        }

        @Override // H5.f
        public void a(int i10) {
            this.f1502c.a(i10);
        }

        @Override // H5.f
        public void b(Typeface typeface, boolean z9) {
            d.this.p(this.f1500a, this.f1501b, typeface);
            this.f1502c.b(typeface, z9);
        }
    }

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.f49164h6);
        l(typedArrayObtainStyledAttributes.getDimension(k.f49173i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        k(c.a(context, typedArrayObtainStyledAttributes, k.f49200l6));
        this.f1481a = c.a(context, typedArrayObtainStyledAttributes, k.f49209m6);
        this.f1482b = c.a(context, typedArrayObtainStyledAttributes, k.f49218n6);
        this.f1485e = typedArrayObtainStyledAttributes.getInt(k.f49191k6, 0);
        this.f1486f = typedArrayObtainStyledAttributes.getInt(k.f49182j6, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, k.f49272t6, k.f49263s6);
        this.f1495o = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f1484d = typedArrayObtainStyledAttributes.getString(iG);
        this.f1487g = typedArrayObtainStyledAttributes.getBoolean(k.f49281u6, false);
        this.f1483c = c.a(context, typedArrayObtainStyledAttributes, k.f49227o6);
        this.f1488h = typedArrayObtainStyledAttributes.getFloat(k.f49236p6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f1489i = typedArrayObtainStyledAttributes.getFloat(k.f49245q6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f1490j = typedArrayObtainStyledAttributes.getFloat(k.f49254r6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f49153g4);
        this.f1491k = typedArrayObtainStyledAttributes2.hasValue(k.f49162h4);
        this.f1492l = typedArrayObtainStyledAttributes2.getFloat(k.f49162h4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f1497q == null && (str = this.f1484d) != null) {
            this.f1497q = Typeface.create(str, this.f1485e);
        }
        if (this.f1497q == null) {
            int i10 = this.f1486f;
            if (i10 == 1) {
                this.f1497q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f1497q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f1497q = Typeface.DEFAULT;
            } else {
                this.f1497q = Typeface.MONOSPACE;
            }
            this.f1497q = Typeface.create(this.f1497q, this.f1485e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f1495o;
        return (i10 != 0 ? E.h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f1497q;
    }

    public Typeface f(Context context) {
        if (this.f1496p) {
            return this.f1497q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = E.h.h(context, this.f1495o);
                this.f1497q = typefaceH;
                if (typefaceH != null) {
                    this.f1497q = Typeface.create(typefaceH, this.f1485e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f1484d, e10);
            }
        }
        d();
        this.f1496p = true;
        return this.f1497q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f1495o;
        if (i10 == 0) {
            this.f1496p = true;
        }
        if (this.f1496p) {
            fVar.b(this.f1497q, true);
            return;
        }
        try {
            E.h.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f1496p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f1484d, e10);
            this.f1496p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f1493m;
    }

    public float j() {
        return this.f1494n;
    }

    public void k(ColorStateList colorStateList) {
        this.f1493m = colorStateList;
    }

    public void l(float f10) {
        this.f1494n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f1493m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f1490j;
        float f11 = this.f1488h;
        float f12 = this.f1489i;
        ColorStateList colorStateList2 = this.f1483c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = i.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f1485e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textPaint.setTextSize(this.f1494n);
        if (this.f1491k) {
            textPaint.setLetterSpacing(this.f1492l);
        }
    }
}

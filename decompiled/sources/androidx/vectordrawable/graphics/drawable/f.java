package androidx.vectordrawable.graphics.drawable;

import E.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f11072k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f11073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f11074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f11075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f11078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f11079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f11080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f11081j;

    private static class b extends AbstractC0179f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11108b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11107a = F.d.d(string2);
            }
            this.f11109c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC0179f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11045d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f11129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f11130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f11131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f11132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f11133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f11134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f11135h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f11136i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f11137j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f11138k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f11139l;

        public h(h hVar) {
            this.f11130c = null;
            this.f11131d = f.f11072k;
            if (hVar != null) {
                this.f11128a = hVar.f11128a;
                g gVar = new g(hVar.f11129b);
                this.f11129b = gVar;
                if (hVar.f11129b.f11116e != null) {
                    gVar.f11116e = new Paint(hVar.f11129b.f11116e);
                }
                if (hVar.f11129b.f11115d != null) {
                    this.f11129b.f11115d = new Paint(hVar.f11129b.f11115d);
                }
                this.f11130c = hVar.f11130c;
                this.f11131d = hVar.f11131d;
                this.f11132e = hVar.f11132e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f11133f.getWidth() && i11 == this.f11133f.getHeight();
        }

        public boolean b() {
            return !this.f11138k && this.f11134g == this.f11130c && this.f11135h == this.f11131d && this.f11137j == this.f11132e && this.f11136i == this.f11129b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f11133f == null || !a(i10, i11)) {
                this.f11133f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f11138k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11133f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f11139l == null) {
                Paint paint = new Paint();
                this.f11139l = paint;
                paint.setFilterBitmap(true);
            }
            this.f11139l.setAlpha(this.f11129b.getRootAlpha());
            this.f11139l.setColorFilter(colorFilter);
            return this.f11139l;
        }

        public boolean f() {
            return this.f11129b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f11129b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11128a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f11129b.g(iArr);
            this.f11138k |= zG;
            return zG;
        }

        public void i() {
            this.f11134g = this.f11130c;
            this.f11135h = this.f11131d;
            this.f11136i = this.f11129b.getRootAlpha();
            this.f11137j = this.f11132e;
            this.f11138k = false;
        }

        public void j(int i10, int i11) {
            this.f11133f.eraseColor(0);
            this.f11129b.b(new Canvas(this.f11133f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f11130c = null;
            this.f11131d = f.f11072k;
            this.f11129b = new g();
        }
    }

    f() {
        this.f11077f = true;
        this.f11079h = new float[9];
        this.f11080i = new Matrix();
        this.f11081j = new Rect();
        this.f11073b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f11071a = E.h.f(resources, i10, theme);
        fVar.f11078g = new i(fVar.f11071a.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f11073b;
        g gVar = hVar.f11129b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f11119h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z9 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11095b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f11127p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f11128a = cVar.f11110d | hVar.f11128a;
                    z9 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11095b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f11127p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f11128a = bVar.f11110d | hVar.f11128a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11095b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f11127p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f11128a = dVar2.f11104k | hVar.f11128a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z9) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && G.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f11073b;
        g gVar = hVar.f11129b;
        hVar.f11131d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f11130c = colorStateListC;
        }
        hVar.f11132e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f11132e);
        gVar.f11122k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f11122k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f11123l);
        gVar.f11123l = f10;
        if (gVar.f11122k <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f11120i = typedArray.getDimension(3, gVar.f11120i);
        float dimension = typedArray.getDimension(2, gVar.f11121j);
        gVar.f11121j = dimension;
        if (gVar.f11120i <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f11125n = string;
            gVar.f11127p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f11073b.f11129b.f11127p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11071a;
        if (drawable == null) {
            return false;
        }
        G.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11081j);
        if (this.f11081j.width() <= 0 || this.f11081j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11075d;
        if (colorFilter == null) {
            colorFilter = this.f11074c;
        }
        canvas.getMatrix(this.f11080i);
        this.f11080i.getValues(this.f11079h);
        float fAbs = Math.abs(this.f11079h[0]);
        float fAbs2 = Math.abs(this.f11079h[4]);
        float fAbs3 = Math.abs(this.f11079h[1]);
        float fAbs4 = Math.abs(this.f11079h[3]);
        if (fAbs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fAbs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f11081j.width() * fAbs);
        int iHeight = (int) (this.f11081j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f11081j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f11081j.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f11081j.offsetTo(0, 0);
        this.f11073b.c(iMin, iMin2);
        if (!this.f11077f) {
            this.f11073b.j(iMin, iMin2);
        } else if (!this.f11073b.b()) {
            this.f11073b.j(iMin, iMin2);
            this.f11073b.i();
        }
        this.f11073b.d(canvas, colorFilter, this.f11081j);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z9) {
        this.f11077f = z9;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11071a;
        return drawable != null ? G.a.d(drawable) : this.f11073b.f11129b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11073b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11071a;
        return drawable != null ? G.a.e(drawable) : this.f11075d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11071a != null) {
            return new i(this.f11071a.getConstantState());
        }
        this.f11073b.f11128a = getChangingConfigurations();
        return this.f11073b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11073b.f11129b.f11121j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11073b.f11129b.f11120i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11071a;
        return drawable != null ? G.a.h(drawable) : this.f11073b.f11132e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f11073b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f11073b.f11130c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11076e && super.mutate() == this) {
            this.f11073b = new h(this.f11073b);
            this.f11076e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f11073b;
        ColorStateList colorStateList = hVar.f11130c;
        if (colorStateList == null || (mode = hVar.f11131d) == null) {
            z9 = false;
        } else {
            this.f11074c = i(this.f11074c, colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z9;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f11073b.f11129b.getRootAlpha() != i10) {
            this.f11073b.f11129b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.j(drawable, z9);
        } else {
            this.f11073b.f11132e = z9;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
        super.setFilterBitmap(z9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f11073b;
        if (hVar.f11130c != colorStateList) {
            hVar.f11130c = colorStateList;
            this.f11074c = i(this.f11074c, colorStateList, hVar.f11131d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.p(drawable, mode);
            return;
        }
        h hVar = this.f11073b;
        if (hVar.f11131d != mode) {
            hVar.f11131d = mode;
            this.f11074c = i(this.f11074c, hVar.f11130c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f11140a;

        public i(Drawable.ConstantState constantState) {
            this.f11140a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11140a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11140a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f11071a = (VectorDrawable) this.f11140a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f11071a = (VectorDrawable) this.f11140a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f11071a = (VectorDrawable) this.f11140a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11075d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    private static abstract class AbstractC0179f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected F.d.b[] f11107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f11108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11110d;

        public AbstractC0179f() {
            super();
            this.f11107a = null;
            this.f11109c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            F.d.b[] bVarArr = this.f11107a;
            if (bVarArr != null) {
                F.d.b.h(bVarArr, path);
            }
        }

        public F.d.b[] getPathData() {
            return this.f11107a;
        }

        public String getPathName() {
            return this.f11108b;
        }

        public void setPathData(F.d.b[] bVarArr) {
            if (F.d.b(this.f11107a, bVarArr)) {
                F.d.k(this.f11107a, bVarArr);
            } else {
                this.f11107a = F.d.f(bVarArr);
            }
        }

        public AbstractC0179f(AbstractC0179f abstractC0179f) {
            super();
            this.f11107a = null;
            this.f11109c = 0;
            this.f11108b = abstractC0179f.f11108b;
            this.f11110d = abstractC0179f.f11110d;
            this.f11107a = F.d.f(abstractC0179f.f11107a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f11073b;
        hVar.f11129b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11042a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f11128a = getChangingConfigurations();
        hVar.f11138k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f11074c = i(this.f11074c, hVar.f11130c, hVar.f11131d);
    }

    f(h hVar) {
        this.f11077f = true;
        this.f11079h = new float[9];
        this.f11080i = new Matrix();
        this.f11081j = new Rect();
        this.f11073b = hVar;
        this.f11074c = i(this.f11074c, hVar.f11130c, hVar.f11131d);
    }

    private static class c extends AbstractC0179f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f11082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        E.d f11083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f11084g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        E.d f11085h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f11086i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f11087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f11088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f11089l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f11090m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f11091n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f11092o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f11093p;

        c() {
            this.f11084g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11086i = 1.0f;
            this.f11087j = 1.0f;
            this.f11088k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11089l = 1.0f;
            this.f11090m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11091n = Paint.Cap.BUTT;
            this.f11092o = Paint.Join.MITER;
            this.f11093p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11082e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11108b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11107a = F.d.d(string2);
                }
                this.f11085h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f11087j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f11087j);
                this.f11091n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11091n);
                this.f11092o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11092o);
                this.f11093p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11093p);
                this.f11083f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f11086i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11086i);
                this.f11084g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f11084g);
                this.f11089l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11089l);
                this.f11090m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11090m);
                this.f11088k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f11088k);
                this.f11109c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f11109c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f11085h.i() || this.f11083f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f11083f.j(iArr) | this.f11085h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11044c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f11087j;
        }

        int getFillColor() {
            return this.f11085h.e();
        }

        float getStrokeAlpha() {
            return this.f11086i;
        }

        int getStrokeColor() {
            return this.f11083f.e();
        }

        float getStrokeWidth() {
            return this.f11084g;
        }

        float getTrimPathEnd() {
            return this.f11089l;
        }

        float getTrimPathOffset() {
            return this.f11090m;
        }

        float getTrimPathStart() {
            return this.f11088k;
        }

        void setFillAlpha(float f10) {
            this.f11087j = f10;
        }

        void setFillColor(int i10) {
            this.f11085h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f11086i = f10;
        }

        void setStrokeColor(int i10) {
            this.f11083f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f11084g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f11089l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f11090m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f11088k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f11084g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11086i = 1.0f;
            this.f11087j = 1.0f;
            this.f11088k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11089l = 1.0f;
            this.f11090m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11091n = Paint.Cap.BUTT;
            this.f11092o = Paint.Join.MITER;
            this.f11093p = 4.0f;
            this.f11082e = cVar.f11082e;
            this.f11083f = cVar.f11083f;
            this.f11084g = cVar.f11084g;
            this.f11086i = cVar.f11086i;
            this.f11085h = cVar.f11085h;
            this.f11109c = cVar.f11109c;
            this.f11087j = cVar.f11087j;
            this.f11088k = cVar.f11088k;
            this.f11089l = cVar.f11089l;
            this.f11090m = cVar.f11090m;
            this.f11091n = cVar.f11091n;
            this.f11092o = cVar.f11092o;
            this.f11093p = cVar.f11093p;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f11111q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f11112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f11113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f11114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f11115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f11116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f11117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f11119h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f11120i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f11121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f11122k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f11123l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f11124m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f11125n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f11126o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final p190t.a f11127p;

        public g() {
            this.f11114c = new Matrix();
            this.f11120i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11121j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11122k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11123l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11124m = 255;
            this.f11125n = null;
            this.f11126o = null;
            this.f11127p = new p190t.a();
            this.f11119h = new d();
            this.f11112a = new Path();
            this.f11113b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f11094a.set(matrix);
            dVar2.f11094a.preConcat(dVar2.f11103j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f11095b.size()) {
                e eVar = (e) dVar2.f11095b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f11094a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0179f) {
                    d(dVar2, (AbstractC0179f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0179f abstractC0179f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f11122k;
            float f11 = i11 / this.f11123l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f11094a;
            this.f11114c.set(matrix);
            this.f11114c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            abstractC0179f.d(this.f11112a);
            Path path = this.f11112a;
            this.f11113b.reset();
            if (abstractC0179f.c()) {
                this.f11113b.setFillType(abstractC0179f.f11109c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f11113b.addPath(path, this.f11114c);
                canvas.clipPath(this.f11113b);
                return;
            }
            c cVar = (c) abstractC0179f;
            float f12 = cVar.f11088k;
            if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || cVar.f11089l != 1.0f) {
                float f13 = cVar.f11090m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f11089l + f13) % 1.0f;
                if (this.f11117f == null) {
                    this.f11117f = new PathMeasure();
                }
                this.f11117f.setPath(this.f11112a, false);
                float length = this.f11117f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f11117f.getSegment(f16, length, path, true);
                    this.f11117f.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f17, path, true);
                } else {
                    this.f11117f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.f11113b.addPath(path, this.f11114c);
            if (cVar.f11085h.l()) {
                E.d dVar2 = cVar.f11085h;
                if (this.f11116e == null) {
                    Paint paint = new Paint(1);
                    this.f11116e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f11116e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f11114c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f11087j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f11087j));
                }
                paint2.setColorFilter(colorFilter);
                this.f11113b.setFillType(cVar.f11109c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f11113b, paint2);
            }
            if (cVar.f11083f.l()) {
                E.d dVar3 = cVar.f11083f;
                if (this.f11115d == null) {
                    Paint paint3 = new Paint(1);
                    this.f11115d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f11115d;
                Paint.Join join = cVar.f11092o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f11091n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f11093p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f11114c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f11086i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f11086i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f11084g * fMin * fE);
                canvas.drawPath(this.f11113b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            return fMax > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.abs(fA) / fMax : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f11119h, f11111q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f11126o == null) {
                this.f11126o = Boolean.valueOf(this.f11119h.a());
            }
            return this.f11126o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f11119h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11124m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f11124m = i10;
        }

        public g(g gVar) {
            this.f11114c = new Matrix();
            this.f11120i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11121j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11122k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11123l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11124m = 255;
            this.f11125n = null;
            this.f11126o = null;
            p190t.a aVar = new p190t.a();
            this.f11127p = aVar;
            this.f11119h = new d(gVar.f11119h, aVar);
            this.f11112a = new Path(gVar.f11112a);
            this.f11113b = new Path(gVar.f11113b);
            this.f11120i = gVar.f11120i;
            this.f11121j = gVar.f11121j;
            this.f11122k = gVar.f11122k;
            this.f11123l = gVar.f11123l;
            this.f11118g = gVar.f11118g;
            this.f11124m = gVar.f11124m;
            this.f11125n = gVar.f11125n;
            String str = gVar.f11125n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f11126o = gVar.f11126o;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f11094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f11095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f11097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f11098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f11099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f11100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f11101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f11102i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f11103j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f11104k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f11105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f11106m;

        public d(d dVar, p190t.a aVar) {
            AbstractC0179f bVar;
            super();
            this.f11094a = new Matrix();
            this.f11095b = new ArrayList();
            this.f11096c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11097d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11098e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11099f = 1.0f;
            this.f11100g = 1.0f;
            this.f11101h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11102i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Matrix matrix = new Matrix();
            this.f11103j = matrix;
            this.f11106m = null;
            this.f11096c = dVar.f11096c;
            this.f11097d = dVar.f11097d;
            this.f11098e = dVar.f11098e;
            this.f11099f = dVar.f11099f;
            this.f11100g = dVar.f11100g;
            this.f11101h = dVar.f11101h;
            this.f11102i = dVar.f11102i;
            this.f11105l = dVar.f11105l;
            String str = dVar.f11106m;
            this.f11106m = str;
            this.f11104k = dVar.f11104k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f11103j);
            ArrayList arrayList = dVar.f11095b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f11095b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f11095b.add(bVar);
                    Object obj2 = bVar.f11108b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f11103j.reset();
            this.f11103j.postTranslate(-this.f11097d, -this.f11098e);
            this.f11103j.postScale(this.f11099f, this.f11100g);
            this.f11103j.postRotate(this.f11096c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f11103j.postTranslate(this.f11101h + this.f11097d, this.f11102i + this.f11098e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11105l = null;
            this.f11096c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f11096c);
            this.f11097d = typedArray.getFloat(1, this.f11097d);
            this.f11098e = typedArray.getFloat(2, this.f11098e);
            this.f11099f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f11099f);
            this.f11100g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f11100g);
            this.f11101h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f11101h);
            this.f11102i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f11102i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11106m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f11095b.size(); i10++) {
                if (((e) this.f11095b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f11095b.size(); i10++) {
                zB |= ((e) this.f11095b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11043b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f11106m;
        }

        public Matrix getLocalMatrix() {
            return this.f11103j;
        }

        public float getPivotX() {
            return this.f11097d;
        }

        public float getPivotY() {
            return this.f11098e;
        }

        public float getRotation() {
            return this.f11096c;
        }

        public float getScaleX() {
            return this.f11099f;
        }

        public float getScaleY() {
            return this.f11100g;
        }

        public float getTranslateX() {
            return this.f11101h;
        }

        public float getTranslateY() {
            return this.f11102i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f11097d) {
                this.f11097d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f11098e) {
                this.f11098e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f11096c) {
                this.f11096c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f11099f) {
                this.f11099f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f11100g) {
                this.f11100g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f11101h) {
                this.f11101h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f11102i) {
                this.f11102i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f11094a = new Matrix();
            this.f11095b = new ArrayList();
            this.f11096c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11097d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11098e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11099f = 1.0f;
            this.f11100g = 1.0f;
            this.f11101h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11102i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f11103j = new Matrix();
            this.f11106m = null;
        }
    }
}

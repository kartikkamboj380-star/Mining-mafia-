package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1090k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f8338b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1090k f8339c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X f8340a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a implements X.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f8341a = {p060g.e.f43920R, p060g.e.f43918P, p060g.e.f43922a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f8342b = {p060g.e.f43936o, p060g.e.f43904B, p060g.e.f43941t, p060g.e.f43937p, p060g.e.f43938q, p060g.e.f43940s, p060g.e.f43939r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f8343c = {p060g.e.f43917O, p060g.e.f43919Q, p060g.e.f43932k, p060g.e.f43913K, p060g.e.f43914L, p060g.e.f43915M, p060g.e.f43916N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f8344d = {p060g.e.f43944w, p060g.e.f43930i, p060g.e.f43943v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f8345e = {p060g.e.f43912J, p060g.e.f43921S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f8346f = {p060g.e.f43924c, p060g.e.f43928g, p060g.e.f43925d, p060g.e.f43929h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = d0.c(context, p060g.a.f43874t);
            return new ColorStateList(new int[][]{d0.f8286b, d0.f8289e, d0.f8287c, d0.f8293i}, new int[]{d0.b(context, p060g.a.f43872r), F.a.g(iC, i10), F.a.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, p060g.a.f43871q));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, p060g.a.f43872r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = d0.e(context, p060g.a.f43877w);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = d0.f8286b;
                iArr2[0] = d0.b(context, p060g.a.f43877w);
                iArr[1] = d0.f8290f;
                iArr2[1] = d0.c(context, p060g.a.f43873s);
                iArr[2] = d0.f8293i;
                iArr2[2] = d0.c(context, p060g.a.f43877w);
            } else {
                int[] iArr3 = d0.f8286b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = d0.f8290f;
                iArr2[1] = d0.c(context, p060g.a.f43873s);
                iArr[2] = d0.f8293i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(X x10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = x10.i(context, p060g.e.f43908F);
            Drawable drawableI2 = x10.i(context, p060g.e.f43909G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C1090k.f8338b;
            }
            drawableMutate.setColorFilter(C1090k.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.X.c
        public Drawable a(X x10, Context context, int i10) {
            if (i10 == p060g.e.f43931j) {
                return new LayerDrawable(new Drawable[]{x10.i(context, p060g.e.f43930i), x10.i(context, p060g.e.f43932k)});
            }
            if (i10 == p060g.e.f43946y) {
                return l(x10, context, p060g.d.f43896g);
            }
            if (i10 == p060g.e.f43945x) {
                return l(x10, context, p060g.d.f43897h);
            }
            if (i10 == p060g.e.f43947z) {
                return l(x10, context, p060g.d.f43898i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == p060g.e.f43934m) {
                return p080i.a.a(context, p060g.c.f43886e);
            }
            if (i10 == p060g.e.f43911I) {
                return p080i.a.a(context, p060g.c.f43889h);
            }
            if (i10 == p060g.e.f43910H) {
                return k(context);
            }
            if (i10 == p060g.e.f43927f) {
                return j(context);
            }
            if (i10 == p060g.e.f43923b) {
                return g(context);
            }
            if (i10 == p060g.e.f43926e) {
                return i(context);
            }
            if (i10 == p060g.e.f43906D || i10 == p060g.e.f43907E) {
                return p080i.a.a(context, p060g.c.f43888g);
            }
            if (f(this.f8342b, i10)) {
                return d0.e(context, p060g.a.f43875u);
            }
            if (f(this.f8345e, i10)) {
                return p080i.a.a(context, p060g.c.f43885d);
            }
            if (f(this.f8346f, i10)) {
                return p080i.a.a(context, p060g.c.f43884c);
            }
            if (i10 == p060g.e.f43903A) {
                return p080i.a.a(context, p060g.c.f43887f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.X.c
        public boolean c(Context context, int i10, Drawable drawable) {
            int i11;
            boolean z9;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C1090k.f8338b;
            if (!f(this.f8341a, i10)) {
                if (f(this.f8343c, i10)) {
                    i11 = p060g.a.f43873s;
                } else {
                    if (f(this.f8344d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == p060g.e.f43942u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != p060g.e.f43933l) {
                            i11 = 0;
                            z9 = false;
                            iRound = -1;
                        }
                        z9 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i11 = 16842801;
                    z9 = true;
                }
                if (z9) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C1090k.e(d0.c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = p060g.a.f43875u;
            z9 = true;
            iRound = -1;
            if (z9) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C1090k.e(d0.c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.X.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == p060g.e.f43910H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == p060g.e.f43905C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.c(context, p060g.a.f43875u), C1090k.f8338b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, p060g.a.f43875u), C1090k.f8338b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), d0.c(context, p060g.a.f43873s), C1090k.f8338b);
                return true;
            }
            if (i10 != p060g.e.f43946y && i10 != p060g.e.f43945x && i10 != p060g.e.f43947z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), d0.b(context, p060g.a.f43875u), C1090k.f8338b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, p060g.a.f43873s), C1090k.f8338b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), d0.c(context, p060g.a.f43873s), C1090k.f8338b);
            return true;
        }
    }

    public static synchronized C1090k b() {
        try {
            if (f8339c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8339c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return X.k(i10, mode);
    }

    public static synchronized void h() {
        if (f8339c == null) {
            C1090k c1090k = new C1090k();
            f8339c = c1090k;
            c1090k.f8340a = X.g();
            f8339c.f8340a.t(new a());
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        X.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f8340a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z9) {
        return this.f8340a.j(context, i10, z9);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f8340a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f8340a.r(context);
    }
}

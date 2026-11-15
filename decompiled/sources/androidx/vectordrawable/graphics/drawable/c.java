package androidx.vectordrawable.graphics.drawable;

import E.h;
import E.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0178c f11056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f11058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f11059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f11060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f11061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f11062h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f11061g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f11061g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0178c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f11066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f11067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f11068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        p190t.a f11069e;

        public C0178c(Context context, C0178c c0178c, Drawable.Callback callback, Resources resources) {
            if (c0178c != null) {
                this.f11065a = c0178c.f11065a;
                f fVar = c0178c.f11066b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f11066b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f11066b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f11066b.mutate();
                    this.f11066b = fVar2;
                    fVar2.setCallback(callback);
                    this.f11066b.setBounds(c0178c.f11066b.getBounds());
                    this.f11066b.g(false);
                }
                ArrayList arrayList = c0178c.f11068d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11068d = new ArrayList(size);
                    this.f11069e = new p190t.a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0178c.f11068d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0178c.f11069e.get(animator);
                        animatorClone.setTarget(this.f11066b.c(str));
                        this.f11068d.add(animatorClone);
                        this.f11069e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f11067c == null) {
                this.f11067c = new AnimatorSet();
            }
            this.f11067c.playTogether(this.f11068d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11065a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableF = h.f(context.getResources(), i10, context.getTheme());
        cVar.f11071a = drawableF;
        drawableF.setCallback(cVar.f11062h);
        cVar.f11059e = new d(cVar.f11071a.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f11060f;
        if (animatorListener != null) {
            this.f11056b.f11067c.removeListener(animatorListener);
            this.f11060f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f11056b.f11066b.c(str));
        C0178c c0178c = this.f11056b;
        if (c0178c.f11068d == null) {
            c0178c.f11068d = new ArrayList();
            this.f11056b.f11069e = new p190t.a();
        }
        this.f11056b.f11068d.add(animator);
        this.f11056b.f11069e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f11061g == null) {
            this.f11061g = new ArrayList();
        }
        if (this.f11061g.contains(bVar)) {
            return;
        }
        this.f11061g.add(bVar);
        if (this.f11060f == null) {
            this.f11060f = new b();
        }
        this.f11056b.f11067c.addListener(this.f11060f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            return G.a.b(drawable);
        }
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
        this.f11056b.f11066b.draw(canvas);
        if (this.f11056b.f11067c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f11061g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f11061g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11071a;
        return drawable != null ? G.a.d(drawable) : this.f11056b.f11066b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11056b.f11065a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11071a;
        return drawable != null ? G.a.e(drawable) : this.f11056b.f11066b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11071a != null) {
            return new d(this.f11071a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11056b.f11066b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11056b.f11066b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f11056b.f11066b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11046e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f11062h);
                        f fVar = this.f11056b.f11066b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f11056b.f11066b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f11047f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11057c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f11056b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11071a;
        return drawable != null ? G.a.h(drawable) : this.f11056b.f11066b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f11071a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11056b.f11067c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.isStateful() : this.f11056b.f11066b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11056b.f11066b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.setLevel(i10) : this.f11056b.f11066b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11071a;
        return drawable != null ? drawable.setState(iArr) : this.f11056b.f11066b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f11056b.f11066b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.j(drawable, z9);
        } else {
            this.f11056b.f11066b.setAutoMirrored(z9);
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
            this.f11056b.f11066b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.o(drawable, colorStateList);
        } else {
            this.f11056b.f11066b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            G.a.p(drawable, mode);
        } else {
            this.f11056b.f11066b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f11056b.f11066b.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f11056b.f11067c.isStarted()) {
                return;
            }
            this.f11056b.f11067c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11056b.f11067c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11056b.f11066b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f11070a;

        public d(Drawable.ConstantState constantState) {
            this.f11070a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11070a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11070a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11070a.newDrawable();
            cVar.f11071a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11062h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11070a.newDrawable(resources);
            cVar.f11071a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11062h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11070a.newDrawable(resources, theme);
            cVar.f11071a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11062h);
            return cVar;
        }
    }

    private c(Context context, C0178c c0178c, Resources resources) {
        this.f11058d = null;
        this.f11060f = null;
        this.f11061g = null;
        a aVar = new a();
        this.f11062h = aVar;
        this.f11057c = context;
        if (c0178c != null) {
            this.f11056b = c0178c;
        } else {
            this.f11056b = new C0178c(context, c0178c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

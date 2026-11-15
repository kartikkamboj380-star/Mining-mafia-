package G0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: G0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0566b extends AbstractC0575k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String[] f784e0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Property f785f0 = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Property f786g0 = new C0023b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Property f787h0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Property f788i0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Property f789j0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final C0573i f790k0 = new C0573i();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f791d0 = false;

    /* JADX INFO: renamed from: G0.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: G0.b$b, reason: collision with other inner class name */
    class C0023b extends Property {
        C0023b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: G0.b$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: G0.b$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: G0.b$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            y.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: G0.b$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f792a;
        private final i mViewBounds;

        f(i iVar) {
            this.f792a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: G0.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC0575k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f801h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f802i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f803j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f804k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f805l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f806m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f807n;

        g(View view, Rect rect, boolean z9, Rect rect2, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f794a = view;
            this.f795b = rect;
            this.f796c = z9;
            this.f797d = rect2;
            this.f798e = z10;
            this.f799f = i10;
            this.f800g = i11;
            this.f801h = i12;
            this.f802i = i13;
            this.f803j = i14;
            this.f804k = i15;
            this.f805l = i16;
            this.f806m = i17;
        }

        @Override // G0.AbstractC0575k.f
        public void a(AbstractC0575k abstractC0575k) {
            Rect rect = (Rect) this.f794a.getTag(AbstractC0572h.f839b);
            this.f794a.setTag(AbstractC0572h.f839b, null);
            this.f794a.setClipBounds(rect);
        }

        @Override // G0.AbstractC0575k.f
        public void b(AbstractC0575k abstractC0575k) {
            this.f794a.setTag(AbstractC0572h.f839b, this.f794a.getClipBounds());
            this.f794a.setClipBounds(this.f798e ? null : this.f797d);
        }

        @Override // G0.AbstractC0575k.f
        public void g(AbstractC0575k abstractC0575k) {
            this.f807n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (this.f807n) {
                return;
            }
            Rect rect = null;
            if (z9) {
                if (!this.f796c) {
                    rect = this.f795b;
                }
            } else if (!this.f798e) {
                rect = this.f797d;
            }
            this.f794a.setClipBounds(rect);
            if (z9) {
                y.d(this.f794a, this.f799f, this.f800g, this.f801h, this.f802i);
            } else {
                y.d(this.f794a, this.f803j, this.f804k, this.f805l, this.f806m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            int iMax = Math.max(this.f801h - this.f799f, this.f805l - this.f803j);
            int iMax2 = Math.max(this.f802i - this.f800g, this.f806m - this.f804k);
            int i10 = z9 ? this.f803j : this.f799f;
            int i11 = z9 ? this.f804k : this.f800g;
            y.d(this.f794a, i10, i11, iMax + i10, iMax2 + i11);
            this.f794a.setClipBounds(z9 ? this.f797d : this.f795b);
        }

        @Override // G0.AbstractC0575k.f
        public void d(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
        }
    }

    /* JADX INFO: renamed from: G0.b$h */
    private static class h extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f808a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f809b;

        h(ViewGroup viewGroup) {
            this.f809b = viewGroup;
        }

        @Override // G0.q, G0.AbstractC0575k.f
        public void a(AbstractC0575k abstractC0575k) {
            x.b(this.f809b, true);
        }

        @Override // G0.q, G0.AbstractC0575k.f
        public void b(AbstractC0575k abstractC0575k) {
            x.b(this.f809b, false);
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
            if (!this.f808a) {
                x.b(this.f809b, false);
            }
            abstractC0575k.Z(this);
        }

        @Override // G0.q, G0.AbstractC0575k.f
        public void g(AbstractC0575k abstractC0575k) {
            x.b(this.f809b, false);
            this.f808a = true;
        }
    }

    /* JADX INFO: renamed from: G0.b$i */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f816g;

        i(View view) {
            this.f814e = view;
        }

        private void b() {
            y.d(this.f814e, this.f810a, this.f811b, this.f812c, this.f813d);
            this.f815f = 0;
            this.f816g = 0;
        }

        void a(PointF pointF) {
            this.f812c = Math.round(pointF.x);
            this.f813d = Math.round(pointF.y);
            int i10 = this.f816g + 1;
            this.f816g = i10;
            if (this.f815f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f810a = Math.round(pointF.x);
            this.f811b = Math.round(pointF.y);
            int i10 = this.f815f + 1;
            this.f815f = i10;
            if (i10 == this.f816g) {
                b();
            }
        }
    }

    private void m0(v vVar) {
        View view = vVar.f912b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        vVar.f911a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        vVar.f911a.put("android:changeBounds:parent", vVar.f912b.getParent());
        if (this.f791d0) {
            vVar.f911a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // G0.AbstractC0575k
    public String[] G() {
        return f784e0;
    }

    @Override // G0.AbstractC0575k
    public void g(v vVar) {
        m0(vVar);
    }

    @Override // G0.AbstractC0575k
    public void k(v vVar) {
        Rect rect;
        m0(vVar);
        if (!this.f791d0 || (rect = (Rect) vVar.f912b.getTag(AbstractC0572h.f839b)) == null) {
            return;
        }
        vVar.f911a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G0.AbstractC0575k
    public Animator o(ViewGroup viewGroup, v vVar, v vVar2) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (vVar == null || vVar2 == null) {
            return null;
        }
        Map map = vVar.f911a;
        Map map2 = vVar2.f911a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = vVar2.f912b;
        Rect rect2 = (Rect) vVar.f911a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) vVar2.f911a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) vVar.f911a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) vVar2.f911a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        if (this.f791d0) {
            y.d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : AbstractC0570f.a(view, f789j0, x().a(i12, i14, i13, i15));
            boolean z9 = rect4 == null;
            if (z9) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            int i25 = rect5 == null ? 1 : i11;
            Rect rect6 = i25 != 0 ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f790k0, rect, rect6);
                g gVar = new g(view, rect, z9, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                objectAnimatorOfObject.addListener(gVar);
                b(gVar);
            }
            animatorC = u.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            y.d(view, i12, i14, i16, i18);
            if (i24 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? AbstractC0570f.a(view, f787h0, x().a(i16, i18, i17, i19)) : AbstractC0570f.a(view, f788i0, x().a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = AbstractC0570f.a(view, f789j0, x().a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = AbstractC0570f.a(iVar, f785f0, x().a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = AbstractC0570f.a(iVar, f786g0, x().a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.b(viewGroup4, true);
            z().b(new h(viewGroup4));
        }
        return animatorC;
    }
}

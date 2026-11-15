package G0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends AbstractC0575k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String[] f765e0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f766d0 = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC0575k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f772f = false;

        a(View view, int i10, boolean z9) {
            this.f767a = view;
            this.f768b = i10;
            this.f769c = (ViewGroup) view.getParent();
            this.f770d = z9;
            i(true);
        }

        private void h() {
            if (!this.f772f) {
                y.f(this.f767a, this.f768b);
                ViewGroup viewGroup = this.f769c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z9) {
            ViewGroup viewGroup;
            if (!this.f770d || this.f771e == z9 || (viewGroup = this.f769c) == null) {
                return;
            }
            this.f771e = z9;
            x.b(viewGroup, z9);
        }

        @Override // G0.AbstractC0575k.f
        public void a(AbstractC0575k abstractC0575k) {
            i(true);
            if (this.f772f) {
                return;
            }
            y.f(this.f767a, 0);
        }

        @Override // G0.AbstractC0575k.f
        public void b(AbstractC0575k abstractC0575k) {
            i(false);
            if (this.f772f) {
                return;
            }
            y.f(this.f767a, this.f768b);
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
            abstractC0575k.Z(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f772f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (z9) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            if (z9) {
                y.f(this.f767a, 0);
                ViewGroup viewGroup = this.f769c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // G0.AbstractC0575k.f
        public void d(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void g(AbstractC0575k abstractC0575k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC0575k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f776d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f773a = viewGroup;
            this.f774b = view;
            this.f775c = view2;
        }

        private void h() {
            this.f775c.setTag(AbstractC0572h.f838a, null);
            this.f773a.getOverlay().remove(this.f774b);
            this.f776d = false;
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
            abstractC0575k.Z(this);
        }

        @Override // G0.AbstractC0575k.f
        public void g(AbstractC0575k abstractC0575k) {
            if (this.f776d) {
                h();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f773a.getOverlay().remove(this.f774b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f774b.getParent() == null) {
                this.f773a.getOverlay().add(this.f774b);
            } else {
                K.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            if (z9) {
                this.f775c.setTag(AbstractC0572h.f838a, this.f774b);
                this.f773a.getOverlay().add(this.f774b);
                this.f776d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (z9) {
                return;
            }
            h();
        }

        @Override // G0.AbstractC0575k.f
        public void a(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void b(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void d(AbstractC0575k abstractC0575k) {
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f783f;

        c() {
        }
    }

    private void m0(v vVar) {
        vVar.f911a.put("android:visibility:visibility", Integer.valueOf(vVar.f912b.getVisibility()));
        vVar.f911a.put("android:visibility:parent", vVar.f912b.getParent());
        int[] iArr = new int[2];
        vVar.f912b.getLocationOnScreen(iArr);
        vVar.f911a.put("android:visibility:screenLocation", iArr);
    }

    private c n0(v vVar, v vVar2) {
        c cVar = new c();
        cVar.f778a = false;
        cVar.f779b = false;
        if (vVar == null || !vVar.f911a.containsKey("android:visibility:visibility")) {
            cVar.f780c = -1;
            cVar.f782e = null;
        } else {
            cVar.f780c = ((Integer) vVar.f911a.get("android:visibility:visibility")).intValue();
            cVar.f782e = (ViewGroup) vVar.f911a.get("android:visibility:parent");
        }
        if (vVar2 == null || !vVar2.f911a.containsKey("android:visibility:visibility")) {
            cVar.f781d = -1;
            cVar.f783f = null;
        } else {
            cVar.f781d = ((Integer) vVar2.f911a.get("android:visibility:visibility")).intValue();
            cVar.f783f = (ViewGroup) vVar2.f911a.get("android:visibility:parent");
        }
        if (vVar != null && vVar2 != null) {
            int i10 = cVar.f780c;
            int i11 = cVar.f781d;
            if (i10 != i11 || cVar.f782e != cVar.f783f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f779b = false;
                        cVar.f778a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f779b = true;
                        cVar.f778a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f783f == null) {
                        cVar.f779b = false;
                        cVar.f778a = true;
                        return cVar;
                    }
                    if (cVar.f782e == null) {
                        cVar.f779b = true;
                        cVar.f778a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (vVar == null && cVar.f781d == 0) {
                cVar.f779b = true;
                cVar.f778a = true;
                return cVar;
            }
            if (vVar2 == null && cVar.f780c == 0) {
                cVar.f779b = false;
                cVar.f778a = true;
            }
        }
        return cVar;
    }

    @Override // G0.AbstractC0575k
    public String[] G() {
        return f765e0;
    }

    @Override // G0.AbstractC0575k
    public boolean I(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f911a.containsKey("android:visibility:visibility") != vVar.f911a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarN0 = n0(vVar, vVar2);
        return cVarN0.f778a && (cVarN0.f780c == 0 || cVarN0.f781d == 0);
    }

    @Override // G0.AbstractC0575k
    public void g(v vVar) {
        m0(vVar);
    }

    @Override // G0.AbstractC0575k
    public void k(v vVar) {
        m0(vVar);
    }

    @Override // G0.AbstractC0575k
    public Animator o(ViewGroup viewGroup, v vVar, v vVar2) {
        c cVarN0 = n0(vVar, vVar2);
        if (!cVarN0.f778a) {
            return null;
        }
        if (cVarN0.f782e == null && cVarN0.f783f == null) {
            return null;
        }
        return cVarN0.f779b ? o0(viewGroup, vVar, cVarN0.f780c, vVar2, cVarN0.f781d) : q0(viewGroup, vVar, cVarN0.f780c, vVar2, cVarN0.f781d);
    }

    public Animator o0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        if ((this.f766d0 & 1) != 1 || vVar2 == null) {
            return null;
        }
        if (vVar == null) {
            View view = (View) vVar2.f912b.getParent();
            if (n0(u(view, false), H(view, false)).f778a) {
                return null;
            }
        }
        return p0(viewGroup, vVar2.f912b, vVar, vVar2);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator q0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        View view;
        boolean z9;
        View view2;
        boolean z10;
        if ((this.f766d0 & 2) != 2 || vVar == null) {
            return null;
        }
        View view3 = vVar.f912b;
        View viewA = vVar2 != null ? vVar2.f912b : null;
        View view4 = (View) view3.getTag(AbstractC0572h.f838a);
        if (view4 != null) {
            view2 = null;
            z10 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z9 = false;
                } else {
                    viewA = null;
                    view = null;
                    z9 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z9 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z9 = true;
            }
            if (z9) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (n0(H(view5, true), u(view5, true)).f778a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f854N) {
                            }
                        } else {
                            viewA = u.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z10 = false;
                }
                view2 = view;
                z10 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z10 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            y.f(view2, 0);
            Animator animatorR0 = r0(viewGroup, view2, vVar, vVar2);
            if (animatorR0 == null) {
                y.f(view2, visibility);
                return animatorR0;
            }
            a aVar = new a(view2, i11, true);
            animatorR0.addListener(aVar);
            z().b(aVar);
            return animatorR0;
        }
        if (!z10) {
            int[] iArr = (int[]) vVar.f911a.get("android:visibility:screenLocation");
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i12 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i13 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorR1 = r0(viewGroup, view4, vVar, vVar2);
        if (!z10) {
            if (animatorR1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorR1;
            }
            view3.setTag(AbstractC0572h.f838a, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorR1.addListener(bVar);
            animatorR1.addPauseListener(bVar);
            z().b(bVar);
        }
        return animatorR1;
    }

    public abstract Animator r0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    public void s0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f766d0 = i10;
    }
}

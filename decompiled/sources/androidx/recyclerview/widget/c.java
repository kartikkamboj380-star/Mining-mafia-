package androidx.recyclerview.widget;

import O.AbstractC0845c0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f10613s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f10614h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f10615i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f10616j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f10617k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f10618l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f10619m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f10620n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f10621o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f10622p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f10623q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f10624r = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10625a;

        a(ArrayList arrayList) {
            this.f10625a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f10625a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                c.this.S(jVar.f10659a, jVar.f10660b, jVar.f10661c, jVar.f10662d, jVar.f10663e);
            }
            this.f10625a.clear();
            c.this.f10619m.remove(this.f10625a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10627a;

        b(ArrayList arrayList) {
            this.f10627a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f10627a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c.this.R((i) obj);
            }
            this.f10627a.clear();
            c.this.f10620n.remove(this.f10627a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0168c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10629a;

        RunnableC0168c(ArrayList arrayList) {
            this.f10629a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f10629a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c.this.Q((RecyclerView.D) obj);
            }
            this.f10629a.clear();
            c.this.f10618l.remove(this.f10629a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.D f10631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10633c;

        d(RecyclerView.D d10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10631a = d10;
            this.f10632b = viewPropertyAnimator;
            this.f10633c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10632b.setListener(null);
            this.f10633c.setAlpha(1.0f);
            c.this.G(this.f10631a);
            c.this.f10623q.remove(this.f10631a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f10631a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.D f10635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10637c;

        e(RecyclerView.D d10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f10635a = d10;
            this.f10636b = view;
            this.f10637c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10636b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10637c.setListener(null);
            c.this.A(this.f10635a);
            c.this.f10621o.remove(this.f10635a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f10635a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.D f10639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10643e;

        f(RecyclerView.D d10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f10639a = d10;
            this.f10640b = i10;
            this.f10641c = view;
            this.f10642d = i11;
            this.f10643e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f10640b != 0) {
                this.f10641c.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (this.f10642d != 0) {
                this.f10641c.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10643e.setListener(null);
            c.this.E(this.f10639a);
            c.this.f10622p.remove(this.f10639a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f10639a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f10645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10647c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10645a = iVar;
            this.f10646b = viewPropertyAnimator;
            this.f10647c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10646b.setListener(null);
            this.f10647c.setAlpha(1.0f);
            this.f10647c.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f10647c.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c.this.C(this.f10645a.f10653a, true);
            c.this.f10624r.remove(this.f10645a.f10653a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f10645a.f10653a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f10649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10651c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10649a = iVar;
            this.f10650b = viewPropertyAnimator;
            this.f10651c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10650b.setListener(null);
            this.f10651c.setAlpha(1.0f);
            this.f10651c.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f10651c.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c.this.C(this.f10649a.f10654b, false);
            c.this.f10624r.remove(this.f10649a.f10654b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f10649a.f10654b, false);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.D f10659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10663e;

        j(RecyclerView.D d10, int i10, int i11, int i12, int i13) {
            this.f10659a = d10;
            this.f10660b = i10;
            this.f10661c = i11;
            this.f10662d = i12;
            this.f10663e = i13;
        }
    }

    private void T(RecyclerView.D d10) {
        View view = d10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f10623q.add(d10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new d(d10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.D d10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, d10) && iVar.f10653a == null && iVar.f10654b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.D d10 = iVar.f10653a;
        if (d10 != null) {
            Y(iVar, d10);
        }
        RecyclerView.D d11 = iVar.f10654b;
        if (d11 != null) {
            Y(iVar, d11);
        }
    }

    private boolean Y(i iVar, RecyclerView.D d10) {
        boolean z9 = false;
        if (iVar.f10654b == d10) {
            iVar.f10654b = null;
        } else {
            if (iVar.f10653a != d10) {
                return false;
            }
            iVar.f10653a = null;
            z9 = true;
        }
        d10.itemView.setAlpha(1.0f);
        d10.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        d10.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        C(d10, z9);
        return true;
    }

    private void Z(RecyclerView.D d10) {
        if (f10613s == null) {
            f10613s = new ValueAnimator().getInterpolator();
        }
        d10.itemView.animate().setInterpolator(f10613s);
        j(d10);
    }

    void Q(RecyclerView.D d10) {
        View view = d10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f10621o.add(d10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(d10, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.D d10 = iVar.f10653a;
        View view = d10 == null ? null : d10.itemView;
        RecyclerView.D d11 = iVar.f10654b;
        View view2 = d11 != null ? d11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f10624r.add(iVar.f10653a);
            duration.translationX(iVar.f10657e - iVar.f10655c);
            duration.translationY(iVar.f10658f - iVar.f10656d);
            duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f10624r.add(iVar.f10654b);
            viewPropertyAnimatorAnimate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.D d10, int i10, int i11, int i12, int i13) {
        View view = d10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i15 != 0) {
            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f10622p.add(d10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.D) list.get(size)).itemView.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.D d10, List list) {
        return !list.isEmpty() || super.g(d10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.D d10) {
        View view = d10.itemView;
        view.animate().cancel();
        int size = this.f10616j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f10616j.get(size)).f10659a == d10) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                E(d10);
                this.f10616j.remove(size);
            }
        }
        W(this.f10617k, d10);
        if (this.f10614h.remove(d10)) {
            view.setAlpha(1.0f);
            G(d10);
        }
        if (this.f10615i.remove(d10)) {
            view.setAlpha(1.0f);
            A(d10);
        }
        for (int size2 = this.f10620n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f10620n.get(size2);
            W(arrayList, d10);
            if (arrayList.isEmpty()) {
                this.f10620n.remove(size2);
            }
        }
        for (int size3 = this.f10619m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f10619m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((j) arrayList2.get(size4)).f10659a == d10) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    E(d10);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f10619m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f10618l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f10618l.get(size5);
            if (arrayList3.remove(d10)) {
                view.setAlpha(1.0f);
                A(d10);
                if (arrayList3.isEmpty()) {
                    this.f10618l.remove(size5);
                }
            }
        }
        this.f10623q.remove(d10);
        this.f10621o.remove(d10);
        this.f10624r.remove(d10);
        this.f10622p.remove(d10);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f10616j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f10616j.get(size);
            View view = jVar.f10659a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            E(jVar.f10659a);
            this.f10616j.remove(size);
        }
        for (int size2 = this.f10614h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.D) this.f10614h.get(size2));
            this.f10614h.remove(size2);
        }
        int size3 = this.f10615i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.D d10 = (RecyclerView.D) this.f10615i.get(size3);
            d10.itemView.setAlpha(1.0f);
            A(d10);
            this.f10615i.remove(size3);
        }
        for (int size4 = this.f10617k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f10617k.get(size4));
        }
        this.f10617k.clear();
        if (p()) {
            for (int size5 = this.f10619m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f10619m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f10659a.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    E(jVar2.f10659a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f10619m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f10618l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f10618l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.D d11 = (RecyclerView.D) arrayList2.get(size8);
                    d11.itemView.setAlpha(1.0f);
                    A(d11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f10618l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f10620n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f10620n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f10620n.remove(arrayList3);
                    }
                }
            }
            U(this.f10623q);
            U(this.f10622p);
            U(this.f10621o);
            U(this.f10624r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f10615i.isEmpty() && this.f10617k.isEmpty() && this.f10616j.isEmpty() && this.f10614h.isEmpty() && this.f10622p.isEmpty() && this.f10623q.isEmpty() && this.f10621o.isEmpty() && this.f10624r.isEmpty() && this.f10619m.isEmpty() && this.f10618l.isEmpty() && this.f10620n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean zIsEmpty = this.f10614h.isEmpty();
        boolean zIsEmpty2 = this.f10616j.isEmpty();
        boolean zIsEmpty3 = this.f10617k.isEmpty();
        boolean zIsEmpty4 = this.f10615i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList arrayList = this.f10614h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            T((RecyclerView.D) obj);
        }
        this.f10614h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f10616j);
            this.f10619m.add(arrayList2);
            this.f10616j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                AbstractC0845c0.f0(((j) arrayList2.get(0)).f10659a.itemView, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f10617k);
            this.f10620n.add(arrayList3);
            this.f10617k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                AbstractC0845c0.f0(((i) arrayList3.get(0)).f10653a.itemView, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.f10615i);
        this.f10618l.add(arrayList4);
        this.f10615i.clear();
        RunnableC0168c runnableC0168c = new RunnableC0168c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0168c.run();
        } else {
            AbstractC0845c0.f0(((RecyclerView.D) arrayList4.get(0)).itemView, runnableC0168c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.D d10) {
        Z(d10);
        d10.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f10615i.add(d10);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.D d10, RecyclerView.D d11, int i10, int i11, int i12, int i13) {
        if (d10 == d11) {
            return y(d10, i10, i11, i12, i13);
        }
        float translationX = d10.itemView.getTranslationX();
        float translationY = d10.itemView.getTranslationY();
        float alpha = d10.itemView.getAlpha();
        Z(d10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        d10.itemView.setTranslationX(translationX);
        d10.itemView.setTranslationY(translationY);
        d10.itemView.setAlpha(alpha);
        if (d11 != null) {
            Z(d11);
            d11.itemView.setTranslationX(-i14);
            d11.itemView.setTranslationY(-i15);
            d11.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f10617k.add(new i(d10, d11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.D d10, int i10, int i11, int i12, int i13) {
        View view = d10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) d10.itemView.getTranslationY());
        Z(d10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(d10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f10616j.add(new j(d10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.D d10) {
        Z(d10);
        this.f10614h.add(d10);
        return true;
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.D f10653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.D f10654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10658f;

        private i(RecyclerView.D d10, RecyclerView.D d11) {
            this.f10653a = d10;
            this.f10654b = d11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f10653a + ", newHolder=" + this.f10654b + ", fromX=" + this.f10655c + ", fromY=" + this.f10656d + ", toX=" + this.f10657e + ", toY=" + this.f10658f + '}';
        }

        i(RecyclerView.D d10, RecyclerView.D d11, int i10, int i11, int i12, int i13) {
            this(d10, d11);
            this.f10655c = i10;
            this.f10656d = i11;
            this.f10657e = i12;
            this.f10658f = i13;
        }
    }
}

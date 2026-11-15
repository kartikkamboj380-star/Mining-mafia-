package G0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC0575k f895a = new C0565a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f896b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f897c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC0575k abstractC0575k) {
        if (f897c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f897c.add(viewGroup);
        if (abstractC0575k == null) {
            abstractC0575k = f895a;
        }
        AbstractC0575k abstractC0575kClone = abstractC0575k.clone();
        d(viewGroup, abstractC0575kClone);
        AbstractC0574j.b(viewGroup, null);
        c(viewGroup, abstractC0575kClone);
    }

    static p190t.a b() {
        p190t.a aVar;
        WeakReference weakReference = (WeakReference) f896b.get();
        if (weakReference != null && (aVar = (p190t.a) weakReference.get()) != null) {
            return aVar;
        }
        p190t.a aVar2 = new p190t.a();
        f896b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, AbstractC0575k abstractC0575k) {
        if (abstractC0575k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0575k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC0575k abstractC0575k) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((AbstractC0575k) obj).X(viewGroup);
            }
        }
        if (abstractC0575k != null) {
            abstractC0575k.l(viewGroup, true);
        }
        AbstractC0574j.a(viewGroup);
    }

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AbstractC0575k f898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f899b;

        /* JADX INFO: renamed from: G0.r$a$a, reason: collision with other inner class name */
        class C0025a extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p190t.a f900a;

            C0025a(p190t.a aVar) {
                this.f900a = aVar;
            }

            @Override // G0.AbstractC0575k.f
            public void e(AbstractC0575k abstractC0575k) {
                ((ArrayList) this.f900a.get(a.this.f899b)).remove(abstractC0575k);
                abstractC0575k.Z(this);
            }
        }

        a(AbstractC0575k abstractC0575k, ViewGroup viewGroup) {
            this.f898a = abstractC0575k;
            this.f899b = viewGroup;
        }

        private void a() {
            this.f899b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f899b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!r.f897c.remove(this.f899b)) {
                return true;
            }
            p190t.a aVarB = r.b();
            ArrayList arrayList = (ArrayList) aVarB.get(this.f899b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVarB.put(this.f899b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f898a);
            this.f898a.b(new C0025a(aVarB));
            int i10 = 0;
            this.f898a.l(this.f899b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((AbstractC0575k) obj).b0(this.f899b);
                }
            }
            this.f898a.Y(this.f899b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            r.f897c.remove(this.f899b);
            ArrayList arrayList = (ArrayList) r.b().get(this.f899b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((AbstractC0575k) obj).b0(this.f899b);
                }
            }
            this.f898a.m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0167b f10608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f10609b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f10610c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f10611a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f10612b;

        a() {
        }

        private void c() {
            if (this.f10612b == null) {
                this.f10612b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f10611a &= ~(1 << i10);
                return;
            }
            a aVar = this.f10612b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f10612b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f10611a) : Long.bitCount(this.f10611a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f10611a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f10611a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f10611a & (1 << i10)) != 0;
            }
            c();
            return this.f10612b.d(i10 - 64);
        }

        void e(int i10, boolean z9) {
            if (i10 >= 64) {
                c();
                this.f10612b.e(i10 - 64, z9);
                return;
            }
            long j10 = this.f10611a;
            boolean z10 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f10611a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z9) {
                h(i10);
            } else {
                a(i10);
            }
            if (z10 || this.f10612b != null) {
                c();
                this.f10612b.e(0, z10);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f10612b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f10611a;
            boolean z9 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f10611a = j12;
            long j13 = j10 - 1;
            this.f10611a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f10612b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f10612b.f(0);
            }
            return z9;
        }

        void g() {
            this.f10611a = 0L;
            a aVar = this.f10612b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f10611a |= 1 << i10;
            } else {
                c();
                this.f10612b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f10612b == null) {
                return Long.toBinaryString(this.f10611a);
            }
            return this.f10612b.toString() + "xx" + Long.toBinaryString(this.f10611a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0167b {
        View a(int i10);

        int b();

        void c(View view);

        RecyclerView.D d(View view);

        void e(int i10);

        void f(View view, int i10);

        void g();

        int h(View view);

        void i(View view);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0167b interfaceC0167b) {
        this.f10608a = interfaceC0167b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iB = this.f10608a.b();
        int i11 = i10;
        while (i11 < iB) {
            int iB2 = i10 - (i11 - this.f10609b.b(i11));
            if (iB2 == 0) {
                while (this.f10609b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB2;
        }
        return -1;
    }

    private void l(View view) {
        this.f10610c.add(view);
        this.f10608a.c(view);
    }

    private boolean t(View view) {
        if (!this.f10610c.remove(view)) {
            return false;
        }
        this.f10608a.i(view);
        return true;
    }

    void a(View view, int i10, boolean z9) {
        int iB = i10 < 0 ? this.f10608a.b() : h(i10);
        this.f10609b.e(iB, z9);
        if (z9) {
            l(view);
        }
        this.f10608a.f(view, iB);
    }

    void b(View view, boolean z9) {
        a(view, -1, z9);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int iB = i10 < 0 ? this.f10608a.b() : h(i10);
        this.f10609b.e(iB, z9);
        if (z9) {
            l(view);
        }
        this.f10608a.k(view, iB, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f10609b.f(iH);
        this.f10608a.e(iH);
    }

    View e(int i10) {
        int size = this.f10610c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f10610c.get(i11);
            RecyclerView.D d10 = this.f10608a.d(view);
            if (d10.getLayoutPosition() == i10 && !d10.isInvalid() && !d10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f10608a.a(h(i10));
    }

    int g() {
        return this.f10608a.b() - this.f10610c.size();
    }

    View i(int i10) {
        return this.f10608a.a(i10);
    }

    int j() {
        return this.f10608a.b();
    }

    void k(View view) {
        int iH = this.f10608a.h(view);
        if (iH >= 0) {
            this.f10609b.h(iH);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iH = this.f10608a.h(view);
        if (iH == -1 || this.f10609b.d(iH)) {
            return -1;
        }
        return iH - this.f10609b.b(iH);
    }

    boolean n(View view) {
        return this.f10610c.contains(view);
    }

    void o() {
        this.f10609b.g();
        for (int size = this.f10610c.size() - 1; size >= 0; size--) {
            this.f10608a.i((View) this.f10610c.get(size));
            this.f10610c.remove(size);
        }
        this.f10608a.g();
    }

    void p(View view) {
        int iH = this.f10608a.h(view);
        if (iH < 0) {
            return;
        }
        if (this.f10609b.f(iH)) {
            t(view);
        }
        this.f10608a.j(iH);
    }

    void q(int i10) {
        int iH = h(i10);
        View viewA = this.f10608a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f10609b.f(iH)) {
            t(viewA);
        }
        this.f10608a.j(iH);
    }

    boolean r(View view) {
        int iH = this.f10608a.h(view);
        if (iH == -1) {
            t(view);
            return true;
        }
        if (!this.f10609b.d(iH)) {
            return false;
        }
        this.f10609b.f(iH);
        t(view);
        this.f10608a.j(iH);
        return true;
    }

    void s(View view) {
        int iH = this.f10608a.h(view);
        if (iH < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f10609b.d(iH)) {
            this.f10609b.a(iH);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f10609b.toString() + ", hidden list:" + this.f10610c.size();
    }
}

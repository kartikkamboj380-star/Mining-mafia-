package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f10739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f10740b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10741a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10745e;

        a() {
        }

        void a(int i10) {
            this.f10741a = i10 | this.f10741a;
        }

        boolean b() {
            int i10 = this.f10741a;
            if ((i10 & 7) != 0 && (i10 & c(this.f10744d, this.f10742b)) == 0) {
                return false;
            }
            int i11 = this.f10741a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f10744d, this.f10743c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f10741a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f10745e, this.f10742b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f10741a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f10745e, this.f10743c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f10741a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f10742b = i10;
            this.f10743c = i11;
            this.f10744d = i12;
            this.f10745e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    o(b bVar) {
        this.f10739a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f10739a.c();
        int iD = this.f10739a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f10739a.a(i10);
            this.f10740b.e(iC, iD, this.f10739a.b(viewA), this.f10739a.e(viewA));
            if (i12 != 0) {
                this.f10740b.d();
                this.f10740b.a(i12);
                if (this.f10740b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f10740b.d();
                this.f10740b.a(i13);
                if (this.f10740b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f10740b.e(this.f10739a.c(), this.f10739a.d(), this.f10739a.b(view), this.f10739a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f10740b.d();
        this.f10740b.a(i10);
        return this.f10740b.b();
    }
}

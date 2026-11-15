package p120m;

import O.AbstractC0865m0;
import O.C0861k0;
import O.InterfaceC0863l0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f46331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC0863l0 f46332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46333e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46330b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0865m0 f46334f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f46329a = new ArrayList();

    class a extends AbstractC0865m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f46335a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46336b = 0;

        a() {
        }

        @Override // O.InterfaceC0863l0
        public void b(View view) {
            int i10 = this.f46336b + 1;
            this.f46336b = i10;
            if (i10 == h.this.f46329a.size()) {
                InterfaceC0863l0 interfaceC0863l0 = h.this.f46332d;
                if (interfaceC0863l0 != null) {
                    interfaceC0863l0.b(null);
                }
                d();
            }
        }

        @Override // O.AbstractC0865m0, O.InterfaceC0863l0
        public void c(View view) {
            if (this.f46335a) {
                return;
            }
            this.f46335a = true;
            InterfaceC0863l0 interfaceC0863l0 = h.this.f46332d;
            if (interfaceC0863l0 != null) {
                interfaceC0863l0.c(null);
            }
        }

        void d() {
            this.f46336b = 0;
            this.f46335a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f46333e) {
            ArrayList arrayList = this.f46329a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((C0861k0) obj).c();
            }
            this.f46333e = false;
        }
    }

    void b() {
        this.f46333e = false;
    }

    public h c(C0861k0 c0861k0) {
        if (!this.f46333e) {
            this.f46329a.add(c0861k0);
        }
        return this;
    }

    public h d(C0861k0 c0861k0, C0861k0 c0861k1) {
        this.f46329a.add(c0861k0);
        c0861k1.i(c0861k0.d());
        this.f46329a.add(c0861k1);
        return this;
    }

    public h e(long j10) {
        if (!this.f46333e) {
            this.f46330b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f46333e) {
            this.f46331c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC0863l0 interfaceC0863l0) {
        if (!this.f46333e) {
            this.f46332d = interfaceC0863l0;
        }
        return this;
    }

    public void h() {
        if (this.f46333e) {
            return;
        }
        ArrayList arrayList = this.f46329a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C0861k0 c0861k0 = (C0861k0) obj;
            long j10 = this.f46330b;
            if (j10 >= 0) {
                c0861k0.e(j10);
            }
            Interpolator interpolator = this.f46331c;
            if (interpolator != null) {
                c0861k0.f(interpolator);
            }
            if (this.f46332d != null) {
                c0861k0.g(this.f46334f);
            }
            c0861k0.k();
        }
        this.f46333e = true;
    }
}

package O;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f3830a;

    private static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f3831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q f3832b;

        a(Window window, Q q10) {
            this.f3831a = window;
            this.f3832b = q10;
        }

        private void g(int i10) {
            if (i10 == 1) {
                h(4);
            } else if (i10 == 2) {
                h(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f3832b.a();
            }
        }

        private void j(int i10) {
            if (i10 == 1) {
                k(4);
                l(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            } else if (i10 == 2) {
                k(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f3832b.b();
            }
        }

        @Override // O.d1.e
        void a(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        @Override // O.d1.e
        void e(int i10) {
            if (i10 == 0) {
                k(6144);
                return;
            }
            if (i10 == 1) {
                k(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                h(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                k(2048);
                h(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            }
        }

        @Override // O.d1.e
        void f(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    j(i11);
                }
            }
        }

        protected void h(int i10) {
            View decorView = this.f3831a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void i(int i10) {
            this.f3831a.addFlags(i10);
        }

        protected void k(int i10) {
            View decorView = this.f3831a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void l(int i10) {
            this.f3831a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, Q q10) {
            super(window, q10);
        }

        @Override // O.d1.e
        public boolean b() {
            return (this.f3831a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // O.d1.e
        public void d(boolean z9) {
            if (!z9) {
                k(8192);
                return;
            }
            l(67108864);
            i(LinearLayoutManager.INVALID_OFFSET);
            h(8192);
        }
    }

    private static class c extends b {
        c(Window window, Q q10) {
            super(window, q10);
        }

        @Override // O.d1.e
        public void c(boolean z9) {
            if (!z9) {
                k(16);
                return;
            }
            l(134217728);
            i(LinearLayoutManager.INVALID_OFFSET);
            h(16);
        }
    }

    private d1(WindowInsetsController windowInsetsController) {
        this.f3830a = new d(windowInsetsController, this, new Q(windowInsetsController));
    }

    public static d1 g(WindowInsetsController windowInsetsController) {
        return new d1(windowInsetsController);
    }

    public void a(int i10) {
        this.f3830a.a(i10);
    }

    public boolean b() {
        return this.f3830a.b();
    }

    public void c(boolean z9) {
        this.f3830a.c(z9);
    }

    public void d(boolean z9) {
        this.f3830a.d(z9);
    }

    public void e(int i10) {
        this.f3830a.e(i10);
    }

    public void f(int i10) {
        this.f3830a.f(i10);
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d1 f3833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f3834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Q f3835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p190t.k f3836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f3837e;

        d(Window window, d1 d1Var, Q q10) {
            this(window.getInsetsController(), d1Var, q10);
            this.f3837e = window;
        }

        @Override // O.d1.e
        void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f3835c.a();
            }
            this.f3834b.hide(i10 & (-9));
        }

        @Override // O.d1.e
        public boolean b() {
            this.f3834b.setSystemBarsAppearance(0, 0);
            return (this.f3834b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // O.d1.e
        public void c(boolean z9) {
            if (z9) {
                if (this.f3837e != null) {
                    g(16);
                }
                this.f3834b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f3837e != null) {
                    h(16);
                }
                this.f3834b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // O.d1.e
        public void d(boolean z9) {
            if (z9) {
                if (this.f3837e != null) {
                    g(8192);
                }
                this.f3834b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f3837e != null) {
                    h(8192);
                }
                this.f3834b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // O.d1.e
        void e(int i10) {
            this.f3834b.setSystemBarsBehavior(i10);
        }

        @Override // O.d1.e
        void f(int i10) {
            if ((i10 & 8) != 0) {
                this.f3835c.b();
            }
            this.f3834b.show(i10 & (-9));
        }

        protected void g(int i10) {
            View decorView = this.f3837e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void h(int i10) {
            View decorView = this.f3837e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, d1 d1Var, Q q10) {
            this.f3836d = new p190t.k();
            this.f3834b = windowInsetsController;
            this.f3833a = d1Var;
            this.f3835c = q10;
        }
    }

    public d1(Window window, View view) {
        Q q10 = new Q(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3830a = new d(window, this, q10);
        } else if (i10 >= 26) {
            this.f3830a = new c(window, q10);
        } else {
            this.f3830a = new b(window, q10);
        }
    }

    private static class e {
        e() {
        }

        abstract void a(int i10);

        public abstract boolean b();

        public abstract void d(boolean z9);

        abstract void e(int i10);

        abstract void f(int i10);

        public void c(boolean z9) {
        }
    }
}

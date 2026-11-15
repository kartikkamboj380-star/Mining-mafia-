package L;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f2988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f2989b;

    /* JADX INFO: renamed from: L.a$a, reason: collision with other inner class name */
    class RunnableC0040a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f2990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f2991b;

        RunnableC0040a(g.c cVar, Typeface typeface) {
            this.f2990a = cVar;
            this.f2991b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2990a.b(this.f2991b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f2993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2994b;

        b(g.c cVar, int i10) {
            this.f2993a = cVar;
            this.f2994b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2993a.a(this.f2994b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2988a = cVar;
        this.f2989b = handler;
    }

    private void a(int i10) {
        this.f2989b.post(new b(this.f2988a, i10));
    }

    private void c(Typeface typeface) {
        this.f2989b.post(new RunnableC0040a(this.f2988a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f3018a);
        } else {
            a(eVar.f3019b);
        }
    }
}

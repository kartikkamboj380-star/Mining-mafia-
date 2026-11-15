package p009a8;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import p029c8.e;
import p029c8.g;

/* JADX INFO: loaded from: classes3.dex */
public class a extends k implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p019b8.a f7341e;

    /* JADX INFO: renamed from: a8.a$a, reason: collision with other inner class name */
    class RunnableC0129a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f7342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U7.c f7343b;

        /* JADX INFO: renamed from: a8.a$a$a, reason: collision with other inner class name */
        class C0130a implements U7.b {
            C0130a() {
            }

            @Override // U7.b
            public void onAdLoaded() {
                ((k) a.this).f42781b.put(RunnableC0129a.this.f7343b.c(), RunnableC0129a.this.f7342a);
            }
        }

        RunnableC0129a(e eVar, U7.c cVar) {
            this.f7342a = eVar;
            this.f7343b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7342a.b(new C0130a());
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f7346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U7.c f7347b;

        /* JADX INFO: renamed from: a8.a$b$a, reason: collision with other inner class name */
        class C0131a implements U7.b {
            C0131a() {
            }

            @Override // U7.b
            public void onAdLoaded() {
                ((k) a.this).f42781b.put(b.this.f7347b.c(), b.this.f7346a);
            }
        }

        b(g gVar, U7.c cVar) {
            this.f7346a = gVar;
            this.f7347b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7346a.b(new C0131a());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p029c8.c f7350a;

        c(p029c8.c cVar) {
            this.f7350a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7350a.b(null);
        }
    }

    public a(d dVar, String str) {
        super(dVar);
        p019b8.a aVar = new p019b8.a(new T7.a(str));
        this.f7341e = aVar;
        this.f42780a = new p039d8.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, U7.c cVar, h hVar) {
        l.a(new RunnableC0129a(new e(context, this.f7341e, cVar, this.f42783d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void f(Context context, U7.c cVar, i iVar) {
        l.a(new b(new g(context, this.f7341e, cVar, this.f42783d, iVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void g(Context context, RelativeLayout relativeLayout, U7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new p029c8.c(context, relativeLayout, this.f7341e, cVar, i10, i11, this.f42783d, gVar)));
    }
}

package W7;

import Y7.e;
import Y7.g;
import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;

/* JADX INFO: loaded from: classes3.dex */
public class a extends k implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X7.a f6651e;

    /* JADX INFO: renamed from: W7.a$a, reason: collision with other inner class name */
    class RunnableC0111a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U7.c f6653b;

        /* JADX INFO: renamed from: W7.a$a$a, reason: collision with other inner class name */
        class C0112a implements U7.b {
            C0112a() {
            }

            @Override // U7.b
            public void onAdLoaded() {
                ((k) a.this).f42781b.put(RunnableC0111a.this.f6653b.c(), RunnableC0111a.this.f6652a);
            }
        }

        RunnableC0111a(e eVar, U7.c cVar) {
            this.f6652a = eVar;
            this.f6653b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6652a.b(new C0112a());
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f6656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U7.c f6657b;

        /* JADX INFO: renamed from: W7.a$b$a, reason: collision with other inner class name */
        class C0113a implements U7.b {
            C0113a() {
            }

            @Override // U7.b
            public void onAdLoaded() {
                ((k) a.this).f42781b.put(b.this.f6657b.c(), b.this.f6656a);
            }
        }

        b(g gVar, U7.c cVar) {
            this.f6656a = gVar;
            this.f6657b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6656a.b(new C0113a());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y7.c f6660a;

        c(Y7.c cVar) {
            this.f6660a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6660a.b(null);
        }
    }

    public a(d dVar, String str) {
        super(dVar);
        X7.a aVar = new X7.a(new T7.a(str));
        this.f6651e = aVar;
        this.f42780a = new Z7.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, U7.c cVar, h hVar) {
        l.a(new RunnableC0111a(new e(context, this.f6651e, cVar, this.f42783d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void f(Context context, U7.c cVar, i iVar) {
        l.a(new b(new g(context, this.f6651e, cVar, this.f42783d, iVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void g(Context context, RelativeLayout relativeLayout, U7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new Y7.c(context, relativeLayout, this.f6651e, cVar, i10, i11, this.f42783d, gVar)));
    }
}

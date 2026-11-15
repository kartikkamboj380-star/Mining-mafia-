package androidx.emoji2.text;

import K.o;
import android.content.Context;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1158d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements D0.a {

    class a implements InterfaceC1158d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1164j f9705a;

        a(AbstractC1164j abstractC1164j) {
            this.f9705a = abstractC1164j;
        }

        @Override // androidx.lifecycle.InterfaceC1158d
        public void j(r rVar) {
            EmojiCompatInitializer.this.c();
            this.f9705a.d(this);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9707a;

        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f9708a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f9709b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f9708a = iVar;
                this.f9709b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                try {
                    this.f9708a.a(th);
                } finally {
                    this.f9709b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                try {
                    this.f9708a.b(lVar);
                } finally {
                    this.f9709b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f9707a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9749a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i iVarA = androidx.emoji2.text.c.a(this.f9707a);
                if (iVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                iVarA.c(threadPoolExecutor);
                iVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.i()) {
                    e.c().l();
                }
            } finally {
                o.b();
            }
        }
    }

    @Override // D0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        e.h(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    void b(Context context) {
        AbstractC1164j lifecycle = ((r) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void c() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }

    @Override // D0.a
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

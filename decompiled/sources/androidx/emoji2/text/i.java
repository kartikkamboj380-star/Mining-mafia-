package androidx.emoji2.text;

import K.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class i extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f9768k = new a();

    public static class a {
        public Typeface a(Context context, L.g.b bVar) {
            return L.g.a(context, null, new L.g.b[]{bVar});
        }

        public L.g.a b(Context context, L.e eVar) {
            return L.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final L.e f9770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f9771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f9772d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f9773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f9774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f9775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f9776h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f9777i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f9778j;

        b(Context context, L.e eVar, a aVar) {
            N.f.h(context, "Context cannot be null");
            N.f.h(eVar, "FontRequest cannot be null");
            this.f9769a = context.getApplicationContext();
            this.f9770b = eVar;
            this.f9771c = aVar;
        }

        private void b() {
            synchronized (this.f9772d) {
                try {
                    this.f9776h = null;
                    ContentObserver contentObserver = this.f9777i;
                    if (contentObserver != null) {
                        this.f9771c.c(this.f9769a, contentObserver);
                        this.f9777i = null;
                    }
                    Handler handler = this.f9773e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f9778j);
                    }
                    this.f9773e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f9775g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f9774f = null;
                    this.f9775g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private L.g.b e() {
            try {
                L.g.a aVarB = this.f9771c.b(this.f9769a, this.f9770b);
                if (aVarB.c() == 0) {
                    L.g.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            N.f.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f9772d) {
                this.f9776h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f9772d) {
                try {
                    if (this.f9776h == null) {
                        return;
                    }
                    try {
                        L.g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f9772d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f9771c.a(this.f9769a, bVarE);
                            ByteBuffer byteBufferF = F.l.f(this.f9769a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            l lVarB = l.b(typefaceA, byteBufferF);
                            o.b();
                            synchronized (this.f9772d) {
                                try {
                                    e.i iVar = this.f9776h;
                                    if (iVar != null) {
                                        iVar.b(lVarB);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            o.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f9772d) {
                            try {
                                e.i iVar2 = this.f9776h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        void d() {
            synchronized (this.f9772d) {
                try {
                    if (this.f9776h == null) {
                        return;
                    }
                    if (this.f9774f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f9775g = threadPoolExecutorB;
                        this.f9774f = threadPoolExecutorB;
                    }
                    this.f9774f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9779a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f9772d) {
                this.f9774f = executor;
            }
        }
    }

    public i(Context context, L.e eVar) {
        super(new b(context, eVar, f9768k));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}

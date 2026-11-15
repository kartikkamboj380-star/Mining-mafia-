package E6;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p057f6.C6982c;
import p057f6.E;
import p057f6.InterfaceC6983d;
import p176r5.AbstractC7096m;

/* JADX INFO: loaded from: classes3.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G6.b f593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G6.b f595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f597e;

    private f(final Context context, final String str, Set set, G6.b bVar, Executor executor) {
        this(new p057f6.w(new G6.b() { // from class: E6.c
            @Override // G6.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                v vVar = (v) fVar.f593a.get();
                List listG = vVar.g();
                vVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    w wVar = (w) listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", wVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) wVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    public static /* synthetic */ v d(Context context, String str) {
        return new v(context, str);
    }

    public static /* synthetic */ f e(E e10, InterfaceC6983d interfaceC6983d) {
        return new f((Context) interfaceC6983d.a(Context.class), ((p007a6.f) interfaceC6983d.a(p007a6.f.class)).s(), interfaceC6983d.c(g.class), interfaceC6983d.f(Z6.i.class), (Executor) interfaceC6983d.e(e10));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            ((v) fVar.f593a.get()).o(System.currentTimeMillis(), ((Z6.i) fVar.f595c.get()).a());
        }
        return null;
    }

    public static C6982c g() {
        final E eA = E.a(p047e6.a.class, Executor.class);
        return C6982c.f(f.class, i.class, j.class).b(p057f6.q.l(Context.class)).b(p057f6.q.l(p007a6.f.class)).b(p057f6.q.o(g.class)).b(p057f6.q.n(Z6.i.class)).b(p057f6.q.k(eA)).f(new p057f6.g() { // from class: E6.b
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return f.e(eA, interfaceC6983d);
            }
        }).d();
    }

    @Override // E6.i
    public Task a() {
        return !K.p.a(this.f594b) ? AbstractC7096m.f("") : AbstractC7096m.d(this.f597e, new Callable() { // from class: E6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f591a);
            }
        });
    }

    @Override // E6.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        v vVar = (v) this.f593a.get();
        if (!vVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        vVar.k();
        return j.a.GLOBAL;
    }

    public Task h() {
        if (this.f596d.size() <= 0) {
            return AbstractC7096m.f(null);
        }
        return !K.p.a(this.f594b) ? AbstractC7096m.f(null) : AbstractC7096m.d(this.f597e, new Callable() { // from class: E6.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f592a);
            }
        });
    }

    f(G6.b bVar, Set set, Executor executor, G6.b bVar2, Context context) {
        this.f593a = bVar;
        this.f596d = set;
        this.f597e = executor;
        this.f595c = bVar2;
        this.f594b = context;
    }
}

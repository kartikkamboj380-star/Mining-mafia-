package B6;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p257z6.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements A6.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p257z6.d f288e = new p257z6.d() { // from class: B6.a
        @Override // p257z6.d
        public final void a(Object obj, Object obj2) {
            d.c(obj, (p257z6.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p257z6.f f289f = new p257z6.f() { // from class: B6.b
        @Override // p257z6.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).a((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p257z6.f f290g = new p257z6.f() { // from class: B6.c
        @Override // p257z6.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).g(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f291h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f292a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f293b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p257z6.d f294c = f288e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f295d = false;

    class a implements p257z6.a {
        a() {
        }

        @Override // p257z6.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f292a, d.this.f293b, d.this.f294c, d.this.f295d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // p257z6.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements p257z6.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f297a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f297a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // p257z6.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.a(f297a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f289f);
        m(Boolean.class, f290g);
        m(Date.class, f291h);
    }

    public static /* synthetic */ void c(Object obj, p257z6.e eVar) {
        throw new p257z6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public p257z6.a i() {
        return new a();
    }

    public d j(A6.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z9) {
        this.f295d = z9;
        return this;
    }

    @Override // A6.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, p257z6.d dVar) {
        this.f292a.put(cls, dVar);
        this.f293b.remove(cls);
        return this;
    }

    public d m(Class cls, p257z6.f fVar) {
        this.f293b.put(cls, fVar);
        this.f292a.remove(cls);
        return this;
    }
}

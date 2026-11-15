package C6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p257z6.d f404c;

    public static final class a implements A6.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final p257z6.d f405d = new p257z6.d() { // from class: C6.g
            @Override // p257z6.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (p257z6.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f406a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f407b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p257z6.d f408c = f405d;

        public static /* synthetic */ void b(Object obj, p257z6.e eVar) {
            throw new p257z6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f406a), new HashMap(this.f407b), this.f408c);
        }

        public a d(A6.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // A6.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, p257z6.d dVar) {
            this.f406a.put(cls, dVar);
            this.f407b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, p257z6.d dVar) {
        this.f402a = map;
        this.f403b = map2;
        this.f404c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f402a, this.f403b, this.f404c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}

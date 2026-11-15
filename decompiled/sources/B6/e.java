package B6;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p257z6.g;

/* JADX INFO: loaded from: classes3.dex */
final class e implements p257z6.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f298a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f299b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p257z6.d f303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f304g;

    e(Writer writer, Map map, Map map2, p257z6.d dVar, boolean z9) {
        this.f300c = new JsonWriter(writer);
        this.f301d = map;
        this.f302e = map2;
        this.f303f = dVar;
        this.f304g = z9;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) throws IOException {
        y();
        this.f300c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f300c.nullValue();
        return this;
    }

    private e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f300c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f299b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f298a;
        if (eVar != null) {
            eVar.y();
            this.f298a.f299b = false;
            this.f298a = null;
            this.f300c.endObject();
        }
    }

    @Override // p257z6.e
    public p257z6.e b(p257z6.c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    @Override // p257z6.e
    public p257z6.e c(p257z6.c cVar, double d10) {
        return m(cVar.b(), d10);
    }

    @Override // p257z6.e
    public p257z6.e d(p257z6.c cVar, int i10) {
        return n(cVar.b(), i10);
    }

    @Override // p257z6.e
    public p257z6.e e(p257z6.c cVar, long j10) {
        return o(cVar.b(), j10);
    }

    @Override // p257z6.e
    public p257z6.e f(p257z6.c cVar, boolean z9) {
        return q(cVar.b(), z9);
    }

    public e h(double d10) throws IOException {
        y();
        this.f300c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f300c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f300c.value(j10);
        return this;
    }

    e k(Object obj, boolean z9) {
        if (z9 && t(obj)) {
            throw new p257z6.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f300c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f300c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f300c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f300c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f300c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new p257z6.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f300c.endObject();
                return this;
            }
            p257z6.d dVar = (p257z6.d) this.f301d.get(obj.getClass());
            if (dVar != null) {
                return v(dVar, obj, z9);
            }
            p257z6.f fVar = (p257z6.f) this.f302e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f303f, obj, z9);
            }
            if (obj instanceof f) {
                i(((f) obj).getNumber());
                return this;
            }
            a(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f300c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f300c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f300c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f300c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f300c.endArray();
        return this;
    }

    @Override // p257z6.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e a(String str) throws IOException {
        y();
        this.f300c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f300c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f300c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f300c.name(str);
        return j(j10);
    }

    public e p(String str, Object obj) {
        return this.f304g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z9) throws IOException {
        y();
        this.f300c.name(str);
        return g(z9);
    }

    @Override // p257z6.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z9) throws IOException {
        y();
        this.f300c.value(z9);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f300c.nullValue();
            return this;
        }
        this.f300c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void u() {
        y();
        this.f300c.flush();
    }

    e v(p257z6.d dVar, Object obj, boolean z9) throws IOException {
        if (!z9) {
            this.f300c.beginObject();
        }
        dVar.a(obj, this);
        if (!z9) {
            this.f300c.endObject();
        }
        return this;
    }
}

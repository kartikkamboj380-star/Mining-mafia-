package C6;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class f implements p257z6.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f392f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p257z6.c f393g = p257z6.c.a("key").b(C6.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p257z6.c f394h = p257z6.c.a("value").b(C6.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p257z6.d f395i = new p257z6.d() { // from class: C6.e
        @Override // p257z6.d
        public final void a(Object obj, Object obj2) {
            f.a((Map.Entry) obj, (p257z6.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p257z6.d f399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f400e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f401a;

        static {
            int[] iArr = new int[d.a.values().length];
            f401a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f401a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f401a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, p257z6.d dVar) {
        this.f396a = outputStream;
        this.f397b = map;
        this.f398c = map2;
        this.f399d = dVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, p257z6.e eVar) {
        eVar.b(f393g, entry.getKey());
        eVar.b(f394h, entry.getValue());
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(p257z6.d dVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f396a;
            this.f396a = bVar;
            try {
                dVar.a(obj, this);
                this.f396a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f396a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f r(p257z6.d dVar, p257z6.c cVar, Object obj, boolean z9) throws IOException {
        long jQ = q(dVar, obj);
        if (z9 && jQ == 0) {
            return this;
        }
        w((v(cVar) << 3) | 2);
        x(jQ);
        dVar.a(obj, this);
        return this;
    }

    private f s(p257z6.f fVar, p257z6.c cVar, Object obj, boolean z9) {
        this.f400e.c(cVar, z9);
        fVar.a(obj, this.f400e);
        return this;
    }

    private static d u(p257z6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new p257z6.b("Field has no @Protobuf config");
    }

    private static int v(p257z6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new p257z6.b("Field has no @Protobuf config");
    }

    private void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f396a.write((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i10 >>>= 7;
        }
        this.f396a.write(i10 & 127);
    }

    private void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f396a.write((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j10 >>>= 7;
        }
        this.f396a.write(((int) j10) & 127);
    }

    @Override // p257z6.e
    public p257z6.e b(p257z6.c cVar, Object obj) {
        return o(cVar, obj, true);
    }

    @Override // p257z6.e
    public p257z6.e c(p257z6.c cVar, double d10) {
        return m(cVar, d10, true);
    }

    @Override // p257z6.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f d(p257z6.c cVar, int i10) {
        return h(cVar, i10, true);
    }

    f h(p257z6.c cVar, int i10, boolean z9) throws IOException {
        if (!z9 || i10 != 0) {
            d dVarU = u(cVar);
            int i11 = a.f401a[dVarU.intEncoding().ordinal()];
            if (i11 == 1) {
                w(dVarU.tag() << 3);
                w(i10);
                return this;
            }
            if (i11 == 2) {
                w(dVarU.tag() << 3);
                w((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                w((dVarU.tag() << 3) | 5);
                this.f396a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // p257z6.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f e(p257z6.c cVar, long j10) {
        return j(cVar, j10, true);
    }

    f j(p257z6.c cVar, long j10, boolean z9) throws IOException {
        if (!z9 || j10 != 0) {
            d dVarU = u(cVar);
            int i10 = a.f401a[dVarU.intEncoding().ordinal()];
            if (i10 == 1) {
                w(dVarU.tag() << 3);
                x(j10);
                return this;
            }
            if (i10 == 2) {
                w(dVarU.tag() << 3);
                x((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                w((dVarU.tag() << 3) | 1);
                this.f396a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    @Override // p257z6.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public f f(p257z6.c cVar, boolean z9) {
        return l(cVar, z9, true);
    }

    f l(p257z6.c cVar, boolean z9, boolean z10) {
        return h(cVar, z9 ? 1 : 0, z10);
    }

    p257z6.e m(p257z6.c cVar, double d10, boolean z9) throws IOException {
        if (z9 && d10 == 0.0d) {
            return this;
        }
        w((v(cVar) << 3) | 1);
        this.f396a.write(p(8).putDouble(d10).array());
        return this;
    }

    p257z6.e n(p257z6.c cVar, float f10, boolean z9) throws IOException {
        if (z9 && f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this;
        }
        w((v(cVar) << 3) | 5);
        this.f396a.write(p(4).putFloat(f10).array());
        return this;
    }

    p257z6.e o(p257z6.c cVar, Object obj, boolean z9) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    w((v(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f392f);
                    w(bytes.length);
                    this.f396a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    o(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(f395i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return m(cVar, ((Double) obj).doubleValue(), z9);
                }
                if (obj instanceof Float) {
                    return n(cVar, ((Float) obj).floatValue(), z9);
                }
                if (obj instanceof Number) {
                    return j(cVar, ((Number) obj).longValue(), z9);
                }
                if (obj instanceof Boolean) {
                    return l(cVar, ((Boolean) obj).booleanValue(), z9);
                }
                if (!(obj instanceof byte[])) {
                    p257z6.d dVar = (p257z6.d) this.f397b.get(obj.getClass());
                    if (dVar != null) {
                        return r(dVar, cVar, obj, z9);
                    }
                    p257z6.f fVar = (p257z6.f) this.f398c.get(obj.getClass());
                    if (fVar != null) {
                        return s(fVar, cVar, obj, z9);
                    }
                    if (obj instanceof c) {
                        return d(cVar, ((c) obj).getNumber());
                    }
                    return obj instanceof Enum ? d(cVar, ((Enum) obj).ordinal()) : r(this.f399d, cVar, obj, z9);
                }
                byte[] bArr = (byte[]) obj;
                if (!z9 || bArr.length != 0) {
                    w((v(cVar) << 3) | 2);
                    w(bArr.length);
                    this.f396a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    f t(Object obj) {
        if (obj == null) {
            return this;
        }
        p257z6.d dVar = (p257z6.d) this.f397b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new p257z6.b("No encoder for " + obj.getClass());
    }
}

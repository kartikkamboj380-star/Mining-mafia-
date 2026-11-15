package p013b2;

import N.d;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11577a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11578b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f11579c = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f11578b);
        }
    }

    public static int e() {
        return f11578b;
    }

    @Override // N.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b() {
        return (ByteBuffer) f11579c.get();
    }

    @Override // N.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}

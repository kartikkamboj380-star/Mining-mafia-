package J1;

import K1.c;
import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a extends MediaDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f1927e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K1.a f1928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1929b = -2147483648L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.kq.kq.kq.bob.a f1931d;

    public a(Context context, com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        this.f1930c = context;
        this.f1931d = aVar;
        this.f1928a = new c(aVar);
    }

    public static a a(Context context, com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        a aVar2 = new a(context, aVar);
        f1927e.put(aVar.sns(), aVar2);
        return aVar2;
    }

    public com.bykv.vk.openvk.kq.kq.kq.bob.a c() {
        return this.f1931d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1931d.mxq();
        K1.a aVar = this.f1928a;
        if (aVar != null) {
            aVar.oq();
        }
        f1927e.remove(this.f1931d.sns());
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        if (this.f1929b == -2147483648L) {
            if (this.f1930c == null || TextUtils.isEmpty(this.f1931d.mxq())) {
                return -1L;
            }
            this.f1929b = this.f1928a.bob();
        }
        return this.f1929b;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        int iA = this.f1928a.a(j10, bArr, i10, i11);
        int length = bArr.length;
        return iA;
    }
}

package W;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0989n implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f6388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f6389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f6390c;

    /* JADX INFO: renamed from: W.n$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6393c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6395e;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6393c = obj;
            this.f6395e |= LinearLayoutManager.INVALID_OFFSET;
            return C0989n.i(C0989n.this, this);
        }
    }

    public C0989n(File file, E serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f6388a = file;
        this.f6389b = serializer;
        this.f6390c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [W.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [W.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [W.n] */
    static /* synthetic */ Object i(C0989n c0989n, p169q8.b bVar) {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f6395e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f6395e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f6393c;
        Object objE = p179r8.b.e();
        ?? r10 = aVar.f6395e;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    closeable2 = (Closeable) aVar.f6392b;
                    r10 = (C0989n) aVar.f6391a;
                    try {
                        p129m8.n.b(obj);
                        p229w8.c.a(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            p229w8.c.a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f6391a;
                try {
                    p129m8.n.b(obj);
                    p229w8.c.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        p229w8.c.a(closeable, th);
                        throw th6;
                    }
                }
            }
            p129m8.n.b(obj);
            c0989n.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((C0989n) c0989n).f6388a);
                try {
                    E e10 = ((C0989n) c0989n).f6389b;
                    aVar.f6391a = c0989n;
                    aVar.f6392b = fileInputStream;
                    aVar.f6395e = 1;
                    Object from = e10.readFrom(fileInputStream, aVar);
                    if (from != objE) {
                        closeable2 = fileInputStream;
                        obj = from;
                        p229w8.c.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r10 = c0989n;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!((C0989n) c0989n).f6388a.exists()) {
                    return ((C0989n) c0989n).f6389b.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((C0989n) c0989n).f6388a);
                try {
                    E e11 = ((C0989n) c0989n).f6389b;
                    aVar.f6391a = fileInputStream2;
                    aVar.f6392b = null;
                    aVar.f6395e = 2;
                    Object from2 = e11.readFrom(fileInputStream2, aVar);
                    if (from2 != objE) {
                        obj = from2;
                        closeable = fileInputStream2;
                        p229w8.c.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream2;
                    throw th;
                }
            }
            return objE;
        } catch (FileNotFoundException unused2) {
            c0989n = r10;
        }
    }

    @Override // W.InterfaceC0978c
    public void close() {
        this.f6390c.set(true);
    }

    @Override // W.C
    public Object e(p169q8.b bVar) {
        return i(this, bVar);
    }

    protected final void f() {
        if (this.f6390c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    protected final File g() {
        return this.f6388a;
    }

    protected final E h() {
        return this.f6389b;
    }
}

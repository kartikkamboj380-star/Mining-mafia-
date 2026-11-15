package W;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991p implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f6404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f6405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f6406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function0 f6407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f6408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R8.a f6409f;

    /* JADX INFO: renamed from: W.p$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f6413d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6415f;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6413d = obj;
            this.f6415f |= LinearLayoutManager.INVALID_OFFSET;
            return C0991p.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: W.p$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f6418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f6419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6420e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6422g;

        b(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6420e = obj;
            this.f6422g |= LinearLayoutManager.INVALID_OFFSET;
            return C0991p.this.d(null, this);
        }
    }

    public C0991p(File file, E serializer, t coordinator, Function0 onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f6404a = file;
        this.f6405b = serializer;
        this.f6406c = coordinator;
        this.f6407d = onClose;
        this.f6408e = new AtomicBoolean(false);
        this.f6409f = R8.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f6408e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [W.p] */
    /* JADX WARN: Type inference failed for: r0v14, types: [W.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [W.p$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [W.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [z8.n] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // W.K
    public Object b(p259z8.n nVar, p169q8.b bVar) throws Throwable {
        ?? aVar;
        Throwable th;
        InterfaceC0978c interfaceC0978c;
        ?? r10;
        ?? r11;
        if (bVar instanceof a) {
            a aVar2 = (a) bVar;
            int i10 = aVar2.f6415f;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar2.f6415f = i10 - LinearLayoutManager.INVALID_OFFSET;
                aVar = aVar2;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f6413d;
        Object objE = p179r8.b.e();
        int i11 = aVar.f6415f;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = aVar.f6412c;
                interfaceC0978c = (InterfaceC0978c) aVar.f6411b;
                aVar = (C0991p) aVar.f6410a;
                try {
                    p129m8.n.b(obj);
                    r11 = aVar;
                    r10 = nVar;
                    try {
                        interfaceC0978c.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        R8.a.C0077a.b(r11.f6409f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        interfaceC0978c.close();
                    } catch (Throwable th4) {
                        p129m8.a.a(th, th4);
                    }
                    throw th;
                }
            }
            p129m8.n.b(obj);
            f();
            boolean zA = R8.a.C0077a.a(this.f6409f, null, 1, null);
            try {
                C0989n c0989n = new C0989n(this.f6404a, this.f6405b);
                try {
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zA);
                    aVar.f6410a = this;
                    aVar.f6411b = c0989n;
                    aVar.f6412c = zA;
                    aVar.f6415f = 1;
                    Object objInvoke = nVar.invoke(c0989n, boolA, aVar);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    obj = objInvoke;
                    r10 = zA;
                    r11 = this;
                    interfaceC0978c = c0989n;
                    interfaceC0978c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        R8.a.C0077a.b(r11.f6409f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    nVar = zA;
                    aVar = this;
                    interfaceC0978c = c0989n;
                    interfaceC0978c.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                nVar = zA;
                aVar = this;
                if (nVar != 0) {
                    R8.a.C0077a.b(aVar.f6409f, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (nVar != 0) {
                R8.a.C0077a.b(aVar.f6409f, null, 1, null);
            }
            throw th;
        }
    }

    @Override // W.K
    public t c() {
        return this.f6406c;
    }

    @Override // W.InterfaceC0978c
    public void close() {
        this.f6408e.set(true);
        this.f6407d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [R8.a, int] */
    @Override // W.K
    public Object d(Function2 function2, p169q8.b bVar) throws IOException {
        b bVar2;
        File file;
        C0991p c0991p;
        R8.a aVar;
        q qVar;
        Throwable th;
        InterfaceC0978c interfaceC0978c;
        File file2;
        C0991p c0991p2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f6422g;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar2.f6422g = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f6420e;
        Object objE = p179r8.b.e();
        ?? r10 = bVar2.f6422g;
        try {
            try {
                try {
                    try {
                        if (r10 == 0) {
                            p129m8.n.b(obj);
                            f();
                            g(this.f6404a);
                            R8.a aVar2 = this.f6409f;
                            bVar2.f6416a = this;
                            bVar2.f6417b = function2;
                            bVar2.f6418c = aVar2;
                            bVar2.f6422g = 1;
                            if (aVar2.d(null, bVar2) != objE) {
                                c0991p = this;
                                aVar = aVar2;
                            }
                            return objE;
                        }
                        if (r10 != 1) {
                            if (r10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0978c = (InterfaceC0978c) bVar2.f6419d;
                            File file3 = (File) bVar2.f6418c;
                            aVar = (R8.a) bVar2.f6417b;
                            c0991p2 = (C0991p) bVar2.f6416a;
                            try {
                                p129m8.n.b(obj);
                                file2 = file3;
                                Unit unit = Unit.f45918a;
                                try {
                                    interfaceC0978c.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !AbstractC0988m.a(file2, c0991p2.f6404a)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + c0991p2.f6404a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit2 = Unit.f45918a;
                                aVar.e(null);
                                return Unit.f45918a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    interfaceC0978c.close();
                                } catch (Throwable th4) {
                                    p129m8.a.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        R8.a aVar3 = (R8.a) bVar2.f6418c;
                        Function2 function3 = (Function2) bVar2.f6417b;
                        c0991p = (C0991p) bVar2.f6416a;
                        p129m8.n.b(obj);
                        aVar = aVar3;
                        function2 = function3;
                        bVar2.f6416a = c0991p;
                        bVar2.f6417b = aVar;
                        bVar2.f6418c = file;
                        bVar2.f6419d = qVar;
                        bVar2.f6422g = 2;
                        if (function2.invoke(qVar, bVar2) != objE) {
                            file2 = file;
                            c0991p2 = c0991p;
                            interfaceC0978c = qVar;
                            Unit unit3 = Unit.f45918a;
                            interfaceC0978c.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + c0991p2.f6404a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            Unit unit4 = Unit.f45918a;
                            aVar.e(null);
                            return Unit.f45918a;
                        }
                        return objE;
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC0978c = qVar;
                        interfaceC0978c.close();
                        throw th;
                    }
                    qVar = new q(file, c0991p.f6405b);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(c0991p.f6404a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                r10.e(null);
                throw th6;
            }
        } catch (IOException e11) {
            e = e11;
            file = objE;
        }
    }
}

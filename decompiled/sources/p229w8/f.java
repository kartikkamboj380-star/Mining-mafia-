package p229w8;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.AbstractC7017c;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import p129m8.k;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f50396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileWalkDirection f50397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f50399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f50400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50401f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractC7017c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f50402c;

        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f50404b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f50405c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f50406d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f50407e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f50408f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f50408f = bVar;
            }

            @Override // w8.f.c
            public File b() {
                if (!this.f50407e && this.f50405c == null) {
                    Function1 function1 = f.this.f50398c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f50405c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = f.this.f50400e;
                        if (function2 != null) {
                            function2.invoke(a(), new p229w8.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f50407e = true;
                    }
                }
                File[] fileArr = this.f50405c;
                if (fileArr != null) {
                    int i10 = this.f50406d;
                    Intrinsics.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f50405c;
                        Intrinsics.c(fileArr2);
                        int i11 = this.f50406d;
                        this.f50406d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f50404b) {
                    this.f50404b = true;
                    return a();
                }
                Function1 function3 = f.this.f50399d;
                if (function3 != null) {
                    function3.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: w8.f$b$b, reason: collision with other inner class name */
        private final class C0556b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f50409b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f50410c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0556b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f50410c = bVar;
            }

            @Override // w8.f.c
            public File b() {
                if (this.f50409b) {
                    return null;
                }
                this.f50409b = true;
                return a();
            }
        }

        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f50411b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f50412c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f50413d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f50414e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f50414e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // w8.f.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f50411b
                    r1 = 0
                    if (r0 != 0) goto L28
                    w8.f$b r0 = r9.f50414e
                    w8.f r0 = p229w8.f.this
                    kotlin.jvm.functions.Function1 r0 = p229w8.f.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f50411b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f50412c
                    if (r0 == 0) goto L47
                    int r2 = r9.f50413d
                    kotlin.jvm.internal.Intrinsics.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    w8.f$b r0 = r9.f50414e
                    w8.f r0 = p229w8.f.this
                    kotlin.jvm.functions.Function1 r0 = p229w8.f.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f50412c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f50412c = r0
                    if (r0 != 0) goto L76
                    w8.f$b r0 = r9.f50414e
                    w8.f r0 = p229w8.f.this
                    kotlin.jvm.functions.Function2 r0 = p229w8.f.f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    w8.a r3 = new w8.a
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f50412c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.Intrinsics.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    w8.f$b r0 = r9.f50414e
                    w8.f r0 = p229w8.f.this
                    kotlin.jvm.functions.Function1 r0 = p229w8.f.g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f50412c
                    kotlin.jvm.internal.Intrinsics.c(r0)
                    int r1 = r9.f50413d
                    int r2 = r1 + 1
                    r9.f50413d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: w8.f.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50415a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f50415a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f50402c = arrayDeque;
            if (f.this.f50396a.isDirectory()) {
                arrayDeque.push(f(f.this.f50396a));
            } else if (f.this.f50396a.isFile()) {
                arrayDeque.push(new C0556b(this, f.this.f50396a));
            } else {
                b();
            }
        }

        private final a f(File file) {
            int i10 = d.f50415a[f.this.f50397b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new k();
        }

        private final File g() {
            while (true) {
                c cVar = (c) this.f50402c.peek();
                if (cVar == null) {
                    return null;
                }
                File fileB = cVar.b();
                if (fileB == null) {
                    this.f50402c.pop();
                } else {
                    if (Intrinsics.b(fileB, cVar.a()) || !fileB.isDirectory() || this.f50402c.size() >= f.this.f50401f) {
                        return fileB;
                    }
                    this.f50402c.push(f(fileB));
                }
            }
        }

        @Override // kotlin.collections.AbstractC7017c
        protected void a() {
            File fileG = g();
            if (fileG != null) {
                c(fileG);
            } else {
                b();
            }
        }
    }

    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f50416a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f50416a = root;
        }

        public final File a() {
            return this.f50416a;
        }

        public abstract File b();
    }

    private f(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10) {
        this.f50396a = file;
        this.f50397b = fileWalkDirection;
        this.f50398c = function1;
        this.f50399d = function2;
        this.f50400e = function3;
        this.f50401f = i10;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ f(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i11 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}

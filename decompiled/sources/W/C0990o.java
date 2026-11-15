package W;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990o implements J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6396d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f6397e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f6398f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f6399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f6400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f6401c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: W.o$a */
    public static final class a extends kotlin.jvm.internal.m implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6402a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return v.a(it);
        }
    }

    /* JADX INFO: renamed from: W.o$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C0990o.f6397e;
        }

        public final Object b() {
            return C0990o.f6398f;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: W.o$c */
    static final class c extends kotlin.jvm.internal.m implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f6403a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f6403a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return Unit.f45918a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            b bVar = C0990o.f6396d;
            Object objB = bVar.b();
            File file = this.f6403a;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                Unit unit = Unit.f45918a;
            }
        }
    }

    public C0990o(E serializer, Function1 coordinatorProducer, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f6399a = serializer;
        this.f6400b = coordinatorProducer;
        this.f6401c = produceFile;
    }

    @Override // W.J
    public K a() throws IOException {
        File file = ((File) this.f6401c.invoke()).getCanonicalFile();
        synchronized (f6398f) {
            String path = file.getAbsolutePath();
            Set set = f6397e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new C0991p(file, this.f6399a, (t) this.f6400b.invoke(file), new c(file));
    }

    public /* synthetic */ C0990o(E e10, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, (i10 & 2) != 0 ? a.f6402a : function1, function0);
    }
}

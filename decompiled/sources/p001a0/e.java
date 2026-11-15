package p001a0;

import I8.O;
import W.C0985j;
import W.C0990o;
import W.InterfaceC0984i;
import W.J;
import X.b;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import p229w8.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7243a = new e();

    static final class a extends m implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7244a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f7244a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = (File) this.f7244a.invoke();
            if (Intrinsics.b(g.q(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final InterfaceC0984i a(J storage, b bVar, List migrations, O scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(C0985j.f6236a.b(storage, bVar, migrations, scope));
    }

    public final InterfaceC0984i b(b bVar, List migrations, O scope, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new d(a(new C0990o(h.f7246a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}

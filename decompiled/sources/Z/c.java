package Z;

import I8.O;
import W.InterfaceC0984i;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements C8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X.b f7073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f7074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f7075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC0984i f7077f;

    static final class a extends m implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f7079b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f7078a = context;
            this.f7079b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context applicationContext = this.f7078a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f7079b.f7072a);
        }
    }

    public c(String name, X.b bVar, Function1 produceMigrations, O scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7072a = name;
        this.f7073b = bVar;
        this.f7074c = produceMigrations;
        this.f7075d = scope;
        this.f7076e = new Object();
    }

    @Override // C8.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC0984i a(Context thisRef, F8.i property) {
        InterfaceC0984i interfaceC0984i;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        InterfaceC0984i interfaceC0984i2 = this.f7077f;
        if (interfaceC0984i2 != null) {
            return interfaceC0984i2;
        }
        synchronized (this.f7076e) {
            try {
                if (this.f7077f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    p001a0.e eVar = p001a0.e.f7243a;
                    X.b bVar = this.f7073b;
                    Function1 function1 = this.f7074c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f7077f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f7075d, new a(applicationContext, this));
                }
                interfaceC0984i = this.f7077f;
                Intrinsics.c(interfaceC0984i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0984i;
    }
}

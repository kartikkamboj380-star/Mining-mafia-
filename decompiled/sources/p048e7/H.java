package p048e7;

import W.C0979d;
import W.E;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p169q8.b;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f43314a;

    public H(P sessionGenerator) {
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.f43314a = sessionGenerator;
    }

    @Override // W.E
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public G getDefaultValue() {
        return new G(this.f43314a.a(null), (Y) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // W.E
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(G g10, OutputStream outputStream, b bVar) throws IOException {
        outputStream.write(StringsKt.v(Y8.b.f7051d.b(G.Companion.serializer(), g10)));
        return Unit.f45918a;
    }

    @Override // W.E
    public Object readFrom(InputStream inputStream, b bVar) throws C0979d {
        try {
            Y8.b.a aVar = Y8.b.f7051d;
            String strS = StringsKt.s(p229w8.b.c(inputStream));
            aVar.d();
            return (G) aVar.a(G.Companion.serializer(), strS);
        } catch (Exception e10) {
            throw new C0979d("Cannot parse session data", e10);
        }
    }
}

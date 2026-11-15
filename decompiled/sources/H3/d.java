package H3;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Q2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f1212b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f1213c = new LinkedHashMap();

    @Override // Q2.a, com.facebook.imagepipeline.producers.h0
    public void a(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (p065g4.a.j(0L)) {
            Pair pairCreate = Pair.create(Integer.valueOf(this.f1211a), "FRESCO_PRODUCER_" + StringsKt.E(producerName, ':', '_', false, 4, null));
            Object second = pairCreate.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            p065g4.a.a(0L, (String) second, this.f1211a);
            this.f1212b.put(requestId, pairCreate);
            this.f1211a++;
        }
    }

    @Override // Q2.e
    public void b(U2.b request, Object callerContext, String requestId, boolean z9) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (p065g4.a.j(0L)) {
            StringBuilder sb = new StringBuilder();
            sb.append("FRESCO_REQUEST_");
            String string = request.v().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb.append(StringsKt.E(string, ':', '_', false, 4, null));
            Pair pairCreate = Pair.create(Integer.valueOf(this.f1211a), sb.toString());
            Object second = pairCreate.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            p065g4.a.a(0L, (String) second, this.f1211a);
            this.f1213c.put(requestId, pairCreate);
            this.f1211a++;
        }
    }

    @Override // Q2.a, com.facebook.imagepipeline.producers.h0
    public boolean c(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }

    @Override // Q2.a, com.facebook.imagepipeline.producers.h0
    public void d(String requestId, String producerName, Map map) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (p065g4.a.j(0L) && (pair = (Pair) this.f1212b.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p065g4.a.g(0L, (String) second, ((Number) first).intValue());
            this.f1212b.remove(requestId);
        }
    }

    @Override // Q2.a, com.facebook.imagepipeline.producers.h0
    public void e(String requestId, String producerName, Throwable t10, Map map) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t10, "t");
        if (p065g4.a.j(0L) && (pair = (Pair) this.f1212b.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p065g4.a.g(0L, (String) second, ((Number) first).intValue());
            this.f1212b.remove(requestId);
        }
    }

    @Override // Q2.e
    public void f(U2.b request, String requestId, boolean z9) {
        Pair pair;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (p065g4.a.j(0L) && (pair = (Pair) this.f1213c.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p065g4.a.g(0L, (String) second, ((Number) first).intValue());
            this.f1213c.remove(requestId);
        }
    }

    @Override // Q2.a, com.facebook.imagepipeline.producers.h0
    public void g(String requestId, String producerName, Map map) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (p065g4.a.j(0L) && (pair = (Pair) this.f1212b.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p065g4.a.g(0L, (String) second, ((Number) first).intValue());
            this.f1212b.remove(requestId);
        }
    }

    @Override // Q2.e
    public void i(U2.b request, String requestId, Throwable throwable, boolean z9) {
        Pair pair;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (p065g4.a.j(0L) && (pair = (Pair) this.f1213c.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p065g4.a.g(0L, (String) second, ((Number) first).intValue());
            this.f1213c.remove(requestId);
        }
    }

    @Override // Q2.a, com.facebook.imagepipeline.producers.h0
    public void j(String requestId, String producerName, String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (p065g4.a.j(0L)) {
            p065g4.a.n(0L, "FRESCO_PRODUCER_EVENT_" + StringsKt.E(requestId, ':', '_', false, 4, null) + "_" + StringsKt.E(producerName, ':', '_', false, 4, null) + "_" + StringsKt.E(eventName, ':', '_', false, 4, null), p065g4.a.EnumC0429a.THREAD);
        }
    }

    @Override // Q2.e
    public void k(String requestId) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (p065g4.a.j(0L) && (pair = (Pair) this.f1213c.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p065g4.a.g(0L, (String) second, ((Number) first).intValue());
            this.f1213c.remove(requestId);
        }
    }
}

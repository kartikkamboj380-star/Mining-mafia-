package X8;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T8.b f6794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T8.b f6795b;

    public /* synthetic */ l(T8.b bVar, T8.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    @Override // T8.b, T8.e, T8.a
    public abstract V8.d a();

    @Override // T8.e
    public void c(W8.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iJ = j(obj);
        V8.d dVarA = a();
        W8.d dVarP = encoder.p(dVarA, iJ);
        Iterator itI = i(obj);
        int i10 = 0;
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            dVarP.d(a(), i10, r(), key);
            i10 += 2;
            dVarP.d(a(), i11, s(), value);
        }
        dVarP.b(dVarA);
    }

    public final T8.b r() {
        return this.f6794a;
    }

    public final T8.b s() {
        return this.f6795b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void l(W8.c decoder, Map builder, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        kotlin.ranges.a aVarM = kotlin.ranges.b.m(kotlin.ranges.b.n(0, i11 * 2), 2);
        int iA = aVarM.a();
        int iB = aVarM.b();
        int iE = aVarM.e();
        if ((iE <= 0 || iA > iB) && (iE >= 0 || iB > iA)) {
            return;
        }
        while (true) {
            m(decoder, i10 + iA, builder, false);
            if (iA == iB) {
                return;
            } else {
                iA += iE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(W8.c decoder, int i10, Map builder, boolean z9) {
        int iN;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objC = W8.c.a.c(decoder, a(), i10, this.f6794a, null, 8, null);
        if (z9) {
            iN = decoder.n(a());
            if (iN != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iN).toString());
            }
        } else {
            iN = i10 + 1;
        }
        int i11 = iN;
        builder.put(objC, (!builder.containsKey(objC) || (this.f6795b.a().getKind() instanceof V8.c)) ? W8.c.a.c(decoder, a(), i11, this.f6795b, null, 8, null) : decoder.p(a(), i11, this.f6795b, E.h(builder, objC)));
    }

    private l(T8.b bVar, T8.b bVar2) {
        super(null);
        this.f6794a = bVar;
        this.f6795b = bVar2;
    }
}

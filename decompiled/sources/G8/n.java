package G8;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class n extends l {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f1084a;

        public a(Iterator it) {
            this.f1084a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return this.f1084a;
        }
    }

    public static Sequence d(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return e(new a(it));
    }

    public static Sequence e(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof G8.a ? sequence : new G8.a(sequence);
    }

    public static Sequence f() {
        return e.f1065a;
    }

    public static Sequence g(final Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return e(new g(nextFunction, new Function1() { // from class: G8.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.h(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }
}

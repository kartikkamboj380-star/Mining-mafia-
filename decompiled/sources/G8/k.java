package G8;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
class k {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f1082a;

        public a(Function2 function2) {
            this.f1082a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return k.a(this.f1082a);
        }
    }

    public static final Iterator a(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        h hVar = new h();
        hVar.k(p179r8.b.a(block, hVar, hVar));
        return hVar;
    }

    public static final Sequence b(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(block);
    }
}

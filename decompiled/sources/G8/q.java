package G8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class q extends o {

    public static final class a implements Iterable, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence f1085a;

        public a(Sequence sequence) {
            this.f1085a = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f1085a.iterator();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f1087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f1090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Sequence f1091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f1092h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, Sequence sequence, Function2 function2, p169q8.b bVar) {
            super(2, bVar);
            this.f1090f = obj;
            this.f1091g = sequence;
            this.f1092h = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            b bVar2 = new b(this.f1090f, this.f1091g, this.f1092h, bVar);
            bVar2.f1089e = obj;
            return bVar2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0052  */
        /* JADX WARN: Code duplicated, block: B:20:0x006b  */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            if (r1.c(r7, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        
            if (r4.c(r3, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p179r8.b.e()
                int r1 = r6.f1088d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.f1087c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.f1086b
                java.lang.Object r4 = r6.f1089e
                G8.i r4 = (G8.i) r4
                p129m8.n.b(r7)
            L1b:
                r7 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.f1089e
                G8.i r1 = (G8.i) r1
                p129m8.n.b(r7)
                goto L42
            L2d:
                p129m8.n.b(r7)
                java.lang.Object r7 = r6.f1089e
                r1 = r7
                G8.i r1 = (G8.i) r1
                java.lang.Object r7 = r6.f1090f
                r6.f1089e = r1
                r6.f1088d = r3
                java.lang.Object r7 = r1.c(r7, r6)
                if (r7 != r0) goto L42
                goto L6a
            L42:
                java.lang.Object r7 = r6.f1090f
                kotlin.sequences.Sequence r3 = r6.f1091g
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                kotlin.jvm.functions.Function2 r5 = r6.f1092h
                java.lang.Object r3 = r5.invoke(r7, r3)
                r6.f1089e = r4
                r6.f1086b = r3
                r6.f1087c = r1
                r6.f1088d = r2
                java.lang.Object r7 = r4.c(r3, r6)
                if (r7 != r0) goto L1b
            L6a:
                return r0
            L6b:
                kotlin.Unit r7 = kotlin.Unit.f45918a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: G8.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i iVar, p169q8.b bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    public static final class c implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence f1093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f1094b;

        c(Sequence sequence, Comparator comparator) {
            this.f1093a = sequence;
            this.f1094b = comparator;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            List listE = q.E(this.f1093a);
            CollectionsKt.v(listE, this.f1094b);
            return listE.iterator();
        }
    }

    public static Sequence A(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return n.f();
            }
            return sequence instanceof G8.c ? ((G8.c) sequence).b(i10) : new s(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static Sequence B(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new t(sequence, predicate);
    }

    public static Collection C(Sequence sequence, Collection destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List D(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.i();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final List E(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (List) C(sequence, new ArrayList());
    }

    public static Iterable j(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new a(sequence);
    }

    public static int k(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt.q();
            }
        }
        return i10;
    }

    public static Sequence l(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return sequence;
            }
            return sequence instanceof G8.c ? ((G8.c) sequence).a(i10) : new G8.b(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static Sequence m(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new d(sequence, predicate);
    }

    public static Sequence n(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new f(sequence, true, predicate);
    }

    public static final Sequence o(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new f(sequence, false, predicate);
    }

    public static final Sequence p(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence sequenceO = o(sequence, new Function1() { // from class: G8.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(q.q(obj));
            }
        });
        Intrinsics.d(sequenceO, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequenceO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(Object obj) {
        return obj == null;
    }

    public static Object r(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int s(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = 0;
        for (Object obj2 : sequence) {
            if (i10 < 0) {
                CollectionsKt.r();
            }
            if (Intrinsics.b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable t(Sequence sequence, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : sequence) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String u(Sequence sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) t(sequence, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String v(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return u(sequence, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static Sequence w(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new u(sequence, transform);
    }

    public static Sequence x(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return p(new u(sequence, transform));
    }

    public static Sequence y(Sequence sequence, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return k.b(new b(obj, sequence, operation, null));
    }

    public static Sequence z(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new c(sequence, comparator);
    }
}

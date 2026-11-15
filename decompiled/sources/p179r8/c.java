package p179r8;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import p129m8.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f48380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f48381c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p169q8.b bVar, Function2 function2, Object obj) {
            super(bVar);
            this.f48380b = function2;
            this.f48381c = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f48379a;
            if (i10 == 0) {
                this.f48379a = 1;
                n.b(obj);
                Intrinsics.d(this.f48380b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) I.c(this.f48380b, 2)).invoke(this.f48381c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f48379a = 2;
            n.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f48383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f48384c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p169q8.b bVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(bVar, coroutineContext);
            this.f48383b = function2;
            this.f48384c = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f48382a;
            if (i10 == 0) {
                this.f48382a = 1;
                n.b(obj);
                Intrinsics.d(this.f48383b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) I.c(this.f48383b, 2)).invoke(this.f48384c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f48382a = 2;
            n.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: r8.c$c, reason: collision with other inner class name */
    public static final class C0525c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0525c(p169q8.b bVar) {
            super(bVar);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            n.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p169q8.b bVar, CoroutineContext coroutineContext) {
            super(bVar, coroutineContext);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            n.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p169q8.b a(Function2 function2, Object obj, p169q8.b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        p169q8.b bVarA = h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, bVarA);
        }
        CoroutineContext context = bVarA.getContext();
        return context == e.f45956a ? new a(bVarA, function2, obj) : new b(bVarA, context, function2, obj);
    }

    private static final p169q8.b b(p169q8.b bVar) {
        CoroutineContext context = bVar.getContext();
        return context == e.f45956a ? new C0525c(bVar) : new d(bVar, context);
    }

    public static p169q8.b c(p169q8.b bVar) {
        p169q8.b bVarIntercepted;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = bVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) bVar : null;
        return (dVar == null || (bVarIntercepted = dVar.intercepted()) == null) ? bVar : bVarIntercepted;
    }

    public static Object d(Function2 function2, Object obj, p169q8.b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) I.c(function2, 2)).invoke(obj, b(h.a(completion)));
    }
}

package W;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0983h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6218a = new a(null);

    /* JADX INFO: renamed from: W.h$a */
    public static final class a {

        /* JADX INFO: renamed from: W.h$a$a, reason: collision with other inner class name */
        static final class C0101a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f6219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f6220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f6221c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0101a(List list, p169q8.b bVar) {
                super(2, bVar);
                this.f6221c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p169q8.b create(Object obj, p169q8.b bVar) {
                C0101a c0101a = new C0101a(this.f6221c, bVar);
                c0101a.f6220b = obj;
                return c0101a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p179r8.b.e();
                int i10 = this.f6219a;
                if (i10 == 0) {
                    p129m8.n.b(obj);
                    s sVar = (s) this.f6220b;
                    a aVar = AbstractC0983h.f6218a;
                    List list = this.f6221c;
                    this.f6219a = 1;
                    if (aVar.c(list, sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p129m8.n.b(obj);
                }
                return Unit.f45918a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, p169q8.b bVar) {
                return ((C0101a) create(sVar, bVar)).invokeSuspend(Unit.f45918a);
            }
        }

        /* JADX INFO: renamed from: W.h$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f6222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f6223b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f6224c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f6226e;

            b(p169q8.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6224c = obj;
                this.f6226e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: W.h$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f6227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f6228b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f6229c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f6230d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f6231e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f6232f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f6233g;

            /* JADX INFO: renamed from: W.h$a$c$a, reason: collision with other inner class name */
            static final class C0102a extends kotlin.coroutines.jvm.internal.l implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f6234a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC0982g f6235b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0102a(InterfaceC0982g interfaceC0982g, p169q8.b bVar) {
                    super(1, bVar);
                    this.f6235b = interfaceC0982g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p169q8.b create(p169q8.b bVar) {
                    return new C0102a(this.f6235b, bVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p179r8.b.e();
                    int i10 = this.f6234a;
                    if (i10 == 0) {
                        p129m8.n.b(obj);
                        InterfaceC0982g interfaceC0982g = this.f6235b;
                        this.f6234a = 1;
                        if (interfaceC0982g.cleanUp(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p129m8.n.b(obj);
                    }
                    return Unit.f45918a;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(p169q8.b bVar) {
                    return ((C0102a) create(bVar)).invokeSuspend(Unit.f45918a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, p169q8.b bVar) {
                super(2, bVar);
                this.f6232f = list;
                this.f6233g = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p169q8.b create(Object obj, p169q8.b bVar) {
                c cVar = new c(this.f6232f, this.f6233g, bVar);
                cVar.f6231e = obj;
                return cVar;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004a  */
            /* JADX WARN: Code duplicated, block: B:16:0x0061  */
            /* JADX WARN: Code duplicated, block: B:19:0x006e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0088  */
            /* JADX WARN: Code duplicated, block: B:23:0x008a  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p179r8.b.e()
                    int r1 = r9.f6230d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f6227a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f6231e
                    java.util.List r4 = (java.util.List) r4
                    p129m8.n.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f6229c
                    java.lang.Object r4 = r9.f6228b
                    W.g r4 = (W.InterfaceC0982g) r4
                    java.lang.Object r5 = r9.f6227a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f6231e
                    java.util.List r6 = (java.util.List) r6
                    p129m8.n.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    p129m8.n.b(r10)
                    java.lang.Object r10 = r9.f6231e
                    java.util.List r1 = r9.f6232f
                    java.util.List r4 = r9.f6233g
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    W.g r5 = (W.InterfaceC0982g) r5
                    r9.f6231e = r4
                    r9.f6227a = r1
                    r9.f6228b = r5
                    r9.f6229c = r10
                    r9.f6230d = r3
                    java.lang.Object r6 = r5.shouldMigrate(r10, r9)
                    if (r6 != r0) goto L61
                    goto L87
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    W.h$a$c$a r10 = new W.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f6231e = r4
                    r9.f6227a = r5
                    r9.f6228b = r7
                    r9.f6229c = r7
                    r9.f6230d = r2
                    java.lang.Object r10 = r6.migrate(r1, r9)
                    if (r10 != r0) goto L88
                L87:
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: W.AbstractC0983h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, p169q8.b bVar) {
                return ((c) create(obj, bVar)).invokeSuspend(Unit.f45918a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0098  */
        /* JADX WARN: Code duplicated, block: B:39:0x009b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final Object c(List list, s sVar, p169q8.b bVar) throws Throwable {
            b bVar2;
            List list2;
            kotlin.jvm.internal.E e10;
            Iterator it;
            Throwable th;
            Function1 function1;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f6226e;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar2.f6226e = i10 - LinearLayoutManager.INVALID_OFFSET;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f6224c;
            Object objE = p179r8.b.e();
            int i11 = bVar2.f6226e;
            if (i11 == 0) {
                p129m8.n.b(obj);
                ArrayList arrayList = new ArrayList();
                Function2 cVar = new c(list, arrayList, null);
                bVar2.f6222a = arrayList;
                bVar2.f6226e = 1;
                if (sVar.a(cVar, bVar2) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i11 == 1) {
                list2 = (List) bVar2.f6222a;
                p129m8.n.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar2.f6223b;
                e10 = (kotlin.jvm.internal.E) bVar2.f6222a;
                try {
                    p129m8.n.b(obj);
                } catch (Throwable th2) {
                    Object obj2 = e10.f45973a;
                    if (obj2 == null) {
                        e10.f45973a = th2;
                    } else {
                        Intrinsics.c(obj2);
                        p129m8.a.a((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                bVar2.f6222a = e10;
                bVar2.f6223b = it;
                bVar2.f6226e = 2;
                if (function1.invoke(bVar2) == objE) {
                    return objE;
                }
            }
            th = (Throwable) e10.f45973a;
            if (th == null) {
                return Unit.f45918a;
            }
            throw th;
            e10 = new kotlin.jvm.internal.E();
            it = list2.iterator();
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                bVar2.f6222a = e10;
                bVar2.f6223b = it;
                bVar2.f6226e = 2;
                if (function1.invoke(bVar2) == objE) {
                    return objE;
                }
            }
            th = (Throwable) e10.f45973a;
            if (th == null) {
                return Unit.f45918a;
            }
            throw th;
        }

        public final Function2 b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0101a(migrations, null);
        }

        private a() {
        }
    }
}

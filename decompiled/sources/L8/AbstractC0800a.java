package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* JADX INFO: renamed from: L8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0800a implements InterfaceC0804e {

    /* JADX INFO: renamed from: L8.a$a, reason: collision with other inner class name */
    static final class C0045a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3235b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3237d;

        C0045a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3235b = obj;
            this.f3237d |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0800a.this.collect(null, this);
        }
    }

    public abstract Object b(InterfaceC0805f interfaceC0805f, p169q8.b bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L8.InterfaceC0804e
    public final Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) throws Throwable {
        C0045a c0045a;
        Throwable th;
        M8.u uVar;
        if (bVar instanceof C0045a) {
            c0045a = (C0045a) bVar;
            int i10 = c0045a.f3237d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c0045a.f3237d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c0045a = new C0045a(bVar);
            }
        } else {
            c0045a = new C0045a(bVar);
        }
        Object obj = c0045a.f3235b;
        Object objE = p179r8.b.e();
        int i11 = c0045a.f3237d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (M8.u) c0045a.f3234a;
            try {
                p129m8.n.b(obj);
                uVar.releaseIntercepted();
                return Unit.f45918a;
            } catch (Throwable th2) {
                th = th2;
                uVar.releaseIntercepted();
                throw th;
            }
        }
        p129m8.n.b(obj);
        M8.u uVar2 = new M8.u(interfaceC0805f, c0045a.getContext());
        try {
            c0045a.f3234a = uVar2;
            c0045a.f3237d = 1;
            if (b(uVar2, c0045a) == objE) {
                return objE;
            }
            uVar = uVar2;
            uVar.releaseIntercepted();
            return Unit.f45918a;
        } catch (Throwable th3) {
            th = th3;
            uVar = uVar2;
            uVar.releaseIntercepted();
            throw th;
        }
    }
}
